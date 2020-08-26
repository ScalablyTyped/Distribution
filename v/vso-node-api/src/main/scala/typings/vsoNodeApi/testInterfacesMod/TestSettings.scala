package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestSettings extends js.Object {
  /**
    * Area path required to create test settings
    */
  var areaPath: String = js.native
  /**
    * Description of the test settings. Used in create test settings.
    */
  var description: String = js.native
  /**
    * Indicates if the tests settings is public or private.Used in create test settings.
    */
  var isPublic: Boolean = js.native
  /**
    * Xml string of machine roles. Used in create test settings.
    */
  var machineRoles: String = js.native
  /**
    * Test settings content.
    */
  var testSettingsContent: String = js.native
  /**
    * Test settings id.
    */
  var testSettingsId: Double = js.native
  /**
    * Test settings name.
    */
  var testSettingsName: String = js.native
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
  @scala.inline
  implicit class TestSettingsOps[Self <: TestSettings] (val x: Self) extends AnyVal {
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
    def setAreaPath(value: String): Self = this.set("areaPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPublic(value: Boolean): Self = this.set("isPublic", value.asInstanceOf[js.Any])
    @scala.inline
    def setMachineRoles(value: String): Self = this.set("machineRoles", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestSettingsContent(value: String): Self = this.set("testSettingsContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestSettingsId(value: Double): Self = this.set("testSettingsId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTestSettingsName(value: String): Self = this.set("testSettingsName", value.asInstanceOf[js.Any])
  }
  
}

