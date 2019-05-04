package typings
package vegaDashLiteLib.buildSrcCompileConcatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-lite/build/src/compile/concat", "ConcatModel")
@js.native
class ConcatModel protected ()
  extends vegaDashLiteLib.buildSrcCompileBaseconcatMod.BaseConcatModel {
  def this(spec: vegaDashLiteLib.buildSrcSpecMod.NormalizedConcatSpec, parent: vegaDashLiteLib.buildSrcCompileModelMod.Model, parentGivenName: java.lang.String, repeater: vegaDashLiteLib.buildSrcCompileRepeaterMod.RepeaterValue, config: vegaDashLiteLib.buildSrcConfigMod.Config) = this()
  val isVConcat: scala.Boolean = js.native
  @JSName("type")
  val type_ConcatModel: vegaDashLiteLib.vegaDashLiteLibStrings.concat = js.native
  def parseAxisGroup(): scala.Unit = js.native
}

