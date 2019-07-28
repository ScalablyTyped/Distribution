package typings.vscode.vscodeMod

import typings.vscode.Anon_Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentColorProvider extends js.Object {
  /**
  		 * Provide [representations](#ColorPresentation) for a color.
  		 *
  		 * @param color The color to show and insert.
  		 * @param context A context object with additional information
  		 * @param token A cancellation token.
  		 * @return An array of color presentations or a thenable that resolves to such. The lack of a result
  		 * can be signaled by returning `undefined`, `null`, or an empty array.
  		 */
  def provideColorPresentations(color: Color, context: Anon_Document, token: CancellationToken): ProviderResult[js.Array[ColorPresentation]]
  /**
  		 * Provide colors for the given document.
  		 *
  		 * @param document The document in which the command was invoked.
  		 * @param token A cancellation token.
  		 * @return An array of [color information](#ColorInformation) or a thenable that resolves to such. The lack of a result
  		 * can be signaled by returning `undefined`, `null`, or an empty array.
  		 */
  def provideDocumentColors(document: TextDocument, token: CancellationToken): ProviderResult[js.Array[ColorInformation]]
}

object DocumentColorProvider {
  @scala.inline
  def apply(
    provideColorPresentations: (Color, Anon_Document, CancellationToken) => ProviderResult[js.Array[ColorPresentation]],
    provideDocumentColors: (TextDocument, CancellationToken) => ProviderResult[js.Array[ColorInformation]]
  ): DocumentColorProvider = {
    val __obj = js.Dynamic.literal(provideColorPresentations = js.Any.fromFunction3(provideColorPresentations), provideDocumentColors = js.Any.fromFunction2(provideDocumentColors))
  
    __obj.asInstanceOf[DocumentColorProvider]
  }
}

