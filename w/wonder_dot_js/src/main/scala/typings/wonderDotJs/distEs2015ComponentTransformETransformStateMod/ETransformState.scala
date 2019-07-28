package typings.wonderDotJs.distEs2015ComponentTransformETransformStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ETransformState extends js.Object

@JSImport("wonder.js/dist/es2015/component/transform/ETransformState", "ETransformState")
@js.native
object ETransformState extends js.Object {
  @js.native
  sealed trait ISLOCALROTATE extends ETransformState
  
  @js.native
  sealed trait ISLOCALSCALE extends ETransformState
  
  @js.native
  sealed trait ISLOCALTRANSLATE extends ETransformState
  
  @js.native
  sealed trait ISROTATE extends ETransformState
  
  @js.native
  sealed trait ISSCALE extends ETransformState
  
  @js.native
  sealed trait ISTRANSLATE extends ETransformState
  
  /* 4 */ val ISLOCALROTATE: typings.wonderDotJs.distEs2015ComponentTransformETransformStateMod.ETransformState.ISLOCALROTATE with Double = js.native
  /* 5 */ val ISLOCALSCALE: typings.wonderDotJs.distEs2015ComponentTransformETransformStateMod.ETransformState.ISLOCALSCALE with Double = js.native
  /* 3 */ val ISLOCALTRANSLATE: typings.wonderDotJs.distEs2015ComponentTransformETransformStateMod.ETransformState.ISLOCALTRANSLATE with Double = js.native
  /* 1 */ val ISROTATE: typings.wonderDotJs.distEs2015ComponentTransformETransformStateMod.ETransformState.ISROTATE with Double = js.native
  /* 2 */ val ISSCALE: typings.wonderDotJs.distEs2015ComponentTransformETransformStateMod.ETransformState.ISSCALE with Double = js.native
  /* 0 */ val ISTRANSLATE: typings.wonderDotJs.distEs2015ComponentTransformETransformStateMod.ETransformState.ISTRANSLATE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ETransformState with Double] = js.native
}

