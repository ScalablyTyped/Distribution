package typings.wordpressApiFetch.mod.Schema

import typings.std.Record
import typings.wordpressApiFetch.anon.Dictk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseResponse extends js.Object {
  var _embedded: js.UndefOr[Record[String, js.Array[_]]] = js.native
  var _links: Record[String, js.Array[Dictk]] = js.native
}

object BaseResponse {
  @scala.inline
  def apply(_links: Record[String, js.Array[Dictk]]): BaseResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseResponse]
  }
  @scala.inline
  implicit class BaseResponseOps[Self <: BaseResponse] (val x: Self) extends AnyVal {
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
    def set_links(value: Record[String, js.Array[Dictk]]): Self = this.set("_links", value.asInstanceOf[js.Any])
    @scala.inline
    def set_embedded(value: Record[String, js.Array[_]]): Self = this.set("_embedded", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_embedded: Self = this.set("_embedded", js.undefined)
  }
  
}

