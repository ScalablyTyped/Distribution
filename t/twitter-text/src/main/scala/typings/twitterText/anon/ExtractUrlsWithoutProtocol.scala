package typings.twitterText.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtractUrlsWithoutProtocol extends js.Object {
  var extractUrlsWithoutProtocol: Boolean = js.native
}

object ExtractUrlsWithoutProtocol {
  @scala.inline
  def apply(extractUrlsWithoutProtocol: Boolean): ExtractUrlsWithoutProtocol = {
    val __obj = js.Dynamic.literal(extractUrlsWithoutProtocol = extractUrlsWithoutProtocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtractUrlsWithoutProtocol]
  }
  @scala.inline
  implicit class ExtractUrlsWithoutProtocolOps[Self <: ExtractUrlsWithoutProtocol] (val x: Self) extends AnyVal {
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
    def setExtractUrlsWithoutProtocol(value: Boolean): Self = this.set("extractUrlsWithoutProtocol", value.asInstanceOf[js.Any])
  }
  
}

