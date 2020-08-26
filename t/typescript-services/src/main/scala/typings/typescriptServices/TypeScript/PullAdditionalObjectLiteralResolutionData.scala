package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullAdditionalObjectLiteralResolutionData extends js.Object {
  var membersContextTypeSymbols: js.Array[PullTypeSymbol] = js.native
}

object PullAdditionalObjectLiteralResolutionData {
  @scala.inline
  def apply(membersContextTypeSymbols: js.Array[PullTypeSymbol]): PullAdditionalObjectLiteralResolutionData = {
    val __obj = js.Dynamic.literal(membersContextTypeSymbols = membersContextTypeSymbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullAdditionalObjectLiteralResolutionData]
  }
  @scala.inline
  implicit class PullAdditionalObjectLiteralResolutionDataOps[Self <: PullAdditionalObjectLiteralResolutionData] (val x: Self) extends AnyVal {
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
    def setMembersContextTypeSymbolsVarargs(value: PullTypeSymbol*): Self = this.set("membersContextTypeSymbols", js.Array(value :_*))
    @scala.inline
    def setMembersContextTypeSymbols(value: js.Array[PullTypeSymbol]): Self = this.set("membersContextTypeSymbols", value.asInstanceOf[js.Any])
  }
  
}

