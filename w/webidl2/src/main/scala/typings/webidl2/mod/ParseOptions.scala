package typings.webidl2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseOptions extends js.Object {
  
  /** Boolean indicating whether the result should include EOF node or not. */
  var concrete: js.UndefOr[Boolean] = js.native
  
  /** The source name, typically a filename. Errors and validation objects can indicate their origin if you pass a value. */
  var sourceName: js.UndefOr[String] = js.native
}
object ParseOptions {
  
  @scala.inline
  def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions] (val x: Self) extends AnyVal {
    
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
    def setConcrete(value: Boolean): Self = this.set("concrete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcrete: Self = this.set("concrete", js.undefined)
    
    @scala.inline
    def setSourceName(value: String): Self = this.set("sourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceName: Self = this.set("sourceName", js.undefined)
  }
}
