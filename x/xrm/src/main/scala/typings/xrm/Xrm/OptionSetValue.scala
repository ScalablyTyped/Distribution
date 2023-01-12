package typings.xrm.Xrm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for an OptionSet value.
  */
trait OptionSetValue extends StObject {
  
  /**
    * The label text.
    */
  var text: String
  
  /**
    * The value, as a number
    */
  var value: Double
}
object OptionSetValue {
  
  inline def apply(text: String, value: Double): OptionSetValue = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionSetValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionSetValue] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
