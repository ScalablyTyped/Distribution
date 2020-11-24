package typings.surveyKnockout.mod

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "JsonError")
@js.native
class JsonError protected () extends js.Object {
  def this(`type`: String, message: String) = this()
  
  var at: Number = js.native
  
  var description: String = js.native
  
  def getFullDescription(): String = js.native
  
  var message: String = js.native
  
  var `type`: String = js.native
}
