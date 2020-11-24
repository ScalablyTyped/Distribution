package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "createTypePredicateNodeWithModifier")
@js.native
object createTypePredicateNodeWithModifier extends js.Object {
  
  def apply(assertsModifier: js.UndefOr[scala.Nothing], parameterName: java.lang.String): TypePredicateNode = js.native
  def apply(assertsModifier: js.UndefOr[scala.Nothing], parameterName: java.lang.String, `type`: TypeNode): TypePredicateNode = js.native
  def apply(assertsModifier: js.UndefOr[scala.Nothing], parameterName: Identifier): TypePredicateNode = js.native
  def apply(assertsModifier: js.UndefOr[scala.Nothing], parameterName: Identifier, `type`: TypeNode): TypePredicateNode = js.native
  def apply(assertsModifier: js.UndefOr[scala.Nothing], parameterName: ThisTypeNode): TypePredicateNode = js.native
  def apply(assertsModifier: js.UndefOr[scala.Nothing], parameterName: ThisTypeNode, `type`: TypeNode): TypePredicateNode = js.native
  /** @deprecated Use `factory.createTypePredicateNode` or the factory supplied by your transformation context instead. */
  def apply(assertsModifier: AssertsKeyword, parameterName: java.lang.String): TypePredicateNode = js.native
  def apply(assertsModifier: AssertsKeyword, parameterName: java.lang.String, `type`: TypeNode): TypePredicateNode = js.native
  def apply(assertsModifier: AssertsKeyword, parameterName: Identifier): TypePredicateNode = js.native
  def apply(assertsModifier: AssertsKeyword, parameterName: Identifier, `type`: TypeNode): TypePredicateNode = js.native
  def apply(assertsModifier: AssertsKeyword, parameterName: ThisTypeNode): TypePredicateNode = js.native
  def apply(assertsModifier: AssertsKeyword, parameterName: ThisTypeNode, `type`: TypeNode): TypePredicateNode = js.native
}
