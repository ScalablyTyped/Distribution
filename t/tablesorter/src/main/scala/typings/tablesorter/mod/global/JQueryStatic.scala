package typings.tablesorter.mod.global

import typings.tablesorter.tablesorterMod.Tablesorter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic[TElement] extends js.Object {
  
  /**
    * The tablesorter.
    */
  var tablesorter: Tablesorter[TElement] = js.native
}
object JQueryStatic {
  
  @scala.inline
  def apply[TElement](tablesorter: Tablesorter[TElement]): JQueryStatic[TElement] = {
    val __obj = js.Dynamic.literal(tablesorter = tablesorter.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic[TElement]]
  }
  
  @scala.inline
  implicit class JQueryStaticOps[Self <: JQueryStatic[_], TElement] (val x: Self with JQueryStatic[TElement]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTablesorter(value: Tablesorter[TElement]): Self = this.set("tablesorter", value.asInstanceOf[js.Any])
  }
}
