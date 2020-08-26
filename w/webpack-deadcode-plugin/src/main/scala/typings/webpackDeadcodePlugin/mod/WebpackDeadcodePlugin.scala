package typings.webpackDeadcodePlugin.mod

import typings.std.Plugin
import typings.webpackDeadcodePlugin.anon.RequiredOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebpackDeadcodePlugin extends Plugin {
  var options: Options = js.native
  def handleAfterEmit(
    options: RequiredOptions,
    compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Compilation */ js.Any,
    callback: js.Function0[Unit]
  ): Unit = js.native
}

