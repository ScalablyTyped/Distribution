package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentingRangeProvider extends js.Object {
  /**
  		 * Provide a list of ranges which allow new comment threads creation or null for a given document
  		 */
  def provideCommentingRanges(document: TextDocument, token: CancellationToken): ProviderResult[js.Array[Range]]
}

object CommentingRangeProvider {
  @scala.inline
  def apply(provideCommentingRanges: (TextDocument, CancellationToken) => ProviderResult[js.Array[Range]]): CommentingRangeProvider = {
    val __obj = js.Dynamic.literal(provideCommentingRanges = js.Any.fromFunction2(provideCommentingRanges))
    __obj.asInstanceOf[CommentingRangeProvider]
  }
}

