package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedTsconfig extends js.Object {
  /**
    * Note that the case of the config path has not yet been normalized, as no files have been imported into the project yet
    */
  var extendedConfigPath: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[CompilerOptions] = js.undefined
  var raw: js.Any
  var typeAcquisition: js.UndefOr[TypeAcquisition] = js.undefined
  var watchOptions: js.UndefOr[WatchOptions] = js.undefined
}

object ParsedTsconfig {
  @scala.inline
  def apply(
    raw: js.Any,
    extendedConfigPath: java.lang.String = null,
    options: CompilerOptions = null,
    typeAcquisition: TypeAcquisition = null,
    watchOptions: WatchOptions = null
  ): ParsedTsconfig = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    if (extendedConfigPath != null) __obj.updateDynamic("extendedConfigPath")(extendedConfigPath.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (typeAcquisition != null) __obj.updateDynamic("typeAcquisition")(typeAcquisition.asInstanceOf[js.Any])
    if (watchOptions != null) __obj.updateDynamic("watchOptions")(watchOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedTsconfig]
  }
}

