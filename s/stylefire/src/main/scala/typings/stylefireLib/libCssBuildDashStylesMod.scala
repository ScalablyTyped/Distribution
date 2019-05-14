package typings
package stylefireLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stylefire/lib/css/build-styles", JSImport.Namespace)
@js.native
object libCssBuildDashStylesMod extends js.Object {
  def buildStyleProperty(
    state: stylefireLib.libStylerTypesMod.State,
    enableHardwareAcceleration: js.UndefOr[scala.Boolean],
    styles: js.UndefOr[stylefireLib.libStylerTypesMod.ResolvedState],
    transform: js.UndefOr[stylefireLib.libStylerTypesMod.ResolvedState],
    transformOrigin: js.UndefOr[stylefireLib.libStylerTypesMod.ResolvedState],
    transformKeys: js.UndefOr[js.Array[java.lang.String]],
    isDashCase: js.UndefOr[scala.Boolean]
  ): stylefireLib.libStylerTypesMod.ResolvedState = js.native
  def createStyleBuilder(): js.Function1[
    /* state */ stylefireLib.libStylerTypesMod.State, 
    stylefireLib.libStylerTypesMod.ResolvedState
  ] = js.native
  def createStyleBuilder(enableHardwareAcceleration: scala.Boolean): js.Function1[
    /* state */ stylefireLib.libStylerTypesMod.State, 
    stylefireLib.libStylerTypesMod.ResolvedState
  ] = js.native
}

