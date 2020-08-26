package typings.vsoNodeApi.profileInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Profile extends js.Object {
  var applicationContainer: AttributesContainer = js.native
  var coreAttributes: StringDictionary[CoreProfileAttribute] = js.native
  var coreRevision: Double = js.native
  var id: String = js.native
  var revision: Double = js.native
  var timeStamp: Date = js.native
}

object Profile {
  @scala.inline
  def apply(
    applicationContainer: AttributesContainer,
    coreAttributes: StringDictionary[CoreProfileAttribute],
    coreRevision: Double,
    id: String,
    revision: Double,
    timeStamp: Date
  ): Profile = {
    val __obj = js.Dynamic.literal(applicationContainer = applicationContainer.asInstanceOf[js.Any], coreAttributes = coreAttributes.asInstanceOf[js.Any], coreRevision = coreRevision.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
  @scala.inline
  implicit class ProfileOps[Self <: Profile] (val x: Self) extends AnyVal {
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
    def setApplicationContainer(value: AttributesContainer): Self = this.set("applicationContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setCoreAttributes(value: StringDictionary[CoreProfileAttribute]): Self = this.set("coreAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setCoreRevision(value: Double): Self = this.set("coreRevision", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeStamp(value: Date): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
  }
  
}

