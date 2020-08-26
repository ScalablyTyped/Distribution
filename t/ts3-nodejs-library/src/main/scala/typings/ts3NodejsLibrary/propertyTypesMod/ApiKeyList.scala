package typings.ts3NodejsLibrary.propertyTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import typings.ts3NodejsLibrary.ts3NodejsLibraryStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiKeyList extends ResponseEntry {
  /** database ids to list  */
  var cldbid: js.UndefOr[String | Asterisk] = js.native
  /** amount of entries to retrieve */
  var duration: js.UndefOr[Double] = js.native
  /** offset from where the list should start */
  var start: js.UndefOr[Double] = js.native
}

object ApiKeyList {
  @scala.inline
  def apply(): ApiKeyList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiKeyList]
  }
  @scala.inline
  implicit class ApiKeyListOps[Self <: ApiKeyList] (val x: Self) extends AnyVal {
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
    def setCldbid(value: String | Asterisk): Self = this.set("cldbid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCldbid: Self = this.set("cldbid", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

