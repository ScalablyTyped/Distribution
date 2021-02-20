package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionRange extends StObject {
  
  /**
    * The parent selection range containing this range. Therefore `parent.range` must contain `this.range`.
    */
  var parent: js.UndefOr[SelectionRange] = js.native
  
  /**
    * The [range](#Range) of this selection range.
    */
  var range: Range = js.native
}
object SelectionRange {
  
  @scala.inline
  def apply(range: Range): SelectionRange = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionRange]
  }
  
  /**
    * Creates a new SelectionRange
    * @param range the range.
    * @param parent an optional parent.
    */
  @JSImport("vscode-languageserver-types", "SelectionRange.create")
  @js.native
  def create(range: Range): SelectionRange = js.native
  @JSImport("vscode-languageserver-types", "SelectionRange.create")
  @js.native
  def create(range: Range, parent: SelectionRange): SelectionRange = js.native
  
  @JSImport("vscode-languageserver-types", "SelectionRange.is")
  @js.native
  def is(value: js.Any): /* is vscode-languageserver-types.vscode-languageserver-types.SelectionRange */ Boolean = js.native
  
  @scala.inline
  implicit class SelectionRangeMutableBuilder[Self <: SelectionRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParent(value: SelectionRange): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
