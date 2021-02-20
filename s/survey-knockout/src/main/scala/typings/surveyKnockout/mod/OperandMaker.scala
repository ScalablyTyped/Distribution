package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "OperandMaker")
@js.native
class OperandMaker () extends StObject
/* static members */
object OperandMaker {
  
  @JSImport("survey-knockout", "OperandMaker")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "OperandMaker.binaryFunctions")
  @js.native
  def binaryFunctions: HashTable[js.Function] = js.native
  @scala.inline
  def binaryFunctions_=(x: HashTable[js.Function]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("binaryFunctions")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "OperandMaker.isBooleanValue")
  @js.native
  def isBooleanValue(value: String): Boolean = js.native
  
  @JSImport("survey-knockout", "OperandMaker.isNumeric")
  @js.native
  def isNumeric(value: String): Boolean = js.native
  
  @JSImport("survey-knockout", "OperandMaker.isSpaceString")
  @js.native
  def isSpaceString(str: String): Boolean = js.native
  
  @JSImport("survey-knockout", "OperandMaker.isTwoValueEquals")
  @js.native
  def isTwoValueEquals(x: js.Any, y: js.Any): Boolean = js.native
  
  @JSImport("survey-knockout", "OperandMaker.operatorToString")
  @js.native
  def operatorToString(operatorName: String): String = js.native
  
  @JSImport("survey-knockout", "OperandMaker.safeToString")
  @js.native
  def safeToString(operand: Operand, func: js.Function1[/* op */ Operand, String]): String = js.native
  
  @JSImport("survey-knockout", "OperandMaker.signs")
  @js.native
  def signs: HashTable[String] = js.native
  @scala.inline
  def signs_=(x: HashTable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("signs")(x.asInstanceOf[js.Any])
  
  @JSImport("survey-knockout", "OperandMaker.throwInvalidOperatorError")
  @js.native
  def throwInvalidOperatorError(op: String): Unit = js.native
  
  @JSImport("survey-knockout", "OperandMaker.toOperandString")
  @js.native
  def toOperandString(value: String): String = js.native
  
  @JSImport("survey-knockout", "OperandMaker.unaryFunctions")
  @js.native
  def unaryFunctions: HashTable[js.Function] = js.native
  @scala.inline
  def unaryFunctions_=(x: HashTable[js.Function]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unaryFunctions")(x.asInstanceOf[js.Any])
}
