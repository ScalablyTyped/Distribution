package typings.swaggerStats.anon

import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Class extends js.Object {
  var `class`: String = js.native
  var clength: js.UndefOr[Double] = js.native
  var code: String = js.native
  var headers: js.UndefOr[OutgoingHttpHeaders] = js.native
  var phrase: String = js.native
}

object Class {
  @scala.inline
  def apply(`class`: String, code: String, phrase: String): Class = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], phrase = phrase.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Class]
  }
  @scala.inline
  implicit class ClassOps[Self <: Class] (val x: Self) extends AnyVal {
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
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhrase(value: String): Self = this.set("phrase", value.asInstanceOf[js.Any])
    @scala.inline
    def setClength(value: Double): Self = this.set("clength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClength: Self = this.set("clength", js.undefined)
    @scala.inline
    def setHeaders(value: OutgoingHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
  }
  
}

