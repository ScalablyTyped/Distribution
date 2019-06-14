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
    /* 0 */ val Ascending: umbracoLib.umbracoNs.resourcesNs.Direction.Ascending with scala.Double = js.native
    /* 1 */ val Descending: umbracoLib.umbracoNs.resourcesNs.Direction.Descending with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[umbracoLib.umbracoNs.resourcesNs.Direction with scala.Double] = js.native
  }
  
  /**
    * LogType
    */
  @js.native
  object LogType extends js.Object {
    /* 0 */ val Debug: umbracoLib.umbracoNs.resourcesNs.LogType.Debug with scala.Double = js.native
    /* 1 */ val Info: umbracoLib.umbracoNs.resourcesNs.LogType.Info with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[umbracoLib.umbracoNs.resourcesNs.LogType with scala.Double] = js.native
  }
  
  /**
    * Property to order items by, default: `SortOrder`
    */
  @js.native
  object OrderItemsBy extends js.Object {
    /* 0 */ val SortOrder: umbracoLib.umbracoNs.resourcesNs.OrderItemsBy.SortOrder with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[umbracoLib.umbracoNs.resourcesNs.OrderItemsBy with scala.Double] = js.native
  }
  
}

