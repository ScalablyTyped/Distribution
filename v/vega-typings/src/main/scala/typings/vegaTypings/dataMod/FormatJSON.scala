package typings.vegaTypings.dataMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatJSON extends _Format {
  var copy: js.UndefOr[Boolean] = js.undefined
  var parse: js.UndefOr[Parse] = js.undefined
  var property: js.UndefOr[String | SignalRef] = js.undefined
  var `type`: json
}

object FormatJSON {
  @scala.inline
  def apply(
    `type`: json,
    copy: js.UndefOr[Boolean] = js.undefined,
    parse: Parse = null,
    property: String | SignalRef = null
  ): FormatJSON = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(copy)) __obj.updateDynamic("copy")(copy.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatJSON]
  }
}

