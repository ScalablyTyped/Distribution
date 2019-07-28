package typings.systemjs.systemjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageConfig extends js.Object {
  /**
    * The default extension to add to modules requested within the package. Takes preference over defaultJSExtensions.
    * Can be set to defaultExtension: false to optionally opt-out of extension-adding when defaultJSExtensions is enabled.
    */
  var defaultExtension: js.UndefOr[Boolean | String] = js.undefined
  /**
    * The module format of the package. See Module Formats.
    */
  var format: js.UndefOr[ModuleFormat] = js.undefined
  /**
    * The main entry point of the package (so import 'local/package' is equivalent to import 'local/package/index.js')
    */
  var main: js.UndefOr[String] = js.undefined
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

object PackageConfig {
  @scala.inline
  def apply(
    defaultExtension: Boolean | String = null,
    format: ModuleFormat = null,
    main: String = null,
    map: ConfigMap = null,
    meta: ConfigMeta = null
  ): PackageConfig = {
    val __obj = js.Dynamic.literal()
    if (defaultExtension != null) __obj.updateDynamic("defaultExtension")(defaultExtension.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (main != null) __obj.updateDynamic("main")(main)
    if (map != null) __obj.updateDynamic("map")(map)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    __obj.asInstanceOf[PackageConfig]
  }
}

