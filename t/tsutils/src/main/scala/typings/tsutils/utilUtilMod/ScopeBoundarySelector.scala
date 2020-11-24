package typings.tsutils.utilUtilMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScopeBoundarySelector extends js.Object
@JSImport("tsutils/util/util", "ScopeBoundarySelector")
@js.native
object ScopeBoundarySelector extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScopeBoundarySelector with Double] = js.native
  
  @js.native
  sealed trait Block extends ScopeBoundarySelector
  /* 3 */ @js.native
  object Block extends TopLevel[Block with Double]
  
  @js.native
  sealed trait Function extends ScopeBoundarySelector
  /* 1 */ @js.native
  object Function extends TopLevel[Function with Double]
  
  @js.native
  sealed trait InferType extends ScopeBoundarySelector
  /* 8 */ @js.native
  object InferType extends TopLevel[InferType with Double]
  
  @js.native
  sealed trait Type extends ScopeBoundarySelector
  /* 7 */ @js.native
  object Type extends TopLevel[Type with Double]
}
