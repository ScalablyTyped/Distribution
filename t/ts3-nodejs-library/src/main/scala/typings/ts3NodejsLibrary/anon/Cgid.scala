package typings.ts3NodejsLibrary.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cgid extends js.Object {
  var cgid: String = js.native
}

object Cgid {
  @scala.inline
  def apply(cgid: String): Cgid = {
    val __obj = js.Dynamic.literal(cgid = cgid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cgid]
  }
  @scala.inline
  implicit class CgidOps[Self <: Cgid] (val x: Self) extends AnyVal {
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
    def setCgid(value: String): Self = this.set("cgid", value.asInstanceOf[js.Any])
  }
  
}

