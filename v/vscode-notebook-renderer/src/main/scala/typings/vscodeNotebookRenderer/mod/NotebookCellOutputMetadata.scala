package typings.vscodeNotebookRenderer.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotebookCellOutputMetadata extends js.Object {
  
  /**
    * Additional attributes of a cell metadata.
    */
  var custom: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object NotebookCellOutputMetadata {
  
  @scala.inline
  def apply(): NotebookCellOutputMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookCellOutputMetadata]
  }
  
  @scala.inline
  implicit class NotebookCellOutputMetadataOps[Self <: NotebookCellOutputMetadata] (val x: Self) extends AnyVal {
    
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
    def setCustom(value: StringDictionary[js.Any]): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
  }
}
