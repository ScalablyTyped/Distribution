package typings.tsutils.utilUtilMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScopeBoundarySelector extends StObject
@JSImport("tsutils/util/util", "ScopeBoundarySelector")
@js.native
object ScopeBoundarySelector extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScopeBoundarySelector & Double] = js.native
  
  @js.native
  sealed trait Block
    extends StObject
       with ScopeBoundarySelector
  /* 3 */ val Block: typings.tsutils.utilUtilMod.ScopeBoundarySelector.Block & Double = js.native
  
  @js.native
  sealed trait Function
    extends StObject
       with ScopeBoundarySelector
  /* 1 */ val Function: typings.tsutils.utilUtilMod.ScopeBoundarySelector.Function & Double = js.native
  
  @js.native
  sealed trait InferType
    extends StObject
       with ScopeBoundarySelector
  /* 8 */ val InferType: typings.tsutils.utilUtilMod.ScopeBoundarySelector.InferType & Double = js.native
  
  @js.native
  sealed trait Type
    extends StObject
       with ScopeBoundarySelector
  /* 7 */ val Type: typings.tsutils.utilUtilMod.ScopeBoundarySelector.Type & Double = js.native
}
