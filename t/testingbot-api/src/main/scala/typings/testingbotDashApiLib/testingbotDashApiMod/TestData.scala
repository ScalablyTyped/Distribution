package typings
package testingbotDashApiLib.testingbotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestData extends js.Object {
  var build: js.UndefOr[java.lang.String] = js.undefined
  var groups: js.UndefOr[java.lang.String] = js.undefined
  var `test[extra]`: js.UndefOr[java.lang.String] = js.undefined
  var `test[name]`: js.UndefOr[java.lang.String] = js.undefined
  var `test[status_message]`: js.UndefOr[java.lang.String] = js.undefined
  var `test[success]`: js.UndefOr[TestSuccess] = js.undefined
}

object TestData {
  @scala.inline
  def apply(
    build: java.lang.String = null,
    groups: java.lang.String = null,
    `test[extra]`: java.lang.String = null,
    `test[name]`: java.lang.String = null,
    `test[status_message]`: java.lang.String = null,
    `test[success]`: TestSuccess = null
  ): TestData = {
    val __obj = js.Dynamic.literal()
    if (build != null) __obj.updateDynamic("build")(build)
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (`test[extra]` != null) __obj.updateDynamic("test[extra]")(`test[extra]`)
    if (`test[name]` != null) __obj.updateDynamic("test[name]")(`test[name]`)
    if (`test[status_message]` != null) __obj.updateDynamic("test[status_message]")(`test[status_message]`)
    if (`test[success]` != null) __obj.updateDynamic("test[success]")(`test[success]`)
    __obj.asInstanceOf[TestData]
  }
}

