package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentFilter extends js.Object {
  
  /**
    * A language id, like `typescript`.
    */
  val language: js.UndefOr[String] = js.native
  
  /**
    * A [glob pattern](#GlobPattern) that is matched on the absolute path of the document. Use a [relative pattern](#RelativePattern)
    * to filter documents to a [workspace folder](#WorkspaceFolder).
    */
  val pattern: js.UndefOr[GlobPattern] = js.native
  
  /**
    * A Uri [scheme](#Uri.scheme), like `file` or `untitled`.
    */
  val scheme: js.UndefOr[String] = js.native
}
object DocumentFilter {
  
  @scala.inline
  def apply(): DocumentFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentFilter]
  }
  
  @scala.inline
  implicit class DocumentFilterOps[Self <: DocumentFilter] (val x: Self) extends AnyVal {
    
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
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setPattern(value: GlobPattern): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
  }
}
