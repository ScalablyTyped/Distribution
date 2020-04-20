package typings.webpack.mod.compilation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompilationModule extends js.Object {
  var build: Boolean
  var dependencies: Boolean
  var issuer: Boolean
  var module: js.Any
}

object CompilationModule {
  @scala.inline
  def apply(build: Boolean, dependencies: Boolean, issuer: Boolean, module: js.Any): CompilationModule = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilationModule]
  }
}

