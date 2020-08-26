package typings.xml2js.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Encoding extends js.Object {
  var encoding: js.UndefOr[String] = js.native
  var standalone: js.UndefOr[Boolean] = js.native
  var version: String = js.native
}

object Encoding {
  @scala.inline
  def apply(version: String): Encoding = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding]
  }
  @scala.inline
  implicit class EncodingOps[Self <: Encoding] (val x: Self) extends AnyVal {
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
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setStandalone(value: Boolean): Self = this.set("standalone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandalone: Self = this.set("standalone", js.undefined)
  }
  
}

