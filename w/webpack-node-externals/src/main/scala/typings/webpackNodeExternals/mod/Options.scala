package typings.webpackNodeExternals.mod

import typings.webpackNodeExternals.webpackNodeExternalsStrings.`this`
import typings.webpackNodeExternals.webpackNodeExternalsStrings.`var`
import typings.webpackNodeExternals.webpackNodeExternalsStrings.amd
import typings.webpackNodeExternals.webpackNodeExternalsStrings.commonjs
import typings.webpackNodeExternals.webpackNodeExternalsStrings.umd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Additional folders to look for node modules.
    */
  var additionalModuleDirs: js.UndefOr[js.Array[String]] = js.native
  /**
    * An array for the externals to allow, so they will be included in the bundle.
    * Can accept exact strings ('module_name'), regex patterns (/^module_name/), or a
    * function that accepts the module name and returns whether it should be included.
    * Important - if you have set aliases in your webpack config with the exact
    * same names as modules in node_modules, you need to allowlist them so Webpack will know
    * they should be bundled.
    * @default []
    */
  var allowlist: js.UndefOr[js.Array[AllowlistOption] | AllowlistOption] = js.native
  /**
    * @default ['.bin']
    */
  var binaryDirs: js.UndefOr[js.Array[String]] = js.native
  /**
    * The method in which unbundled modules will be required in the code. Best to leave as
    * 'commonjs' for node modules.
    * @default 'commonjs'
    */
  var importType: js.UndefOr[`var` | `this` | commonjs | amd | umd | ImportTypeCallback] = js.native
  /**
    * @default false
    */
  var includeAbsolutePaths: js.UndefOr[Boolean] = js.native
  /**
    * The folder in which to search for the node modules.
    * @default 'node_modules'
    */
  var modulesDir: js.UndefOr[String] = js.native
  /**
    * Read the modules from the package.json file instead of the node_modules folder.
    * @default false
    */
  var modulesFromFile: js.UndefOr[Boolean | ModulesFromFileType] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAdditionalModuleDirsVarargs(value: String*): Self = this.set("additionalModuleDirs", js.Array(value :_*))
    @scala.inline
    def setAdditionalModuleDirs(value: js.Array[String]): Self = this.set("additionalModuleDirs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalModuleDirs: Self = this.set("additionalModuleDirs", js.undefined)
    @scala.inline
    def setAllowlistVarargs(value: AllowlistOption*): Self = this.set("allowlist", js.Array(value :_*))
    @scala.inline
    def setAllowlistFunction1(value: /* moduleName */ String => Boolean): Self = this.set("allowlist", js.Any.fromFunction1(value))
    @scala.inline
    def setAllowlist(value: js.Array[AllowlistOption] | AllowlistOption): Self = this.set("allowlist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowlist: Self = this.set("allowlist", js.undefined)
    @scala.inline
    def setBinaryDirsVarargs(value: String*): Self = this.set("binaryDirs", js.Array(value :_*))
    @scala.inline
    def setBinaryDirs(value: js.Array[String]): Self = this.set("binaryDirs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinaryDirs: Self = this.set("binaryDirs", js.undefined)
    @scala.inline
    def setImportTypeFunction1(value: /* moduleName */ String => String): Self = this.set("importType", js.Any.fromFunction1(value))
    @scala.inline
    def setImportType(value: `var` | `this` | commonjs | amd | umd | ImportTypeCallback): Self = this.set("importType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportType: Self = this.set("importType", js.undefined)
    @scala.inline
    def setIncludeAbsolutePaths(value: Boolean): Self = this.set("includeAbsolutePaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeAbsolutePaths: Self = this.set("includeAbsolutePaths", js.undefined)
    @scala.inline
    def setModulesDir(value: String): Self = this.set("modulesDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModulesDir: Self = this.set("modulesDir", js.undefined)
    @scala.inline
    def setModulesFromFile(value: Boolean | ModulesFromFileType): Self = this.set("modulesFromFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModulesFromFile: Self = this.set("modulesFromFile", js.undefined)
  }
  
}

