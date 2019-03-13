package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceProvider extends js.Object {
  /**
  		 * Provide a set of project-wide references for the given position and document.
  		 *
  		 * @param document The document in which the command was invoked.
  		 * @param position The position at which the command was invoked.
  		 * @param context
  		 * @param token A cancellation token.
  		 * @return An array of locations or a thenable that resolves to such. The lack of a result can be
  		 * signaled by returning `undefined`, `null`, or an empty array.
  		 */
  def provideReferences(document: TextDocument, position: Position, context: ReferenceContext, token: CancellationToken): ProviderResult[js.Array[Location]]
}

object ReferenceProvider {
  @scala.inline
  def apply(
    provideReferences: (TextDocument, Position, ReferenceContext, CancellationToken) => ProviderResult[js.Array[Location]]
  ): ReferenceProvider = {
    val __obj = js.Dynamic.literal(provideReferences = js.Any.fromFunction4(provideReferences))
  
    __obj.asInstanceOf[ReferenceProvider]
  }
}

