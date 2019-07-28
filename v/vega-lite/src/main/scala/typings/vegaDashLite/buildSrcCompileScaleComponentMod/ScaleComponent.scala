package typings.vegaDashLite.buildSrcCompileScaleComponentMod

import typings.vegaDashLite.buildSrcCompileSplitMod.Explicit
import typings.vegaDashLite.buildSrcCompileSplitMod.Split
import typings.vegaDashLite.buildSrcScaleMod.ScaleType
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgNonUnionDomain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/scale/component", "ScaleComponent")
@js.native
class ScaleComponent protected () extends Split[ScaleComponentProps] {
  def this(name: String, typeWithExplicit: Explicit[ScaleType]) = this()
  var domains: js.Array[VgNonUnionDomain] = js.native
  var merged: Boolean = js.native
}

