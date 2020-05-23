package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullAdditionalObjectLiteralResolutionData extends js.Object {
  var membersContextTypeSymbols: js.Array[PullTypeSymbol]
}

object PullAdditionalObjectLiteralResolutionData {
  @scala.inline
  def apply(membersContextTypeSymbols: js.Array[PullTypeSymbol]): PullAdditionalObjectLiteralResolutionData = {
    val __obj = js.Dynamic.literal(membersContextTypeSymbols = membersContextTypeSymbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullAdditionalObjectLiteralResolutionData]
  }
}

