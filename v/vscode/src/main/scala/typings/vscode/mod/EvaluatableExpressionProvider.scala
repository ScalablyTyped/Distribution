package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EvaluatableExpressionProvider extends js.Object {
  /**
  		 * Provide an evaluatable expression for the given document and position.
  		 * VS Code will evaluate this expression in the active debug session and will show the result in the debug hover.
  		 * The expression can be implicitly specified by the range in the underlying document or by explicitly returning an expression.
  		 *
  		 * @param document The document for which the debug hover is about to appear.
  		 * @param position The line and character position in the document where the debug hover is about to appear.
  		 * @param token A cancellation token.
  		 * @return An EvaluatableExpression or a thenable that resolves to such. The lack of a result can be
  		 * signaled by returning `undefined` or `null`.
  		 */
  def provideEvaluatableExpression(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[EvaluatableExpression]
}

object EvaluatableExpressionProvider {
  @scala.inline
  def apply(
    provideEvaluatableExpression: (TextDocument, Position, CancellationToken) => ProviderResult[EvaluatableExpression]
  ): EvaluatableExpressionProvider = {
    val __obj = js.Dynamic.literal(provideEvaluatableExpression = js.Any.fromFunction3(provideEvaluatableExpression))
    __obj.asInstanceOf[EvaluatableExpressionProvider]
  }
}

