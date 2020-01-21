package typings.webpack.mod.compilation

import typings.tapable.mod.Tapable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "compilation.ContextModuleFactory")
@js.native
class ContextModuleFactory () extends Tapable {
  var hooks: ContextModuleFactoryHooks = js.native
}

