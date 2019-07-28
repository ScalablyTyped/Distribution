package typings.vegaDashLite.buildSrcCompileConcatMod

import typings.vegaDashLite.buildSrcCompileBaseconcatMod.BaseConcatModel
import typings.vegaDashLite.buildSrcCompileModelMod.Model
import typings.vegaDashLite.buildSrcCompileRepeaterMod.RepeaterValue
import typings.vegaDashLite.buildSrcConfigMod.Config
import typings.vegaDashLite.buildSrcSpecMod.NormalizedConcatSpec
import typings.vegaDashLite.vegaDashLiteStrings.concat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/concat", "ConcatModel")
@js.native
class ConcatModel protected () extends BaseConcatModel {
  def this(
    spec: NormalizedConcatSpec,
    parent: Model,
    parentGivenName: String,
    repeater: RepeaterValue,
    config: Config
  ) = this()
  val isVConcat: Boolean = js.native
  @JSName("type")
  val type_ConcatModel: concat = js.native
  def parseAxisGroup(): Unit = js.native
}

