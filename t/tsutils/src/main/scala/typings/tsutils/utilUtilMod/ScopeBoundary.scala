package typings.tsutils.utilUtilMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScopeBoundary with Double] = js.native
  /* 2 */ @js.native
  object Block extends TopLevel[Block with Double]
  
  /* 8 */ @js.native
  object ConditionalType extends TopLevel[ConditionalType with Double]
  
  /* 1 */ @js.native
  object Function extends TopLevel[Function with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 4 */ @js.native
  object Type extends TopLevel[Type with Double]
  
}

