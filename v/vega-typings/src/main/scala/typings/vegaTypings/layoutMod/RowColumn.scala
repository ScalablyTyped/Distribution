package typings.vegaTypings.layoutMod

import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowColumn[T] extends js.Object {
  
  var column: js.UndefOr[T | SignalRef] = js.native
  
  var row: js.UndefOr[T | SignalRef] = js.native
}
object RowColumn {
  
  @scala.inline
  def apply[T](): RowColumn[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowColumn[T]]
  }
  
  @scala.inline
  implicit class RowColumnOps[Self <: RowColumn[_], T] (val x: Self with RowColumn[T]) extends AnyVal {
    
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
    def setColumn(value: T | SignalRef): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    
    @scala.inline
    def setRow(value: T | SignalRef): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
  }
}
