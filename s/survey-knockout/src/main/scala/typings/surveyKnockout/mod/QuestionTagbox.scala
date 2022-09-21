package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionTagbox")
@js.native
open class QuestionTagbox protected () extends QuestionTagboxModel {
  def this(name: String) = this()
  
  var _implementor: QuestionCheckboxBaseImplementor = js.native
  
  var isAllSelectedUpdating: Boolean = js.native
  
  var koAllSelected: Any = js.native
  
  /* protected */ def updateAllSelected(): Unit = js.native
}
