package typings
package webpackLib.webpackMod.webpackNs.compilationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompilationModule extends js.Object {
  var build: scala.Boolean
  var dependencies: scala.Boolean
  var issuer: scala.Boolean
  var module: js.Any
}

object CompilationModule {
  @scala.inline
  def apply(build: scala.Boolean, dependencies: scala.Boolean, issuer: scala.Boolean, module: js.Any): CompilationModule = {
    val __obj = js.Dynamic.literal(build = build, dependencies = dependencies, issuer = issuer, module = module)
  
    __obj.asInstanceOf[CompilationModule]
  }
}

