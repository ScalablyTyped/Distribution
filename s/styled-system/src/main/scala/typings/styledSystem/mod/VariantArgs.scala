package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariantArgs[TStyle, K /* <: String */, TPropName] extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  /** Component prop, defaults to "variant" */
  var prop: js.UndefOr[TPropName] = js.undefined
  /** theme key for variant definitions */
  var scale: js.UndefOr[String] = js.undefined
  /** inline theme aware variants definitions  */
  var variants: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: TStyle}
    */ typings.styledSystem.styledSystemStrings.VariantArgs with js.Any
  ] = js.undefined
}

object VariantArgs {
  @scala.inline
  def apply[TStyle, K /* <: String */, TPropName](
    key: String = null,
    prop: TPropName = null,
    scale: String = null,
    variants: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in K ]: TStyle}
    */ typings.styledSystem.styledSystemStrings.VariantArgs with js.Any = null
  ): VariantArgs[TStyle, K, TPropName] = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (prop != null) __obj.updateDynamic("prop")(prop.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (variants != null) __obj.updateDynamic("variants")(variants.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariantArgs[TStyle, K, TPropName]]
  }
}

