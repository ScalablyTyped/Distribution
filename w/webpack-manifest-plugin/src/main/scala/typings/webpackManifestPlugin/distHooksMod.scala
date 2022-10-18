package typings.webpackManifestPlugin

import typings.std.Record
import typings.webpack.mod.Compilation
import typings.webpack.mod.Compiler
import typings.webpack.mod.LoaderContext
import typings.webpack.mod.Module
import typings.webpackManifestPlugin.anon.ModuleAssets
import typings.webpackManifestPlugin.distMod.EmitCountMap
import typings.webpackManifestPlugin.distMod.InternalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksMod {
  
  @JSImport("webpack-manifest-plugin/dist/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def beforeRunHook(hasEmitCountMapManifestFileName: BeforeRunHookArgs, _underscore: Compiler, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeRunHook")(hasEmitCountMapManifestFileName.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def emitHook(
    hasCompilerEmitCountMapManifestAssetIdManifestFileNameModuleAssetsOptions: EmitHookArgs,
    compilation: Compilation
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("emitHook")(hasCompilerEmitCountMapManifestAssetIdManifestFileNameModuleAssetsOptions.asInstanceOf[js.Any], compilation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getCompilerHooks(compiler: Compiler): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getCompilerHooks")(compiler.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def normalModuleLoaderHook(hasModuleAssets: ModuleAssets, loaderContext: LoaderContext[Any], module: LegacyModule): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("normalModuleLoaderHook")(hasModuleAssets.asInstanceOf[js.Any], loaderContext.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait BeforeRunHookArgs extends StObject {
    
    var emitCountMap: EmitCountMap
    
    var manifestFileName: String
  }
  object BeforeRunHookArgs {
    
    inline def apply(emitCountMap: EmitCountMap, manifestFileName: String): BeforeRunHookArgs = {
      val __obj = js.Dynamic.literal(emitCountMap = emitCountMap.asInstanceOf[js.Any], manifestFileName = manifestFileName.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeRunHookArgs]
    }
    
    extension [Self <: BeforeRunHookArgs](x: Self) {
      
      inline def setEmitCountMap(value: EmitCountMap): Self = StObject.set(x, "emitCountMap", value.asInstanceOf[js.Any])
      
      inline def setManifestFileName(value: String): Self = StObject.set(x, "manifestFileName", value.asInstanceOf[js.Any])
    }
  }
  
  trait EmitHookArgs extends StObject {
    
    var compiler: Compiler
    
    var emitCountMap: EmitCountMap
    
    var manifestAssetId: String
    
    var manifestFileName: String
    
    var moduleAssets: Record[Any, Any]
    
    var options: InternalOptions
  }
  object EmitHookArgs {
    
    inline def apply(
      compiler: Compiler,
      emitCountMap: EmitCountMap,
      manifestAssetId: String,
      manifestFileName: String,
      moduleAssets: Record[Any, Any],
      options: InternalOptions
    ): EmitHookArgs = {
      val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], emitCountMap = emitCountMap.asInstanceOf[js.Any], manifestAssetId = manifestAssetId.asInstanceOf[js.Any], manifestFileName = manifestFileName.asInstanceOf[js.Any], moduleAssets = moduleAssets.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmitHookArgs]
    }
    
    extension [Self <: EmitHookArgs](x: Self) {
      
      inline def setCompiler(value: Compiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setEmitCountMap(value: EmitCountMap): Self = StObject.set(x, "emitCountMap", value.asInstanceOf[js.Any])
      
      inline def setManifestAssetId(value: String): Self = StObject.set(x, "manifestAssetId", value.asInstanceOf[js.Any])
      
      inline def setManifestFileName(value: String): Self = StObject.set(x, "manifestFileName", value.asInstanceOf[js.Any])
      
      inline def setModuleAssets(value: Record[Any, Any]): Self = StObject.set(x, "moduleAssets", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: InternalOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LegacyModule extends Module {
    
    var userRequest: js.UndefOr[Any] = js.native
  }
}
