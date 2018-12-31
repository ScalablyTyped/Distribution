package typings
package vsoDashNodeDashApiLib.interfacesCoreInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamContext extends js.Object {
  /**
    * The team project Id or name.  Ignored if ProjectId is set.
    */
  var project: java.lang.String
  /**
    * The Team Project ID.  Required if Project is not set.
    */
  var projectId: java.lang.String
  /**
    * The Team Id or name.  Ignored if TeamId is set.
    */
  var team: java.lang.String
  /**
    * The Team Id
    */
  var teamId: java.lang.String
}

