package typings.testingbotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestData extends js.Object {
  var build: js.UndefOr[String] = js.undefined
  var groups: js.UndefOr[String] = js.undefined
  var `test[extra]`: js.UndefOr[String] = js.undefined
  var `test[name]`: js.UndefOr[String] = js.undefined
  var `test[status_message]`: js.UndefOr[String] = js.undefined
  var `test[success]`: js.UndefOr[TestSuccess] = js.undefined
}

object TestData {
  @scala.inline
  def apply(
    build: String = null,
    groups: String = null,
    `test[extra]`: String = null,
    `test[name]`: String = null,
    `test[status_message]`: String = null,
    `test[success]`: TestSuccess = null
  ): TestData = {
    val __obj = js.Dynamic.literal()
    if (build != null) __obj.updateDynamic("build")(build.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (`test[extra]` != null) __obj.updateDynamic("test[extra]")(`test[extra]`.asInstanceOf[js.Any])
    if (`test[name]` != null) __obj.updateDynamic("test[name]")(`test[name]`.asInstanceOf[js.Any])
    if (`test[status_message]` != null) __obj.updateDynamic("test[status_message]")(`test[status_message]`.asInstanceOf[js.Any])
    if (`test[success]` != null) __obj.updateDynamic("test[success]")(`test[success]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestData]
  }
}

