package typings.winjs.WinJS.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a range of indexes or keys in an ISelection.
  **/
trait ISelectionRange extends StObject {
  
  //#region Properties
  /**
    * Gets or sets the index of the first item in the range.
    **/
  var firstIndex: Double
  
  /**
    * Gets or sets the key of the first item in the range.
    **/
  var firstKey: Any
  
  /**
    * Gets or sets the index of the last item in the range.
    **/
  var lastIndex: Double
  
  /**
    * Gets or sets of the key of the last item in the range.
    **/
  var lastKey: Any
}
object ISelectionRange {
  
  inline def apply(firstIndex: Double, firstKey: Any, lastIndex: Double, lastKey: Any): ISelectionRange = {
    val __obj = js.Dynamic.literal(firstIndex = firstIndex.asInstanceOf[js.Any], firstKey = firstKey.asInstanceOf[js.Any], lastIndex = lastIndex.asInstanceOf[js.Any], lastKey = lastKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectionRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISelectionRange] (val x: Self) extends AnyVal {
    
    inline def setFirstIndex(value: Double): Self = StObject.set(x, "firstIndex", value.asInstanceOf[js.Any])
    
    inline def setFirstKey(value: Any): Self = StObject.set(x, "firstKey", value.asInstanceOf[js.Any])
    
    inline def setLastIndex(value: Double): Self = StObject.set(x, "lastIndex", value.asInstanceOf[js.Any])
    
    inline def setLastKey(value: Any): Self = StObject.set(x, "lastKey", value.asInstanceOf[js.Any])
  }
}
