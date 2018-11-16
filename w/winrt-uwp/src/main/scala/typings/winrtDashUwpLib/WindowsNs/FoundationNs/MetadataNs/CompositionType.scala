package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CompositionType extends js.Object

/** Specifies the visibility of a programming element for which the composable attribute is applied. */
@JSGlobal("Windows.Foundation.Metadata.CompositionType")
@js.native
object CompositionType extends js.Object {
  /** Indicates that access to the programming element is limited to other elements in the containing class or types derived from the containing class. */
  @js.native
  sealed trait `protected`
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.CompositionType
  
  /** Indicates that access to the programming element is not restricted. */
  @js.native
  sealed trait public
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.CompositionType
  
  val `protected`: `protected` with java.lang.String = js.native
  val public: public with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.CompositionType with java.lang.String
  ] = js.native
}

