package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMatrixData extends StObject {
  
  def onMatrixRowChanged(row: MatrixRowModel): Unit = js.native
}
object IMatrixData {
  
  @scala.inline
  def apply(onMatrixRowChanged: MatrixRowModel => Unit): IMatrixData = {
    val __obj = js.Dynamic.literal(onMatrixRowChanged = js.Any.fromFunction1(onMatrixRowChanged))
    __obj.asInstanceOf[IMatrixData]
  }
  
  @scala.inline
  implicit class IMatrixDataMutableBuilder[Self <: IMatrixData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnMatrixRowChanged(value: MatrixRowModel => Unit): Self = StObject.set(x, "onMatrixRowChanged", js.Any.fromFunction1(value))
  }
}
