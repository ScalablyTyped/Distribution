package typings.vscode.mod

import typings.vscode.anon.EndTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookCellExecutionSummary extends StObject {
  
  /**
    * The order in which the execution happened.
    */
  val executionOrder: js.UndefOr[Double] = js.undefined
  
  /**
    * If the execution finished successfully.
    */
  val success: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The times at which execution started and ended, as unix timestamps
    */
  val timing: js.UndefOr[EndTime] = js.undefined
}
object NotebookCellExecutionSummary {
  
  inline def apply(): NotebookCellExecutionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookCellExecutionSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotebookCellExecutionSummary] (val x: Self) extends AnyVal {
    
    inline def setExecutionOrder(value: Double): Self = StObject.set(x, "executionOrder", value.asInstanceOf[js.Any])
    
    inline def setExecutionOrderUndefined: Self = StObject.set(x, "executionOrder", js.undefined)
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTiming(value: EndTime): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
    
    inline def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
  }
}
