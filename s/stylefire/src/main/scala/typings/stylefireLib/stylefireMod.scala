package typings
package stylefireLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stylefire", JSImport.Namespace)
@js.native
object stylefireMod extends js.Object {
  def buildStyleProperty(
    state: stylefireLib.libStylerTypesMod.State,
    enableHardwareAcceleration: js.UndefOr[scala.Boolean],
    styles: js.UndefOr[stylefireLib.libStylerTypesMod.ResolvedState],
    transform: js.UndefOr[stylefireLib.libStylerTypesMod.ResolvedState],
    transformOrigin: js.UndefOr[stylefireLib.libStylerTypesMod.ResolvedState],
    transformKeys: js.UndefOr[js.Array[java.lang.String]],
    isDashCase: js.UndefOr[scala.Boolean]
  ): stylefireLib.libStylerTypesMod.ResolvedState = js.native
  def createStylerFactory(hasOnReadOnRenderUncachedValuesUseCache: stylefireLib.libStylerTypesMod.Config): js.Function1[
    /* hasProps */ js.UndefOr[stylefireLib.libStylerTypesMod.Props], 
    stylefireLib.libStylerTypesMod.Styler
  ] = js.native
  def default(nodeOrSelector: java.lang.String): stylefireLib.libStylerTypesMod.Styler = js.native
  def default(nodeOrSelector: java.lang.String, props: stylefireLib.libStylerTypesMod.Props): stylefireLib.libStylerTypesMod.Styler = js.native
  def default(nodeOrSelector: stdLib.Element): stylefireLib.libStylerTypesMod.Styler = js.native
  def default(nodeOrSelector: stdLib.Element, props: stylefireLib.libStylerTypesMod.Props): stylefireLib.libStylerTypesMod.Styler = js.native
  def default(nodeOrSelector: stdLib.Window): stylefireLib.libStylerTypesMod.Styler = js.native
  def default(nodeOrSelector: stdLib.Window, props: stylefireLib.libStylerTypesMod.Props): stylefireLib.libStylerTypesMod.Styler = js.native
  def isTransformProp(key: java.lang.String): scala.Boolean = js.native
}

