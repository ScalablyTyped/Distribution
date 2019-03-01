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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("dependencies")(dependencies)
    __obj.updateDynamic("issuer")(issuer)
    __obj.updateDynamic("module")(module)
    __obj.asInstanceOf[CompilationModule]
  }
}

