package typings.xrm.Xrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for an OptionSet value.
  */
@js.native
trait OptionSetValue extends StObject {
  
  /**
    * The label text.
    */
  var text: String = js.native
  
  /**
    * The value, as a number
    */
  var value: Double = js.native
}
object OptionSetValue {
  
  @scala.inline
  def apply(text: String, value: Double): OptionSetValue = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionSetValue]
  }
  
  @scala.inline
  implicit class OptionSetValueMutableBuilder[Self <: OptionSetValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
