package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web", "SortMode")
@js.native
open class SortMode protected () extends StObject {
  def this(attributeName: String) = this()
  def this(attributeName: String, order: SortModeOrder) = this()
  
  /**
    * The name of the object attribute used for sorting.
    */
  var attributeName: String = js.native
  
  /**
    * The type of the sorting.
    *
    * By default, this attribute is set to ASC.
    */
  var order: SortModeOrder = js.native
}
