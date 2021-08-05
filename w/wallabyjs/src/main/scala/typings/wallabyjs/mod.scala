package typings.wallabyjs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait IWallaby extends StObject {
    
    var compilers: js.UndefOr[IWallabyBuiltInCompilers] = js.undefined
    
    var defaults: js.UndefOr[js.Any] = js.undefined
    
    var localProjectDir: js.UndefOr[String] = js.undefined
    
    var projectCacheDir: js.UndefOr[String] = js.undefined
  }
  object IWallaby {
    
    inline def apply(): IWallaby = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWallaby]
    }
    
    extension [Self <: IWallaby](x: Self) {
      
      inline def setCompilers(value: IWallabyBuiltInCompilers): Self = StObject.set(x, "compilers", value.asInstanceOf[js.Any])
      
      inline def setCompilersUndefined: Self = StObject.set(x, "compilers", js.undefined)
      
      inline def setDefaults(value: js.Any): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def setLocalProjectDir(value: String): Self = StObject.set(x, "localProjectDir", value.asInstanceOf[js.Any])
      
      inline def setLocalProjectDirUndefined: Self = StObject.set(x, "localProjectDir", js.undefined)
      
      inline def setProjectCacheDir(value: String): Self = StObject.set(x, "projectCacheDir", value.asInstanceOf[js.Any])
      
      inline def setProjectCacheDirUndefined: Self = StObject.set(x, "projectCacheDir", js.undefined)
    }
  }
  
  type IWallabyBuiltInCompilerOptions = StringDictionary[String]
  
  @js.native
  trait IWallabyBuiltInCompilers extends StObject {
    
    def babel(): IWallabyCompilerResult = js.native
    def babel(compilerOptions: IWallabyBuiltInCompilerOptions): IWallabyCompilerResult = js.native
    
    def coffeeScript(): IWallabyCompilerResult = js.native
    def coffeeScript(compilerOptions: IWallabyBuiltInCompilerOptions): IWallabyCompilerResult = js.native
    
    def typeScript(): IWallabyCompilerResult = js.native
    def typeScript(compilerOptions: IWallabyBuiltInCompilerOptions): IWallabyCompilerResult = js.native
  }
  
  trait IWallabyCompilerResult extends StObject {
    
    var code: String
    
    var map: String
    
    var ranges: js.Any
  }
  object IWallabyCompilerResult {
    
    inline def apply(code: String, map: String, ranges: js.Any): IWallabyCompilerResult = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWallabyCompilerResult]
    }
    
    extension [Self <: IWallabyCompilerResult](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setRanges(value: js.Any): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    }
  }
  
  type IWallabyCompilers = StringDictionary[js.Any]
  
  trait IWallabyConfig extends StObject {
    
    var compilers: js.UndefOr[IWallabyCompilers] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var env: js.UndefOr[IWallabyEnvironment] = js.undefined
    
    var files: js.Array[IWallabyFilePattern | String]
    
    var postprocessor: js.UndefOr[IWallabyProcessor] = js.undefined
    
    var preprocessors: js.UndefOr[IWallabyProcessor] = js.undefined
    
    var testFramework: js.UndefOr[String] = js.undefined
    
    var tests: js.Array[IWallabyFilePattern | String]
    
    var workers: js.UndefOr[IWallabyWorkers] = js.undefined
  }
  object IWallabyConfig {
    
    inline def apply(files: js.Array[IWallabyFilePattern | String], tests: js.Array[IWallabyFilePattern | String]): IWallabyConfig = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWallabyConfig]
    }
    
    extension [Self <: IWallabyConfig](x: Self) {
      
      inline def setCompilers(value: IWallabyCompilers): Self = StObject.set(x, "compilers", value.asInstanceOf[js.Any])
      
      inline def setCompilersUndefined: Self = StObject.set(x, "compilers", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setEnv(value: IWallabyEnvironment): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setFiles(value: js.Array[IWallabyFilePattern | String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: (IWallabyFilePattern | String)*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      inline def setPostprocessor(value: IWallabyProcessor): Self = StObject.set(x, "postprocessor", value.asInstanceOf[js.Any])
      
      inline def setPostprocessorUndefined: Self = StObject.set(x, "postprocessor", js.undefined)
      
      inline def setPreprocessors(value: IWallabyProcessor): Self = StObject.set(x, "preprocessors", value.asInstanceOf[js.Any])
      
      inline def setPreprocessorsUndefined: Self = StObject.set(x, "preprocessors", js.undefined)
      
      inline def setTestFramework(value: String): Self = StObject.set(x, "testFramework", value.asInstanceOf[js.Any])
      
      inline def setTestFrameworkUndefined: Self = StObject.set(x, "testFramework", js.undefined)
      
      inline def setTests(value: js.Array[IWallabyFilePattern | String]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
      
      inline def setTestsVarargs(value: (IWallabyFilePattern | String)*): Self = StObject.set(x, "tests", js.Array(value :_*))
      
      inline def setWorkers(value: IWallabyWorkers): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
      
      inline def setWorkersUndefined: Self = StObject.set(x, "workers", js.undefined)
    }
  }
  
  trait IWallabyEnvironment extends StObject {
    
    var params: js.UndefOr[IWallabyEnvironmentParameters] = js.undefined
    
    var runner: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var viewportSize: js.UndefOr[IWallabyEnvironmentViewportSize] = js.undefined
  }
  object IWallabyEnvironment {
    
    inline def apply(): IWallabyEnvironment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWallabyEnvironment]
    }
    
    extension [Self <: IWallabyEnvironment](x: Self) {
      
      inline def setParams(value: IWallabyEnvironmentParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setRunner(value: String): Self = StObject.set(x, "runner", value.asInstanceOf[js.Any])
      
      inline def setRunnerUndefined: Self = StObject.set(x, "runner", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setViewportSize(value: IWallabyEnvironmentViewportSize): Self = StObject.set(x, "viewportSize", value.asInstanceOf[js.Any])
      
      inline def setViewportSizeUndefined: Self = StObject.set(x, "viewportSize", js.undefined)
    }
  }
  
  trait IWallabyEnvironmentParameters extends StObject {
    
    var env: js.UndefOr[String] = js.undefined
    
    var runner: js.UndefOr[String] = js.undefined
  }
  object IWallabyEnvironmentParameters {
    
    inline def apply(): IWallabyEnvironmentParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWallabyEnvironmentParameters]
    }
    
    extension [Self <: IWallabyEnvironmentParameters](x: Self) {
      
      inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setRunner(value: String): Self = StObject.set(x, "runner", value.asInstanceOf[js.Any])
      
      inline def setRunnerUndefined: Self = StObject.set(x, "runner", js.undefined)
    }
  }
  
  trait IWallabyEnvironmentViewportSize extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object IWallabyEnvironmentViewportSize {
    
    inline def apply(): IWallabyEnvironmentViewportSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWallabyEnvironmentViewportSize]
    }
    
    extension [Self <: IWallabyEnvironmentViewportSize](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait IWallabyFile extends StObject {
    
    def changeExt(newExt: String): Unit
    
    var content: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    def rename(newPath: String): Unit
  }
  object IWallabyFile {
    
    inline def apply(changeExt: String => Unit, rename: String => Unit): IWallabyFile = {
      val __obj = js.Dynamic.literal(changeExt = js.Any.fromFunction1(changeExt), rename = js.Any.fromFunction1(rename))
      __obj.asInstanceOf[IWallabyFile]
    }
    
    extension [Self <: IWallabyFile](x: Self) {
      
      inline def setChangeExt(value: String => Unit): Self = StObject.set(x, "changeExt", js.Any.fromFunction1(value))
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setRename(value: String => Unit): Self = StObject.set(x, "rename", js.Any.fromFunction1(value))
    }
  }
  
  trait IWallabyFilePattern extends StObject {
    
    var ignore: js.UndefOr[Boolean] = js.undefined
    
    var instrument: js.UndefOr[Boolean] = js.undefined
    
    var load: js.UndefOr[Boolean] = js.undefined
    
    var pattern: String
  }
  object IWallabyFilePattern {
    
    inline def apply(pattern: String): IWallabyFilePattern = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWallabyFilePattern]
    }
    
    extension [Self <: IWallabyFilePattern](x: Self) {
      
      inline def setIgnore(value: Boolean): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setInstrument(value: Boolean): Self = StObject.set(x, "instrument", value.asInstanceOf[js.Any])
      
      inline def setInstrumentUndefined: Self = StObject.set(x, "instrument", js.undefined)
      
      inline def setLoad(value: Boolean): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
  
  type IWallabyProcessor = StringDictionary[js.Function1[/* file */ IWallabyFile, Unit]]
  
  trait IWallabyWorkers extends StObject {
    
    var recycle: js.UndefOr[Boolean] = js.undefined
  }
  object IWallabyWorkers {
    
    inline def apply(): IWallabyWorkers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWallabyWorkers]
    }
    
    extension [Self <: IWallabyWorkers](x: Self) {
      
      inline def setRecycle(value: Boolean): Self = StObject.set(x, "recycle", value.asInstanceOf[js.Any])
      
      inline def setRecycleUndefined: Self = StObject.set(x, "recycle", js.undefined)
    }
  }
}
