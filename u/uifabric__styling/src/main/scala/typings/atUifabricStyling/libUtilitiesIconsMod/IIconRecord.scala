package typings.atUifabricStyling.libUtilitiesIconsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIconRecord extends js.Object {
  var code: js.UndefOr[String] = js.undefined
  var subset: IIconSubsetRecord
}

object IIconRecord {
  @scala.inline
  def apply(subset: IIconSubsetRecord, code: String = null): IIconRecord = {
    val __obj = js.Dynamic.literal(subset = subset)
    if (code != null) __obj.updateDynamic("code")(code)
    __obj.asInstanceOf[IIconRecord]
  }
}

