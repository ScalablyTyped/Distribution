package typings.webpack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Module extends js.Object {
  var module: typings.webpack.mod.compilation.Module
}

object Module {
  @scala.inline
  def apply(module: typings.webpack.mod.compilation.Module): Module = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
}

