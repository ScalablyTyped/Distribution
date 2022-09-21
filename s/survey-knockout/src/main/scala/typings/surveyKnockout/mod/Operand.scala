package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "Operand")
@js.native
open class Operand () extends StObject {
  
  def addToAsyncList(list: Any): Unit = js.native
  
  /* protected */ def areOperatorsEquals(op1: Operand, op2: Operand): Boolean = js.native
  
  def evaluate(): Any = js.native
  def evaluate(processValue: ProcessValue): Any = js.native
  
  def getType(): String = js.native
  
  def hasAsyncFunction(): Boolean = js.native
  
  def hasFunction(): Boolean = js.native
  
  /* protected */ def isContentEqual(op: Operand): Boolean = js.native
  
  def isEqual(op: Operand): Boolean = js.native
  
  def setVariables(variables: Any): Any = js.native
  
  def toString(func: js.Function1[/* op */ this.type, String]): String = js.native
}
