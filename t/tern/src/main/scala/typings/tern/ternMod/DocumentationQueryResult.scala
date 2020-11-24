package typings.tern.ternMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentationQueryResult extends js.Object {
  
  /** The documentation string of the definition or value, if any. */
  var doc: js.UndefOr[String] = js.native
  
  /** The origin of the definition or value, if any. */
  var origin: js.UndefOr[String] = js.native
  
  /** The url of the definition or value, if any. */
  var url: js.UndefOr[String] = js.native
}
object DocumentationQueryResult {
  
  @scala.inline
  def apply(): DocumentationQueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentationQueryResult]
  }
  
  @scala.inline
  implicit class DocumentationQueryResultOps[Self <: DocumentationQueryResult] (val x: Self) extends AnyVal {
    
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
    def setDoc(value: String): Self = this.set("doc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoc: Self = this.set("doc", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
