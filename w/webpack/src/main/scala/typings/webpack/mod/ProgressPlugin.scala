package typings.webpack.mod

import typings.webpack.webpackStrings.dependencies
import typings.webpack.webpackStrings.entries
import typings.webpack.webpackStrings.modules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressPlugin extends StObject {
  
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
  @JSName("apply")
  def apply(compiler: MultiCompiler): Unit = js.native
  
  var dependenciesCount: js.UndefOr[Double] = js.native
  
  var handler: js.UndefOr[
    js.Function3[/* percentage */ Double, /* msg */ String, /* repeated */ String, Unit]
  ] = js.native
  
  var modulesCount: js.UndefOr[Double] = js.native
  
  var percentBy: js.UndefOr[Null | modules | dependencies | entries] = js.native
  
  var profile: js.UndefOr[Null | Boolean] = js.native
  
  var showActiveModules: js.UndefOr[Boolean] = js.native
  
  var showDependencies: js.UndefOr[Boolean] = js.native
  
  var showEntries: js.UndefOr[Boolean] = js.native
  
  var showModules: js.UndefOr[Boolean] = js.native
}
