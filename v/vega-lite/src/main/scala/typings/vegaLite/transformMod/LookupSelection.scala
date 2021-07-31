package typings.vegaLite.transformMod

import typings.vegaLite.channeldefMod.FieldName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupSelection
  extends StObject
     with LookupBase {
  
  /**
    * Selection name to look up.
    */
  var selection: String
}
object LookupSelection {
  
  @scala.inline
  def apply(key: FieldName, selection: String): LookupSelection = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupSelection]
  }
  
  @scala.inline
  implicit class LookupSelectionMutableBuilder[Self <: LookupSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelection(value: String): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
  }
}
