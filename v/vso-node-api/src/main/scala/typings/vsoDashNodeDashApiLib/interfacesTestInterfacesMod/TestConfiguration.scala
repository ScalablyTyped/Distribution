package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestConfiguration extends js.Object {
  /**
    * Area of the configuration
    */
  var area: ShallowReference
  /**
    * Description of the configuration
    */
  var description: java.lang.String
  /**
    * Id of the configuration
    */
  var id: scala.Double
  /**
    * Is the configuration a default for the test plans
    */
  var isDefault: scala.Boolean
  /**
    * Last Updated By  Reference
    */
  var lastUpdatedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Last Updated Data
    */
  var lastUpdatedDate: stdLib.Date
  /**
    * Name of the configuration
    */
  var name: java.lang.String
  /**
    * Project to which the configuration belongs
    */
  var project: ShallowReference
  /**
    * Revision of the the configuration
    */
  var revision: scala.Double
  /**
    * State of the configuration
    */
  var state: TestConfigurationState
  /**
    * Url of Configuration Resource
    */
  var url: java.lang.String
  /**
    * Dictionary of Test Variable, Selected Value
    */
  var values: js.Array[NameValuePair]
}

object TestConfiguration {
  @scala.inline
  def apply(
    area: ShallowReference,
    description: java.lang.String,
    id: scala.Double,
    isDefault: scala.Boolean,
    lastUpdatedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    lastUpdatedDate: stdLib.Date,
    name: java.lang.String,
    project: ShallowReference,
    revision: scala.Double,
    state: TestConfigurationState,
    url: java.lang.String,
    values: js.Array[NameValuePair]
  ): TestConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("area")(area)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isDefault")(isDefault)
    __obj.updateDynamic("lastUpdatedBy")(lastUpdatedBy)
    __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("project")(project)
    __obj.updateDynamic("revision")(revision)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[TestConfiguration]
  }
}

