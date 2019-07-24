package typings
package webpackDashVirtualDashModulesLib.webpackDashVirtualDashModulesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Plugin that allows dynamic generation of in-memory virtual modules for JavaScript builds
  * created with webpack.
  */
@JSImport("webpack-virtual-modules", JSImport.Namespace)
@js.native
class ^ () extends VirtualModulesPlugin {
  def this(modules: stdLib.Record[java.lang.String, java.lang.String]) = this()
  /**
    * Attaches necessary hooks, in particular, `afterEnvironment`, `afterResolvers`, and `watchRun` hooks,
    * to ensure that the virtual files are added dynamically.
    */
  /* CompleteClass */
  @JSName("apply")
  override def apply(compiler: webpackLib.webpackMod.Compiler): scala.Unit = js.native
  /**
    * Writes a static or dynamic virtual module to a path.
    */
  /* CompleteClass */
  override def writeModule(filePath: java.lang.String, fileContents: java.lang.String): scala.Unit = js.native
}

