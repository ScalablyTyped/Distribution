package typings.winrtUwp.Windows.Foundation.Metadata

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
  
}

