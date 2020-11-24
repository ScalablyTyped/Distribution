package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationLink extends js.Object {
  
  /**
    * Span of the origin of this link.
    *
    * Used as the underlined span for mouse definition hover. Defaults to the word range at
    * the definition position.
    */
  var originSelectionRange: js.UndefOr[Range] = js.native
  
  /**
    * The full target range of this link.
    */
  var targetRange: Range = js.native
  
  /**
    * The span of this link.
    */
  var targetSelectionRange: js.UndefOr[Range] = js.native
  
  /**
    * The target resource identifier of this link.
    */
  var targetUri: Uri = js.native
}
object LocationLink {
  
  @scala.inline
  def apply(targetRange: Range, targetUri: Uri): LocationLink = {
    val __obj = js.Dynamic.literal(targetRange = targetRange.asInstanceOf[js.Any], targetUri = targetUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationLink]
  }
  
  @scala.inline
  implicit class LocationLinkOps[Self <: LocationLink] (val x: Self) extends AnyVal {
    
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
    def setTargetRange(value: Range): Self = this.set("targetRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUri(value: Uri): Self = this.set("targetUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginSelectionRange(value: Range): Self = this.set("originSelectionRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginSelectionRange: Self = this.set("originSelectionRange", js.undefined)
    
    @scala.inline
    def setTargetSelectionRange(value: Range): Self = this.set("targetSelectionRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetSelectionRange: Self = this.set("targetSelectionRange", js.undefined)
  }
}
