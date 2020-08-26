package typings.ts3NodejsLibrary.propertyTypesMod

import typings.ts3NodejsLibrary.enumMod.ApiKeyScope
import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiKeyAdd extends ResponseEntry {
  var cldbid: js.UndefOr[String] = js.native
  var lifetime: js.UndefOr[Double] = js.native
  var scope: ApiKeyScope = js.native
}

object ApiKeyAdd {
  @scala.inline
  def apply(scope: ApiKeyScope): ApiKeyAdd = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKeyAdd]
  }
  @scala.inline
  implicit class ApiKeyAddOps[Self <: ApiKeyAdd] (val x: Self) extends AnyVal {
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
    def setScope(value: ApiKeyScope): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def setCldbid(value: String): Self = this.set("cldbid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCldbid: Self = this.set("cldbid", js.undefined)
    @scala.inline
    def setLifetime(value: Double): Self = this.set("lifetime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifetime: Self = this.set("lifetime", js.undefined)
  }
  
}

