package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionRange extends StObject {
  
  var parent: js.UndefOr[SelectionRange] = js.native
  
  var textSpan: TextSpan = js.native
}
object SelectionRange {
  
  @scala.inline
  def apply(textSpan: TextSpan): SelectionRange = {
    val __obj = js.Dynamic.literal(textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionRange]
  }
  
  @scala.inline
  implicit class SelectionRangeMutableBuilder[Self <: SelectionRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParent(value: SelectionRange): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setTextSpan(value: TextSpan): Self = StObject.set(x, "textSpan", value.asInstanceOf[js.Any])
  }
}
