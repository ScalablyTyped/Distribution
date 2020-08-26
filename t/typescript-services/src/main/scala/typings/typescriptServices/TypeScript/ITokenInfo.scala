package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITokenInfo extends js.Object {
  var leadingTrivia: js.UndefOr[js.Array[ISyntaxTrivia]] = js.native
  var text: js.UndefOr[String] = js.native
  var trailingTrivia: js.UndefOr[js.Array[ISyntaxTrivia]] = js.native
}

object ITokenInfo {
  @scala.inline
  def apply(): ITokenInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITokenInfo]
  }
  @scala.inline
  implicit class ITokenInfoOps[Self <: ITokenInfo] (val x: Self) extends AnyVal {
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
    def setLeadingTriviaVarargs(value: ISyntaxTrivia*): Self = this.set("leadingTrivia", js.Array(value :_*))
    @scala.inline
    def setLeadingTrivia(value: js.Array[ISyntaxTrivia]): Self = this.set("leadingTrivia", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeadingTrivia: Self = this.set("leadingTrivia", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTrailingTriviaVarargs(value: ISyntaxTrivia*): Self = this.set("trailingTrivia", js.Array(value :_*))
    @scala.inline
    def setTrailingTrivia(value: js.Array[ISyntaxTrivia]): Self = this.set("trailingTrivia", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrailingTrivia: Self = this.set("trailingTrivia", js.undefined)
  }
  
}

