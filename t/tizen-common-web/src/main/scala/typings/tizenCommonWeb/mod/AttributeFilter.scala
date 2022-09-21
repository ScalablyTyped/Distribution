package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web", "AttributeFilter")
@js.native
open class AttributeFilter protected () extends AbstractFilter {
  def this(attributeName: String) = this()
  def this(attributeName: String, matchFlag: FilterMatchFlag) = this()
  def this(attributeName: String, matchFlag: Null, matchValue: Any) = this()
  def this(attributeName: String, matchFlag: Unit, matchValue: Any) = this()
  def this(attributeName: String, matchFlag: FilterMatchFlag, matchValue: Any) = this()
  
  /**
    * The name of the object attribute used for filtering.
    *
    * This is the name of the object attribute exactly as it is defined in
    * the object's interface. For attributes of complex type, use fully-qualified names
    * (such as "geolocation.latitude" to filter a video or image content's latitude in a geolocation).
    *
    * For attributes of an array type, the filter will match if any value in the array
    * matches.
    */
  var attributeName: String = js.native
  
  /**
    * The match flag used for attribute-based filtering.
    *
    * By default, this attribute is set to "EXACTLY".
    */
  var matchFlag: FilterMatchFlag = js.native
  
  /**
    * The value used for matching.
    *
    * The filter will match if the attribute value matches the given matchValue.
    *
    * This value is not used if the _matchFlag_ is set to "EXISTS".
    * By default, this attribute is set to null.
    */
  var matchValue: Any = js.native
}
