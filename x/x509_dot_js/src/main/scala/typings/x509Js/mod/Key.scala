package typings.x509Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Key extends js.Object {
  var publicExponent: String = js.native
  var publicModulus: String = js.native
}

object Key {
  @scala.inline
  def apply(publicExponent: String, publicModulus: String): Key = {
    val __obj = js.Dynamic.literal(publicExponent = publicExponent.asInstanceOf[js.Any], publicModulus = publicModulus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  @scala.inline
  implicit class KeyOps[Self <: Key] (val x: Self) extends AnyVal {
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
    def setPublicExponent(value: String): Self = this.set("publicExponent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicModulus(value: String): Self = this.set("publicModulus", value.asInstanceOf[js.Any])
  }
  
}

