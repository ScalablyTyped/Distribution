package typings
package webpackDashVirtualDashModulesLib.webpackDashVirtualDashModulesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Plugin that allows dynamic generation of in-memory virtual modules for JavaScript builds
  * created with webpack.
  */
trait VirtualModulesPlugin extends js.Object {
  /**
    * Attaches necessary hooks, in particular, `afterEnvironment`, `afterResolvers`, and `watchRun` hooks,
    * to ensure that the virtual files are added dynamically.
    */
  @JSName("apply")
  def apply(compiler: webpackLib.webpackMod.Compiler): scala.Unit
  /**
    * Writes a static or dynamic virtual module to a path.
    */
  def writeModule(filePath: java.lang.String, fileContents: java.lang.String): scala.Unit
}

object VirtualModulesPlugin {
  @scala.inline
  def apply(
    apply: webpackLib.webpackMod.Compiler => scala.Unit,
    writeModule: (java.lang.String, java.lang.String) => scala.Unit
  ): VirtualModulesPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), writeModule = js.Any.fromFunction2(writeModule))
  
    __obj.asInstanceOf[VirtualModulesPlugin]
  }
}

