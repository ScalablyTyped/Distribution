package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Information about the parsed input document. */
@js.native
trait DocInfo extends js.Object {
  
  /** The MD5 hash of the input document. */
  var hash: js.UndefOr[String] = js.native
  
  /** The full text of the parsed document in HTML format. */
  var html: js.UndefOr[String] = js.native
  
  /** The title of the parsed document. If the service did not detect a title, the value of this element is `null`. */
  var title: js.UndefOr[String] = js.native
}
object DocInfo {
  
  @scala.inline
  def apply(): DocInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocInfo]
  }
  
  @scala.inline
  implicit class DocInfoOps[Self <: DocInfo] (val x: Self) extends AnyVal {
    
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
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
