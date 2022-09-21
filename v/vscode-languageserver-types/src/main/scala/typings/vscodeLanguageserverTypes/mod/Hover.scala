package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hover extends StObject {
  
  /**
    * The hover's content
    */
  var contents: MarkupContent | MarkedString | js.Array[MarkedString]
  
  /**
    * An optional range inside the text document that is used to
    * visualize the hover, e.g. by changing the background color.
    */
  var range: js.UndefOr[Range] = js.undefined
}
object Hover {
  
  inline def apply(contents: MarkupContent | MarkedString | js.Array[MarkedString]): Hover = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hover]
  }
  
  @JSImport("vscode-languageserver-types", "Hover")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Checks whether the given value conforms to the [Hover](#Hover) interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.Hover */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.Hover */ Boolean]
  
  extension [Self <: Hover](x: Self) {
    
    inline def setContents(value: MarkupContent | MarkedString | js.Array[MarkedString]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsVarargs(value: MarkedString*): Self = StObject.set(x, "contents", js.Array(value*))
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
