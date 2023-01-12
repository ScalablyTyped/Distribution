package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineValueText
  extends StObject
     with InlineValue {
  
  /**
    * The document range for which the inline value applies.
    */
  var range: Range
  
  /**
    * The text of the inline value.
    */
  var text: String
}
object InlineValueText {
  
  inline def apply(range: Range, text: String): InlineValueText = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineValueText]
  }
  
  @JSImport("vscode-languageserver-types", "InlineValueText")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new InlineValueText literal.
    */
  inline def create(range: Range, text: String): InlineValueText = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[InlineValueText]
  
  inline def is(): /* is vscode-languageserver-types.vscode-languageserver-types.InlineValueText */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")().asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.InlineValueText */ Boolean]
  inline def is(value: InlineValue): /* is vscode-languageserver-types.vscode-languageserver-types.InlineValueText */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.InlineValueText */ Boolean]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlineValueText] (val x: Self) extends AnyVal {
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
