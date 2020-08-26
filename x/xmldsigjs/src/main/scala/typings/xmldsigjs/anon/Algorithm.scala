package typings.xmldsigjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Algorithm extends js.Object {
  var Algorithm: String = js.native
  var Encoding: String = js.native
  var Id: String = js.native
  var MimeType: String = js.native
  var Type: String = js.native
  var URI: String = js.native
}

object Algorithm {
  @scala.inline
  def apply(Algorithm: String, Encoding: String, Id: String, MimeType: String, Type: String, URI: String): Algorithm = {
    val __obj = js.Dynamic.literal(Algorithm = Algorithm.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], MimeType = MimeType.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], URI = URI.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algorithm]
  }
  @scala.inline
  implicit class AlgorithmOps[Self <: Algorithm] (val x: Self) extends AnyVal {
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
    def setAlgorithm(value: String): Self = this.set("Algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncoding(value: String): Self = this.set("Encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMimeType(value: String): Self = this.set("MimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setURI(value: String): Self = this.set("URI", value.asInstanceOf[js.Any])
  }
  
}

