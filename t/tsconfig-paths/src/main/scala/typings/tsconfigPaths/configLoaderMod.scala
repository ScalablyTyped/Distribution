package typings.tsconfigPaths

import org.scalablytyped.runtime.StringDictionary
import typings.tsconfigPaths.tsconfigLoaderMod.TsConfigLoaderParams
import typings.tsconfigPaths.tsconfigLoaderMod.TsConfigLoaderResult
import typings.tsconfigPaths.tsconfigPathsStrings.failed
import typings.tsconfigPaths.tsconfigPathsStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configLoaderMod {
  
  @JSImport("tsconfig-paths/lib/config-loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def configLoader(hasCwdExplicitParamsTsConfigLoader: ConfigLoaderParams): ConfigLoaderResult = ^.asInstanceOf[js.Dynamic].applyDynamic("configLoader")(hasCwdExplicitParamsTsConfigLoader.asInstanceOf[js.Any]).asInstanceOf[ConfigLoaderResult]
  
  @scala.inline
  def loadConfig(): ConfigLoaderResult = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")().asInstanceOf[ConfigLoaderResult]
  @scala.inline
  def loadConfig(cwd: String): ConfigLoaderResult = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")(cwd.asInstanceOf[js.Any]).asInstanceOf[ConfigLoaderResult]
  
  trait ConfigLoaderFailResult
    extends StObject
       with ConfigLoaderResult {
    
    var message: String
    
    var resultType: failed
  }
  object ConfigLoaderFailResult {
    
    @scala.inline
    def apply(message: String): ConfigLoaderFailResult = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], resultType = "failed")
      __obj.asInstanceOf[ConfigLoaderFailResult]
    }
    
    @scala.inline
    implicit class ConfigLoaderFailResultMutableBuilder[Self <: ConfigLoaderFailResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultType(value: failed): Self = StObject.set(x, "resultType", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConfigLoaderParams extends StObject {
    
    var cwd: String
    
    var explicitParams: js.UndefOr[ExplicitParams] = js.undefined
    
    var tsConfigLoader: js.UndefOr[TsConfigLoader] = js.undefined
  }
  object ConfigLoaderParams {
    
    @scala.inline
    def apply(cwd: String): ConfigLoaderParams = {
      val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigLoaderParams]
    }
    
    @scala.inline
    implicit class ConfigLoaderParamsMutableBuilder[Self <: ConfigLoaderParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplicitParams(value: ExplicitParams): Self = StObject.set(x, "explicitParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplicitParamsUndefined: Self = StObject.set(x, "explicitParams", js.undefined)
      
      @scala.inline
      def setTsConfigLoader(value: /* params */ TsConfigLoaderParams => TsConfigLoaderResult): Self = StObject.set(x, "tsConfigLoader", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTsConfigLoaderUndefined: Self = StObject.set(x, "tsConfigLoader", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tsconfigPaths.configLoaderMod.ConfigLoaderSuccessResult
    - typings.tsconfigPaths.configLoaderMod.ConfigLoaderFailResult
  */
  trait ConfigLoaderResult extends StObject
  object ConfigLoaderResult {
    
    @scala.inline
    def ConfigLoaderFailResult(message: String): typings.tsconfigPaths.configLoaderMod.ConfigLoaderFailResult = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], resultType = "failed")
      __obj.asInstanceOf[typings.tsconfigPaths.configLoaderMod.ConfigLoaderFailResult]
    }
    
    @scala.inline
    def ConfigLoaderSuccessResult(
      absoluteBaseUrl: String,
      baseUrl: String,
      configFileAbsolutePath: String,
      paths: StringDictionary[js.Array[String]]
    ): typings.tsconfigPaths.configLoaderMod.ConfigLoaderSuccessResult = {
      val __obj = js.Dynamic.literal(absoluteBaseUrl = absoluteBaseUrl.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], configFileAbsolutePath = configFileAbsolutePath.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], resultType = "success")
      __obj.asInstanceOf[typings.tsconfigPaths.configLoaderMod.ConfigLoaderSuccessResult]
    }
  }
  
  trait ConfigLoaderSuccessResult
    extends StObject
       with ConfigLoaderResult {
    
    var absoluteBaseUrl: String
    
    var addMatchAll: js.UndefOr[Boolean] = js.undefined
    
    var baseUrl: String
    
    var configFileAbsolutePath: String
    
    var mainFields: js.UndefOr[js.Array[String]] = js.undefined
    
    var paths: StringDictionary[js.Array[String]]
    
    var resultType: success
  }
  object ConfigLoaderSuccessResult {
    
    @scala.inline
    def apply(
      absoluteBaseUrl: String,
      baseUrl: String,
      configFileAbsolutePath: String,
      paths: StringDictionary[js.Array[String]]
    ): ConfigLoaderSuccessResult = {
      val __obj = js.Dynamic.literal(absoluteBaseUrl = absoluteBaseUrl.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], configFileAbsolutePath = configFileAbsolutePath.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], resultType = "success")
      __obj.asInstanceOf[ConfigLoaderSuccessResult]
    }
    
    @scala.inline
    implicit class ConfigLoaderSuccessResultMutableBuilder[Self <: ConfigLoaderSuccessResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsoluteBaseUrl(value: String): Self = StObject.set(x, "absoluteBaseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddMatchAll(value: Boolean): Self = StObject.set(x, "addMatchAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddMatchAllUndefined: Self = StObject.set(x, "addMatchAll", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigFileAbsolutePath(value: String): Self = StObject.set(x, "configFileAbsolutePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainFields(value: js.Array[String]): Self = StObject.set(x, "mainFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainFieldsUndefined: Self = StObject.set(x, "mainFields", js.undefined)
      
      @scala.inline
      def setMainFieldsVarargs(value: String*): Self = StObject.set(x, "mainFields", js.Array(value :_*))
      
      @scala.inline
      def setPaths(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultType(value: success): Self = StObject.set(x, "resultType", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExplicitParams extends StObject {
    
    var addMatchAll: js.UndefOr[Boolean] = js.undefined
    
    var baseUrl: String
    
    var mainFields: js.UndefOr[js.Array[String]] = js.undefined
    
    var paths: StringDictionary[js.Array[String]]
  }
  object ExplicitParams {
    
    @scala.inline
    def apply(baseUrl: String, paths: StringDictionary[js.Array[String]]): ExplicitParams = {
      val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExplicitParams]
    }
    
    @scala.inline
    implicit class ExplicitParamsMutableBuilder[Self <: ExplicitParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddMatchAll(value: Boolean): Self = StObject.set(x, "addMatchAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddMatchAllUndefined: Self = StObject.set(x, "addMatchAll", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainFields(value: js.Array[String]): Self = StObject.set(x, "mainFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainFieldsUndefined: Self = StObject.set(x, "mainFields", js.undefined)
      
      @scala.inline
      def setMainFieldsVarargs(value: String*): Self = StObject.set(x, "mainFields", js.Array(value :_*))
      
      @scala.inline
      def setPaths(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    }
  }
  
  type TsConfigLoader = js.Function1[/* params */ TsConfigLoaderParams, TsConfigLoaderResult]
}
