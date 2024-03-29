package typings.stylableWebpackPlugin

import typings.std.Set
import typings.stylableWebpackPlugin.anon.LogicModule
import typings.stylableWebpackPlugin.anon.Module
import typings.stylableWebpackPlugin.anon.ShallowPartialStylableWeb
import typings.stylableWebpackPlugin.stylableModuleHelpersMod.MultiMap
import typings.stylableWebpackPlugin.typesMod.CalcResult
import typings.stylableWebpackPlugin.typesMod.StylableModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@stylable/webpack-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@stylable/webpack-plugin", "StylableWebpackPlugin")
  @js.native
  class StylableWebpackPlugin ()
    extends typings.stylableWebpackPlugin.stylableWebpackPluginMod.StylableWebpackPlugin {
    def this(options: ShallowPartialStylableWeb) = this()
  }
  
  inline def calculateModuleDepthAndShallowStylableDependencies(module: StylableModule): CalcResult = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateModuleDepthAndShallowStylableDependencies")(module.asInstanceOf[js.Any]).asInstanceOf[CalcResult]
  inline def calculateModuleDepthAndShallowStylableDependencies(module: StylableModule, cssDependencies: js.Array[StylableModule]): CalcResult = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateModuleDepthAndShallowStylableDependencies")(module.asInstanceOf[js.Any], cssDependencies.asInstanceOf[js.Any])).asInstanceOf[CalcResult]
  inline def calculateModuleDepthAndShallowStylableDependencies(module: StylableModule, cssDependencies: js.Array[StylableModule], path: js.Array[StylableModule]): CalcResult = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateModuleDepthAndShallowStylableDependencies")(module.asInstanceOf[js.Any], cssDependencies.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[CalcResult]
  inline def calculateModuleDepthAndShallowStylableDependencies(
    module: StylableModule,
    cssDependencies: js.Array[StylableModule],
    path: js.Array[StylableModule],
    cache: MultiMap[StylableModule, CalcResult]
  ): CalcResult = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateModuleDepthAndShallowStylableDependencies")(module.asInstanceOf[js.Any], cssDependencies.asInstanceOf[js.Any], path.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[CalcResult]
  inline def calculateModuleDepthAndShallowStylableDependencies(
    module: StylableModule,
    cssDependencies: js.Array[StylableModule],
    path: Unit,
    cache: MultiMap[StylableModule, CalcResult]
  ): CalcResult = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateModuleDepthAndShallowStylableDependencies")(module.asInstanceOf[js.Any], cssDependencies.asInstanceOf[js.Any], path.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[CalcResult]
  inline def calculateModuleDepthAndShallowStylableDependencies(module: StylableModule, cssDependencies: Unit, path: js.Array[StylableModule]): CalcResult = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateModuleDepthAndShallowStylableDependencies")(module.asInstanceOf[js.Any], cssDependencies.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[CalcResult]
  inline def calculateModuleDepthAndShallowStylableDependencies(
    module: StylableModule,
    cssDependencies: Unit,
    path: js.Array[StylableModule],
    cache: MultiMap[StylableModule, CalcResult]
  ): CalcResult = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateModuleDepthAndShallowStylableDependencies")(module.asInstanceOf[js.Any], cssDependencies.asInstanceOf[js.Any], path.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[CalcResult]
  inline def calculateModuleDepthAndShallowStylableDependencies(
    module: StylableModule,
    cssDependencies: Unit,
    path: Unit,
    cache: MultiMap[StylableModule, CalcResult]
  ): CalcResult = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateModuleDepthAndShallowStylableDependencies")(module.asInstanceOf[js.Any], cssDependencies.asInstanceOf[js.Any], path.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[CalcResult]
  
  inline def findStylableComponents(stylableModules: js.Array[StylableModule]): js.Array[LogicModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("findStylableComponents")(stylableModules.asInstanceOf[js.Any]).asInstanceOf[js.Array[LogicModule]]
  
  inline def getCSSComponentLogicModule(stylableModule: StylableModule): StylableModule = ^.asInstanceOf[js.Dynamic].applyDynamic("getCSSComponentLogicModule")(stylableModule.asInstanceOf[js.Any]).asInstanceOf[StylableModule]
  
  inline def getDeepCSSDependencies(m: StylableModule): Set[StylableModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeepCSSDependencies")(m.asInstanceOf[js.Any]).asInstanceOf[Set[StylableModule]]
  inline def getDeepCSSDependencies(m: StylableModule, onlyUsed: Boolean): Set[StylableModule] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepCSSDependencies")(m.asInstanceOf[js.Any], onlyUsed.asInstanceOf[js.Any])).asInstanceOf[Set[StylableModule]]
  inline def getDeepCSSDependencies(m: StylableModule, onlyUsed: Boolean, deps: Unit, origin: StylableModule): Set[StylableModule] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepCSSDependencies")(m.asInstanceOf[js.Any], onlyUsed.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Set[StylableModule]]
  inline def getDeepCSSDependencies(m: StylableModule, onlyUsed: Boolean, deps: Set[StylableModule]): Set[StylableModule] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepCSSDependencies")(m.asInstanceOf[js.Any], onlyUsed.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Set[StylableModule]]
  inline def getDeepCSSDependencies(m: StylableModule, onlyUsed: Boolean, deps: Set[StylableModule], origin: StylableModule): Set[StylableModule] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepCSSDependencies")(m.asInstanceOf[js.Any], onlyUsed.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Set[StylableModule]]
  inline def getDeepCSSDependencies(m: StylableModule, onlyUsed: Unit, deps: Unit, origin: StylableModule): Set[StylableModule] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepCSSDependencies")(m.asInstanceOf[js.Any], onlyUsed.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Set[StylableModule]]
  inline def getDeepCSSDependencies(m: StylableModule, onlyUsed: Unit, deps: Set[StylableModule]): Set[StylableModule] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepCSSDependencies")(m.asInstanceOf[js.Any], onlyUsed.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Set[StylableModule]]
  inline def getDeepCSSDependencies(m: StylableModule, onlyUsed: Unit, deps: Set[StylableModule], origin: StylableModule): Set[StylableModule] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepCSSDependencies")(m.asInstanceOf[js.Any], onlyUsed.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Set[StylableModule]]
  
  inline def getStylableModulesFromCompilation(
    compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ js.Any
  ): js.Array[StylableModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStylableModulesFromCompilation")(compilation.asInstanceOf[js.Any]).asInstanceOf[js.Array[StylableModule]]
  
  inline def getStylableModulesFromDependencies(dependencies: js.Array[Module]): js.Array[StylableModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStylableModulesFromDependencies")(dependencies.asInstanceOf[js.Any]).asInstanceOf[js.Array[StylableModule]]
  
  inline def renderStaticCSS(modules: js.Any, mainTemplate: js.Any, hash: js.Any): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderStaticCSS")(modules.asInstanceOf[js.Any], mainTemplate.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def renderStaticCSS(
    modules: js.Any,
    mainTemplate: js.Any,
    hash: js.Any,
    filter: js.Function1[/* item */ js.Any, Boolean]
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderStaticCSS")(modules.asInstanceOf[js.Any], mainTemplate.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def sortedStylableModulesByDepth(modules: js.Array[StylableModule]): js.Array[StylableModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("sortedStylableModulesByDepth")(modules.asInstanceOf[js.Any]).asInstanceOf[js.Array[StylableModule]]
}
