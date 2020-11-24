package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMatrixData extends js.Object {
  
  def onMatrixRowChanged(row: MatrixRowModel): Unit = js.native
}
object IMatrixData {
  
  @scala.inline
  def apply(onMatrixRowChanged: MatrixRowModel => Unit): IMatrixData = {
    val __obj = js.Dynamic.literal(onMatrixRowChanged = js.Any.fromFunction1(onMatrixRowChanged))
    __obj.asInstanceOf[IMatrixData]
  }
  
  @scala.inline
  implicit class IMatrixDataOps[Self <: IMatrixData] (val x: Self) extends AnyVal {
    
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
    def setOnMatrixRowChanged(value: MatrixRowModel => Unit): Self = this.set("onMatrixRowChanged", js.Any.fromFunction1(value))
  }
}
