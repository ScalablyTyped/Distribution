package typings.winrtDashUwp.Windows.ApplicationModel.Store

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Store.ProductType.consumable
import typings.winrtDashUwp.Windows.ApplicationModel.Store.ProductType.durable
import typings.winrtDashUwp.Windows.ApplicationModel.Store.ProductType.unknown
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ProductType with Double] = js.native
  /* 2 */ @js.native
  object consumable extends TopLevel[consumable with Double]
  
  /* 1 */ @js.native
  object durable extends TopLevel[durable with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

