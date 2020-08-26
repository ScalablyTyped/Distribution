package typings.x509Js.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonName extends js.Object {
  var commonName: String = js.native
}

object CommonName {
  @scala.inline
  def apply(commonName: String): CommonName = {
    val __obj = js.Dynamic.literal(commonName = commonName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonName]
  }
  @scala.inline
  implicit class CommonNameOps[Self <: CommonName] (val x: Self) extends AnyVal {
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
    def setCommonName(value: String): Self = this.set("commonName", value.asInstanceOf[js.Any])
  }
  
}

