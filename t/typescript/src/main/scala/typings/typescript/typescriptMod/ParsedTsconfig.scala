package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedTsconfig extends js.Object {
  /**
    * Note that the case of the config path has not yet been normalized, as no files have been imported into the project yet
    */
  var extendedConfigPath: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[CompilerOptions] = js.undefined
  var raw: js.Any
  var typeAcquisition: js.UndefOr[TypeAcquisition] = js.undefined
}

object ParsedTsconfig {
  @scala.inline
  def apply(
    raw: js.Any,
    extendedConfigPath: String = null,
    options: CompilerOptions = null,
    typeAcquisition: TypeAcquisition = null
  ): ParsedTsconfig = {
    val __obj = js.Dynamic.literal(raw = raw)
    if (extendedConfigPath != null) __obj.updateDynamic("extendedConfigPath")(extendedConfigPath)
    if (options != null) __obj.updateDynamic("options")(options)
    if (typeAcquisition != null) __obj.updateDynamic("typeAcquisition")(typeAcquisition)
    __obj.asInstanceOf[ParsedTsconfig]
  }
}

