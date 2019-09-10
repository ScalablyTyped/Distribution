package typings.tsutils.utilUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScopeBoundary extends js.Object

@JSImport("tsutils/util/util", "ScopeBoundary")
@js.native
object ScopeBoundary extends js.Object {
  @js.native
  sealed trait Block extends ScopeBoundary
  
  @js.native
  sealed trait ConditionalType extends ScopeBoundary
  
  @js.native
  sealed trait Function extends ScopeBoundary
  
  @js.native
  sealed trait None extends ScopeBoundary
  
  @js.native
  sealed trait Type extends ScopeBoundary
  
  /* 2 */ val Block: typings.tsutils.utilUtilMod.ScopeBoundary.Block with Double = js.native
  /* 8 */ val ConditionalType: typings.tsutils.utilUtilMod.ScopeBoundary.ConditionalType with Double = js.native
  /* 1 */ val Function: typings.tsutils.utilUtilMod.ScopeBoundary.Function with Double = js.native
  /* 0 */ val None: typings.tsutils.utilUtilMod.ScopeBoundary.None with Double = js.native
  /* 4 */ val Type: typings.tsutils.utilUtilMod.ScopeBoundary.Type with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScopeBoundary with Double] = js.native
}

