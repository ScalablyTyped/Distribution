package typings.winrtDashUwp.Windows.Foundation.Metadata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeprecationType extends js.Object

/** Indicates a deprecation as Deprecate or Remove. */
@JSGlobal("Windows.Foundation.Metadata.DeprecationType")
@js.native
object DeprecationType extends js.Object {
  /** Compilers and other tools should treat the entity as deprecated. This is the default. */
  @js.native
  sealed trait deprecate extends DeprecationType
  
  /** Compilers and other tools should treat the entity as removed. */
  @js.native
  sealed trait remove extends DeprecationType
  
  /* 0 */ val deprecate: typings.winrtDashUwp.Windows.Foundation.Metadata.DeprecationType.deprecate with Double = js.native
  /* 1 */ val remove: typings.winrtDashUwp.Windows.Foundation.Metadata.DeprecationType.remove with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeprecationType with Double] = js.native
}

