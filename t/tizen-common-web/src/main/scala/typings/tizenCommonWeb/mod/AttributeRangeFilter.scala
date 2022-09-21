package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web", "AttributeRangeFilter")
@js.native
open class AttributeRangeFilter protected () extends AbstractFilter {
  def this(attributeName: String) = this()
  def this(attributeName: String, initialValue: Any) = this()
  def this(attributeName: String, initialValue: Any, endValue: Any) = this()
  def this(attributeName: String, initialValue: Unit, endValue: Any) = this()
  
  /**
    * The name of the object attribute used for filtering.
    *
    * The value of this attribute is exactly as it is defined in the object's interface. For attributes of complex type, use fully-qualified names
    * (such as "geolocation.latitude" to filter a video or image content's latitude in a geolocation).
    *
    * For attributes of array type, the filter will match if any value in the array
    * matches.
    */
  var attributeName: String = js.native
  
  /**
    * Objects with an attribute that is strictly lower than or equal to _endValue_ will match.
    *
    * By default, this attribute is set to null.
    */
  var endValue: Any = js.native
  
  /**
    * Objects with an attribute that is greater than or equal to _initialValue_ will match.
    *
    * By default, this attribute is set to null.
    */
  var initialValue: Any = js.native
}
