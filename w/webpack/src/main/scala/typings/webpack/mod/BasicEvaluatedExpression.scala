package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicEvaluatedExpression extends StObject {
  
  def addOptions(): BasicEvaluatedExpression = js.native
  def addOptions(options: Any): BasicEvaluatedExpression = js.native
  
  var array: js.UndefOr[js.Array[Any]] = js.native
  
  def asBool(): Any = js.native
  
  /**
  	 * Gets the compile-time value of the expression
  	 */
  def asCompileTimeValue(): Any = js.native
  
  def asNullish(): js.UndefOr[Boolean] = js.native
  
  def asString(): Any = js.native
  
  var bigint: js.UndefOr[js.BigInt] = js.native
  
  var bool: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Can this expression have side effects?
  	 */
  def couldHaveSideEffects(): Boolean = js.native
  
  var expression: NodeEstreeIndex = js.native
  
  var falsy: Boolean = js.native
  
  def getMembers(): js.Array[String] = js.native
  
  def getMembersOptionals(): js.Array[Boolean] = js.native
  
  var identifier: js.UndefOr[String | VariableInfoInterface] = js.native
  
  def isArray(): Boolean = js.native
  
  def isBigInt(): Boolean = js.native
  
  def isBoolean(): Boolean = js.native
  
  /**
  	 * Is expression a runtime or compile-time value?
  	 */
  def isCompileTimeValue(): Boolean = js.native
  
  def isConditional(): Boolean = js.native
  
  def isConstArray(): Boolean = js.native
  
  def isFalsy(): Boolean = js.native
  
  def isIdentifier(): Boolean = js.native
  
  def isNull(): Boolean = js.native
  
  def isNullish(): js.UndefOr[Boolean] = js.native
  
  def isNumber(): Boolean = js.native
  
  /**
  	 * Is expression a primitive or an object type value?
  	 */
  def isPrimitiveType(): js.UndefOr[Boolean] = js.native
  
  def isRegExp(): Boolean = js.native
  
  def isString(): Boolean = js.native
  
  def isTemplateString(): Boolean = js.native
  
  def isTruthy(): Boolean = js.native
  
  def isUndefined(): Boolean = js.native
  
  def isUnknown(): Boolean = js.native
  
  def isWrapped(): Boolean = js.native
  
  var items: js.UndefOr[js.Array[BasicEvaluatedExpression]] = js.native
  
  var nullish: js.UndefOr[Boolean] = js.native
  
  var number: js.UndefOr[Double] = js.native
  
  var options: js.UndefOr[js.Array[BasicEvaluatedExpression]] = js.native
  
  var parts: js.UndefOr[js.Array[BasicEvaluatedExpression]] = js.native
  
  var postfix: js.UndefOr[BasicEvaluatedExpression] = js.native
  
  var prefix: js.UndefOr[BasicEvaluatedExpression] = js.native
  
  var quasis: js.UndefOr[js.Array[BasicEvaluatedExpression]] = js.native
  
  var range: js.Tuple2[Double, Double] = js.native
  
  var regExp: js.UndefOr[js.RegExp] = js.native
  
  var rootInfo: VariableInfoInterface = js.native
  
  def setArray(): BasicEvaluatedExpression = js.native
  def setArray(array: Any): BasicEvaluatedExpression = js.native
  
  def setBigInt(): BasicEvaluatedExpression = js.native
  def setBigInt(bigint: Any): BasicEvaluatedExpression = js.native
  
  def setBoolean(): BasicEvaluatedExpression = js.native
  def setBoolean(bool: Any): BasicEvaluatedExpression = js.native
  
  def setExpression(): BasicEvaluatedExpression = js.native
  def setExpression(expression: Any): BasicEvaluatedExpression = js.native
  
  def setFalsy(): BasicEvaluatedExpression = js.native
  
  def setIdentifier(): BasicEvaluatedExpression = js.native
  def setIdentifier(identifier: Any): BasicEvaluatedExpression = js.native
  def setIdentifier(identifier: Any, rootInfo: Any): BasicEvaluatedExpression = js.native
  def setIdentifier(identifier: Any, rootInfo: Any, getMembers: Any): BasicEvaluatedExpression = js.native
  def setIdentifier(identifier: Any, rootInfo: Any, getMembers: Any, getMembersOptionals: Any): BasicEvaluatedExpression = js.native
  def setIdentifier(identifier: Any, rootInfo: Any, getMembers: Unit, getMembersOptionals: Any): BasicEvaluatedExpression = js.native
  def setIdentifier(identifier: Any, rootInfo: Unit, getMembers: Any): BasicEvaluatedExpression = js.native
  def setIdentifier(identifier: Any, rootInfo: Unit, getMembers: Any, getMembersOptionals: Any): BasicEvaluatedExpression = js.native
  def setIdentifier(identifier: Any, rootInfo: Unit, getMembers: Unit, getMembersOptionals: Any): BasicEvaluatedExpression = js.native
  def setIdentifier(identifier: Unit, rootInfo: Any): BasicEvaluatedExpression = js.native
  def setIdentifier(identifier: Unit, rootInfo: Any, getMembers: Any): BasicEvaluatedExpression = js.native
  def setIdentifier(identifier: Unit, rootInfo: Any, getMembers: Any, getMembersOptionals: Any): BasicEvaluatedExpression = js.native
  def setIdentifier(identifier: Unit, rootInfo: Any, getMembers: Unit, getMembersOptionals: Any): BasicEvaluatedExpression = js.native
  def setIdentifier(identifier: Unit, rootInfo: Unit, getMembers: Any): BasicEvaluatedExpression = js.native
  def setIdentifier(identifier: Unit, rootInfo: Unit, getMembers: Any, getMembersOptionals: Any): BasicEvaluatedExpression = js.native
  def setIdentifier(identifier: Unit, rootInfo: Unit, getMembers: Unit, getMembersOptionals: Any): BasicEvaluatedExpression = js.native
  
  def setItems(): BasicEvaluatedExpression = js.native
  def setItems(items: Any): BasicEvaluatedExpression = js.native
  
  def setNull(): BasicEvaluatedExpression = js.native
  
  def setNullish(): BasicEvaluatedExpression = js.native
  def setNullish(value: Any): BasicEvaluatedExpression = js.native
  
  def setNumber(): BasicEvaluatedExpression = js.native
  def setNumber(number: Any): BasicEvaluatedExpression = js.native
  
  def setOptions(): BasicEvaluatedExpression = js.native
  def setOptions(options: Any): BasicEvaluatedExpression = js.native
  
  def setRange(): BasicEvaluatedExpression = js.native
  def setRange(range: Any): BasicEvaluatedExpression = js.native
  
  def setRegExp(): BasicEvaluatedExpression = js.native
  def setRegExp(regExp: Any): BasicEvaluatedExpression = js.native
  
  def setSideEffects(): BasicEvaluatedExpression = js.native
  def setSideEffects(sideEffects: Boolean): BasicEvaluatedExpression = js.native
  
  def setString(): BasicEvaluatedExpression = js.native
  def setString(string: Any): BasicEvaluatedExpression = js.native
  
  def setTemplateString(): BasicEvaluatedExpression = js.native
  def setTemplateString(quasis: Any): BasicEvaluatedExpression = js.native
  def setTemplateString(quasis: Any, parts: Any): BasicEvaluatedExpression = js.native
  def setTemplateString(quasis: Any, parts: Any, kind: Any): BasicEvaluatedExpression = js.native
  def setTemplateString(quasis: Any, parts: Unit, kind: Any): BasicEvaluatedExpression = js.native
  def setTemplateString(quasis: Unit, parts: Any): BasicEvaluatedExpression = js.native
  def setTemplateString(quasis: Unit, parts: Any, kind: Any): BasicEvaluatedExpression = js.native
  def setTemplateString(quasis: Unit, parts: Unit, kind: Any): BasicEvaluatedExpression = js.native
  
  def setTruthy(): BasicEvaluatedExpression = js.native
  
  def setUndefined(): BasicEvaluatedExpression = js.native
  
  def setWrapped(): BasicEvaluatedExpression = js.native
  def setWrapped(prefix: Any): BasicEvaluatedExpression = js.native
  def setWrapped(prefix: Any, postfix: Any): BasicEvaluatedExpression = js.native
  def setWrapped(prefix: Any, postfix: Any, innerExpressions: Any): BasicEvaluatedExpression = js.native
  def setWrapped(prefix: Any, postfix: Unit, innerExpressions: Any): BasicEvaluatedExpression = js.native
  def setWrapped(prefix: Unit, postfix: Any): BasicEvaluatedExpression = js.native
  def setWrapped(prefix: Unit, postfix: Any, innerExpressions: Any): BasicEvaluatedExpression = js.native
  def setWrapped(prefix: Unit, postfix: Unit, innerExpressions: Any): BasicEvaluatedExpression = js.native
  
  var sideEffects: Boolean = js.native
  
  var string: js.UndefOr[String] = js.native
  
  var templateStringKind: Any = js.native
  
  var truthy: Boolean = js.native
  
  var `type`: Double = js.native
  
  var wrappedInnerExpressions: Any = js.native
}
