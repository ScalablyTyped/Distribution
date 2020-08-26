package typings.tablesorter.zebraOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZebraOptions extends js.Object {
  /**
    * The classes to add to even and odd rows.
    */
  var zebra: js.UndefOr[js.Tuple2[String, String]] = js.native
}

object ZebraOptions {
  @scala.inline
  def apply(): ZebraOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZebraOptions]
  }
  @scala.inline
  implicit class ZebraOptionsOps[Self <: ZebraOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setZebra(value: js.Tuple2[String, String]): Self = this.set("zebra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZebra: Self = this.set("zebra", js.undefined)
  }
  
}

