package typings.webpack.webpackMod.compilation

import typings.tapable.tapableMod.Tapable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "compilation.NormalModuleFactory")
@js.native
class NormalModuleFactory () extends Tapable {
  var hooks: NormalModuleFactoryHooks = js.native
}

