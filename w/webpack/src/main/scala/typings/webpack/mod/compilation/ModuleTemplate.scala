package typings.webpack.mod.compilation

import typings.tapable.mod.Tapable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "compilation.ModuleTemplate")
@js.native
class ModuleTemplate () extends Tapable {
  var hooks: ModuleTemplateHooks = js.native
}

