package typings.tsutils.utilUtilMod

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
  
  /* 3 */ val Block: typings.tsutils.utilUtilMod.ScopeBoundarySelector.Block with Double = js.native
  /* 1 */ val Function: typings.tsutils.utilUtilMod.ScopeBoundarySelector.Function with Double = js.native
  /* 8 */ val InferType: typings.tsutils.utilUtilMod.ScopeBoundarySelector.InferType with Double = js.native
  /* 7 */ val Type: typings.tsutils.utilUtilMod.ScopeBoundarySelector.Type with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScopeBoundarySelector with Double] = js.native
}

