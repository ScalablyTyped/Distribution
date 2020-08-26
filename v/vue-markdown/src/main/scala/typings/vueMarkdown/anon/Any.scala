package typings.vueMarkdown.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Any extends js.Object {
  var Any: RegExp = js.native
  var Cc: RegExp = js.native
  var Cf: RegExp = js.native
  var P: RegExp = js.native
  var Z: RegExp = js.native
}

object Any {
  @scala.inline
  def apply(Any: RegExp, Cc: RegExp, Cf: RegExp, P: RegExp, Z: RegExp): Any = {
    val __obj = js.Dynamic.literal(Any = Any.asInstanceOf[js.Any], Cc = Cc.asInstanceOf[js.Any], Cf = Cf.asInstanceOf[js.Any], P = P.asInstanceOf[js.Any], Z = Z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Any]
  }
  @scala.inline
  implicit class AnyOps[Self <: Any] (val x: Self) extends AnyVal {
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
    def setAny(value: RegExp): Self = this.set("Any", value.asInstanceOf[js.Any])
    @scala.inline
    def setCc(value: RegExp): Self = this.set("Cc", value.asInstanceOf[js.Any])
    @scala.inline
    def setCf(value: RegExp): Self = this.set("Cf", value.asInstanceOf[js.Any])
    @scala.inline
    def setP(value: RegExp): Self = this.set("P", value.asInstanceOf[js.Any])
    @scala.inline
    def setZ(value: RegExp): Self = this.set("Z", value.asInstanceOf[js.Any])
  }
  
}

