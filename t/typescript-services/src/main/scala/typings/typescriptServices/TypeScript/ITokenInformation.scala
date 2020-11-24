package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITokenInformation extends js.Object {
  
  var nextToken: ISyntaxToken = js.native
  
  var previousToken: ISyntaxToken = js.native
}
object ITokenInformation {
  
  @scala.inline
  def apply(nextToken: ISyntaxToken, previousToken: ISyntaxToken): ITokenInformation = {
    val __obj = js.Dynamic.literal(nextToken = nextToken.asInstanceOf[js.Any], previousToken = previousToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITokenInformation]
  }
  
  @scala.inline
  implicit class ITokenInformationOps[Self <: ITokenInformation] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: ISyntaxToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousToken(value: ISyntaxToken): Self = this.set("previousToken", value.asInstanceOf[js.Any])
  }
}
