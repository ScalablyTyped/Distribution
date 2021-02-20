package typings.wallabyjs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait IWallaby extends StObject {
    
    var compilers: js.UndefOr[IWallabyBuiltInCompilers] = js.native
    
    var defaults: js.UndefOr[js.Any] = js.native
    
    var localProjectDir: js.UndefOr[String] = js.native
    
    var projectCacheDir: js.UndefOr[String] = js.native
  }
  object IWallaby {
    
    @scala.inline
    def apply(): IWallaby = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWallaby]
    }
    
    @scala.inline
    implicit class IWallabyMutableBuilder[Self <: IWallaby] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompilers(value: IWallabyBuiltInCompilers): Self = StObject.set(x, "compilers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompilersUndefined: Self = StObject.set(x, "compilers", js.undefined)
      
      @scala.inline
      def setDefaults(value: js.Any): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      @scala.inline
      def setLocalProjectDir(value: String): Self = StObject.set(x, "localProjectDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalProjectDirUndefined: Self = StObject.set(x, "localProjectDir", js.undefined)
      
      @scala.inline
      def setProjectCacheDir(value: String): Self = StObject.set(x, "projectCacheDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectCacheDirUndefined: Self = StObject.set(x, "projectCacheDir", js.undefined)
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
  
  @js.native
  trait IWallabyCompilerResult extends StObject {
    
    var code: String = js.native
    
    var map: String = js.native
    
    var ranges: js.Any = js.native
  }
  object IWallabyCompilerResult {
    
    @scala.inline
    def apply(code: String, map: String, ranges: js.Any): IWallabyCompilerResult = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWallabyCompilerResult]
    }
    
    @scala.inline
    implicit class IWallabyCompilerResultMutableBuilder[Self <: IWallabyCompilerResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRanges(value: js.Any): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    }
  }
  
  type IWallabyCompilers = StringDictionary[js.Any]
  
  @js.native
  trait IWallabyConfig extends StObject {
    
    var compilers: js.UndefOr[IWallabyCompilers] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var env: js.UndefOr[IWallabyEnvironment] = js.native
    
    var files: js.Array[IWallabyFilePattern | String] = js.native
    
    var postprocessor: js.UndefOr[IWallabyProcessor] = js.native
    
    var preprocessors: js.UndefOr[IWallabyProcessor] = js.native
    
    var testFramework: js.UndefOr[String] = js.native
    
    var tests: js.Array[IWallabyFilePattern | String] = js.native
    
    var workers: js.UndefOr[IWallabyWorkers] = js.native
  }
  object IWallabyConfig {
    
    @scala.inline
    def apply(files: js.Array[IWallabyFilePattern | String], tests: js.Array[IWallabyFilePattern | String]): IWallabyConfig = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWallabyConfig]
    }
    
    @scala.inline
    implicit class IWallabyConfigMutableBuilder[Self <: IWallabyConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompilers(value: IWallabyCompilers): Self = StObject.set(x, "compilers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompilersUndefined: Self = StObject.set(x, "compilers", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setEnv(value: IWallabyEnvironment): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setFiles(value: js.Array[IWallabyFilePattern | String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesVarargs(value: (IWallabyFilePattern | String)*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setPostprocessor(value: IWallabyProcessor): Self = StObject.set(x, "postprocessor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostprocessorUndefined: Self = StObject.set(x, "postprocessor", js.undefined)
      
      @scala.inline
      def setPreprocessors(value: IWallabyProcessor): Self = StObject.set(x, "preprocessors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreprocessorsUndefined: Self = StObject.set(x, "preprocessors", js.undefined)
      
      @scala.inline
      def setTestFramework(value: String): Self = StObject.set(x, "testFramework", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestFrameworkUndefined: Self = StObject.set(x, "testFramework", js.undefined)
      
      @scala.inline
      def setTests(value: js.Array[IWallabyFilePattern | String]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestsVarargs(value: (IWallabyFilePattern | String)*): Self = StObject.set(x, "tests", js.Array(value :_*))
      
      @scala.inline
      def setWorkers(value: IWallabyWorkers): Self = StObject.set(x, "workers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkersUndefined: Self = StObject.set(x, "workers", js.undefined)
    }
  }
  
  @js.native
  trait IWallabyEnvironment extends StObject {
    
    var params: js.UndefOr[IWallabyEnvironmentParameters] = js.native
    
    var runner: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var viewportSize: js.UndefOr[IWallabyEnvironmentViewportSize] = js.native
  }
  object IWallabyEnvironment {
    
    @scala.inline
    def apply(): IWallabyEnvironment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWallabyEnvironment]
    }
    
    @scala.inline
    implicit class IWallabyEnvironmentMutableBuilder[Self <: IWallabyEnvironment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParams(value: IWallabyEnvironmentParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setRunner(value: String): Self = StObject.set(x, "runner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunnerUndefined: Self = StObject.set(x, "runner", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setViewportSize(value: IWallabyEnvironmentViewportSize): Self = StObject.set(x, "viewportSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportSizeUndefined: Self = StObject.set(x, "viewportSize", js.undefined)
    }
  }
  
  @js.native
  trait IWallabyEnvironmentParameters extends StObject {
    
    var env: js.UndefOr[String] = js.native
    
    var runner: js.UndefOr[String] = js.native
  }
  object IWallabyEnvironmentParameters {
    
    @scala.inline
    def apply(): IWallabyEnvironmentParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWallabyEnvironmentParameters]
    }
    
    @scala.inline
    implicit class IWallabyEnvironmentParametersMutableBuilder[Self <: IWallabyEnvironmentParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setRunner(value: String): Self = StObject.set(x, "runner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunnerUndefined: Self = StObject.set(x, "runner", js.undefined)
    }
  }
  
  @js.native
  trait IWallabyEnvironmentViewportSize extends StObject {
    
    var height: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object IWallabyEnvironmentViewportSize {
    
    @scala.inline
    def apply(): IWallabyEnvironmentViewportSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWallabyEnvironmentViewportSize]
    }
    
    @scala.inline
    implicit class IWallabyEnvironmentViewportSizeMutableBuilder[Self <: IWallabyEnvironmentViewportSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait IWallabyFile extends StObject {
    
    def changeExt(newExt: String): Unit = js.native
    
    var content: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    def rename(newPath: String): Unit = js.native
  }
  object IWallabyFile {
    
    @scala.inline
    def apply(changeExt: String => Unit, rename: String => Unit): IWallabyFile = {
      val __obj = js.Dynamic.literal(changeExt = js.Any.fromFunction1(changeExt), rename = js.Any.fromFunction1(rename))
      __obj.asInstanceOf[IWallabyFile]
    }
    
    @scala.inline
    implicit class IWallabyFileMutableBuilder[Self <: IWallabyFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangeExt(value: String => Unit): Self = StObject.set(x, "changeExt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setRename(value: String => Unit): Self = StObject.set(x, "rename", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IWallabyFilePattern extends StObject {
    
    var ignore: js.UndefOr[Boolean] = js.native
    
    var instrument: js.UndefOr[Boolean] = js.native
    
    var load: js.UndefOr[Boolean] = js.native
    
    var pattern: String = js.native
  }
  object IWallabyFilePattern {
    
    @scala.inline
    def apply(pattern: String): IWallabyFilePattern = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWallabyFilePattern]
    }
    
    @scala.inline
    implicit class IWallabyFilePatternMutableBuilder[Self <: IWallabyFilePattern] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnore(value: Boolean): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setInstrument(value: Boolean): Self = StObject.set(x, "instrument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstrumentUndefined: Self = StObject.set(x, "instrument", js.undefined)
      
      @scala.inline
      def setLoad(value: Boolean): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
  
  type IWallabyProcessor = StringDictionary[js.Function1[/* file */ IWallabyFile, Unit]]
  
  @js.native
  trait IWallabyWorkers extends StObject {
    
    var recycle: js.UndefOr[Boolean] = js.native
  }
  object IWallabyWorkers {
    
    @scala.inline
    def apply(): IWallabyWorkers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWallabyWorkers]
    }
    
    @scala.inline
    implicit class IWallabyWorkersMutableBuilder[Self <: IWallabyWorkers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecycle(value: Boolean): Self = StObject.set(x, "recycle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecycleUndefined: Self = StObject.set(x, "recycle", js.undefined)
    }
  }
}
