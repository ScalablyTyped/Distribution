package typings.webpack.mod

import typings.node.bufferMod.global.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NormalModule extends Module {
  
  def applyNoParseRule(): Any = js.native
  def applyNoParseRule(rule: Any): Any = js.native
  def applyNoParseRule(rule: Any, content: Any): Any = js.native
  def applyNoParseRule(rule: Unit, content: Any): Any = js.native
  
  var binary: Boolean = js.native
  
  def createSource(context: String, content: String): Source = js.native
  def createSource(context: String, content: String, sourceMap: Any): Source = js.native
  def createSource(context: String, content: String, sourceMap: Any, associatedObjectForCache: js.Object): Source = js.native
  def createSource(context: String, content: String, sourceMap: Unit, associatedObjectForCache: js.Object): Source = js.native
  def createSource(context: String, content: Buffer): Source = js.native
  def createSource(context: String, content: Buffer, sourceMap: Any): Source = js.native
  def createSource(context: String, content: Buffer, sourceMap: Any, associatedObjectForCache: js.Object): Source = js.native
  def createSource(context: String, content: Buffer, sourceMap: Unit, associatedObjectForCache: js.Object): Source = js.native
  
  def createSourceForAsset(context: String, name: String, content: String): Source = js.native
  def createSourceForAsset(context: String, name: String, content: String, sourceMap: Any): Source = js.native
  def createSourceForAsset(
    context: String,
    name: String,
    content: String,
    sourceMap: Any,
    associatedObjectForCache: js.Object
  ): Source = js.native
  def createSourceForAsset(
    context: String,
    name: String,
    content: String,
    sourceMap: Unit,
    associatedObjectForCache: js.Object
  ): Source = js.native
  
  var error: js.UndefOr[Null | WebpackError] = js.native
  
  var generator: typings.std.Generator[Any, Any, Any] = js.native
  
  var generatorOptions: js.UndefOr[Record[String, Any]] = js.native
  
  def getCurrentLoader(): Null | LoaderItem = js.native
  def getCurrentLoader(loaderContext: Any): Null | LoaderItem = js.native
  def getCurrentLoader(loaderContext: Any, index: Any): Null | LoaderItem = js.native
  def getCurrentLoader(loaderContext: Unit, index: Any): Null | LoaderItem = js.native
  
  var loaders: js.Array[LoaderItem] = js.native
  
  def markModuleAsErrored(error: WebpackError): Unit = js.native
  
  var matchResource: js.UndefOr[String] = js.native
  
  var parser: Parser = js.native
  
  var parserOptions: js.UndefOr[Record[String, Any]] = js.native
  
  var rawRequest: String = js.native
  
  var request: String = js.native
  
  var resource: String = js.native
  
  var resourceResolveData: js.UndefOr[Record[String, Any]] = js.native
  
  def restoreFromUnsafeCache(): Unit = js.native
  def restoreFromUnsafeCache(unsafeCacheData: Any): Unit = js.native
  def restoreFromUnsafeCache(unsafeCacheData: Any, normalModuleFactory: Any): Unit = js.native
  def restoreFromUnsafeCache(unsafeCacheData: Unit, normalModuleFactory: Any): Unit = js.native
  
  def shouldPreventParsing(): Any = js.native
  def shouldPreventParsing(noParseRule: Any): Any = js.native
  def shouldPreventParsing(noParseRule: Any, request: Any): Any = js.native
  def shouldPreventParsing(noParseRule: Unit, request: Any): Any = js.native
  
  var userRequest: String = js.native
}
