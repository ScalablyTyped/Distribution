package typings.webpack.mod

import typings.node.bufferMod.global.Buffer
import typings.webpack.anon.Absolutify
import typings.webpack.anon.FnCallContextRequestCallback
import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackStrings.development
import typings.webpack.webpackStrings.none
import typings.webpack.webpackStrings.production
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * These properties are added by the NormalModule
  */
@js.native
trait NormalModuleLoaderContext[OptionsType] extends StObject {
  
  var _compilation: js.UndefOr[Compilation] = js.native
  
  var _compiler: js.UndefOr[Compiler] = js.native
  
  var _module: js.UndefOr[NormalModule] = js.native
  
  def addBuildDependency(dep: String): Unit = js.native
  
  def emitError(error: js.Error): Unit = js.native
  
  def emitFile(name: String, content: String): Unit = js.native
  def emitFile(name: String, content: String, sourceMap: String): Unit = js.native
  def emitFile(name: String, content: String, sourceMap: String, assetInfo: AssetInfo): Unit = js.native
  def emitFile(name: String, content: String, sourceMap: Unit, assetInfo: AssetInfo): Unit = js.native
  def emitFile(name: String, content: Buffer): Unit = js.native
  def emitFile(name: String, content: Buffer, sourceMap: String): Unit = js.native
  def emitFile(name: String, content: Buffer, sourceMap: String, assetInfo: AssetInfo): Unit = js.native
  def emitFile(name: String, content: Buffer, sourceMap: Unit, assetInfo: AssetInfo): Unit = js.native
  
  def emitWarning(warning: js.Error): Unit = js.native
  
  var fs: InputFileSystem = js.native
  
  def getLogger(): WebpackLogger = js.native
  def getLogger(name: String): WebpackLogger = js.native
  
  def getOptions(): OptionsType = js.native
  @JSName("getOptions")
  def getOptions_0(
    schema: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<webpack.anon.FnCallSchemaOptionsConfiguration>[0] */ js.Any
  ): OptionsType = js.native
  
  def getResolve(): FnCallContextRequestCallback = js.native
  def getResolve(options: ResolveOptionsWithDependencyType): FnCallContextRequestCallback = js.native
  
  var mode: none | development | production = js.native
  
  @JSName("resolve")
  def resolve_false(
    context: String,
    request: String,
    callback: js.Function3[
      /* arg0 */ Null | js.Error, 
      /* arg1 */ js.UndefOr[String | `false`], 
      /* arg2 */ js.UndefOr[ResolveRequest], 
      Unit
    ]
  ): Any = js.native
  
  var rootContext: String = js.native
  
  var sourceMap: js.UndefOr[Boolean] = js.native
  
  var utils: Absolutify = js.native
  
  var version: Double = js.native
  
  var webpack: js.UndefOr[Boolean] = js.native
}
