package typings.vegaDashLite.buildSrcCompileBaseconcatMod

import typings.vegaDashLite.buildSrcCompileModelMod.Model
import typings.vegaDashLite.buildSrcCompileRepeaterMod.RepeaterValue
import typings.vegaDashLite.buildSrcConfigMod.Config
import typings.vegaDashLite.buildSrcResolveMod.Resolve
import typings.vegaDashLite.buildSrcSpecMod.BaseSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/baseconcat", "BaseConcatModel")
@js.native
abstract class BaseConcatModel protected () extends Model {
  def this(
    spec: BaseSpec,
    parent: Model,
    parentGivenName: String,
    config: Config,
    repeater: RepeaterValue,
    resolve: Resolve
  ) = this()
}

