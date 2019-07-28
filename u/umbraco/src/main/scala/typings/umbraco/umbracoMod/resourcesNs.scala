package typings.umbraco.umbracoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("umbraco", "resources")
@js.native
object resourcesNs extends js.Object {
  trait IResourcePromise extends js.Object {
    var data: js.Any
    var errorMsg: String
    var status: Double
  }
  
  /**
    * Can be Ascending or Descending - Default: Ascending
    */
  @js.native
  object Direction extends js.Object {
    /* 0 */ val Ascending: typings.umbraco.umbracoNs.resourcesNs.Direction.Ascending with Double = js.native
    /* 1 */ val Descending: typings.umbraco.umbracoNs.resourcesNs.Direction.Descending with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.umbraco.umbracoNs.resourcesNs.Direction with Double] = js.native
  }
  
  /**
    * LogType
    */
  @js.native
  object LogType extends js.Object {
    /* 0 */ val Debug: typings.umbraco.umbracoNs.resourcesNs.LogType.Debug with Double = js.native
    /* 1 */ val Info: typings.umbraco.umbracoNs.resourcesNs.LogType.Info with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.umbraco.umbracoNs.resourcesNs.LogType with Double] = js.native
  }
  
  /**
    * Property to order items by, default: `SortOrder`
    */
  @js.native
  object OrderItemsBy extends js.Object {
    /* 0 */ val SortOrder: typings.umbraco.umbracoNs.resourcesNs.OrderItemsBy.SortOrder with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.umbraco.umbracoNs.resourcesNs.OrderItemsBy with Double] = js.native
  }
  
}

