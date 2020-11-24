package typings.webpackVirtualModules.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Plugin that allows dynamic generation of in-memory virtual modules for JavaScript builds
  * created with webpack.
  */
@JSImport("webpack-virtual-modules", JSImport.Namespace)
@js.native
class ^ () extends VirtualModulesPlugin {
  def this(modules: Record[String, String]) = this()
}
