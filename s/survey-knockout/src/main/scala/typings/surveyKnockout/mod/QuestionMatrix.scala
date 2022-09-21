package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionMatrix")
@js.native
open class QuestionMatrix protected () extends QuestionMatrixModel {
  def this(name: String) = this()
  
  var _implementor: QuestionImplementor = js.native
  
  var koVisibleColumns: Any = js.native
  
  var koVisibleRows: Any = js.native
  
  /* protected */ def onMatrixRowCreated(row: Any): Unit = js.native
}
