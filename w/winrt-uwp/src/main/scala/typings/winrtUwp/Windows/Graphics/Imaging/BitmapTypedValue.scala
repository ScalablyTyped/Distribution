package typings.winrtUwp.Windows.Graphics.Imaging

import typings.winrtUwp.Windows.Foundation.PropertyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A value along with an enumeration specifying its data type. */
trait BitmapTypedValue extends StObject {
  
  /** Gets the PropertyType of the stored value. */
  var `type`: PropertyType
  
  /** Gets the stored value. */
  var value: Any
}
object BitmapTypedValue {
  
  inline def apply(`type`: PropertyType, value: Any): BitmapTypedValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapTypedValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BitmapTypedValue] (val x: Self) extends AnyVal {
    
    inline def setType(value: PropertyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
