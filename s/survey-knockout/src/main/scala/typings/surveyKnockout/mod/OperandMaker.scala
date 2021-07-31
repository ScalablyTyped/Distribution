package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @scala.inline
  def isBooleanValue(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBooleanValue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isNumeric(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isSpaceString(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSpaceString")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isTwoValueEquals(x: js.Any, y: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTwoValueEquals")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def operatorToString(operatorName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("operatorToString")(operatorName.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def safeToString(operand: Operand, func: js.Function1[/* op */ Operand, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("safeToString")(operand.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("survey-knockout", "OperandMaker.signs")
  @js.native
  def signs: HashTable[String] = js.native
  @scala.inline
  def signs_=(x: HashTable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("signs")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def throwInvalidOperatorError(op: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("throwInvalidOperatorError")(op.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def toOperandString(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toOperandString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("survey-knockout", "OperandMaker.unaryFunctions")
  @js.native
  def unaryFunctions: HashTable[js.Function] = js.native
  @scala.inline
  def unaryFunctions_=(x: HashTable[js.Function]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unaryFunctions")(x.asInstanceOf[js.Any])
}
