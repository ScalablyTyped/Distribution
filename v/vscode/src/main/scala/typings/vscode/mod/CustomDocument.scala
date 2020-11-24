package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a custom document used by a [`CustomEditorProvider`](#CustomEditorProvider).
  *
  * Custom documents are only used within a given `CustomEditorProvider`. The lifecycle of a `CustomDocument` is
  * managed by VS Code. When no more references remain to a `CustomDocument`, it is disposed of.
  */
@js.native
trait CustomDocument extends js.Object {
  
  /**
    * Dispose of the custom document.
    *
    * This is invoked by VS Code when there are no more references to a given `CustomDocument` (for example when
    * all editors associated with the document have been closed.)
    */
  def dispose(): Unit = js.native
  
  /**
    * The associated uri for this document.
    */
  val uri: Uri = js.native
}
object CustomDocument {
  
  @scala.inline
  def apply(dispose: () => Unit, uri: Uri): CustomDocument = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomDocument]
  }
  
  @scala.inline
  implicit class CustomDocumentOps[Self <: CustomDocument] (val x: Self) extends AnyVal {
    
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
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUri(value: Uri): Self = this.set("uri", value.asInstanceOf[js.Any])
  }
}
