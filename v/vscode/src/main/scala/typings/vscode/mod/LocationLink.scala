package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationLink extends StObject {
  
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
  implicit class LocationLinkMutableBuilder[Self <: LocationLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginSelectionRange(value: Range): Self = StObject.set(x, "originSelectionRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginSelectionRangeUndefined: Self = StObject.set(x, "originSelectionRange", js.undefined)
    
    @scala.inline
    def setTargetRange(value: Range): Self = StObject.set(x, "targetRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSelectionRange(value: Range): Self = StObject.set(x, "targetSelectionRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSelectionRangeUndefined: Self = StObject.set(x, "targetSelectionRange", js.undefined)
    
    @scala.inline
    def setTargetUri(value: Uri): Self = StObject.set(x, "targetUri", value.asInstanceOf[js.Any])
  }
}
