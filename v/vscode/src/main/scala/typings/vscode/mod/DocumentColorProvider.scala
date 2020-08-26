package typings.vscode.mod

import typings.vscode.anon.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  def provideColorPresentations(color: Color, context: Document, token: CancellationToken): ProviderResult[js.Array[ColorPresentation]] = js.native
  /**
    * Provide colors for the given document.
    *
    * @param document The document in which the command was invoked.
    * @param token A cancellation token.
    * @return An array of [color information](#ColorInformation) or a thenable that resolves to such. The lack of a result
    * can be signaled by returning `undefined`, `null`, or an empty array.
    */
  def provideDocumentColors(document: TextDocument, token: CancellationToken): ProviderResult[js.Array[ColorInformation]] = js.native
}

object DocumentColorProvider {
  @scala.inline
  def apply(
    provideColorPresentations: (Color, Document, CancellationToken) => ProviderResult[js.Array[ColorPresentation]],
    provideDocumentColors: (TextDocument, CancellationToken) => ProviderResult[js.Array[ColorInformation]]
  ): DocumentColorProvider = {
    val __obj = js.Dynamic.literal(provideColorPresentations = js.Any.fromFunction3(provideColorPresentations), provideDocumentColors = js.Any.fromFunction2(provideDocumentColors))
    __obj.asInstanceOf[DocumentColorProvider]
  }
  @scala.inline
  implicit class DocumentColorProviderOps[Self <: DocumentColorProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProvideColorPresentations(value: (Color, Document, CancellationToken) => ProviderResult[js.Array[ColorPresentation]]): Self = this.set("provideColorPresentations", js.Any.fromFunction3(value))
    @scala.inline
    def setProvideDocumentColors(value: (TextDocument, CancellationToken) => ProviderResult[js.Array[ColorInformation]]): Self = this.set("provideDocumentColors", js.Any.fromFunction2(value))
  }
  
}

