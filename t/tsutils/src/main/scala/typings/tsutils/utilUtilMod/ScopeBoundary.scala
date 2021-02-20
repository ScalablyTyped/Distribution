package typings.tsutils.utilUtilMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScopeBoundary extends StObject
@JSImport("tsutils/util/util", "ScopeBoundary")
@js.native
object ScopeBoundary extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScopeBoundary with Double] = js.native
  
  @js.native
  sealed trait Block extends ScopeBoundary
  /* 2 */ val Block: typings.tsutils.utilUtilMod.ScopeBoundary.Block with Double = js.native
  
  @js.native
  sealed trait ConditionalType extends ScopeBoundary
  /* 8 */ val ConditionalType: typings.tsutils.utilUtilMod.ScopeBoundary.ConditionalType with Double = js.native
  
  @js.native
  sealed trait Function extends ScopeBoundary
  /* 1 */ val Function: typings.tsutils.utilUtilMod.ScopeBoundary.Function with Double = js.native
  
  @js.native
  sealed trait None extends ScopeBoundary
  /* 0 */ val None: typings.tsutils.utilUtilMod.ScopeBoundary.None with Double = js.native
  
  @js.native
  sealed trait Type extends ScopeBoundary
  /* 4 */ val Type: typings.tsutils.utilUtilMod.ScopeBoundary.Type with Double = js.native
}
