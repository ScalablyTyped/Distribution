package typings.winrt.Windows.Foundation.Metadata

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompositionType with Double] = js.native
  /* 0 */ @js.native
  object `protected` extends TopLevel[`protected` with Double]
  
  /* 1 */ @js.native
  object public extends TopLevel[public with Double]
  
}

