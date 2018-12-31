package typings
package systemjsLib.systemjsMod.SystemJSLoaderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageConfig extends js.Object {
  /**
    * The default extension to add to modules requested within the package. Takes preference over defaultJSExtensions.
    * Can be set to defaultExtension: false to optionally opt-out of extension-adding when defaultJSExtensions is enabled.
    */
  var defaultExtension: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
    * The module format of the package. See Module Formats.
    */
  var format: js.UndefOr[ModuleFormat] = js.undefined
  /**
    * The main entry point of the package (so import 'local/package' is equivalent to import 'local/package/index.js')
    */
  var main: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Local and relative map configurations scoped to the package. Apply for subpaths as well.
    */
  var map: js.UndefOr[ConfigMap] = js.undefined
  /**
    * Module meta provides an API for SystemJS to understand how to load modules correctly.
    * Package-scoped meta configuration with wildcard support. Modules are subpaths within the package path.
    * This also provides an opt-out mechanism for defaultExtension, by adding modules here that should skip extension adding.
    */
  var meta: js.UndefOr[ConfigMeta] = js.undefined
}

