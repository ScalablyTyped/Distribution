package typings.testingbotDashApi.testingbotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestLabData extends js.Object {
  @JSName("test[cron]")
  var testLeftsquarebracketcronRightsquarebracket: js.UndefOr[String] = js.undefined
  @JSName("test[enabled]")
  var testLeftsquarebracketenabledRightsquarebracket: js.UndefOr[Boolean] = js.undefined
  @JSName("test[name]")
  var testLeftsquarebracketnameRightsquarebracket: js.UndefOr[String] = js.undefined
  @JSName("test[url]")
  var testLeftsquarebracketurlRightsquarebracket: js.UndefOr[String] = js.undefined
}

object TestLabData {
  @scala.inline
  def apply(
    testLeftsquarebracketcronRightsquarebracket: String = null,
    testLeftsquarebracketenabledRightsquarebracket: js.UndefOr[Boolean] = js.undefined,
    testLeftsquarebracketnameRightsquarebracket: String = null,
    testLeftsquarebracketurlRightsquarebracket: String = null
  ): TestLabData = {
    val __obj = js.Dynamic.literal()
    if (testLeftsquarebracketcronRightsquarebracket != null) __obj.updateDynamic("test[cron]")(testLeftsquarebracketcronRightsquarebracket.asInstanceOf[js.Any])
    if (!js.isUndefined(testLeftsquarebracketenabledRightsquarebracket)) __obj.updateDynamic("test[enabled]")(testLeftsquarebracketenabledRightsquarebracket.asInstanceOf[js.Any])
    if (testLeftsquarebracketnameRightsquarebracket != null) __obj.updateDynamic("test[name]")(testLeftsquarebracketnameRightsquarebracket.asInstanceOf[js.Any])
    if (testLeftsquarebracketurlRightsquarebracket != null) __obj.updateDynamic("test[url]")(testLeftsquarebracketurlRightsquarebracket.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestLabData]
  }
}

