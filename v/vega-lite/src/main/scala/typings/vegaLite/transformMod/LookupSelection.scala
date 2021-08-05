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
  
  inline def apply(key: FieldName, selection: String): LookupSelection = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupSelection]
  }
  
  extension [Self <: LookupSelection](x: Self) {
    
    inline def setSelection(value: String): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
  }
}
