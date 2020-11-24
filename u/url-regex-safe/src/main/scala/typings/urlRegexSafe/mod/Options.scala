package typings.urlRegexSafe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  exact :boolean,   strict :boolean,   auth :boolean,   localhost :boolean,   parens :boolean,   apostrophes :boolean,   trailingPeriod :boolean,   ipv4 :boolean,   ipv6 :boolean,   tlds :std.Array<string>,   returnString :boolean}> */
@js.native
trait Options extends js.Object {
  
  var apostrophes: js.UndefOr[Boolean] = js.native
  
  var auth: js.UndefOr[Boolean] = js.native
  
  var exact: js.UndefOr[Boolean] = js.native
  
  var ipv4: js.UndefOr[Boolean] = js.native
  
  var ipv6: js.UndefOr[Boolean] = js.native
  
  var localhost: js.UndefOr[Boolean] = js.native
  
  var parens: js.UndefOr[Boolean] = js.native
  
  var returnString: js.UndefOr[Boolean] = js.native
  
  var strict: js.UndefOr[Boolean] = js.native
  
  var tlds: js.UndefOr[js.Array[String]] = js.native
  
  var trailingPeriod: js.UndefOr[Boolean] = js.native
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
    def setApostrophes(value: Boolean): Self = this.set("apostrophes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApostrophes: Self = this.set("apostrophes", js.undefined)
    
    @scala.inline
    def setAuth(value: Boolean): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setExact(value: Boolean): Self = this.set("exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExact: Self = this.set("exact", js.undefined)
    
    @scala.inline
    def setIpv4(value: Boolean): Self = this.set("ipv4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv4: Self = this.set("ipv4", js.undefined)
    
    @scala.inline
    def setIpv6(value: Boolean): Self = this.set("ipv6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6: Self = this.set("ipv6", js.undefined)
    
    @scala.inline
    def setLocalhost(value: Boolean): Self = this.set("localhost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalhost: Self = this.set("localhost", js.undefined)
    
    @scala.inline
    def setParens(value: Boolean): Self = this.set("parens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParens: Self = this.set("parens", js.undefined)
    
    @scala.inline
    def setReturnString(value: Boolean): Self = this.set("returnString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnString: Self = this.set("returnString", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    
    @scala.inline
    def setTldsVarargs(value: String*): Self = this.set("tlds", js.Array(value :_*))
    
    @scala.inline
    def setTlds(value: js.Array[String]): Self = this.set("tlds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTlds: Self = this.set("tlds", js.undefined)
    
    @scala.inline
    def setTrailingPeriod(value: Boolean): Self = this.set("trailingPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrailingPeriod: Self = this.set("trailingPeriod", js.undefined)
  }
}
