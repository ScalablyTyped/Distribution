package typings.stylefire

import typings.stylefire.anon.AllowTransformNone
import typings.stylefire.typesMod.ResolvedState
import typings.stylefire.typesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildStylesMod {
  
  @JSImport("stylefire/lib/css/build-styles", "buildStyleProperty")
  @js.native
  def buildStyleProperty(
    state: State,
    enableHardwareAcceleration: js.UndefOr[Boolean],
    styles: js.UndefOr[ResolvedState],
    transform: js.UndefOr[ResolvedState],
    transformOrigin: js.UndefOr[ResolvedState],
    transformKeys: js.UndefOr[js.Array[String]],
    isDashCase: js.UndefOr[Boolean],
    allowTransformNone: js.UndefOr[Boolean]
  ): ResolvedState = js.native
  
  @JSImport("stylefire/lib/css/build-styles", "createStyleBuilder")
  @js.native
  def createStyleBuilder(): js.Function1[/* state */ State, ResolvedState] = js.native
  @JSImport("stylefire/lib/css/build-styles", "createStyleBuilder")
  @js.native
  def createStyleBuilder(hasEnableHardwareAccelerationIsDashCaseAllowTransformNone: AllowTransformNone): js.Function1[/* state */ State, ResolvedState] = js.native
}
