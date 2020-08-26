package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CharSet extends js.Object {
  var charSet: String = js.native
  var path: String = js.native
  var result: String = js.native
  var scanType: String = js.native
}

object CharSet {
  @scala.inline
  def apply(charSet: String, path: String, result: String, scanType: String): CharSet = {
    val __obj = js.Dynamic.literal(charSet = charSet.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], scanType = scanType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharSet]
  }
  @scala.inline
  implicit class CharSetOps[Self <: CharSet] (val x: Self) extends AnyVal {
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
    def setCharSet(value: String): Self = this.set("charSet", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: String): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setScanType(value: String): Self = this.set("scanType", value.asInstanceOf[js.Any])
  }
  
}

