package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hover extends StObject {
  
  /**
    * The hover's content
    */
  var contents: MarkupContent | MarkedString | js.Array[MarkedString] = js.native
  
  /**
    * An optional range
    */
  var range: js.UndefOr[Range] = js.native
}
object Hover {
  
  @scala.inline
  def apply(contents: MarkupContent | MarkedString | js.Array[MarkedString]): Hover = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hover]
  }
  
  /**
    * Checks whether the given value conforms to the [Hover](#Hover) interface.
    */
  @JSImport("vscode-languageserver-types", "Hover.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.Hover */ Boolean = js.native
  
  @scala.inline
  implicit class HoverMutableBuilder[Self <: Hover] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: MarkupContent | MarkedString | js.Array[MarkedString]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsVarargs(value: MarkedString*): Self = StObject.set(x, "contents", js.Array(value :_*))
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
