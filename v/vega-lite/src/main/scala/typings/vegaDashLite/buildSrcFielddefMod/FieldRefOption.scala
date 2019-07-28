package typings.vegaDashLite.buildSrcFielddefMod

import typings.vegaDashLite.vegaDashLiteStrings.datum
import typings.vegaDashLite.vegaDashLiteStrings.end
import typings.vegaDashLite.vegaDashLiteStrings.mid
import typings.vegaDashLite.vegaDashLiteStrings.parent
import typings.vegaDashLite.vegaDashLiteStrings.range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldRefOption extends js.Object {
  /** append suffix to the field ref for bin (default='start') */
  var binSuffix: js.UndefOr[end | range | mid] = js.undefined
  /** Wrap the field with datum or parent (e.g., datum['...'] for Vega Expression */
  var expr: js.UndefOr[datum | parent] = js.undefined
  /** exclude bin, aggregate, timeUnit */
  var nofn: js.UndefOr[Boolean] = js.undefined
  /** prepend fn with custom function prefix */
  var prefix: js.UndefOr[String] = js.undefined
  /** append suffix to the field ref (general) */
  var suffix: js.UndefOr[String] = js.undefined
}

object FieldRefOption {
  @scala.inline
  def apply(
    binSuffix: end | range | mid = null,
    expr: datum | parent = null,
    nofn: js.UndefOr[Boolean] = js.undefined,
    prefix: String = null,
    suffix: String = null
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

