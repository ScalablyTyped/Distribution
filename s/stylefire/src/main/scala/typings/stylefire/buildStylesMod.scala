package typings.stylefire

import typings.stylefire.anon.AllowTransformNone
import typings.stylefire.typesMod.ResolvedState
import typings.stylefire.typesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildStylesMod {
  
  @JSImport("stylefire/lib/css/build-styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def buildStyleProperty(
    state: State,
    enableHardwareAcceleration: js.UndefOr[Boolean],
    styles: js.UndefOr[ResolvedState],
    transform: js.UndefOr[ResolvedState],
    transformOrigin: js.UndefOr[ResolvedState],
    transformKeys: js.UndefOr[js.Array[String]],
    isDashCase: js.UndefOr[Boolean],
    allowTransformNone: js.UndefOr[Boolean]
  ): ResolvedState = (^.asInstanceOf[js.Dynamic].applyDynamic("buildStyleProperty")(state.asInstanceOf[js.Any], enableHardwareAcceleration.asInstanceOf[js.Any], styles.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], transformOrigin.asInstanceOf[js.Any], transformKeys.asInstanceOf[js.Any], isDashCase.asInstanceOf[js.Any], allowTransformNone.asInstanceOf[js.Any])).asInstanceOf[ResolvedState]
  
  @scala.inline
  def createStyleBuilder(): js.Function1[/* state */ State, ResolvedState] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStyleBuilder")().asInstanceOf[js.Function1[/* state */ State, ResolvedState]]
  @scala.inline
  def createStyleBuilder(hasEnableHardwareAccelerationIsDashCaseAllowTransformNone: AllowTransformNone): js.Function1[/* state */ State, ResolvedState] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStyleBuilder")(hasEnableHardwareAccelerationIsDashCaseAllowTransformNone.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* state */ State, ResolvedState]]
}
