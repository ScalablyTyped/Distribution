package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "JsonError")
@js.native
open class JsonError protected () extends StObject {
  def this(`type`: String, message: String) = this()
  
  var at: Any = js.native
  
  var description: String = js.native
  
  def getFullDescription(): String = js.native
  
  var message: String = js.native
  
  var `type`: String = js.native
}
