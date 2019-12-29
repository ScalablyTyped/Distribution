package typings.testingbotDashApi.testingbotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestData extends js.Object {
  var build: js.UndefOr[String] = js.undefined
  var groups: js.UndefOr[String] = js.undefined
  @JSName("test[extra]")
  var testLeftsquarebracketextraRightsquarebracket: js.UndefOr[String] = js.undefined
  @JSName("test[name]")
  var testLeftsquarebracketnameRightsquarebracket: js.UndefOr[String] = js.undefined
  @JSName("test[status_message]")
  var testLeftsquarebracketstatus_messageRightsquarebracket: js.UndefOr[String] = js.undefined
  @JSName("test[success]")
  var testLeftsquarebracketsuccessRightsquarebracket: js.UndefOr[TestSuccess] = js.undefined
}

object TestData {
  @scala.inline
  def apply(
    build: String = null,
    groups: String = null,
    testLeftsquarebracketextraRightsquarebracket: String = null,
    testLeftsquarebracketnameRightsquarebracket: String = null,
    testLeftsquarebracketstatus_messageRightsquarebracket: String = null,
    testLeftsquarebracketsuccessRightsquarebracket: TestSuccess = null
  ): TestData = {
    val __obj = js.Dynamic.literal()
    if (build != null) __obj.updateDynamic("build")(build.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (testLeftsquarebracketextraRightsquarebracket != null) __obj.updateDynamic("test[extra]")(testLeftsquarebracketextraRightsquarebracket.asInstanceOf[js.Any])
    if (testLeftsquarebracketnameRightsquarebracket != null) __obj.updateDynamic("test[name]")(testLeftsquarebracketnameRightsquarebracket.asInstanceOf[js.Any])
    if (testLeftsquarebracketstatus_messageRightsquarebracket != null) __obj.updateDynamic("test[status_message]")(testLeftsquarebracketstatus_messageRightsquarebracket.asInstanceOf[js.Any])
    if (testLeftsquarebracketsuccessRightsquarebracket != null) __obj.updateDynamic("test[success]")(testLeftsquarebracketsuccessRightsquarebracket.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestData]
  }
}

