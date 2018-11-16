package typings
package wiredepLib.wiredepMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WiredepParams extends js.Object {
  /**
       * your bower.json file contents.
       * Default: require('./bower.json')
       */
  var bowerJson: js.UndefOr[java.lang.String] = js.undefined
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
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Default: true
       */
  var dependencies: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Default: false
       */
  var devDependencies: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * the directory of your Bower packages.
       * Default: '.bowerrc'.directory || bower_components
       */
  var directory: js.UndefOr[java.lang.String] = js.undefined
  /**
       * @example:
       *  [ /jquery/, 'bower_components/modernizr/modernizr.js' ]
       */
  var exclude: js.UndefOr[js.Array[java.lang.String | stdLib.RegExp]] = js.undefined
  var fileTypes: js.UndefOr[FileTypes] = js.undefined
  /**
       * string or regexp to ignore from the injected filepath
       * @example:
       *  [ /jquery/, 'bower_components/modernizr/modernizr.js' ]
       */
  var ignorePath: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
  /**
       * Default: false
       */
  var includeSelf: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If not overridden, an error will throw
       *
       * err.code can be:
       *  - "PKG_NOT_INSTALLED" (a Bower package was not found)
       *  - "BOWER_COMPONENTS_MISSING" (cannot find the `bower_components` directory)
       */
  var onError: js.UndefOr[js.Function1[/* err */ nodeLib.Error, scala.Unit]] = js.undefined
  /**
       * @param {string} filePath name of file that was updated
       */
  var onFileUpdated: js.UndefOr[js.Function1[/* filePath */ java.lang.String, scala.Unit]] = js.undefined
  /**
       * @param {string} pkg name of bower package without main
       */
  var onMainNotFound: js.UndefOr[js.Function1[/* pkg */ java.lang.String, scala.Unit]] = js.undefined
  /**
       * @param {FileObject} fileObject
       */
  var onPathInjected: js.UndefOr[js.Function1[/* fileObject */ FileObject, scala.Unit]] = js.undefined
  /**
       *  This inline object offers another way to define your overrides if
       *  modifying your project's `bower.json` isn't an option.
       */
  var overrides: js.UndefOr[js.Object] = js.undefined
  var src: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

