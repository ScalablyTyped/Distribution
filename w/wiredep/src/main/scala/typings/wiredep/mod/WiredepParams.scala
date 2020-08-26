package typings.wiredep.mod

import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WiredepParams extends js.Object {
  /**
    * your bower.json file contents.
    * Default: require('./bower.json')
    */
  var bowerJson: js.UndefOr[String] = js.native
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
  var cwd: js.UndefOr[String] = js.native
  /**
    * Default: true
    */
  var dependencies: js.UndefOr[Boolean] = js.native
  /**
    * Default: false
    */
  var devDependencies: js.UndefOr[Boolean] = js.native
  /**
    * the directory of your Bower packages.
    * Default: '.bowerrc'.directory || bower_components
    */
  var directory: js.UndefOr[String] = js.native
  /**
    * @example:
    *  [ /jquery/, 'bower_components/modernizr/modernizr.js' ]
    */
  var exclude: js.UndefOr[js.Array[String | RegExp]] = js.native
  var fileTypes: js.UndefOr[FileTypes] = js.native
  /**
    * string or regexp to ignore from the injected filepath
    * @example:
    *  [ /jquery/, 'bower_components/modernizr/modernizr.js' ]
    */
  var ignorePath: js.UndefOr[String | RegExp] = js.native
  /**
    * Default: false
    */
  var includeSelf: js.UndefOr[Boolean] = js.native
  /**
    * If not overridden, an error will throw
    *
    * err.code can be:
    *  - "PKG_NOT_INSTALLED" (a Bower package was not found)
    *  - "BOWER_COMPONENTS_MISSING" (cannot find the `bower_components` directory)
    */
  var onError: js.UndefOr[js.Function1[/* err */ Error, Unit]] = js.native
  /**
    * @param {string} filePath name of file that was updated
    */
  var onFileUpdated: js.UndefOr[js.Function1[/* filePath */ String, Unit]] = js.native
  /**
    * @param {string} pkg name of bower package without main
    */
  var onMainNotFound: js.UndefOr[js.Function1[/* pkg */ String, Unit]] = js.native
  /**
    * @param {FileObject} fileObject
    */
  var onPathInjected: js.UndefOr[js.Function1[/* fileObject */ FileObject, Unit]] = js.native
  /**
    *  This inline object offers another way to define your overrides if
    *  modifying your project's `bower.json` isn't an option.
    */
  var overrides: js.UndefOr[js.Object] = js.native
  var src: js.UndefOr[String | js.Array[String]] = js.native
}

object WiredepParams {
  @scala.inline
  def apply(): WiredepParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WiredepParams]
  }
  @scala.inline
  implicit class WiredepParamsOps[Self <: WiredepParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBowerJson(value: String): Self = this.set("bowerJson", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBowerJson: Self = this.set("bowerJson", js.undefined)
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setDependencies(value: Boolean): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    @scala.inline
    def setDevDependencies(value: Boolean): Self = this.set("devDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevDependencies: Self = this.set("devDependencies", js.undefined)
    @scala.inline
    def setDirectory(value: String): Self = this.set("directory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectory: Self = this.set("directory", js.undefined)
    @scala.inline
    def setExcludeVarargs(value: (String | RegExp)*): Self = this.set("exclude", js.Array(value :_*))
    @scala.inline
    def setExclude(value: js.Array[String | RegExp]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    @scala.inline
    def setFileTypes(value: FileTypes): Self = this.set("fileTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileTypes: Self = this.set("fileTypes", js.undefined)
    @scala.inline
    def setIgnorePath(value: String | RegExp): Self = this.set("ignorePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnorePath: Self = this.set("ignorePath", js.undefined)
    @scala.inline
    def setIncludeSelf(value: Boolean): Self = this.set("includeSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeSelf: Self = this.set("includeSelf", js.undefined)
    @scala.inline
    def setOnError(value: /* err */ Error => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnFileUpdated(value: /* filePath */ String => Unit): Self = this.set("onFileUpdated", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFileUpdated: Self = this.set("onFileUpdated", js.undefined)
    @scala.inline
    def setOnMainNotFound(value: /* pkg */ String => Unit): Self = this.set("onMainNotFound", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMainNotFound: Self = this.set("onMainNotFound", js.undefined)
    @scala.inline
    def setOnPathInjected(value: /* fileObject */ FileObject => Unit): Self = this.set("onPathInjected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPathInjected: Self = this.set("onPathInjected", js.undefined)
    @scala.inline
    def setOverrides(value: js.Object): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setSrcVarargs(value: String*): Self = this.set("src", js.Array(value :_*))
    @scala.inline
    def setSrc(value: String | js.Array[String]): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
  }
  
}

