package typings.vscodeLanguageserverTypes.mod

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
    * The full target range of this link. If the target for example is a symbol then target range is the
    * range enclosing this symbol not including leading/trailing whitespace but everything else
    * like comments. This information is typically used to highlight the range in the editor.
    */
  var targetRange: Range = js.native
  
  /**
    * The range that should be selected and revealed when this link is being followed, e.g the name of a function.
    * Must be contained by the the `targetRange`. See also `DocumentSymbol#range`
    */
  var targetSelectionRange: Range = js.native
  
  /**
    * The target resource identifier of this link.
    */
  var targetUri: DocumentUri = js.native
}
object LocationLink {
  
  @scala.inline
  def apply(targetRange: Range, targetSelectionRange: Range, targetUri: DocumentUri): LocationLink = {
    val __obj = js.Dynamic.literal(targetRange = targetRange.asInstanceOf[js.Any], targetSelectionRange = targetSelectionRange.asInstanceOf[js.Any], targetUri = targetUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationLink]
  }
  
  /**
    * Creates a LocationLink literal.
    * @param targetUri The definition's uri.
    * @param targetRange The full range of the definition.
    * @param targetSelectionRange The span of the symbol definition at the target.
    * @param originSelectionRange The span of the symbol being defined in the originating source file.
    */
  @JSImport("vscode-languageserver-types", "LocationLink.create")
  @js.native
  def create(targetUri: DocumentUri, targetRange: Range, targetSelectionRange: Range): LocationLink = js.native
  @JSImport("vscode-languageserver-types", "LocationLink.create")
  @js.native
  def create(
    targetUri: DocumentUri,
    targetRange: Range,
    targetSelectionRange: Range,
    originSelectionRange: Range
  ): LocationLink = js.native
  
  /**
    * Checks whether the given literal conforms to the [LocationLink](#LocationLink) interface.
    */
  @JSImport("vscode-languageserver-types", "LocationLink.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.LocationLink */ Boolean = js.native
  
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
    def setTargetUri(value: DocumentUri): Self = StObject.set(x, "targetUri", value.asInstanceOf[js.Any])
  }
}
