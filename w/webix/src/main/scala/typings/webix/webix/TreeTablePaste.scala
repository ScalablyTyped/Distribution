package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeTablePaste extends StObject {
  
  def insert(data: js.Array[js.Any]): Unit
}
object TreeTablePaste {
  
  inline def apply(insert: js.Array[js.Any] => Unit): TreeTablePaste = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert))
    __obj.asInstanceOf[TreeTablePaste]
  }
  
  extension [Self <: TreeTablePaste](x: Self) {
    
    inline def setInsert(value: js.Array[js.Any] => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
  }
}
