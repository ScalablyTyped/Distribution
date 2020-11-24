package typings.toughCookie.mod.CookieJar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var allowSpecialUseDomain: js.UndefOr[Boolean] = js.native
  
  var looseMode: js.UndefOr[Boolean] = js.native
  
  var prefixSecurity: js.UndefOr[String] = js.native
  
  var rejectPublicSuffixes: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAllowSpecialUseDomain(value: Boolean): Self = this.set("allowSpecialUseDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSpecialUseDomain: Self = this.set("allowSpecialUseDomain", js.undefined)
    
    @scala.inline
    def setLooseMode(value: Boolean): Self = this.set("looseMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLooseMode: Self = this.set("looseMode", js.undefined)
    
    @scala.inline
    def setPrefixSecurity(value: String): Self = this.set("prefixSecurity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixSecurity: Self = this.set("prefixSecurity", js.undefined)
    
    @scala.inline
    def setRejectPublicSuffixes(value: Boolean): Self = this.set("rejectPublicSuffixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectPublicSuffixes: Self = this.set("rejectPublicSuffixes", js.undefined)
  }
}
