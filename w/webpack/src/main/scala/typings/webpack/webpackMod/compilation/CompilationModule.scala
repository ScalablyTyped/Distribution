package typings.webpack.webpackMod.compilation

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
    val __obj = js.Dynamic.literal(build = build, dependencies = dependencies, issuer = issuer, module = module)
  
    __obj.asInstanceOf[CompilationModule]
  }
}

