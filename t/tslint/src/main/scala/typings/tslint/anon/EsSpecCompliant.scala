package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EsSpecCompliant extends js.Object {
  var esSpecCompliant: Boolean = js.native
  var multiline: String = js.native
  var singleline: String = js.native
}

object EsSpecCompliant {
  @scala.inline
  def apply(esSpecCompliant: Boolean, multiline: String, singleline: String): EsSpecCompliant = {
    val __obj = js.Dynamic.literal(esSpecCompliant = esSpecCompliant.asInstanceOf[js.Any], multiline = multiline.asInstanceOf[js.Any], singleline = singleline.asInstanceOf[js.Any])
    __obj.asInstanceOf[EsSpecCompliant]
  }
  @scala.inline
  implicit class EsSpecCompliantOps[Self <: EsSpecCompliant] (val x: Self) extends AnyVal {
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
    def setEsSpecCompliant(value: Boolean): Self = this.set("esSpecCompliant", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiline(value: String): Self = this.set("multiline", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingleline(value: String): Self = this.set("singleline", value.asInstanceOf[js.Any])
  }
  
}

