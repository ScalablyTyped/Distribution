package typings.stylableWebpackPlugin

import typings.std.Map
import typings.std.Set
import typings.std.WeakMap
import typings.stylableWebpackPlugin.anon.LogicModule
import typings.stylableWebpackPlugin.anon.Module
import typings.stylableWebpackPlugin.typesMod.CalcResult
import typings.stylableWebpackPlugin.typesMod.StylableModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylableModuleHelpersMod {
  
  @JSImport("@stylable/webpack-plugin/cjs/stylable-module-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def calculateModuleDepthAndShallowStylableDependencies(module: StylableModule): CalcResult = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateModuleDepthAndShallowStylableDependencies")(module.asInstanceOf[js.Any]).asInstanceOf[CalcResult]
  @scala.inline
  def calculateModuleDepthAndShallowStylableDependencies(module: StylableModule, cssDependencies: js.Array[StylableModule]): CalcResult = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateModuleDepthAndShallowStylableDependencies")(module.asInstanceOf[js.Any], cssDependencies.asInstanceOf[js.Any])).asInstanceOf[CalcResult]
  @scala.inline
  def calculateModuleDepthAndShallowStylableDependencies(module: StylableModule, cssDependencies: js.Array[StylableModule], path: js.Array[StylableModule]): CalcResult = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateModuleDepthAndShallowStylableDependencies")(module.asInstanceOf[js.Any], cssDependencies.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[CalcResult]
  @scala.inline
  def calculateModuleDepthAndShallowStylableDependencies(
    module: StylableModule,
    cssDependencies: js.Array[StylableModule],
    path: js.Array[StylableModule],
    cache: MultiMap[StylableModule, CalcResult]
  ): CalcResult = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateModuleDepthAndShallowStylableDependencies")(module.asInstanceOf[js.Any], cssDependencies.asInstanceOf[js.Any], path.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[CalcResult]
  @scala.inline
  def calculateModuleDepthAndShallowStylableDependencies(
    module: StylableModule,
    cssDependencies: js.Array[StylableModule],
    path: Unit,
    cache: MultiMap[StylableModule, CalcResult]
  ): CalcResult = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateModuleDepthAndShallowStylableDependencies")(module.asInstanceOf[js.Any], cssDependencies.asInstanceOf[js.Any], path.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[CalcResult]
  @scala.inline
  def calculateModuleDepthAndShallowStylableDependencies(module: StylableModule, cssDependencies: Unit, path: js.Array[StylableModule]): CalcResult = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateModuleDepthAndShallowStylableDependencies")(module.asInstanceOf[js.Any], cssDependencies.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[CalcResult]
  @scala.inline
  def calculateModuleDepthAndShallowStylableDependencies(
    module: StylableModule,
    cssDependencies: Unit,
    path: js.Array[StylableModule],
    cache: MultiMap[StylableModule, CalcResult]
  ): CalcResult = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateModuleDepthAndShallowStylableDependencies")(module.asInstanceOf[js.Any], cssDependencies.asInstanceOf[js.Any], path.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[CalcResult]
  @scala.inline
  def calculateModuleDepthAndShallowStylableDependencies(
    module: StylableModule,
    cssDependencies: Unit,
    path: Unit,
    cache: MultiMap[StylableModule, CalcResult]
  ): CalcResult = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateModuleDepthAndShallowStylableDependencies")(module.asInstanceOf[js.Any], cssDependencies.asInstanceOf[js.Any], path.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[CalcResult]
  
  @scala.inline
  def findStylableComponents(stylableModules: js.Array[StylableModule]): js.Array[LogicModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("findStylableComponents")(stylableModules.asInstanceOf[js.Any]).asInstanceOf[js.Array[LogicModule]]
  
  @scala.inline
  def getCSSComponentLogicModule(stylableModule: StylableModule): StylableModule = ^.asInstanceOf[js.Dynamic].applyDynamic("getCSSComponentLogicModule")(stylableModule.asInstanceOf[js.Any]).asInstanceOf[StylableModule]
  
  @scala.inline
  def getDeepCSSDependencies(m: StylableModule): Set[StylableModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeepCSSDependencies")(m.asInstanceOf[js.Any]).asInstanceOf[Set[StylableModule]]
  @scala.inline
  def getDeepCSSDependencies(m: StylableModule, onlyUsed: Boolean): Set[StylableModule] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepCSSDependencies")(m.asInstanceOf[js.Any], onlyUsed.asInstanceOf[js.Any])).asInstanceOf[Set[StylableModule]]
  @scala.inline
  def getDeepCSSDependencies(m: StylableModule, onlyUsed: Boolean, deps: Unit, origin: StylableModule): Set[StylableModule] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepCSSDependencies")(m.asInstanceOf[js.Any], onlyUsed.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Set[StylableModule]]
  @scala.inline
  def getDeepCSSDependencies(m: StylableModule, onlyUsed: Boolean, deps: Set[StylableModule]): Set[StylableModule] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepCSSDependencies")(m.asInstanceOf[js.Any], onlyUsed.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Set[StylableModule]]
  @scala.inline
  def getDeepCSSDependencies(m: StylableModule, onlyUsed: Boolean, deps: Set[StylableModule], origin: StylableModule): Set[StylableModule] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepCSSDependencies")(m.asInstanceOf[js.Any], onlyUsed.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Set[StylableModule]]
  @scala.inline
  def getDeepCSSDependencies(m: StylableModule, onlyUsed: Unit, deps: Unit, origin: StylableModule): Set[StylableModule] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepCSSDependencies")(m.asInstanceOf[js.Any], onlyUsed.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Set[StylableModule]]
  @scala.inline
  def getDeepCSSDependencies(m: StylableModule, onlyUsed: Unit, deps: Set[StylableModule]): Set[StylableModule] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepCSSDependencies")(m.asInstanceOf[js.Any], onlyUsed.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Set[StylableModule]]
  @scala.inline
  def getDeepCSSDependencies(m: StylableModule, onlyUsed: Unit, deps: Set[StylableModule], origin: StylableModule): Set[StylableModule] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeepCSSDependencies")(m.asInstanceOf[js.Any], onlyUsed.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Set[StylableModule]]
  
  @scala.inline
  def getStylableModulesFromCompilation(
    compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ js.Any
  ): js.Array[StylableModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStylableModulesFromCompilation")(compilation.asInstanceOf[js.Any]).asInstanceOf[js.Array[StylableModule]]
  
  @scala.inline
  def getStylableModulesFromDependencies(dependencies: js.Array[Module]): js.Array[StylableModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStylableModulesFromDependencies")(dependencies.asInstanceOf[js.Any]).asInstanceOf[js.Array[StylableModule]]
  
  @scala.inline
  def renderStaticCSS(modules: js.Any, mainTemplate: js.Any, hash: js.Any): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderStaticCSS")(modules.asInstanceOf[js.Any], mainTemplate.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def renderStaticCSS(
    modules: js.Any,
    mainTemplate: js.Any,
    hash: js.Any,
    filter: js.Function1[/* item */ js.Any, Boolean]
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderStaticCSS")(modules.asInstanceOf[js.Any], mainTemplate.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def sortedStylableModulesByDepth(modules: js.Array[StylableModule]): js.Array[StylableModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("sortedStylableModulesByDepth")(modules.asInstanceOf[js.Any]).asInstanceOf[js.Array[StylableModule]]
  
  type MultiMap[K /* <: js.Object */, V] = (Map[K, V]) | (WeakMap[K, V])
}
