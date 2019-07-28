package typings.vegaDashLite.buildSrcCompileScaleTypeMod

import typings.vegaDashLite.buildSrcChannelMod.Channel
import typings.vegaDashLite.buildSrcFielddefMod.FieldDef
import typings.vegaDashLite.buildSrcMarkMod.Mark
import typings.vegaDashLite.buildSrcScaleMod.ScaleConfig
import typings.vegaDashLite.buildSrcScaleMod.ScaleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/scale/type", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def scaleType(
    specifiedType: ScaleType,
    channel: Channel,
    fieldDef: FieldDef[String],
    mark: Mark,
    scaleConfig: ScaleConfig
  ): ScaleType = js.native
}

