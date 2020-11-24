package typings.stylefire

import typings.stylefire.anon.AllowTransformNone
import typings.stylefire.typesMod.ResolvedState
import typings.stylefire.typesMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stylefire/lib/css/build-styles", JSImport.Namespace)
@js.native
object buildStylesMod extends js.Object {
  
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
  
  def createStyleBuilder(): js.Function1[/* state */ State, ResolvedState] = js.native
  def createStyleBuilder(hasEnableHardwareAccelerationIsDashCaseAllowTransformNone: AllowTransformNone): js.Function1[/* state */ State, ResolvedState] = js.native
}
