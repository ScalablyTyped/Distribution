package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "InlineValueEvaluatableExpression")
@js.native
open class InlineValueEvaluatableExpression protected ()
  extends StObject
     with InlineValue {
  /**
    * Creates a new InlineValueEvaluatableExpression object.
    *
    * @param range The range in the underlying document from which the evaluatable expression is extracted.
    * @param expression If specified overrides the extracted expression.
    */
  def this(range: Range) = this()
  def this(range: Range, expression: String) = this()
  
  /**
    * If specified the expression overrides the extracted expression.
    */
  val expression: js.UndefOr[String] = js.native
  
  /**
    * The document range for which the inline value applies.
    * The range is used to extract the evaluatable expression from the underlying document.
    */
  val range: Range = js.native
}
