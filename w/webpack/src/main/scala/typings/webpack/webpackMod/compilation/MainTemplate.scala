package typings.webpack.webpackMod.compilation

import typings.tapable.tapableMod.Tapable
import typings.webpack.Anon_JsonpScript
import typings.webpack.webpackMod.Output
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "compilation.MainTemplate")
@js.native
class MainTemplate () extends Tapable {
  var hooks: Anon_JsonpScript = js.native
  var outputOptions: Output = js.native
  var requireFn: String = js.native
  def renderAddModule(hash: String, chunk: Chunk, varModuleId: js.UndefOr[scala.Nothing], varModule: String): String = js.native
  def renderAddModule(hash: String, chunk: Chunk, varModuleId: String, varModule: String): String = js.native
  def renderAddModule(hash: String, chunk: Chunk, varModuleId: Double, varModule: String): String = js.native
  def renderRequireFunctionForModule(hash: String, chunk: Chunk): String = js.native
  def renderRequireFunctionForModule(hash: String, chunk: Chunk, varModuleId: String): String = js.native
  def renderRequireFunctionForModule(hash: String, chunk: Chunk, varModuleId: Double): String = js.native
}

