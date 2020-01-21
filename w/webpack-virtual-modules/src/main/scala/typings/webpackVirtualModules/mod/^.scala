package typings.webpackVirtualModules.mod

import typings.std.Record
import typings.webpack.mod.Compiler_
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
  def this(modules: Record[String, String]) = this()
  /**
    * Attaches necessary hooks, in particular, `afterEnvironment`, `afterResolvers`, and `watchRun` hooks,
    * to ensure that the virtual files are added dynamically.
    */
  /* CompleteClass */
  @JSName("apply")
  override def apply(compiler: Compiler_): Unit = js.native
  /**
    * Writes a static or dynamic virtual module to a path.
    */
  /* CompleteClass */
  override def writeModule(filePath: String, fileContents: String): Unit = js.native
}

