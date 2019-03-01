package typings
package vsoDashNodeDashApiLib.interfacesProfileInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile extends js.Object {
  var applicationContainer: AttributesContainer
  var coreAttributes: org.scalablytyped.runtime.StringDictionary[CoreProfileAttribute]
  var coreRevision: scala.Double
  var id: java.lang.String
  var revision: scala.Double
  var timeStamp: stdLib.Date
}

object Profile {
  @scala.inline
  def apply(
    applicationContainer: AttributesContainer,
    coreAttributes: org.scalablytyped.runtime.StringDictionary[CoreProfileAttribute],
    coreRevision: scala.Double,
    id: java.lang.String,
    revision: scala.Double,
    timeStamp: stdLib.Date
  ): Profile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applicationContainer")(applicationContainer)
    __obj.updateDynamic("coreAttributes")(coreAttributes)
    __obj.updateDynamic("coreRevision")(coreRevision)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("revision")(revision)
    __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.asInstanceOf[Profile]
  }
}

