package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeTablePaste extends StObject {
  
  def insert(data: js.Array[js.Any]): Unit
}
object TreeTablePaste {
  
  @JSImport("webix", "TreeTablePaste")
  @js.native
  val ^ : TreeTablePaste = js.native
  
  @scala.inline
  implicit class TreeTablePasteMutableBuilder[Self <: TreeTablePaste] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsert(value: js.Array[js.Any] => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
  }
}
