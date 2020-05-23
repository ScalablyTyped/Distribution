package typings.wiredep.mod

import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WiredepParams extends js.Object {
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
  def apply(
    bowerJson: String = null,
    cwd: String = null,
    dependencies: js.UndefOr[Boolean] = js.undefined,
    devDependencies: js.UndefOr[Boolean] = js.undefined,
    directory: String = null,
    exclude: js.Array[String | RegExp] = null,
    fileTypes: FileTypes = null,
    ignorePath: String | RegExp = null,
    includeSelf: js.UndefOr[Boolean] = js.undefined,
    onError: /* err */ Error => Unit = null,
    onFileUpdated: /* filePath */ String => Unit = null,
    onMainNotFound: /* pkg */ String => Unit = null,
    onPathInjected: /* fileObject */ FileObject => Unit = null,
    overrides: js.Object = null,
    src: String | js.Array[String] = null
  ): WiredepParams = {
    val __obj = js.Dynamic.literal()
    if (bowerJson != null) __obj.updateDynamic("bowerJson")(bowerJson.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (!js.isUndefined(dependencies)) __obj.updateDynamic("dependencies")(dependencies.get.asInstanceOf[js.Any])
    if (!js.isUndefined(devDependencies)) __obj.updateDynamic("devDependencies")(devDependencies.get.asInstanceOf[js.Any])
    if (directory != null) __obj.updateDynamic("directory")(directory.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (fileTypes != null) __obj.updateDynamic("fileTypes")(fileTypes.asInstanceOf[js.Any])
    if (ignorePath != null) __obj.updateDynamic("ignorePath")(ignorePath.asInstanceOf[js.Any])
    if (!js.isUndefined(includeSelf)) __obj.updateDynamic("includeSelf")(includeSelf.get.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFileUpdated != null) __obj.updateDynamic("onFileUpdated")(js.Any.fromFunction1(onFileUpdated))
    if (onMainNotFound != null) __obj.updateDynamic("onMainNotFound")(js.Any.fromFunction1(onMainNotFound))
    if (onPathInjected != null) __obj.updateDynamic("onPathInjected")(js.Any.fromFunction1(onPathInjected))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiredepParams]
  }
}

