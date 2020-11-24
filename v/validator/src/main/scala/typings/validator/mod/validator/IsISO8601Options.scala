package typings.validator.mod.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsISO8601Options extends js.Object {
  
  /**
    * If `strict` is `true`, performs additional checks for valid dates,
    * e.g. invalidates dates like `2009-02-29`.
    *
    * @default false
    */
  var strict: js.UndefOr[Boolean] = js.native
}
object IsISO8601Options {
  
  @scala.inline
  def apply(): IsISO8601Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsISO8601Options]
  }
  
  @scala.inline
  implicit class IsISO8601OptionsOps[Self <: IsISO8601Options] (val x: Self) extends AnyVal {
    
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
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
  }
}
