package typings.twitchExt.anon

import typings.twitchExt.TwitchExt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ext extends js.Object {
  var ext: TwitchExt = js.native
}

object Ext {
  @scala.inline
  def apply(ext: TwitchExt): Ext = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ext]
  }
  @scala.inline
  implicit class ExtOps[Self <: Ext] (val x: Self) extends AnyVal {
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
    def setExt(value: TwitchExt): Self = this.set("ext", value.asInstanceOf[js.Any])
  }
  
}

