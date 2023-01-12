package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeTablePaste extends StObject {
  
  def insert(data: js.Array[Any]): Unit
}
object TreeTablePaste {
  
  @JSImport("webix", "TreeTablePaste")
  @js.native
  val ^ : TreeTablePaste = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeTablePaste] (val x: Self) extends AnyVal {
    
    inline def setInsert(value: js.Array[Any] => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
  }
}
