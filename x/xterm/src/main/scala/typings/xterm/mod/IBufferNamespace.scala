package typings.xterm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the terminal's set of buffers.
  */
trait IBufferNamespace extends StObject {
  
  /**
    * The active buffer, this will either be the normal or alternate buffers.
    */
  val active: IBuffer
  
  /**
    * The alternate buffer, this becomes the active buffer when an application
    * enters this mode via DECSET (`CSI ? 4 7 h`)
    */
  val alternate: IBuffer
  
  /**
    * The normal buffer.
    */
  val normal: IBuffer
  
  /**
    * Adds an event listener for when the active buffer changes.
    * @returns an `IDisposable` to stop listening.
    */
  def onBufferChange(listener: js.Function2[/* arg1 */ IBuffer, /* arg2 */ Unit, Any]): IDisposable
  /**
    * Adds an event listener for when the active buffer changes.
    * @returns an `IDisposable` to stop listening.
    */
  @JSName("onBufferChange")
  var onBufferChange_Original: IEvent[IBuffer, Unit]
}
object IBufferNamespace {
  
  inline def apply(
    active: IBuffer,
    alternate: IBuffer,
    normal: IBuffer,
    onBufferChange: /* listener */ js.Function2[IBuffer, Unit, Any] => IDisposable
  ): IBufferNamespace = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], alternate = alternate.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], onBufferChange = js.Any.fromFunction1(onBufferChange))
    __obj.asInstanceOf[IBufferNamespace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IBufferNamespace] (val x: Self) extends AnyVal {
    
    inline def setActive(value: IBuffer): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setAlternate(value: IBuffer): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    inline def setNormal(value: IBuffer): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setOnBufferChange(value: /* listener */ js.Function2[IBuffer, Unit, Any] => IDisposable): Self = StObject.set(x, "onBufferChange", js.Any.fromFunction1(value))
  }
}
