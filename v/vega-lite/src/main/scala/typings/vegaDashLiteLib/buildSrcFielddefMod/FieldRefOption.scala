package typings
package vegaDashLiteLib.buildSrcFielddefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldRefOption extends js.Object {
  /** append suffix to the field ref for bin (default='start') */
  var binSuffix: js.UndefOr[
    vegaDashLiteLib.vegaDashLiteLibStrings.end | vegaDashLiteLib.vegaDashLiteLibStrings.range | vegaDashLiteLib.vegaDashLiteLibStrings.mid
  ] = js.undefined
  /** Wrap the field with datum or parent (e.g., datum['...'] for Vega Expression */
  var expr: js.UndefOr[
    vegaDashLiteLib.vegaDashLiteLibStrings.datum | vegaDashLiteLib.vegaDashLiteLibStrings.parent
  ] = js.undefined
  /** exclude bin, aggregate, timeUnit */
  var nofn: js.UndefOr[scala.Boolean] = js.undefined
  /** prepend fn with custom function prefix */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /** append suffix to the field ref (general) */
  var suffix: js.UndefOr[java.lang.String] = js.undefined
}

object FieldRefOption {
  @scala.inline
  def apply(
    binSuffix: vegaDashLiteLib.vegaDashLiteLibStrings.end | vegaDashLiteLib.vegaDashLiteLibStrings.range | vegaDashLiteLib.vegaDashLiteLibStrings.mid = null,
    expr: vegaDashLiteLib.vegaDashLiteLibStrings.datum | vegaDashLiteLib.vegaDashLiteLibStrings.parent = null,
    nofn: js.UndefOr[scala.Boolean] = js.undefined,
    prefix: java.lang.String = null,
    suffix: java.lang.String = null
  ): FieldRefOption = {
    val __obj = js.Dynamic.literal()
    if (binSuffix != null) __obj.updateDynamic("binSuffix")(binSuffix.asInstanceOf[js.Any])
    if (expr != null) __obj.updateDynamic("expr")(expr.asInstanceOf[js.Any])
    if (!js.isUndefined(nofn)) __obj.updateDynamic("nofn")(nofn)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[FieldRefOption]
  }
}

