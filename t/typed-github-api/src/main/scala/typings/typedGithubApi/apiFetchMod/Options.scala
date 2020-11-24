package typings.typedGithubApi.apiFetchMod

import typings.typedGithubApi.githubRefMod.OptionsOrRef
import typings.typedGithubApi.typedGithubApiStrings.`thor-preview`
import typings.typedGithubApi.typedGithubApiStrings.v3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends OptionsOrRef {
  
  var oAuthToken: js.UndefOr[String] = js.native
  
  var userAgent: String = js.native
  
  var version: js.UndefOr[v3 | `thor-preview`] = js.native
}
object Options {
  
  @scala.inline
  def apply(userAgent: String): Options = {
    val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any])
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
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOAuthToken(value: String): Self = this.set("oAuthToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOAuthToken: Self = this.set("oAuthToken", js.undefined)
    
    @scala.inline
    def setVersion(value: v3 | `thor-preview`): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
