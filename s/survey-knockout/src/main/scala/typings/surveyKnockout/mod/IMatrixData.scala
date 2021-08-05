package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMatrixData extends StObject {
  
  def onMatrixRowChanged(row: MatrixRowModel): Unit
}
object IMatrixData {
  
  inline def apply(onMatrixRowChanged: MatrixRowModel => Unit): IMatrixData = {
    val __obj = js.Dynamic.literal(onMatrixRowChanged = js.Any.fromFunction1(onMatrixRowChanged))
    __obj.asInstanceOf[IMatrixData]
  }
  
  extension [Self <: IMatrixData](x: Self) {
    
    inline def setOnMatrixRowChanged(value: MatrixRowModel => Unit): Self = StObject.set(x, "onMatrixRowChanged", js.Any.fromFunction1(value))
  }
}
