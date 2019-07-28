package typings.winrtDashUwp.WindowsNs.FoundationNs.MetadataNs

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
  sealed trait `protected` extends CompositionType
  
  /** Indicates that access to the programming element is not restricted. */
  @js.native
  sealed trait public extends CompositionType
  
  /* 0 */ val `protected`: typings.winrtDashUwp.WindowsNs.FoundationNs.MetadataNs.CompositionType.`protected` with Double = js.native
  /* 1 */ val public: typings.winrtDashUwp.WindowsNs.FoundationNs.MetadataNs.CompositionType.public with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompositionType with Double] = js.native
}

