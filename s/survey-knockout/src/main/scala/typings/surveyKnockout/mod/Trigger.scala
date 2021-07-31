package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "Trigger")
@js.native
class Trigger () extends Base {
  
  def buildExpression(): String = js.native
  
  def check(value: js.Any): Unit = js.native
  
  def checkExpression(keys: js.Any, values: HashTable[js.Any]): Unit = js.native
  def checkExpression(keys: js.Any, values: HashTable[js.Any], properties: HashTable[js.Any]): Unit = js.native
  
  var expression: String = js.native
  
  var name: String = js.native
  
  /* protected */ def onFailure(): Unit = js.native
  
  /* protected */ def onSuccess(values: HashTable[js.Any], properties: HashTable[js.Any]): Unit = js.native
  
  var operator: String = js.native
  
  var value: js.Any = js.native
}
/* static members */
object Trigger {
  
  @JSImport("survey-knockout", "Trigger")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "Trigger.operators")
  @js.native
  val operators: HashTable[js.Function] = js.native
  
  @JSImport("survey-knockout", "Trigger.operatorsValue")
  @js.native
  def operatorsValue: HashTable[js.Function] = js.native
  @scala.inline
  def operatorsValue_=(x: HashTable[js.Function]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("operatorsValue")(x.asInstanceOf[js.Any])
}
