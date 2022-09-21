package typings.tengitsui.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableEditorRef extends StObject {
  
  def getErrors(): js.Array[Any]
  
  def getValue(): js.Array[Any]
}
object TableEditorRef {
  
  inline def apply(getErrors: () => js.Array[Any], getValue: () => js.Array[Any]): TableEditorRef = {
    val __obj = js.Dynamic.literal(getErrors = js.Any.fromFunction0(getErrors), getValue = js.Any.fromFunction0(getValue))
    __obj.asInstanceOf[TableEditorRef]
  }
  
  extension [Self <: TableEditorRef](x: Self) {
    
    inline def setGetErrors(value: () => js.Array[Any]): Self = StObject.set(x, "getErrors", js.Any.fromFunction0(value))
    
    inline def setGetValue(value: () => js.Array[Any]): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
  }
}
