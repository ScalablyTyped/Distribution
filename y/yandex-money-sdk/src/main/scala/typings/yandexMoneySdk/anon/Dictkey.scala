package typings.yandexMoneySdk.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  var MD: String = js.native
  var PaReq: String = js.native
}

object Dictkey {
  @scala.inline
  def apply(MD: String, PaReq: String): Dictkey = {
    val __obj = js.Dynamic.literal(MD = MD.asInstanceOf[js.Any], PaReq = PaReq.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  @scala.inline
  implicit class DictkeyOps[Self <: Dictkey] (val x: Self) extends AnyVal {
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
    def setMD(value: String): Self = this.set("MD", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaReq(value: String): Self = this.set("PaReq", value.asInstanceOf[js.Any])
  }
  
}

