package typings.webpack.mod

import typings.webpack.webpackStrings.cooked
import typings.webpack.webpackStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicEvaluatedExpression extends StObject {
  
  /**
  	 * Adds options to a conditional expression.
  	 */
  def addOptions(options: js.Array[BasicEvaluatedExpression]): BasicEvaluatedExpression = js.native
  
  var array: js.UndefOr[js.Array[Any]] = js.native
  
  /**
  	 * Creates a boolean representation of this evaluated expression.
  	 */
  def asBool(): js.UndefOr[Boolean] = js.native
  
  /**
  	 * Gets the compile-time value of the expression
  	 */
  def asCompileTimeValue(): Any = js.native
  
  /**
  	 * Creates a nullish coalescing representation of this evaluated expression.
  	 */
  def asNullish(): js.UndefOr[Boolean] = js.native
  
  /**
  	 * Creates a string representation of this evaluated expression.
  	 */
  def asString(): js.UndefOr[String] = js.native
  
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
  
  var rootInfo: String | VariableInfoInterface = js.native
  
  /**
  	 * Set's the value of this expression to an array of strings.
  	 */
  def setArray(array: js.Array[String]): BasicEvaluatedExpression = js.native
  
  /**
  	 * Set's the value of this expression to a BigInt
  	 */
  def setBigInt(bigint: js.BigInt): BasicEvaluatedExpression = js.native
  
  /**
  	 * Set's the value of this expression to a boolean
  	 */
  def setBoolean(bool: Boolean): BasicEvaluatedExpression = js.native
  
  /**
  	 * Set the expression node for the expression.
  	 */
  def setExpression(expression: NodeEstreeIndex): BasicEvaluatedExpression = js.native
  
  def setFalsy(): BasicEvaluatedExpression = js.native
  
  /**
  	 * Set's the value of this expression to a particular identifier and its members.
  	 */
  def setIdentifier(identifier: String, rootInfo: String, getMembers: js.Function0[js.Array[String]]): BasicEvaluatedExpression = js.native
  def setIdentifier(
    identifier: String,
    rootInfo: String,
    getMembers: js.Function0[js.Array[String]],
    getMembersOptionals: js.Function0[js.Array[Boolean]]
  ): BasicEvaluatedExpression = js.native
  def setIdentifier(identifier: String, rootInfo: VariableInfoInterface, getMembers: js.Function0[js.Array[String]]): BasicEvaluatedExpression = js.native
  def setIdentifier(
    identifier: String,
    rootInfo: VariableInfoInterface,
    getMembers: js.Function0[js.Array[String]],
    getMembersOptionals: js.Function0[js.Array[Boolean]]
  ): BasicEvaluatedExpression = js.native
  def setIdentifier(identifier: VariableInfoInterface, rootInfo: String, getMembers: js.Function0[js.Array[String]]): BasicEvaluatedExpression = js.native
  def setIdentifier(
    identifier: VariableInfoInterface,
    rootInfo: String,
    getMembers: js.Function0[js.Array[String]],
    getMembersOptionals: js.Function0[js.Array[Boolean]]
  ): BasicEvaluatedExpression = js.native
  def setIdentifier(
    identifier: VariableInfoInterface,
    rootInfo: VariableInfoInterface,
    getMembers: js.Function0[js.Array[String]]
  ): BasicEvaluatedExpression = js.native
  def setIdentifier(
    identifier: VariableInfoInterface,
    rootInfo: VariableInfoInterface,
    getMembers: js.Function0[js.Array[String]],
    getMembersOptionals: js.Function0[js.Array[Boolean]]
  ): BasicEvaluatedExpression = js.native
  
  /**
  	 * Set's the value of this expression to an array of expressions.
  	 */
  def setItems(items: js.Array[BasicEvaluatedExpression]): BasicEvaluatedExpression = js.native
  
  def setNull(): BasicEvaluatedExpression = js.native
  
  /**
  	 * Set's the value of the expression to nullish.
  	 */
  def setNullish(value: Boolean): BasicEvaluatedExpression = js.native
  
  /**
  	 * Set's the value of this expression to a number
  	 */
  def setNumber(number: Double): BasicEvaluatedExpression = js.native
  
  /**
  	 * Stores the options of a conditional expression.
  	 */
  def setOptions(options: js.Array[BasicEvaluatedExpression]): BasicEvaluatedExpression = js.native
  
  /**
  	 * Set's the range for the expression.
  	 */
  def setRange(range: js.Tuple2[Double, Double]): BasicEvaluatedExpression = js.native
  
  /**
  	 * Set's the value of this expression to a regular expression
  	 */
  def setRegExp(regExp: js.RegExp): BasicEvaluatedExpression = js.native
  
  /**
  	 * Set whether or not the expression has side effects.
  	 */
  def setSideEffects(): BasicEvaluatedExpression = js.native
  def setSideEffects(sideEffects: Boolean): BasicEvaluatedExpression = js.native
  
  def setString(): BasicEvaluatedExpression = js.native
  def setString(string: Any): BasicEvaluatedExpression = js.native
  
  /**
  	 * Set's the value of this expression to a processed/unprocessed template string. Used
  	 * for evaluating TemplateLiteral expressions in the JavaScript Parser.
  	 */
  def setTemplateString(
    quasis: js.Array[BasicEvaluatedExpression],
    parts: js.Array[BasicEvaluatedExpression],
    kind: raw | cooked
  ): BasicEvaluatedExpression = js.native
  
  def setTruthy(): BasicEvaluatedExpression = js.native
  
  def setUndefined(): BasicEvaluatedExpression = js.native
  
  /**
  	 * Wraps an array of expressions with a prefix and postfix expression.
  	 */
  def setWrapped(
    prefix: Null,
    postfix: BasicEvaluatedExpression,
    innerExpressions: js.Array[BasicEvaluatedExpression]
  ): BasicEvaluatedExpression = js.native
  def setWrapped(
    prefix: BasicEvaluatedExpression,
    postfix: BasicEvaluatedExpression,
    innerExpressions: js.Array[BasicEvaluatedExpression]
  ): BasicEvaluatedExpression = js.native
  
  var sideEffects: Boolean = js.native
  
  var string: js.UndefOr[String] = js.native
  
  var templateStringKind: js.UndefOr[raw | cooked] = js.native
  
  var truthy: Boolean = js.native
  
  var `type`: Double = js.native
  
  var wrappedInnerExpressions: js.Array[BasicEvaluatedExpression] = js.native
}
