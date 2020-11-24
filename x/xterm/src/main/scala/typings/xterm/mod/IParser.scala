package typings.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IParser extends js.Object {
  
  /**
    * Adds a handler for CSI escape sequences.
    * @param id Specifies the function identifier under which the callback
    * gets registered, e.g. {final: 'm'} for SGR.
    * @param callback The function to handle the sequence. The callback is
    * called with the numerical params. If the sequence has subparams the
    * array will contain subarrays with their numercial values.
    * Return true if the sequence was handled; false if we should try
    * a previous handler (set by addCsiHandler or setCsiHandler).
    * The most recently added handler is tried first.
    * @return An IDisposable you can call to remove this handler.
    */
  def registerCsiHandler(
    id: IFunctionIdentifier,
    callback: js.Function1[/* params */ js.Array[Double | js.Array[Double]], Boolean]
  ): IDisposable = js.native
  
  /**
    * Adds a handler for DCS escape sequences.
    * @param id Specifies the function identifier under which the callback
    * gets registered, e.g. {intermediates: '$' final: 'q'} for DECRQSS.
    * @param callback The function to handle the sequence. Note that the
    * function will only be called once if the sequence finished sucessfully.
    * There is currently no way to intercept smaller data chunks, data chunks
    * will be stored up until the sequence is finished. Since DCS sequences
    * are not limited by the amount of data this might impose a problem for
    * big payloads. Currently xterm.js limits DCS payload to 10 MB
    * which should give enough room for most use cases.
    * The function gets the payload and numerical parameters as arguments.
    * Return true if the sequence was handled; false if we should try
    * a previous handler (set by addDcsHandler or setDcsHandler).
    * The most recently added handler is tried first.
    * @return An IDisposable you can call to remove this handler.
    */
  def registerDcsHandler(
    id: IFunctionIdentifier,
    callback: js.Function2[/* data */ String, /* param */ js.Array[Double | js.Array[Double]], Boolean]
  ): IDisposable = js.native
  
  /**
    * Adds a handler for ESC escape sequences.
    * @param id Specifies the function identifier under which the callback
    * gets registered, e.g. {intermediates: '%' final: 'G'} for
    * default charset selection.
    * @param callback The function to handle the sequence.
    * Return true if the sequence was handled; false if we should try
    * a previous handler (set by addEscHandler or setEscHandler).
    * The most recently added handler is tried first.
    * @return An IDisposable you can call to remove this handler.
    */
  def registerEscHandler(id: IFunctionIdentifier, handler: js.Function0[Boolean]): IDisposable = js.native
  
  /**
    * Adds a handler for OSC escape sequences.
    * @param ident The number (first parameter) of the sequence.
    * @param callback The function to handle the sequence. Note that the
    * function will only be called once if the sequence finished sucessfully.
    * There is currently no way to intercept smaller data chunks, data chunks
    * will be stored up until the sequence is finished. Since OSC sequences
    * are not limited by the amount of data this might impose a problem for
    * big payloads. Currently xterm.js limits OSC payload to 10 MB
    * which should give enough room for most use cases.
    * The callback is called with OSC data string.
    * Return true if the sequence was handled; false if we should try
    * a previous handler (set by addOscHandler or setOscHandler).
    * The most recently added handler is tried first.
    * @return An IDisposable you can call to remove this handler.
    */
  def registerOscHandler(ident: Double, callback: js.Function1[/* data */ String, Boolean]): IDisposable = js.native
}
object IParser {
  
  @scala.inline
  def apply(
    registerCsiHandler: (IFunctionIdentifier, js.Function1[/* params */ js.Array[Double | js.Array[Double]], Boolean]) => IDisposable,
    registerDcsHandler: (IFunctionIdentifier, js.Function2[/* data */ String, /* param */ js.Array[Double | js.Array[Double]], Boolean]) => IDisposable,
    registerEscHandler: (IFunctionIdentifier, js.Function0[Boolean]) => IDisposable,
    registerOscHandler: (Double, js.Function1[/* data */ String, Boolean]) => IDisposable
  ): IParser = {
    val __obj = js.Dynamic.literal(registerCsiHandler = js.Any.fromFunction2(registerCsiHandler), registerDcsHandler = js.Any.fromFunction2(registerDcsHandler), registerEscHandler = js.Any.fromFunction2(registerEscHandler), registerOscHandler = js.Any.fromFunction2(registerOscHandler))
    __obj.asInstanceOf[IParser]
  }
  
  @scala.inline
  implicit class IParserOps[Self <: IParser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRegisterCsiHandler(
      value: (IFunctionIdentifier, js.Function1[/* params */ js.Array[Double | js.Array[Double]], Boolean]) => IDisposable
    ): Self = this.set("registerCsiHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegisterDcsHandler(
      value: (IFunctionIdentifier, js.Function2[/* data */ String, /* param */ js.Array[Double | js.Array[Double]], Boolean]) => IDisposable
    ): Self = this.set("registerDcsHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegisterEscHandler(value: (IFunctionIdentifier, js.Function0[Boolean]) => IDisposable): Self = this.set("registerEscHandler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegisterOscHandler(value: (Double, js.Function1[/* data */ String, Boolean]) => IDisposable): Self = this.set("registerOscHandler", js.Any.fromFunction2(value))
  }
}
