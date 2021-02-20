package typings.tsconfigPaths

import org.scalablytyped.runtime.StringDictionary
import typings.tsconfigPaths.anon.BaseUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsconfigLoaderMod {
  
  @JSImport("tsconfig-paths/lib/tsconfig-loader", "loadTsconfig")
  @js.native
  def loadTsconfig(configFilePath: String): js.UndefOr[Tsconfig] = js.native
  @JSImport("tsconfig-paths/lib/tsconfig-loader", "loadTsconfig")
  @js.native
  def loadTsconfig(
    configFilePath: String,
    existsSync: js.UndefOr[scala.Nothing],
    readFileSync: js.Function1[/* filename */ String, String]
  ): js.UndefOr[Tsconfig] = js.native
  @JSImport("tsconfig-paths/lib/tsconfig-loader", "loadTsconfig")
  @js.native
  def loadTsconfig(configFilePath: String, existsSync: js.Function1[/* path */ String, Boolean]): js.UndefOr[Tsconfig] = js.native
  @JSImport("tsconfig-paths/lib/tsconfig-loader", "loadTsconfig")
  @js.native
  def loadTsconfig(
    configFilePath: String,
    existsSync: js.Function1[/* path */ String, Boolean],
    readFileSync: js.Function1[/* filename */ String, String]
  ): js.UndefOr[Tsconfig] = js.native
  
  @JSImport("tsconfig-paths/lib/tsconfig-loader", "tsConfigLoader")
  @js.native
  def tsConfigLoader(hasGetEnvCwdLoadSync: TsConfigLoaderParams): TsConfigLoaderResult = js.native
  
  @JSImport("tsconfig-paths/lib/tsconfig-loader", "walkForTsConfig")
  @js.native
  def walkForTsConfig(directory: String): js.UndefOr[String] = js.native
  @JSImport("tsconfig-paths/lib/tsconfig-loader", "walkForTsConfig")
  @js.native
  def walkForTsConfig(directory: String, existsSync: js.Function1[/* path */ String, Boolean]): js.UndefOr[String] = js.native
  
  @js.native
  trait TsConfigLoaderParams extends StObject {
    
    var cwd: String = js.native
    
    def getEnv(key: String): js.UndefOr[String] = js.native
    
    var loadSync: js.UndefOr[
        js.Function2[/* cwd */ String, /* filename */ js.UndefOr[String], TsConfigLoaderResult]
      ] = js.native
  }
  object TsConfigLoaderParams {
    
    @scala.inline
    def apply(cwd: String, getEnv: String => js.UndefOr[String]): TsConfigLoaderParams = {
      val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], getEnv = js.Any.fromFunction1(getEnv))
      __obj.asInstanceOf[TsConfigLoaderParams]
    }
    
    @scala.inline
    implicit class TsConfigLoaderParamsMutableBuilder[Self <: TsConfigLoaderParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetEnv(value: String => js.UndefOr[String]): Self = StObject.set(x, "getEnv", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadSync(value: (/* cwd */ String, /* filename */ js.UndefOr[String]) => TsConfigLoaderResult): Self = StObject.set(x, "loadSync", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadSyncUndefined: Self = StObject.set(x, "loadSync", js.undefined)
    }
  }
  
  @js.native
  trait TsConfigLoaderResult extends StObject {
    
    var baseUrl: js.UndefOr[String] = js.native
    
    var paths: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
    
    var tsConfigPath: js.UndefOr[String] = js.native
  }
  object TsConfigLoaderResult {
    
    @scala.inline
    def apply(): TsConfigLoaderResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TsConfigLoaderResult]
    }
    
    @scala.inline
    implicit class TsConfigLoaderResultMutableBuilder[Self <: TsConfigLoaderResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setPaths(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      @scala.inline
      def setTsConfigPath(value: String): Self = StObject.set(x, "tsConfigPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTsConfigPathUndefined: Self = StObject.set(x, "tsConfigPath", js.undefined)
    }
  }
  
  @js.native
  trait Tsconfig extends StObject {
    
    var compilerOptions: js.UndefOr[BaseUrl] = js.native
    
    var `extends`: js.UndefOr[String] = js.native
  }
  object Tsconfig {
    
    @scala.inline
    def apply(): Tsconfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tsconfig]
    }
    
    @scala.inline
    implicit class TsconfigMutableBuilder[Self <: Tsconfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompilerOptions(value: BaseUrl): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
      
      @scala.inline
      def setExtends(value: String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
    }
  }
}
