package typings.webpack.webpackMod.compilation

import typings.tapable.tapableMod.Tapable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "compilation.ModuleTemplate")
@js.native
class ModuleTemplate () extends Tapable {
  var hooks: ModuleTemplateHooks = js.native
}

