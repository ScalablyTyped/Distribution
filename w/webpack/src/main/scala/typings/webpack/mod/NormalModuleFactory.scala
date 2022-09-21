package typings.webpack.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.std.WeakMap
import typings.webpack.anon.ReadonlyresolveAsyncSerie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NormalModuleFactory
  extends StObject
     with ModuleFactory {
  
  def cleanupForCache(): Unit = js.native
  
  var context: String = js.native
  
  def createGenerator(): Any = js.native
  def createGenerator(`type`: Any): Any = js.native
  def createGenerator(`type`: Any, generatorOptions: js.Object): Any = js.native
  def createGenerator(`type`: Unit, generatorOptions: js.Object): Any = js.native
  
  def createParser(`type`: String): Parser = js.native
  def createParser(`type`: String, parserOptions: StringDictionary[Any]): Parser = js.native
  
  var fs: InputFileSystem = js.native
  
  var generatorCache: Map[String, WeakMap[js.Object, typings.std.Generator[Any, Any, Any]]] = js.native
  
  def getGenerator(): js.UndefOr[typings.std.Generator[Any, Any, Any]] = js.native
  def getGenerator(`type`: Any): js.UndefOr[typings.std.Generator[Any, Any, Any]] = js.native
  def getGenerator(`type`: Any, generatorOptions: js.Object): js.UndefOr[typings.std.Generator[Any, Any, Any]] = js.native
  def getGenerator(`type`: Unit, generatorOptions: js.Object): js.UndefOr[typings.std.Generator[Any, Any, Any]] = js.native
  
  def getParser(): Any = js.native
  def getParser(`type`: Any): Any = js.native
  def getParser(`type`: Any, parserOptions: js.Object): Any = js.native
  def getParser(`type`: Unit, parserOptions: js.Object): Any = js.native
  
  def getResolver(): ResolverWithOptions = js.native
  def getResolver(`type`: Any): ResolverWithOptions = js.native
  def getResolver(`type`: Any, resolveOptions: Any): ResolverWithOptions = js.native
  def getResolver(`type`: Unit, resolveOptions: Any): ResolverWithOptions = js.native
  
  var hooks: ReadonlyresolveAsyncSerie = js.native
  
  var parserCache: Map[String, WeakMap[js.Object, Any]] = js.native
  
  def resolveRequestArray(
    contextInfo: js.UndefOr[Any],
    context: js.UndefOr[Any],
    array: js.UndefOr[Any],
    resolver: js.UndefOr[Any],
    resolveContext: js.UndefOr[Any],
    callback: js.UndefOr[Any]
  ): Any = js.native
  
  def resolveResource(
    contextInfo: js.UndefOr[Any],
    context: js.UndefOr[Any],
    unresolvedResource: js.UndefOr[Any],
    resolver: js.UndefOr[Any],
    resolveContext: js.UndefOr[Any],
    callback: js.UndefOr[Any]
  ): Unit = js.native
  
  var resolverFactory: ResolverFactory = js.native
  
  var ruleSet: RuleSet = js.native
}
