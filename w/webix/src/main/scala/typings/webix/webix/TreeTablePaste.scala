package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeTablePaste extends StObject {
  
  def insert(data: js.Array[_]): Unit = js.native
}
object TreeTablePaste {
  
  @scala.inline
  def apply(insert: js.Array[_] => Unit): TreeTablePaste = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert))
    __obj.asInstanceOf[TreeTablePaste]
  }
  
  @scala.inline
  implicit class TreeTablePasteMutableBuilder[Self <: TreeTablePaste] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsert(value: js.Array[_] => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
  }
}
