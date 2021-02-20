package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeTablePaste extends StObject {
  
  def insert(data: js.Array[_]): Unit = js.native
}
object TreeTablePaste {
  
  @JSImport("webix", "TreeTablePaste")
  @js.native
  val ^ : TreeTablePaste = js.native
  
  @scala.inline
  implicit class TreeTablePasteMutableBuilder[Self <: TreeTablePaste] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsert(value: js.Array[_] => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
  }
}
