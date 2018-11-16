package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs

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
  sealed trait deprecate
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.DeprecationType
  
  /** Compilers and other tools should treat the entity as removed. */
  @js.native
  sealed trait remove
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.DeprecationType
  
  val deprecate: deprecate with java.lang.String = js.native
  val remove: remove with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.DeprecationType with java.lang.String
  ] = js.native
}

