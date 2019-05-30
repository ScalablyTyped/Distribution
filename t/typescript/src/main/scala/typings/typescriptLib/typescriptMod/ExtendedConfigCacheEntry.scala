package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedConfigCacheEntry extends js.Object {
  var extendedConfig: js.UndefOr[ParsedTsconfig] = js.undefined
  var extendedResult: TsConfigSourceFile
}

object ExtendedConfigCacheEntry {
  @scala.inline
  def apply(extendedResult: TsConfigSourceFile, extendedConfig: ParsedTsconfig = null): ExtendedConfigCacheEntry = {
    val __obj = js.Dynamic.literal(extendedResult = extendedResult)
    if (extendedConfig != null) __obj.updateDynamic("extendedConfig")(extendedConfig)
    __obj.asInstanceOf[ExtendedConfigCacheEntry]
  }
}

