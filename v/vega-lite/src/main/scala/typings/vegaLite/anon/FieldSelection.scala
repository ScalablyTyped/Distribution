package typings.vegaLite.anon

import typings.vegaLite.channeldefMod.FieldName
import typings.vegaLite.srcSelectionMod.SelectionExtent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldSelection
  extends StObject
     with SelectionExtent {
  
  /**
    * The field name to extract selected values for, when a selection is [projected](https://vega.github.io/vega-lite/docs/project.html)
    * over multiple fields or encodings.
    */
  var field: js.UndefOr[FieldName] = js.undefined
  
  /**
    * The name of a selection.
    */
  var selection: String
}
object FieldSelection {
  
  inline def apply(selection: String): FieldSelection = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSelection]
  }
  
  extension [Self <: FieldSelection](x: Self) {
    
    inline def setField(value: FieldName): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setSelection(value: String): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
  }
}
