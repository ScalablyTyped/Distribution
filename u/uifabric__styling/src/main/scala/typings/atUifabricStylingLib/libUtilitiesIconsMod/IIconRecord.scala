package typings
package atUifabricStylingLib.libUtilitiesIconsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIconRecord extends js.Object {
  var code: js.UndefOr[java.lang.String]
  var subset: IIconSubsetRecord
}

object IIconRecord {
  @scala.inline
  def apply(subset: IIconSubsetRecord, code: java.lang.String = null): IIconRecord = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subset")(subset)
    if (code != null) __obj.updateDynamic("code")(code)
    __obj.asInstanceOf[IIconRecord]
  }
}

