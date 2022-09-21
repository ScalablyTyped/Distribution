package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "Trigger")
@js.native
open class Trigger () extends Base {
  
  def buildExpression(): String = js.native
  
  /* protected */ def canBeExecuted(isOnNextPage: Boolean): Boolean = js.native
  
  def check(value: Any): Unit = js.native
  
  def checkExpression(isOnNextPage: Boolean, keys: Any, values: Any): Unit = js.native
  def checkExpression(isOnNextPage: Boolean, keys: Any, values: Any, properties: Any): Unit = js.native
  
  var conditionRunner: ConditionRunner = js.native
  
  def expression: String = js.native
  def expression_=(`val`: String): Unit = js.native
  
  var hasFunction: Boolean = js.native
  
  /* protected */ var isExecutingOnNextPage: Boolean = js.native
  
  def name: String = js.native
  def name_=(`val`: String): Unit = js.native
  
  /* protected */ def onFailure(): Unit = js.native
  
  /* protected */ def onSuccess(values: Any, properties: Any): Unit = js.native
  
  /* protected */ def onSuccessExecuted(): Unit = js.native
  
  def operator: String = js.native
  def operator_=(`val`: String): Unit = js.native
  
  var usedNames: Any = js.native
  
  def value: Any = js.native
  def value_=(`val`: Any): Unit = js.native
}
/* static members */
object Trigger {
  
  @JSImport("survey-knockout", "Trigger")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "Trigger.operatorsValue")
  @js.native
  def operatorsValue: Any = js.native
  inline def operatorsValue_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("operatorsValue")(x.asInstanceOf[js.Any])
}
