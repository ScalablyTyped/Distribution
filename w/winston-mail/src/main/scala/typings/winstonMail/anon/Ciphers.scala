package typings.winstonMail.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ciphers extends js.Object {
  var ciphers: String = js.native
}

object Ciphers {
  @scala.inline
  def apply(ciphers: String): Ciphers = {
    val __obj = js.Dynamic.literal(ciphers = ciphers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ciphers]
  }
  @scala.inline
  implicit class CiphersOps[Self <: Ciphers] (val x: Self) extends AnyVal {
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
    def setCiphers(value: String): Self = this.set("ciphers", value.asInstanceOf[js.Any])
  }
  
}

