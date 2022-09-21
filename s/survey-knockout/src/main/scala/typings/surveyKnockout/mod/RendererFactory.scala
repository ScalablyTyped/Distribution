package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "RendererFactory")
@js.native
open class RendererFactory () extends StObject {
  
  def clear(): Unit = js.native
  
  def getRenderer(questionType: String, renderAs: String): Any = js.native
  
  def getRendererByQuestion(question: Question): Any = js.native
  
  def registerRenderer(questionType: String, renderAs: String, renderer: Any): Unit = js.native
  
  var renderersHash: Any = js.native
  
  def unregisterRenderer(questionType: String, rendererAs: String): Unit = js.native
}
/* static members */
object RendererFactory {
  
  @JSImport("survey-knockout", "RendererFactory")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "RendererFactory.Instance")
  @js.native
  def Instance: RendererFactory = js.native
  inline def Instance_=(x: RendererFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Instance")(x.asInstanceOf[js.Any])
}
