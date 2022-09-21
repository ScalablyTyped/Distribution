package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionPanelDynamicImplementor")
@js.native
open class QuestionPanelDynamicImplementor protected () extends QuestionImplementor {
  def this(question: QuestionPanelDynamic) = this()
  
  /* protected */ def addPanel(): Unit = js.native
  
  var koRecalc: Any = js.native
  
  /* protected */ def onCurrentIndexChanged(): Unit = js.native
  
  /* protected */ def onPanelCountChanged(): Unit = js.native
  
  /* protected */ def onRenderModeChanged(): Unit = js.native
  
  /* protected */ def removePanel(`val`: Any): Unit = js.native
}
