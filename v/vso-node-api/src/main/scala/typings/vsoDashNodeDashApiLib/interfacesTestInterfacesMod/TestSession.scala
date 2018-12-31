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

