package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentLink extends StObject {
  
  /**
    * A data entry field that is preserved on a document link between a
    * DocumentLinkRequest and a DocumentLinkResolveRequest.
    */
  var data: js.UndefOr[LSPAny] = js.undefined
  
  /**
    * The range this link applies to.
    */
  var range: Range
  
  /**
    * The uri this link points to. If missing a resolve request is sent later.
    */
  var target: js.UndefOr[String] = js.undefined
  
  /**
    * The tooltip text when you hover over this link.
    *
    * If a tooltip is provided, is will be displayed in a string that includes instructions on how to
    * trigger the link, such as `{0} (ctrl + click)`. The specific instructions vary depending on OS,
    * user settings, and localization.
    *
    * @since 3.15.0
    */
  var tooltip: js.UndefOr[String] = js.undefined
}
object DocumentLink {
  
  inline def apply(range: Range): DocumentLink = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentLink]
  }
  
  @JSImport("vscode-languageserver-types", "DocumentLink")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new DocumentLink literal.
    */
  inline def create(range: Range): DocumentLink = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any]).asInstanceOf[DocumentLink]
  inline def create(range: Range, target: String): DocumentLink = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[DocumentLink]
  inline def create(range: Range, target: String, data: LSPAny): DocumentLink = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], target.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[DocumentLink]
  inline def create(range: Range, target: Unit, data: LSPAny): DocumentLink = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], target.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[DocumentLink]
  
  /**
    * Checks whether the given literal conforms to the [DocumentLink](#DocumentLink) interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.DocumentLink */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.DocumentLink */ Boolean]
  
  extension [Self <: DocumentLink](x: Self) {
    
    inline def setData(value: LSPAny): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
