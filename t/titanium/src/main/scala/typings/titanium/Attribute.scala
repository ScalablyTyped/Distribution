package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An abstract datatype for specifying an attributed string attribute.
  */
@js.native
trait Attribute extends StObject {
  
  /**
    * Attribute range.
    */
  var range: js.Array[Double] = js.native
  
  /**
    * Attribute to apply to the text.
    */
  var `type`: Double = js.native
  
  /**
    * Attribute value.
    */
  var value: js.Any = js.native
}
object Attribute {
  
  @scala.inline
  def apply(range: js.Array[Double], `type`: Double, value: js.Any): Attribute = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
  
  @scala.inline
  implicit class AttributeMutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: js.Array[Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value :_*))
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
