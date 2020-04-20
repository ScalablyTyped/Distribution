package typings.vsoNodeApi.profileInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile extends js.Object {
  var applicationContainer: AttributesContainer
  var coreAttributes: StringDictionary[CoreProfileAttribute]
  var coreRevision: Double
  var id: String
  var revision: Double
  var timeStamp: Date
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
}

