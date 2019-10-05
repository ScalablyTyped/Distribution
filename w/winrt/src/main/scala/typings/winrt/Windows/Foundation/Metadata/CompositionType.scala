package typings.winrt.Windows.Foundation.Metadata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CompositionType extends js.Object

@JSGlobal("Windows.Foundation.Metadata.CompositionType")
@js.native
object CompositionType extends js.Object {
  @js.native
  sealed trait `protected` extends CompositionType
  
  @js.native
  sealed trait public extends CompositionType
  
  /* 0 */ val `protected`: typings.winrt.Windows.Foundation.Metadata.CompositionType.`protected` with Double = js.native
  /* 1 */ val public: typings.winrt.Windows.Foundation.Metadata.CompositionType.public with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompositionType with Double] = js.native
}

