package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestSettings extends js.Object {
  /**
    * Area path required to create test settings
    */
  var areaPath: java.lang.String
  /**
    * Description of the test settings. Used in create test settings.
    */
  var description: java.lang.String
  /**
    * Indicates if the tests settings is public or private.Used in create test settings.
    */
  var isPublic: scala.Boolean
  /**
    * Xml string of machine roles. Used in create test settings.
    */
  var machineRoles: java.lang.String
  /**
    * Test settings content.
    */
  var testSettingsContent: java.lang.String
  /**
    * Test settings id.
    */
  var testSettingsId: scala.Double
  /**
    * Test settings name.
    */
  var testSettingsName: java.lang.String
}

object TestSettings {
  @scala.inline
  def apply(
    areaPath: java.lang.String,
    description: java.lang.String,
    isPublic: scala.Boolean,
    machineRoles: java.lang.String,
    testSettingsContent: java.lang.String,
    testSettingsId: scala.Double,
    testSettingsName: java.lang.String
  ): TestSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("areaPath")(areaPath)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("isPublic")(isPublic)
    __obj.updateDynamic("machineRoles")(machineRoles)
    __obj.updateDynamic("testSettingsContent")(testSettingsContent)
    __obj.updateDynamic("testSettingsId")(testSettingsId)
    __obj.updateDynamic("testSettingsName")(testSettingsName)
    __obj.asInstanceOf[TestSettings]
  }
}

