package typings.vegaDashLite.buildSrcCompileRepeatMod

import typings.vegaDashLite.buildSrcCompileBaseconcatMod.BaseConcatModel
import typings.vegaDashLite.buildSrcCompileModelMod.Model
import typings.vegaDashLite.buildSrcCompileRepeaterMod.RepeaterValue
import typings.vegaDashLite.buildSrcConfigMod.Config
import typings.vegaDashLite.buildSrcRepeatMod.Repeat
import typings.vegaDashLite.buildSrcSpecMod.NormalizedRepeatSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/repeat", "RepeatModel")
@js.native
class RepeatModel protected () extends BaseConcatModel {
  def this(
    spec: NormalizedRepeatSpec,
    parent: Model,
    parentGivenName: String,
    repeatValues: RepeaterValue,
    config: Config
  ) = this()
  var _initChildren: js.Any = js.native
  val repeat: Repeat = js.native
  @JSName("type")
  val type_RepeatModel: typings.vegaDashLite.vegaDashLiteStrings.repeat = js.native
}

