package typings.winrtDashUwp.Windows.ApplicationModel.Store

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
  sealed trait consumable extends ProductType
  
  /** A durable product. */
  @js.native
  sealed trait durable extends ProductType
  
  /** The product type is unknown. */
  @js.native
  sealed trait unknown extends ProductType
  
  /* 2 */ val consumable: typings.winrtDashUwp.Windows.ApplicationModel.Store.ProductType.consumable with Double = js.native
  /* 1 */ val durable: typings.winrtDashUwp.Windows.ApplicationModel.Store.ProductType.durable with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.Windows.ApplicationModel.Store.ProductType.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProductType with Double] = js.native
}

