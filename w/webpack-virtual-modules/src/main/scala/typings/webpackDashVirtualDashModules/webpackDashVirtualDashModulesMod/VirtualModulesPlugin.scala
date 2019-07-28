package typings.webpackDashVirtualDashModules.webpackDashVirtualDashModulesMod

import typings.webpack.webpackMod.Compiler
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
  def apply(compiler: Compiler): Unit
  /**
    * Writes a static or dynamic virtual module to a path.
    */
  def writeModule(filePath: String, fileContents: String): Unit
}

object VirtualModulesPlugin {
  @scala.inline
  def apply(apply: Compiler => Unit, writeModule: (String, String) => Unit): VirtualModulesPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), writeModule = js.Any.fromFunction2(writeModule))
  
    __obj.asInstanceOf[VirtualModulesPlugin]
  }
}

