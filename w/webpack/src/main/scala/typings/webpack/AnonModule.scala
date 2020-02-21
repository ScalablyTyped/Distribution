package typings.webpack

import typings.webpack.mod.compilation.Module
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonModule extends js.Object {
  var module: Module
}

object AnonModule {
  @scala.inline
  def apply(module: Module): AnonModule = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonModule]
  }
}

