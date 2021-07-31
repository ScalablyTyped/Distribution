package typings.wiredep

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ReadWriteStream
import typings.std.Error
import typings.std.RegExp
import typings.wiredep.anon.Block
import typings.wiredep.anon.BlockDetect
import typings.wiredep.anon.Detect
import typings.wiredep.anon.DetectReplace
import typings.wiredep.anon.Replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @return {PathFiles} paths to your files by extension
    * @example:
    *  {
    *     js: [
    *       'paths/to/your/js/files.js',
    *       'in/their/order/of/dependency.js'
    *     ],
    *     css: [
    *       'paths/to/your/css/files.css'
    *     ],
    *     // etc.
    *   }
    */
  @scala.inline
  def apply(config: WiredepParams): PathFiles = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[PathFiles]
  
  @JSImport("wiredep", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def stream(config: WiredepParams): ReadWriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")(config.asInstanceOf[js.Any]).asInstanceOf[ReadWriteStream]
  
  trait FileObject extends StObject {
    
    /**
      * type of wiredep block ('js', 'css', etc)
      */
    var block: String
    
    /**
      * name of file that was updated
      */
    var file: String
    
    /**
      * path to file that was injected
      */
    var path: String
  }
  object FileObject {
    
    @scala.inline
    def apply(block: String, file: String, path: String): FileObject = {
      val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileObject]
    }
    
    @scala.inline
    implicit class FileObjectMutableBuilder[Self <: FileObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlock(value: String): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileTypes extends StObject {
    
    var fileExtension: Block
    
    // defaults:
    var html: Detect
    
    var jade: Detect
    
    var less: Replace
    
    var scss: BlockDetect
    
    var styl: DetectReplace
    
    var yaml: Detect
  }
  object FileTypes {
    
    @scala.inline
    def apply(
      fileExtension: Block,
      html: Detect,
      jade: Detect,
      less: Replace,
      scss: BlockDetect,
      styl: DetectReplace,
      yaml: Detect
    ): FileTypes = {
      val __obj = js.Dynamic.literal(fileExtension = fileExtension.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], jade = jade.asInstanceOf[js.Any], less = less.asInstanceOf[js.Any], scss = scss.asInstanceOf[js.Any], styl = styl.asInstanceOf[js.Any], yaml = yaml.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileTypes]
    }
    
    @scala.inline
    implicit class FileTypesMutableBuilder[Self <: FileTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileExtension(value: Block): Self = StObject.set(x, "fileExtension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtml(value: Detect): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJade(value: Detect): Self = StObject.set(x, "jade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLess(value: Replace): Self = StObject.set(x, "less", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScss(value: BlockDetect): Self = StObject.set(x, "scss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyl(value: DetectReplace): Self = StObject.set(x, "styl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYaml(value: Detect): Self = StObject.set(x, "yaml", value.asInstanceOf[js.Any])
    }
  }
  
  type PathFiles = StringDictionary[js.Array[String]]
  
  trait WiredepParams extends StObject {
    
    /**
      * your bower.json file contents.
      * Default: require('./bower.json')
      */
    var bowerJson: js.UndefOr[String] = js.undefined
    
    // ----- Advanced Configuration -----
    // All of the below settings are for advanced configuration, to
    // give your project support for additional file types and more
    // control.
    //
    // Out of the box, wiredep will handle HTML files just fine for
    // JavaScript and CSS injection.
    /**
      * path to where we are pretending to be
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * Default: true
      */
    var dependencies: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Default: false
      */
    var devDependencies: js.UndefOr[Boolean] = js.undefined
    
    /**
      * the directory of your Bower packages.
      * Default: '.bowerrc'.directory || bower_components
      */
    var directory: js.UndefOr[String] = js.undefined
    
    /**
      * @example:
      *  [ /jquery/, 'bower_components/modernizr/modernizr.js' ]
      */
    var exclude: js.UndefOr[js.Array[String | RegExp]] = js.undefined
    
    var fileTypes: js.UndefOr[FileTypes] = js.undefined
    
    /**
      * string or regexp to ignore from the injected filepath
      * @example:
      *  [ /jquery/, 'bower_components/modernizr/modernizr.js' ]
      */
    var ignorePath: js.UndefOr[String | RegExp] = js.undefined
    
    /**
      * Default: false
      */
    var includeSelf: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If not overridden, an error will throw
      *
      * err.code can be:
      *  - "PKG_NOT_INSTALLED" (a Bower package was not found)
      *  - "BOWER_COMPONENTS_MISSING" (cannot find the `bower_components` directory)
      */
    var onError: js.UndefOr[js.Function1[/* err */ Error, Unit]] = js.undefined
    
    /**
      * @param {string} filePath name of file that was updated
      */
    var onFileUpdated: js.UndefOr[js.Function1[/* filePath */ String, Unit]] = js.undefined
    
    /**
      * @param {string} pkg name of bower package without main
      */
    var onMainNotFound: js.UndefOr[js.Function1[/* pkg */ String, Unit]] = js.undefined
    
    /**
      * @param {FileObject} fileObject
      */
    var onPathInjected: js.UndefOr[js.Function1[/* fileObject */ FileObject, Unit]] = js.undefined
    
    /**
      *  This inline object offers another way to define your overrides if
      *  modifying your project's `bower.json` isn't an option.
      */
    var overrides: js.UndefOr[js.Object] = js.undefined
    
    var src: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object WiredepParams {
    
    @scala.inline
    def apply(): WiredepParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WiredepParams]
    }
    
    @scala.inline
    implicit class WiredepParamsMutableBuilder[Self <: WiredepParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBowerJson(value: String): Self = StObject.set(x, "bowerJson", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBowerJsonUndefined: Self = StObject.set(x, "bowerJson", js.undefined)
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setDependencies(value: Boolean): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setDevDependencies(value: Boolean): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
      
      @scala.inline
      def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      @scala.inline
      def setExclude(value: js.Array[String | RegExp]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setFileTypes(value: FileTypes): Self = StObject.set(x, "fileTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileTypesUndefined: Self = StObject.set(x, "fileTypes", js.undefined)
      
      @scala.inline
      def setIgnorePath(value: String | RegExp): Self = StObject.set(x, "ignorePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnorePathUndefined: Self = StObject.set(x, "ignorePath", js.undefined)
      
      @scala.inline
      def setIncludeSelf(value: Boolean): Self = StObject.set(x, "includeSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeSelfUndefined: Self = StObject.set(x, "includeSelf", js.undefined)
      
      @scala.inline
      def setOnError(value: /* err */ Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnFileUpdated(value: /* filePath */ String => Unit): Self = StObject.set(x, "onFileUpdated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFileUpdatedUndefined: Self = StObject.set(x, "onFileUpdated", js.undefined)
      
      @scala.inline
      def setOnMainNotFound(value: /* pkg */ String => Unit): Self = StObject.set(x, "onMainNotFound", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMainNotFoundUndefined: Self = StObject.set(x, "onMainNotFound", js.undefined)
      
      @scala.inline
      def setOnPathInjected(value: /* fileObject */ FileObject => Unit): Self = StObject.set(x, "onPathInjected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPathInjectedUndefined: Self = StObject.set(x, "onPathInjected", js.undefined)
      
      @scala.inline
      def setOverrides(value: js.Object): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setSrc(value: String | js.Array[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setSrcVarargs(value: String*): Self = StObject.set(x, "src", js.Array(value :_*))
    }
  }
}
