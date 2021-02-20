package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentLink extends StObject {
  
  /**
    * A data entry field that is preserved on a document link between a
    * DocumentLinkRequest and a DocumentLinkResolveRequest.
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * The range this link applies to.
    */
  var range: Range = js.native
  
  /**
    * The uri this link points to.
    */
  var target: js.UndefOr[String] = js.native
  
  /**
    * The tooltip text when you hover over this link.
    *
    * If a tooltip is provided, is will be displayed in a string that includes instructions on how to
    * trigger the link, such as `{0} (ctrl + click)`. The specific instructions vary depending on OS,
    * user settings, and localization.
    *
    * @since 3.15.0
    */
  var tooltip: js.UndefOr[String] = js.native
}
object DocumentLink {
  
  @scala.inline
  def apply(range: Range): DocumentLink = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentLink]
  }
  
  /**
    * Creates a new DocumentLink literal.
    */
  @JSImport("vscode-languageserver-types", "DocumentLink.create")
  @js.native
  def create(range: Range): DocumentLink = js.native
  @JSImport("vscode-languageserver-types", "DocumentLink.create")
  @js.native
  def create(range: Range, target: js.UndefOr[scala.Nothing], data: js.Any): DocumentLink = js.native
  @JSImport("vscode-languageserver-types", "DocumentLink.create")
  @js.native
  def create(range: Range, target: String): DocumentLink = js.native
  @JSImport("vscode-languageserver-types", "DocumentLink.create")
  @js.native
  def create(range: Range, target: String, data: js.Any): DocumentLink = js.native
  
  /**
    * Checks whether the given literal conforms to the [DocumentLink](#DocumentLink) interface.
    */
  @JSImport("vscode-languageserver-types", "DocumentLink.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.DocumentLink */ Boolean = js.native
  
  @scala.inline
  implicit class DocumentLinkMutableBuilder[Self <: DocumentLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
