package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "EvaluatableExpression")
@js.native
open class EvaluatableExpression protected () extends StObject {
  /**
  		 * Creates a new evaluatable expression object.
  		 *
  		 * @param range The range in the underlying document from which the evaluatable expression is extracted.
  		 * @param expression If specified overrides the extracted expression.
  		 */
  def this(range: Range) = this()
  def this(range: Range, expression: String) = this()
  
  /*
  		 * If specified the expression overrides the extracted expression.
  		 */
  val expression: js.UndefOr[String] = js.native
  
  /*
  		 * The range is used to extract the evaluatable expression from the underlying document and to highlight it.
  		 */
  val range: Range = js.native
}
