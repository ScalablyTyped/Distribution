package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ProcessValue")
@js.native
class ProcessValue () extends js.Object {
  
  def getFirstName(text: String): String = js.native
  def getFirstName(text: String, obj: js.Any): String = js.native
  
  def getValue(text: String): js.Any = js.native
  def getValue(text: String, values: HashTable[_]): js.Any = js.native
  
  def getValueInfo(valueInfo: js.Any): Unit = js.native
  
  def hasValue(text: String): Boolean = js.native
  def hasValue(text: String, values: HashTable[_]): Boolean = js.native
  
  var properties: HashTable[_] = js.native
  
  def setValue(obj: js.Any, text: String, value: js.Any): Unit = js.native
  
  var values: HashTable[_] = js.native
}
