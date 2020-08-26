package typings.typescriptTuple.anon

import typings.typescriptTuple.typescriptTupleStrings.InfiniteLeft
import typings.typescriptTuple.typescriptTupleStrings.`Left is not finite`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ERROR extends js.Object {
  var CODENAME: InfiniteLeft with typings.typescriptTuple.typescriptTupleStrings.Infinite = js.native
  var ERROR: `Left is not finite` = js.native
}

object ERROR {
  @scala.inline
  def apply(
    CODENAME: InfiniteLeft with typings.typescriptTuple.typescriptTupleStrings.Infinite,
    ERROR: `Left is not finite`
  ): ERROR = {
    val __obj = js.Dynamic.literal(CODENAME = CODENAME.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any])
    __obj.asInstanceOf[ERROR]
  }
  @scala.inline
  implicit class ERROROps[Self <: ERROR] (val x: Self) extends AnyVal {
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
    def setCODENAME(value: InfiniteLeft with typings.typescriptTuple.typescriptTupleStrings.Infinite): Self = this.set("CODENAME", value.asInstanceOf[js.Any])
    @scala.inline
    def setERROR(value: `Left is not finite`): Self = this.set("ERROR", value.asInstanceOf[js.Any])
  }
  
}

