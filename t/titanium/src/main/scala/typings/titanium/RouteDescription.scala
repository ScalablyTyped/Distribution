package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Object describing the current audio route.
  */
@js.native
trait RouteDescription extends StObject {
  
  /**
    * An Array of current input ports for the session. See the `AUDIO_SESSION_PORT` constants.
    */
  var inputs: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An Array of current output ports for the session. See the `AUDIO_SESSION_PORT` constants.
    */
  var outputs: js.UndefOr[js.Array[String]] = js.native
}
object RouteDescription {
  
  @scala.inline
  def apply(): RouteDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteDescription]
  }
  
  @scala.inline
  implicit class RouteDescriptionMutableBuilder[Self <: RouteDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputs(value: js.Array[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    @scala.inline
    def setInputsVarargs(value: String*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    @scala.inline
    def setOutputs(value: js.Array[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    @scala.inline
    def setOutputsVarargs(value: String*): Self = StObject.set(x, "outputs", js.Array(value :_*))
  }
}
