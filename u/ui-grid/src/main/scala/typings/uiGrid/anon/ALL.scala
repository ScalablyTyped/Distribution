package typings.uiGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ALL extends js.Object {
  var ALL: String = js.native
  var COLUMN: String = js.native
  var EDIT: String = js.native
  var OPTIONS: String = js.native
  var ROW: String = js.native
}

object ALL {
  @scala.inline
  def apply(ALL: String, COLUMN: String, EDIT: String, OPTIONS: String, ROW: String): ALL = {
    val __obj = js.Dynamic.literal(ALL = ALL.asInstanceOf[js.Any], COLUMN = COLUMN.asInstanceOf[js.Any], EDIT = EDIT.asInstanceOf[js.Any], OPTIONS = OPTIONS.asInstanceOf[js.Any], ROW = ROW.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALL]
  }
  @scala.inline
  implicit class ALLOps[Self <: ALL] (val x: Self) extends AnyVal {
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
    def setALL(value: String): Self = this.set("ALL", value.asInstanceOf[js.Any])
    @scala.inline
    def setCOLUMN(value: String): Self = this.set("COLUMN", value.asInstanceOf[js.Any])
    @scala.inline
    def setEDIT(value: String): Self = this.set("EDIT", value.asInstanceOf[js.Any])
    @scala.inline
    def setOPTIONS(value: String): Self = this.set("OPTIONS", value.asInstanceOf[js.Any])
    @scala.inline
    def setROW(value: String): Self = this.set("ROW", value.asInstanceOf[js.Any])
  }
  
}

