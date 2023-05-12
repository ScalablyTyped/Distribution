package typings.webpack.mod

import typings.webpack.webpackStrings.dependencies
import typings.webpack.webpackStrings.entries
import typings.webpack.webpackStrings.modules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "ProgressPlugin")
@js.native
open class ProgressPlugin () extends StObject {
  def this(options: ProgressPluginArgument) = this()
  
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
  @JSName("apply")
  def apply(compiler: MultiCompiler): Unit = js.native
  
  var dependenciesCount: js.UndefOr[Double] = js.native
  
  var handler: js.UndefOr[
    js.Function3[/* percentage */ Double, /* msg */ String, /* repeated */ String, Unit]
  ] = js.native
  
  var modulesCount: js.UndefOr[Double] = js.native
  
  var percentBy: js.UndefOr[Null | entries | modules | dependencies] = js.native
  
  var profile: js.UndefOr[Null | Boolean] = js.native
  
  var showActiveModules: js.UndefOr[Boolean] = js.native
  
  var showDependencies: js.UndefOr[Boolean] = js.native
  
  var showEntries: js.UndefOr[Boolean] = js.native
  
  var showModules: js.UndefOr[Boolean] = js.native
}
object ProgressPlugin {
  
  @JSImport("webpack", "ProgressPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  object defaultOptions {
    
    @JSImport("webpack", "ProgressPlugin.defaultOptions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webpack", "ProgressPlugin.defaultOptions.activeModules")
    @js.native
    def activeModules: Boolean = js.native
    inline def activeModules_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeModules")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "ProgressPlugin.defaultOptions.dependencies")
    @js.native
    def dependencies: Boolean = js.native
    
    @JSImport("webpack", "ProgressPlugin.defaultOptions.dependenciesCount")
    @js.native
    def dependenciesCount: Double = js.native
    inline def dependenciesCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependenciesCount")(x.asInstanceOf[js.Any])
    
    inline def dependencies_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "ProgressPlugin.defaultOptions.entries")
    @js.native
    def entries: Boolean = js.native
    inline def entries_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("entries")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "ProgressPlugin.defaultOptions.modules")
    @js.native
    def modules: Boolean = js.native
    
    @JSImport("webpack", "ProgressPlugin.defaultOptions.modulesCount")
    @js.native
    def modulesCount: Double = js.native
    inline def modulesCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modulesCount")(x.asInstanceOf[js.Any])
    
    inline def modules_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modules")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "ProgressPlugin.defaultOptions.profile")
    @js.native
    def profile: Boolean = js.native
    inline def profile_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("profile")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  inline def getReporter(compiler: Compiler): js.Function2[/* p */ Double, /* repeated */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getReporter")(compiler.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* p */ Double, /* repeated */ String, Unit]]
}
