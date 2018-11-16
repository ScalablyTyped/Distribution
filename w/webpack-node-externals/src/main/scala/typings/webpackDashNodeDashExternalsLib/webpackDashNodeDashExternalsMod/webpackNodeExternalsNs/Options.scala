package typings
package webpackDashNodeDashExternalsLib.webpackDashNodeDashExternalsMod.webpackNodeExternalsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /**
           * @default ['.bin']
           */
  var binaryDirs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * The method in which unbundled modules will be required in the code. Best to leave as
           * 'commonjs' for node modules.
           * @default 'commonjs'
           */
  var importType: js.UndefOr[
    webpackDashNodeDashExternalsLib.webpackDashNodeDashExternalsLibStrings.`var` | webpackDashNodeDashExternalsLib.webpackDashNodeDashExternalsLibStrings.`this` | webpackDashNodeDashExternalsLib.webpackDashNodeDashExternalsLibStrings.commonjs | webpackDashNodeDashExternalsLib.webpackDashNodeDashExternalsLibStrings.amd | webpackDashNodeDashExternalsLib.webpackDashNodeDashExternalsLibStrings.umd
  ] = js.undefined
  /**
           * @default false
           */
  var includeAbsolutePaths: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The folder in which to search for the node modules.
           * @default 'node_modules'
           */
  var modulesDir: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Read the modules from the package.json file instead of the node_modules folder.
           * @default false
           */
  var modulesFromFile: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * An array for the externals to whitelist, so they will be included in the bundle.
           * Can accept exact strings ('module_name'), regex patterns (/^module_name/), or a
           * function that accepts the module name and returns whether it should be included.
           * Important - if you have set aliases in your webpack config with the exact
           * same names as modules in node_modules, you need to whitelist them so Webpack will know
           * they should be bundled.
           * @default []
           */
  var whitelist: js.UndefOr[js.Array[WhitelistOption] | WhitelistOption] = js.undefined
}

