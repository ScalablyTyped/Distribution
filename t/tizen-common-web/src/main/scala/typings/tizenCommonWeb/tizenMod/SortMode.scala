package typings.tizenCommonWeb.tizenMod

import typings.tizenCommonWeb.tizenCommonWebStrings.ASC
import typings.tizenCommonWeb.tizenCommonWebStrings.DESC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web/tizen", "SortMode")
@js.native
class SortMode protected () extends StObject {
  def this(attributeName: String) = this()
  def this(attributeName: String, order: ASC) = this()
  def this(attributeName: String, order: DESC) = this()
  def this(attributeName: String, order: SortModeOrder) = this()
  
  /**
    * The name of the object attribute used for sorting.
    */
  var attributeName: String = js.native
  
  /**
    * The type of the sorting.
    *
    * By default, this attribute is set to ***ASC***.
    */
  var order: SortModeOrder | ASC | DESC = js.native
}
