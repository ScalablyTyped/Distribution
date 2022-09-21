package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "SyntaxError")
@js.native
open class SyntaxError protected () extends StObject {
  def this(message: String, expected: Any, found: String, location: IFileRange) = this()
  
  var expected: Any = js.native
  
  var found: String = js.native
  
  var location: IFileRange = js.native
  
  var message: String = js.native
  
  var name: String = js.native
}
/* static members */
object SyntaxError {
  
  @JSImport("survey-knockout", "SyntaxError")
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildMessage(expected: Any, found: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildMessage")(expected.asInstanceOf[js.Any], found.asInstanceOf[js.Any])).asInstanceOf[String]
}
