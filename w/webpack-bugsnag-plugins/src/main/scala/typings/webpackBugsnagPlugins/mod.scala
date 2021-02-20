package typings.webpackBugsnagPlugins

import typings.webpackBugsnagPlugins.anon.Debug
import typings.webpackBugsnagPlugins.anon.Provider
import typings.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.debug
import typings.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.error
import typings.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.info
import typings.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Plugin * / any */ @JSImport("webpack-bugsnag-plugins", "BugsnagBuildReporterPlugin")
  @js.native
  class BugsnagBuildReporterPlugin protected () extends StObject {
    def this(build: BuildReporterBuild) = this()
    def this(build: BuildReporterBuild, options: BuildReporterOptions) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Plugin * / any */ @JSImport("webpack-bugsnag-plugins", "BugsnagSourceMapUploaderPlugin")
  @js.native
  class BugsnagSourceMapUploaderPlugin protected () extends StObject {
    def this(options: SourceMapUploaderOptions) = this()
  }
  
  @js.native
  trait BuildReporterBuild extends StObject {
    
    /**
      * Your Bugsnag API key
      */
    var apiKey: String = js.native
    
    /**
      * The version of the application you are building (this should match the
      * `appVersion` configured in your notifier)
      */
    var appVersion: String = js.native
    
    /**
      * Automatically associate this build with any new error events and sessions
      * that are received for the releaseStage until a subsequent build
      * notification is received. If this is set to true and no `releaseStage`
      * is provided the build will be applied to 'production'. You should only use
      * this option if you aren’t able to set an `appVersion` in your notifier.
      */
    var autoAssignRelease: js.UndefOr[Boolean] = js.native
    
    /**
      * The name of the person/machine that created this build (defaults to the
      * result of the `whoami` command)
      */
    var builderName: js.UndefOr[String] = js.native
    
    /**
      * 'production', 'staging' etc. (leave blank if this build can be released to
      * different releaseStages)
      */
    var releaseStage: js.UndefOr[String] = js.native
    
    /**
      * An object describing the source control of the build (if not specified,
      * the module will attempt to detect source control information from .git, .
      * hg and the nearest package.json)
      */
    var sourceControl: js.UndefOr[Provider] = js.native
  }
  object BuildReporterBuild {
    
    @scala.inline
    def apply(apiKey: String, appVersion: String): BuildReporterBuild = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildReporterBuild]
    }
    
    @scala.inline
    implicit class BuildReporterBuildMutableBuilder[Self <: BuildReporterBuild] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAssignRelease(value: Boolean): Self = StObject.set(x, "autoAssignRelease", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAssignReleaseUndefined: Self = StObject.set(x, "autoAssignRelease", js.undefined)
      
      @scala.inline
      def setBuilderName(value: String): Self = StObject.set(x, "builderName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuilderNameUndefined: Self = StObject.set(x, "builderName", js.undefined)
      
      @scala.inline
      def setReleaseStage(value: String): Self = StObject.set(x, "releaseStage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseStageUndefined: Self = StObject.set(x, "releaseStage", js.undefined)
      
      @scala.inline
      def setSourceControl(value: Provider): Self = StObject.set(x, "sourceControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceControlUndefined: Self = StObject.set(x, "sourceControl", js.undefined)
    }
  }
  
  @js.native
  trait BuildReporterOptions extends StObject {
    
    /**
      * Post the build payload to a specified URL
      *
      * @default https://build.bugsnag.com
      */
    var endpoint: js.UndefOr[String] = js.native
    
    /**
      * The minimum severity of log to output
      *
      * @default warn
      */
    var logLevel: js.UndefOr[debug | info | warn | error] = js.native
    
    /**
      * Provide a different logger object
      */
    var logger: js.UndefOr[Debug] = js.native
    
    /**
      * The path to search for source control info
      *
      * @default process.cwd()
      */
    var path: js.UndefOr[String] = js.native
  }
  object BuildReporterOptions {
    
    @scala.inline
    def apply(): BuildReporterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuildReporterOptions]
    }
    
    @scala.inline
    implicit class BuildReporterOptionsMutableBuilder[Self <: BuildReporterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setLogLevel(value: debug | info | warn | error): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setLogger(value: Debug): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  @js.native
  trait SourceMapUploaderOptions extends StObject {
    
    /**
      * Your Bugsnag API key
      */
    var apiKey: String = js.native
    
    /**
      * The version of the application you are building
      */
    var appVersion: js.UndefOr[String] = js.native
    
    /**
      * Post the build payload to a URL other than the default
      *
      * @default https://upload.bugsnag.com
      */
    var endpoint: js.UndefOr[String] = js.native
    
    /**
      * A list of bundle file extensions which shouldn't be uploaded
      *
      * @default ['.css']
      */
    var ignoredBundleExtensions: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Whether you want to overwrite previously uploaded sourcemaps
      */
    var overwrite: js.UndefOr[Boolean] = js.native
    
    /**
      * The path to your bundled assets (as the browser will see them).
      * This option must either be provided here, or as `output.publicPath` in
      * your Webpack config.
      *
      * @default output.publicPath
      */
    var publicPath: js.UndefOr[String] = js.native
  }
  object SourceMapUploaderOptions {
    
    @scala.inline
    def apply(apiKey: String): SourceMapUploaderOptions = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceMapUploaderOptions]
    }
    
    @scala.inline
    implicit class SourceMapUploaderOptionsMutableBuilder[Self <: SourceMapUploaderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppVersionUndefined: Self = StObject.set(x, "appVersion", js.undefined)
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setIgnoredBundleExtensions(value: js.Array[String]): Self = StObject.set(x, "ignoredBundleExtensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoredBundleExtensionsUndefined: Self = StObject.set(x, "ignoredBundleExtensions", js.undefined)
      
      @scala.inline
      def setIgnoredBundleExtensionsVarargs(value: String*): Self = StObject.set(x, "ignoredBundleExtensions", js.Array(value :_*))
      
      @scala.inline
      def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      @scala.inline
      def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
    }
  }
}
