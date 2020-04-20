package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestSettings extends js.Object {
  /**
    * Area path required to create test settings
    */
  var areaPath: String
  /**
    * Description of the test settings. Used in create test settings.
    */
  var description: String
  /**
    * Indicates if the tests settings is public or private.Used in create test settings.
    */
  var isPublic: Boolean
  /**
    * Xml string of machine roles. Used in create test settings.
    */
  var machineRoles: String
  /**
    * Test settings content.
    */
  var testSettingsContent: String
  /**
    * Test settings id.
    */
  var testSettingsId: Double
  /**
    * Test settings name.
    */
  var testSettingsName: String
}

object TestSettings {
  @scala.inline
  def apply(
    areaPath: String,
    description: String,
    isPublic: Boolean,
    machineRoles: String,
    testSettingsContent: String,
    testSettingsId: Double,
    testSettingsName: String
  ): TestSettings = {
    val __obj = js.Dynamic.literal(areaPath = areaPath.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], isPublic = isPublic.asInstanceOf[js.Any], machineRoles = machineRoles.asInstanceOf[js.Any], testSettingsContent = testSettingsContent.asInstanceOf[js.Any], testSettingsId = testSettingsId.asInstanceOf[js.Any], testSettingsName = testSettingsName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestSettings]
  }
}

