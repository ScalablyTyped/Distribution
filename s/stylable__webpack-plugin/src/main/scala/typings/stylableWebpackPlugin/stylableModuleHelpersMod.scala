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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylableModuleHelpersMod {
  
  @JSImport("@stylable/webpack-plugin/cjs/stylable-module-helpers", "calculateModuleDepthAndShallowStylableDependencies")
  @js.native
  def calculateModuleDepthAndShallowStylableDependencies(module: StylableModule): CalcResult = js.native
  @JSImport("@stylable/webpack-plugin/cjs/stylable-module-helpers", "calculateModuleDepthAndShallowStylableDependencies")
  @js.native
  def calculateModuleDepthAndShallowStylableDependencies(
    module: StylableModule,
    cssDependencies: js.UndefOr[scala.Nothing],
    path: js.UndefOr[scala.Nothing],
    cache: MultiMap[StylableModule, CalcResult]
  ): CalcResult = js.native
  @JSImport("@stylable/webpack-plugin/cjs/stylable-module-helpers", "calculateModuleDepthAndShallowStylableDependencies")
  @js.native
  def calculateModuleDepthAndShallowStylableDependencies(module: StylableModule, cssDependencies: js.UndefOr[scala.Nothing], path: js.Array[StylableModule]): CalcResult = js.native
  @JSImport("@stylable/webpack-plugin/cjs/stylable-module-helpers", "calculateModuleDepthAndShallowStylableDependencies")
  @js.native
  def calculateModuleDepthAndShallowStylableDependencies(
    module: StylableModule,
    cssDependencies: js.UndefOr[scala.Nothing],
    path: js.Array[StylableModule],
    cache: MultiMap[StylableModule, CalcResult]
  ): CalcResult = js.native
  @JSImport("@stylable/webpack-plugin/cjs/stylable-module-helpers", "calculateModuleDepthAndShallowStylableDependencies")
  @js.native
  def calculateModuleDepthAndShallowStylableDependencies(module: StylableModule, cssDependencies: js.Array[StylableModule]): CalcResult = js.native
  @JSImport("@stylable/webpack-plugin/cjs/stylable-module-helpers", "calculateModuleDepthAndShallowStylableDependencies")
  @js.native
  def calculateModuleDepthAndShallowStylableDependencies(
    module: StylableModule,
    cssDependencies: js.Array[StylableModule],
    path: js.UndefOr[scala.Nothing],
    cache: MultiMap[StylableModule, CalcResult]
  ): CalcResult = js.native
  @JSImport("@stylable/webpack-plugin/cjs/stylable-module-helpers", "calculateModuleDepthAndShallowStylableDependencies")
  @js.native
  def calculateModuleDepthAndShallowStylableDependencies(module: StylableModule, cssDependencies: js.Array[StylableModule], path: js.Array[StylableModule]): CalcResult = js.native
  @JSImport("@stylable/webpack-plugin/cjs/stylable-module-helpers", "calculateModuleDepthAndShallowStylableDependencies")
  @js.native
  def calculateModuleDepthAndShallowStylableDependencies(
    module: StylableModule,
    cssDependencies: js.Array[StylableModule],
    path: js.Array[StylableModule],
    cache: MultiMap[StylableModule, CalcResult]
  ): CalcResult = js.native
  
  @JSImport("@stylable/webpack-plugin/cjs/stylable-module-helpers", "findStylableComponents")
  @js.native
  def findStylableComponents(stylableModules: js.Array[StylableModule]): js.Array[LogicModule] = js.native
  
  @JSImport("@stylable/webpack-plugin/cjs/stylable-module-helpers", "getCSSComponentLogicModule")
  @js.native
  def getCSSComponentLogicModule(stylableModule: StylableModule): StylableModule = js.native
  
  @JSImport("@stylable/webpack-plugin/cjs/stylable-module-helpers", "getDeepCSSDependencies")
  @js.native
  def getDeepCSSDependencies(m: StylableModule): Set[StylableModule] = js.native
  @JSImport("@stylable/webpack-plugin/cjs/stylable-module-helpers", "getDeepCSSDependencies")
  @js.native
  def getDeepCSSDependencies(
    m: StylableModule,
    onlyUsed: js.UndefOr[scala.Nothing],
    deps: js.UndefOr[scala.Nothing],
    origin: StylableModule
  ): Set[StylableModule] = js.native
  @JSImport("@stylable/webpack-plugin/cjs/stylable-module-helpers", "getDeepCSSDependencies")
  @js.native
  def getDeepCSSDependencies(m: StylableModule, onlyUsed: js.UndefOr[scala.Nothing], deps: Set[StylableModule]): Set[StylableModule] = js.native
  @JSImport("@stylable/webpack-plugin/cjs/stylable-module-helpers", "getDeepCSSDependencies")
  @js.native
  def getDeepCSSDependencies(
    m: StylableModule,
    onlyUsed: js.UndefOr[scala.Nothing],
    deps: Set[StylableModule],
    origin: StylableModule
  ): Set[StylableModule] = js.native
  @JSImport("@stylable/webpack-plugin/cjs/stylable-module-helpers", "getDeepCSSDependencies")
  @js.native
  def getDeepCSSDependencies(m: StylableModule, onlyUsed: Boolean): Set[StylableModule] = js.native
  @JSImport("@stylable/webpack-plugin/cjs/stylable-module-helpers", "getDeepCSSDependencies")
  @js.native
  def getDeepCSSDependencies(m: StylableModule, onlyUsed: Boolean, deps: js.UndefOr[scala.Nothing], origin: StylableModule): Set[StylableModule] = js.native
  @JSImport("@stylable/webpack-plugin/cjs/stylable-module-helpers", "getDeepCSSDependencies")
  @js.native
  def getDeepCSSDependencies(m: StylableModule, onlyUsed: Boolean, deps: Set[StylableModule]): Set[StylableModule] = js.native
  @JSImport("@stylable/webpack-plugin/cjs/stylable-module-helpers", "getDeepCSSDependencies")
  @js.native
  def getDeepCSSDependencies(m: StylableModule, onlyUsed: Boolean, deps: Set[StylableModule], origin: StylableModule): Set[StylableModule] = js.native
  
  @JSImport("@stylable/webpack-plugin/cjs/stylable-module-helpers", "getStylableModulesFromCompilation")
  @js.native
  def getStylableModulesFromCompilation(
    compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ js.Any
  ): js.Array[StylableModule] = js.native
  
  @JSImport("@stylable/webpack-plugin/cjs/stylable-module-helpers", "getStylableModulesFromDependencies")
  @js.native
  def getStylableModulesFromDependencies(dependencies: js.Array[Module]): js.Array[StylableModule] = js.native
  
  @JSImport("@stylable/webpack-plugin/cjs/stylable-module-helpers", "renderStaticCSS")
  @js.native
  def renderStaticCSS(modules: js.Any, mainTemplate: js.Any, hash: js.Any): js.Array[String] = js.native
  @JSImport("@stylable/webpack-plugin/cjs/stylable-module-helpers", "renderStaticCSS")
  @js.native
  def renderStaticCSS(
    modules: js.Any,
    mainTemplate: js.Any,
    hash: js.Any,
    filter: js.Function1[/* item */ js.Any, Boolean]
  ): js.Array[String] = js.native
  
  @JSImport("@stylable/webpack-plugin/cjs/stylable-module-helpers", "sortedStylableModulesByDepth")
  @js.native
  def sortedStylableModulesByDepth(modules: js.Array[StylableModule]): js.Array[StylableModule] = js.native
  
  type MultiMap[K /* <: js.Object */, V] = (Map[K, V]) | (WeakMap[K, V])
}
