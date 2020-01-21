package typings.stylefire

import typings.stylefire.typesMod.ResolvedState
import typings.stylefire.typesMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    isDashCase: js.UndefOr[Boolean]
  ): ResolvedState = js.native
  def createStyleBuilder(): js.Function1[/* state */ State, ResolvedState] = js.native
  def createStyleBuilder(enableHardwareAcceleration: Boolean): js.Function1[/* state */ State, ResolvedState] = js.native
  def createStyleBuilder(enableHardwareAcceleration: Boolean, isDashCase: Boolean): js.Function1[/* state */ State, ResolvedState] = js.native
}

