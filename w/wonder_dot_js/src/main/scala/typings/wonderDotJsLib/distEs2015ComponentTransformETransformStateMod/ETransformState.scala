package typings
package wonderDotJsLib.distEs2015ComponentTransformETransformStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ETransformState extends js.Object

@JSImport("wonder.js/dist/es2015/component/transform/ETransformState", "ETransformState")
@js.native
object ETransformState extends js.Object {
  @js.native
  sealed trait ISLOCALROTATE
    extends wonderDotJsLib.distEs2015ComponentTransformETransformStateMod.ETransformState
  
  @js.native
  sealed trait ISLOCALSCALE
    extends wonderDotJsLib.distEs2015ComponentTransformETransformStateMod.ETransformState
  
  @js.native
  sealed trait ISLOCALTRANSLATE
    extends wonderDotJsLib.distEs2015ComponentTransformETransformStateMod.ETransformState
  
  @js.native
  sealed trait ISROTATE
    extends wonderDotJsLib.distEs2015ComponentTransformETransformStateMod.ETransformState
  
  @js.native
  sealed trait ISSCALE
    extends wonderDotJsLib.distEs2015ComponentTransformETransformStateMod.ETransformState
  
  @js.native
  sealed trait ISTRANSLATE
    extends wonderDotJsLib.distEs2015ComponentTransformETransformStateMod.ETransformState
  
  /* 4 */ val ISLOCALROTATE: ISLOCALROTATE with scala.Double = js.native
  /* 5 */ val ISLOCALSCALE: ISLOCALSCALE with scala.Double = js.native
  /* 3 */ val ISLOCALTRANSLATE: ISLOCALTRANSLATE with scala.Double = js.native
  /* 1 */ val ISROTATE: ISROTATE with scala.Double = js.native
  /* 2 */ val ISSCALE: ISSCALE with scala.Double = js.native
  /* 0 */ val ISTRANSLATE: ISTRANSLATE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    wonderDotJsLib.distEs2015ComponentTransformETransformStateMod.ETransformState with scala.Double
  ] = js.native
}

