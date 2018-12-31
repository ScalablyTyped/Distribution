package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceTemplate extends js.Object {
  /**
    * Uri of the associated definition
    */
  var definitionUri: java.lang.String
  /**
    * The identity that last modified this template
    */
  var lastModifiedBy: java.lang.String
  /**
    * The last time this template was modified
    */
  var lastModifiedDate: stdLib.Date
  /**
    * List of workspace mappings
    */
  var mappings: js.Array[WorkspaceMapping]
  /**
    * Id of the workspace for this template
    */
  var workspaceId: scala.Double
}

