package typings.vegaLite.anon

import typings.vegaLite.channelMod.SingleDefUnitChannel
import typings.vegaLite.srcSelectionMod.SelectionExtent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodingSelection
  extends StObject
     with SelectionExtent {
  
  /**
    * The encoding channel to extract selected values for, when a selection is [projected](https://vega.github.io/vega-lite/docs/project.html)
    * over multiple fields or encodings.
    */
  var encoding: js.UndefOr[SingleDefUnitChannel] = js.undefined
  
  /**
    * The name of a selection.
    */
  var selection: String
}
object EncodingSelection {
  
  inline def apply(selection: String): EncodingSelection = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodingSelection]
  }
  
  extension [Self <: EncodingSelection](x: Self) {
    
    inline def setEncoding(value: SingleDefUnitChannel): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setSelection(value: String): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
  }
}
