package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestSession extends js.Object {
  /**
    * Area path of the test session
    */
  var area: ShallowReference
  /**
    * Comments in the test session
    */
  var comment: java.lang.String
  /**
    * Duration of the session
    */
  var endDate: stdLib.Date
  /**
    * Id of the test session
    */
  var id: scala.Double
  /**
    * Last Updated By  Reference
    */
  var lastUpdatedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Last updated date
    */
  var lastUpdatedDate: stdLib.Date
  /**
    * Owner of the test session
    */
  var owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Project to which the test session belongs
    */
  var project: ShallowReference
  /**
    * Generic store for test session data
    */
  var propertyBag: PropertyBag
  /**
    * Revision of the test session
    */
  var revision: scala.Double
  /**
    * Source of the test session
    */
  var source: TestSessionSource
  /**
    * Start date
    */
  var startDate: stdLib.Date
  /**
    * State of the test session
    */
  var state: TestSessionState
  /**
    * Title of the test session
    */
  var title: java.lang.String
  /**
    * Url of Test Session Resource
    */
  var url: java.lang.String
}

object TestSession {
  @scala.inline
  def apply(
    area: ShallowReference,
    comment: java.lang.String,
    endDate: stdLib.Date,
    id: scala.Double,
    lastUpdatedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    lastUpdatedDate: stdLib.Date,
    owner: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    project: ShallowReference,
    propertyBag: PropertyBag,
    revision: scala.Double,
    source: TestSessionSource,
    startDate: stdLib.Date,
    state: TestSessionState,
    title: java.lang.String,
    url: java.lang.String
  ): TestSession = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("area")(area)
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("endDate")(endDate)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("lastUpdatedBy")(lastUpdatedBy)
    __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate)
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("project")(project)
    __obj.updateDynamic("propertyBag")(propertyBag)
    __obj.updateDynamic("revision")(revision)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("startDate")(startDate)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[TestSession]
  }
}

