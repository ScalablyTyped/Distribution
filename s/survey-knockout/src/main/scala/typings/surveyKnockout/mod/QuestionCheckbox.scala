package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionCheckbox")
@js.native
open class QuestionCheckbox protected () extends QuestionCheckboxModel {
  def this(name: String) = this()
  
  var _implementor: QuestionCheckboxImplementor = js.native
  
  var isAllSelectedUpdating: Boolean = js.native
  
  var koAllSelected: Any = js.native
  
  /* protected */ def updateAllSelected(): Unit = js.native
}
