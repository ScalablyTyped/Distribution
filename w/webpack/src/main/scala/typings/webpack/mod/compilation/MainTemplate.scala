package typings.webpack.mod.compilation

import typings.tapable.mod.Tapable
import typings.webpack.anon.AfterStartup
import typings.webpack.mod.Output
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "compilation.MainTemplate")
@js.native
class MainTemplate () extends Tapable {
  var hooks: AfterStartup = js.native
  var outputOptions: Output = js.native
  var requireFn: String = js.native
  def renderAddModule(hash: String, chunk: Chunk, varModuleId: js.UndefOr[Double | String], varModule: String): String = js.native
  def renderRequireFunctionForModule(hash: String, chunk: Chunk): String = js.native
  def renderRequireFunctionForModule(hash: String, chunk: Chunk, varModuleId: String): String = js.native
  def renderRequireFunctionForModule(hash: String, chunk: Chunk, varModuleId: Double): String = js.native
}

