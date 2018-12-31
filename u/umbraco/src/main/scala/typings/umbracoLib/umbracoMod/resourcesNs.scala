package typings
package umbracoLib.umbracoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("umbraco", "resources")
@js.native
object resourcesNs extends js.Object {
  trait IResourcePromise extends js.Object {
    var data: js.Any
    var errorMsg: java.lang.String
    var status: scala.Double
  }
  
  /**
    * Can be Ascending or Descending - Default: Ascending
    */
  @js.native
  object Direction extends js.Object {
    val Ascending: umbracoLib.umbracoNs.resourcesNs.Direction.Ascending with java.lang.String = js.native
    val Descending: umbracoLib.umbracoNs.resourcesNs.Direction.Descending with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[umbracoLib.umbracoNs.resourcesNs.Direction with java.lang.String] = js.native
  }
  
  /**
    * LogType
    */
  @js.native
  object LogType extends js.Object {
    val Debug: umbracoLib.umbracoNs.resourcesNs.LogType.Debug with java.lang.String = js.native
    val Info: umbracoLib.umbracoNs.resourcesNs.LogType.Info with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[umbracoLib.umbracoNs.resourcesNs.LogType with java.lang.String] = js.native
  }
  
  /**
    * Property to order items by, default: `SortOrder`
    */
  @js.native
  object OrderItemsBy extends js.Object {
    val SortOrder: umbracoLib.umbracoNs.resourcesNs.OrderItemsBy.SortOrder with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[umbracoLib.umbracoNs.resourcesNs.OrderItemsBy with java.lang.String] = js.native
  }
  
  type Direction = umbracoLib.umbracoNs.resourcesNs.Direction
  type LogType = umbracoLib.umbracoNs.resourcesNs.LogType
  type OrderItemsBy = umbracoLib.umbracoNs.resourcesNs.OrderItemsBy
}

