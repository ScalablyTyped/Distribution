package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentSymbolProviderMetadata extends js.Object {
  /**
  		 * A human readable string that is shown when multiple outlines trees show for one document.
  		 */
  var label: js.UndefOr[String] = js.undefined
}

object DocumentSymbolProviderMetadata {
  @scala.inline
  def apply(label: String = null): DocumentSymbolProviderMetadata = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSymbolProviderMetadata]
  }
}

