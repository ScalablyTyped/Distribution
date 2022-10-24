package typings.tsconfigPaths

import org.scalablytyped.runtime.StringDictionary
import typings.tsconfigPaths.anon.BaseUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTsconfigLoaderMod {
  
  @JSImport("tsconfig-paths/lib/tsconfig-loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadTsconfig(configFilePath: String): js.UndefOr[Tsconfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTsconfig")(configFilePath.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Tsconfig]]
  inline def loadTsconfig(configFilePath: String, existsSync: js.Function1[/* path */ String, Boolean]): js.UndefOr[Tsconfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTsconfig")(configFilePath.asInstanceOf[js.Any], existsSync.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Tsconfig]]
  inline def loadTsconfig(
    configFilePath: String,
    existsSync: js.Function1[/* path */ String, Boolean],
    readFileSync: js.Function1[/* filename */ String, String]
  ): js.UndefOr[Tsconfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTsconfig")(configFilePath.asInstanceOf[js.Any], existsSync.asInstanceOf[js.Any], readFileSync.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Tsconfig]]
  inline def loadTsconfig(
    configFilePath: String,
    existsSync: Unit,
    readFileSync: js.Function1[/* filename */ String, String]
  ): js.UndefOr[Tsconfig] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTsconfig")(configFilePath.asInstanceOf[js.Any], existsSync.asInstanceOf[js.Any], readFileSync.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Tsconfig]]
  
  inline def tsConfigLoader(param0: TsConfigLoaderParams): TsConfigLoaderResult = ^.asInstanceOf[js.Dynamic].applyDynamic("tsConfigLoader")(param0.asInstanceOf[js.Any]).asInstanceOf[TsConfigLoaderResult]
  
  inline def walkForTsConfig(directory: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("walkForTsConfig")(directory.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def walkForTsConfig(directory: String, readdirSync: js.Function1[/* path */ String, js.Array[String]]): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("walkForTsConfig")(directory.asInstanceOf[js.Any], readdirSync.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  trait TsConfigLoaderParams extends StObject {
    
    var cwd: String
    
    def getEnv(key: String): js.UndefOr[String]
    
    var loadSync: js.UndefOr[
        js.Function3[
          /* cwd */ String, 
          /* filename */ js.UndefOr[String], 
          /* baseUrl */ js.UndefOr[String], 
          TsConfigLoaderResult
        ]
      ] = js.undefined
  }
  object TsConfigLoaderParams {
    
    inline def apply(cwd: String, getEnv: String => js.UndefOr[String]): TsConfigLoaderParams = {
      val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], getEnv = js.Any.fromFunction1(getEnv))
      __obj.asInstanceOf[TsConfigLoaderParams]
    }
    
    extension [Self <: TsConfigLoaderParams](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setGetEnv(value: String => js.UndefOr[String]): Self = StObject.set(x, "getEnv", js.Any.fromFunction1(value))
      
      inline def setLoadSync(
        value: (/* cwd */ String, /* filename */ js.UndefOr[String], /* baseUrl */ js.UndefOr[String]) => TsConfigLoaderResult
      ): Self = StObject.set(x, "loadSync", js.Any.fromFunction3(value))
      
      inline def setLoadSyncUndefined: Self = StObject.set(x, "loadSync", js.undefined)
    }
  }
  
  trait TsConfigLoaderResult extends StObject {
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var paths: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
    
    var tsConfigPath: js.UndefOr[String] = js.undefined
  }
  object TsConfigLoaderResult {
    
    inline def apply(): TsConfigLoaderResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TsConfigLoaderResult]
    }
    
    extension [Self <: TsConfigLoaderResult](x: Self) {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setPaths(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setTsConfigPath(value: String): Self = StObject.set(x, "tsConfigPath", value.asInstanceOf[js.Any])
      
      inline def setTsConfigPathUndefined: Self = StObject.set(x, "tsConfigPath", js.undefined)
    }
  }
  
  trait Tsconfig extends StObject {
    
    var compilerOptions: js.UndefOr[BaseUrl] = js.undefined
    
    var `extends`: js.UndefOr[String] = js.undefined
  }
  object Tsconfig {
    
    inline def apply(): Tsconfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tsconfig]
    }
    
    extension [Self <: Tsconfig](x: Self) {
      
      inline def setCompilerOptions(value: BaseUrl): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      inline def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
      
      inline def setExtends(value: String): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
      
      inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
    }
  }
}
