package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProductType extends js.Object

/** Specifies the product type for an in-app product. */
@JSGlobal("Windows.ApplicationModel.Store.ProductType")
@js.native
object ProductType extends js.Object {
  /** A consumable product. */
  @js.native
  sealed trait consumable
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.ProductType
  
  /** A durable product. */
  @js.native
  sealed trait durable
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.ProductType
  
  /** The product type is unknown. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.ProductType
  
  val consumable: consumable with java.lang.String = js.native
  val durable: durable with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.StoreNs.ProductType with java.lang.String
  ] = js.native
}

