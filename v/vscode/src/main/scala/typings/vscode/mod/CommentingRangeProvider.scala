package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentingRangeProvider extends js.Object {
  
  /**
    * Provide a list of ranges which allow new comment threads creation or null for a given document
    */
  def provideCommentingRanges(document: TextDocument, token: CancellationToken): ProviderResult[js.Array[Range]] = js.native
}
object CommentingRangeProvider {
  
  @scala.inline
  def apply(provideCommentingRanges: (TextDocument, CancellationToken) => ProviderResult[js.Array[Range]]): CommentingRangeProvider = {
    val __obj = js.Dynamic.literal(provideCommentingRanges = js.Any.fromFunction2(provideCommentingRanges))
    __obj.asInstanceOf[CommentingRangeProvider]
  }
  
  @scala.inline
  implicit class CommentingRangeProviderOps[Self <: CommentingRangeProvider] (val x: Self) extends AnyVal {
    
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
    def setProvideCommentingRanges(value: (TextDocument, CancellationToken) => ProviderResult[js.Array[Range]]): Self = this.set("provideCommentingRanges", js.Any.fromFunction2(value))
  }
}
