package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceControlResourceThemableDecorations extends js.Object {
  
  /**
    * The icon path for a specific
    * [source control resource state](#SourceControlResourceState).
    */
  val iconPath: js.UndefOr[String | Uri] = js.native
}
object SourceControlResourceThemableDecorations {
  
  @scala.inline
  def apply(): SourceControlResourceThemableDecorations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceControlResourceThemableDecorations]
  }
  
  @scala.inline
  implicit class SourceControlResourceThemableDecorationsOps[Self <: SourceControlResourceThemableDecorations] (val x: Self) extends AnyVal {
    
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
    def setIconPath(value: String | Uri): Self = this.set("iconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconPath: Self = this.set("iconPath", js.undefined)
  }
}
