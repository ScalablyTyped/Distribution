package typings
package vegaDashLiteLib.buildSrcCompileAxisComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/axis/component", "AxisComponent")
@js.native
class AxisComponent ()
  extends vegaDashLiteLib.buildSrcCompileSplitMod.Split[AxisComponentProps] {
  def this(explicit: stdLib.Partial[AxisComponentProps]) = this()
  def this(explicit: stdLib.Partial[AxisComponentProps], `implicit`: stdLib.Partial[AxisComponentProps]) = this()
  def this(explicit: stdLib.Partial[AxisComponentProps], `implicit`: stdLib.Partial[AxisComponentProps], mainExtracted: scala.Boolean) = this()
  var mainExtracted: scala.Boolean = js.native
  def hasAxisPart(part: vegaDashLiteLib.buildSrcAxisMod.AxisPart): scala.Boolean = js.native
}

