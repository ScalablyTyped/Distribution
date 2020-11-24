package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "RendererFactory")
@js.native
class RendererFactory () extends js.Object {
  
  def getRenderer(questionType: String, renderAs: String): js.Any = js.native
  
  def getRendererByQuestion(question: Question): js.Any = js.native
  
  def registerRenderer(questionType: String, renderAs: String, renderer: js.Any): Unit = js.native
  
  def unregisterRenderer(questionType: String, rendererAs: String): Unit = js.native
}
/* static members */
@JSImport("survey-knockout", "RendererFactory")
@js.native
object RendererFactory extends js.Object {
  
  var Instance: RendererFactory = js.native
}
