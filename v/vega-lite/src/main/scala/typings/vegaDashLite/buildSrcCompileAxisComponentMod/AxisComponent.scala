package typings.vegaDashLite.buildSrcCompileAxisComponentMod

import typings.std.Partial
import typings.vegaDashLite.buildSrcAxisMod.AxisPart
import typings.vegaDashLite.buildSrcCompileSplitMod.Split
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/axis/component", "AxisComponent")
@js.native
class AxisComponent () extends Split[AxisComponentProps] {
  def this(explicit: Partial[AxisComponentProps]) = this()
  def this(explicit: Partial[AxisComponentProps], `implicit`: Partial[AxisComponentProps]) = this()
  def this(
    explicit: Partial[AxisComponentProps],
    `implicit`: Partial[AxisComponentProps],
    mainExtracted: Boolean
  ) = this()
  var mainExtracted: Boolean = js.native
  def hasAxisPart(part: AxisPart): Boolean = js.native
}

