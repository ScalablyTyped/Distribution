package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "FlowPanel")
@js.native
open class FlowPanel () extends FlowPanelModel {
  def this(name: String) = this()
  
  /* protected */ def getHtmlForQuestion(question: Any): String = js.native
  
  var koElementAfterRender: Any = js.native
  
  var koElementType: Any = js.native
  
  /* protected */ def onCreating(): Unit = js.native
  
  var placeHolder: String = js.native
}
