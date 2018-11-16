package typings
package tsutilsLib.utilUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScopeBoundary extends js.Object

@JSImport("tsutils/util/util", "ScopeBoundary")
@js.native
object ScopeBoundary extends js.Object {
  @js.native
  sealed trait Block
    extends tsutilsLib.utilUtilMod.ScopeBoundary
  
  @js.native
  sealed trait Function
    extends tsutilsLib.utilUtilMod.ScopeBoundary
  
  @js.native
  sealed trait None
    extends tsutilsLib.utilUtilMod.ScopeBoundary
  
  /* 2 */ val Block: Block with scala.Double = js.native
  /* 1 */ val Function: Function with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[tsutilsLib.utilUtilMod.ScopeBoundary with scala.Double] = js.native
}

