package typings.tizenCommonWeb.tizenMod

import typings.tizenCommonWeb.tizenCommonWebStrings.CONTAINS
import typings.tizenCommonWeb.tizenCommonWebStrings.ENDSWITH
import typings.tizenCommonWeb.tizenCommonWebStrings.EXACTLY
import typings.tizenCommonWeb.tizenCommonWebStrings.EXISTS
import typings.tizenCommonWeb.tizenCommonWebStrings.FULLSTRING
import typings.tizenCommonWeb.tizenCommonWebStrings.STARTSWITH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web/tizen", "AttributeFilter")
@js.native
class AttributeFilter protected () extends AbstractFilter {
  def this(attributeName: String) = this()
  def this(attributeName: String, matchFlag: CONTAINS) = this()
  def this(attributeName: String, matchFlag: ENDSWITH) = this()
  def this(attributeName: String, matchFlag: EXACTLY) = this()
  def this(attributeName: String, matchFlag: EXISTS) = this()
  def this(attributeName: String, matchFlag: FULLSTRING) = this()
  def this(attributeName: String, matchFlag: STARTSWITH) = this()
  def this(attributeName: String, matchFlag: FilterMatchFlag) = this()
  def this(attributeName: String, matchFlag: js.UndefOr[scala.Nothing], matchValue: js.Any) = this()
  def this(attributeName: String, matchFlag: CONTAINS, matchValue: js.Any) = this()
  def this(attributeName: String, matchFlag: ENDSWITH, matchValue: js.Any) = this()
  def this(attributeName: String, matchFlag: EXACTLY, matchValue: js.Any) = this()
  def this(attributeName: String, matchFlag: EXISTS, matchValue: js.Any) = this()
  def this(attributeName: String, matchFlag: FULLSTRING, matchValue: js.Any) = this()
  def this(attributeName: String, matchFlag: STARTSWITH, matchValue: js.Any) = this()
  def this(attributeName: String, matchFlag: FilterMatchFlag, matchValue: js.Any) = this()
  
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
    * By default, this attribute is set to "EXACTLY".
    */
  var matchFlag: FilterMatchFlag | EXACTLY | FULLSTRING | CONTAINS | STARTSWITH | ENDSWITH | EXISTS = js.native
  
  /**
    * The value used for matching.
    * The filter will match if the attribute value matches the given matchValue.
    * This value is not used if the `matchFlag` is set to "EXISTS".
    * By default, this attribute is set to ***null***.
    */
  var matchValue: js.Any = js.native
}
