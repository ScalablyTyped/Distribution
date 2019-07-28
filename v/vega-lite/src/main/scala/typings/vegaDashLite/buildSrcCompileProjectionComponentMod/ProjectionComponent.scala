package typings.vegaDashLite.buildSrcCompileProjectionComponentMod

import typings.vegaDashLite.buildSrcCompileSplitMod.Split
import typings.vegaDashLite.buildSrcProjectionMod.Projection
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgProjection
import typings.vegaDashLite.buildSrcVegaDotSchemaMod.VgSignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/projection/component", "ProjectionComponent")
@js.native
class ProjectionComponent protected () extends Split[VgProjection] {
  def this(
    name: String,
    specifiedProjection: Projection,
    size: js.Array[VgSignalRef],
    data: js.Array[String | VgSignalRef]
  ) = this()
  var data: js.Array[String | VgSignalRef] = js.native
  var merged: Boolean = js.native
  var size: js.Array[VgSignalRef] = js.native
  var specifiedProjection: Projection = js.native
}

