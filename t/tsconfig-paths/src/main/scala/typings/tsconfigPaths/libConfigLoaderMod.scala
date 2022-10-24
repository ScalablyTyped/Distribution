package typings.tsconfigPaths

import org.scalablytyped.runtime.StringDictionary
import typings.tsconfigPaths.libTsconfigLoaderMod.TsConfigLoaderParams
import typings.tsconfigPaths.libTsconfigLoaderMod.TsConfigLoaderResult
import typings.tsconfigPaths.tsconfigPathsStrings.failed
import typings.tsconfigPaths.tsconfigPathsStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConfigLoaderMod {
  
  @JSImport("tsconfig-paths/lib/config-loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def configLoader(param0: ConfigLoaderParams): ConfigLoaderResult = ^.asInstanceOf[js.Dynamic].applyDynamic("configLoader")(param0.asInstanceOf[js.Any]).asInstanceOf[ConfigLoaderResult]
  
  inline def loadConfig(): ConfigLoaderResult = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")().asInstanceOf[ConfigLoaderResult]
  inline def loadConfig(cwd: String): ConfigLoaderResult = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")(cwd.asInstanceOf[js.Any]).asInstanceOf[ConfigLoaderResult]
  
  trait ConfigLoaderFailResult
    extends StObject
       with ConfigLoaderResult {
    
    var message: String
    
    var resultType: failed
  }
  object ConfigLoaderFailResult {
    
    inline def apply(message: String): ConfigLoaderFailResult = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], resultType = "failed")
      __obj.asInstanceOf[ConfigLoaderFailResult]
    }
    
    extension [Self <: ConfigLoaderFailResult](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setResultType(value: failed): Self = StObject.set(x, "resultType", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConfigLoaderParams extends StObject {
    
    var cwd: String
    
    var explicitParams: js.UndefOr[ExplicitParams] = js.undefined
    
    var tsConfigLoader: js.UndefOr[TsConfigLoader] = js.undefined
  }
  object ConfigLoaderParams {
    
    inline def apply(cwd: String): ConfigLoaderParams = {
      val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigLoaderParams]
    }
    
    extension [Self <: ConfigLoaderParams](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setExplicitParams(value: ExplicitParams): Self = StObject.set(x, "explicitParams", value.asInstanceOf[js.Any])
      
      inline def setExplicitParamsUndefined: Self = StObject.set(x, "explicitParams", js.undefined)
      
      inline def setTsConfigLoader(value: /* params */ TsConfigLoaderParams => TsConfigLoaderResult): Self = StObject.set(x, "tsConfigLoader", js.Any.fromFunction1(value))
      
      inline def setTsConfigLoaderUndefined: Self = StObject.set(x, "tsConfigLoader", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tsconfigPaths.libConfigLoaderMod.ConfigLoaderSuccessResult
    - typings.tsconfigPaths.libConfigLoaderMod.ConfigLoaderFailResult
  */
  trait ConfigLoaderResult extends StObject
  object ConfigLoaderResult {
    
    inline def ConfigLoaderFailResult(message: String): typings.tsconfigPaths.libConfigLoaderMod.ConfigLoaderFailResult = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], resultType = "failed")
      __obj.asInstanceOf[typings.tsconfigPaths.libConfigLoaderMod.ConfigLoaderFailResult]
    }
    
    inline def ConfigLoaderSuccessResult(absoluteBaseUrl: String, configFileAbsolutePath: String, paths: StringDictionary[js.Array[String]]): typings.tsconfigPaths.libConfigLoaderMod.ConfigLoaderSuccessResult = {
      val __obj = js.Dynamic.literal(absoluteBaseUrl = absoluteBaseUrl.asInstanceOf[js.Any], configFileAbsolutePath = configFileAbsolutePath.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], resultType = "success")
      __obj.asInstanceOf[typings.tsconfigPaths.libConfigLoaderMod.ConfigLoaderSuccessResult]
    }
  }
  
  trait ConfigLoaderSuccessResult
    extends StObject
       with ConfigLoaderResult {
    
    var absoluteBaseUrl: String
    
    var addMatchAll: js.UndefOr[Boolean] = js.undefined
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var configFileAbsolutePath: String
    
    var mainFields: js.UndefOr[js.Array[String | js.Array[String]]] = js.undefined
    
    var paths: StringDictionary[js.Array[String]]
    
    var resultType: success
  }
  object ConfigLoaderSuccessResult {
    
    inline def apply(absoluteBaseUrl: String, configFileAbsolutePath: String, paths: StringDictionary[js.Array[String]]): ConfigLoaderSuccessResult = {
      val __obj = js.Dynamic.literal(absoluteBaseUrl = absoluteBaseUrl.asInstanceOf[js.Any], configFileAbsolutePath = configFileAbsolutePath.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], resultType = "success")
      __obj.asInstanceOf[ConfigLoaderSuccessResult]
    }
    
    extension [Self <: ConfigLoaderSuccessResult](x: Self) {
      
      inline def setAbsoluteBaseUrl(value: String): Self = StObject.set(x, "absoluteBaseUrl", value.asInstanceOf[js.Any])
      
      inline def setAddMatchAll(value: Boolean): Self = StObject.set(x, "addMatchAll", value.asInstanceOf[js.Any])
      
      inline def setAddMatchAllUndefined: Self = StObject.set(x, "addMatchAll", js.undefined)
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setConfigFileAbsolutePath(value: String): Self = StObject.set(x, "configFileAbsolutePath", value.asInstanceOf[js.Any])
      
      inline def setMainFields(value: js.Array[String | js.Array[String]]): Self = StObject.set(x, "mainFields", value.asInstanceOf[js.Any])
      
      inline def setMainFieldsUndefined: Self = StObject.set(x, "mainFields", js.undefined)
      
      inline def setMainFieldsVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "mainFields", js.Array(value*))
      
      inline def setPaths(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setResultType(value: success): Self = StObject.set(x, "resultType", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExplicitParams extends StObject {
    
    var addMatchAll: js.UndefOr[Boolean] = js.undefined
    
    var baseUrl: String
    
    var mainFields: js.UndefOr[js.Array[String | js.Array[String]]] = js.undefined
    
    var paths: StringDictionary[js.Array[String]]
  }
  object ExplicitParams {
    
    inline def apply(baseUrl: String, paths: StringDictionary[js.Array[String]]): ExplicitParams = {
      val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExplicitParams]
    }
    
    extension [Self <: ExplicitParams](x: Self) {
      
      inline def setAddMatchAll(value: Boolean): Self = StObject.set(x, "addMatchAll", value.asInstanceOf[js.Any])
      
      inline def setAddMatchAllUndefined: Self = StObject.set(x, "addMatchAll", js.undefined)
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setMainFields(value: js.Array[String | js.Array[String]]): Self = StObject.set(x, "mainFields", value.asInstanceOf[js.Any])
      
      inline def setMainFieldsUndefined: Self = StObject.set(x, "mainFields", js.undefined)
      
      inline def setMainFieldsVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "mainFields", js.Array(value*))
      
      inline def setPaths(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    }
  }
  
  type TsConfigLoader = js.Function1[/* params */ TsConfigLoaderParams, TsConfigLoaderResult]
}
