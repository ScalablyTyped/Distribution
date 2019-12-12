package typings.tsutils.utilUtilMod

import org.scalablytyped.runtime.TopLevel
import typings.tsutils.utilUtilMod.ScopeBoundarySelector.Block
import typings.tsutils.utilUtilMod.ScopeBoundarySelector.Function
import typings.tsutils.utilUtilMod.ScopeBoundarySelector.InferType
import typings.tsutils.utilUtilMod.ScopeBoundarySelector.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScopeBoundarySelector extends js.Object

@JSImport("tsutils/util/util", "ScopeBoundarySelector")
@js.native
object ScopeBoundarySelector extends js.Object {
  @js.native
  sealed trait Block extends ScopeBoundarySelector
  
  @js.native
  sealed trait Function extends ScopeBoundarySelector
  
  @js.native
  sealed trait InferType extends ScopeBoundarySelector
  
  @js.native
  sealed trait Type extends ScopeBoundarySelector
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScopeBoundarySelector with Double] = js.native
  /* 3 */ @js.native
  object Block extends TopLevel[Block with Double]
  
  /* 1 */ @js.native
  object Function extends TopLevel[Function with Double]
  
  /* 8 */ @js.native
  object InferType extends TopLevel[InferType with Double]
  
  /* 7 */ @js.native
  object Type extends TopLevel[Type with Double]
  
}

