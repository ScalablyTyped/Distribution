package typings.webpackDashNodeDashExternals.webpackDashNodeDashExternalsMod

import typings.webpackDashNodeDashExternals.webpackDashNodeDashExternalsStrings.`this`
import typings.webpackDashNodeDashExternals.webpackDashNodeDashExternalsStrings.`var`
import typings.webpackDashNodeDashExternals.webpackDashNodeDashExternalsStrings.amd
import typings.webpackDashNodeDashExternals.webpackDashNodeDashExternalsStrings.commonjs
import typings.webpackDashNodeDashExternals.webpackDashNodeDashExternalsStrings.umd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * @default ['.bin']
    */
  var binaryDirs: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The method in which unbundled modules will be required in the code. Best to leave as
    * 'commonjs' for node modules.
    * @default 'commonjs'
    */
  var importType: js.UndefOr[`var` | `this` | commonjs | amd | umd] = js.undefined
  /**
    * @default false
    */
  var includeAbsolutePaths: js.UndefOr[Boolean] = js.undefined
  /**
    * The folder in which to search for the node modules.
    * @default 'node_modules'
    */
  var modulesDir: js.UndefOr[String] = js.undefined
  /**
    * Read the modules from the package.json file instead of the node_modules folder.
    * @default false
    */
  var modulesFromFile: js.UndefOr[Boolean] = js.undefined
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

object Options {
  @scala.inline
  def apply(
    binaryDirs: js.Array[String] = null,
    importType: `var` | `this` | commonjs | amd | umd = null,
    includeAbsolutePaths: js.UndefOr[Boolean] = js.undefined,
    modulesDir: String = null,
    modulesFromFile: js.UndefOr[Boolean] = js.undefined,
    whitelist: js.Array[WhitelistOption] | WhitelistOption = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (binaryDirs != null) __obj.updateDynamic("binaryDirs")(binaryDirs)
    if (importType != null) __obj.updateDynamic("importType")(importType.asInstanceOf[js.Any])
    if (!js.isUndefined(includeAbsolutePaths)) __obj.updateDynamic("includeAbsolutePaths")(includeAbsolutePaths)
    if (modulesDir != null) __obj.updateDynamic("modulesDir")(modulesDir)
    if (!js.isUndefined(modulesFromFile)) __obj.updateDynamic("modulesFromFile")(modulesFromFile)
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

