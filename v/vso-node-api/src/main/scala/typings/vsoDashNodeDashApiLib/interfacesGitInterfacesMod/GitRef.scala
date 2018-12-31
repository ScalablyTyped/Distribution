package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitRef extends js.Object {
  var _links: js.Any
  var isLocked: scala.Boolean
  var isLockedBy: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var name: java.lang.String
  var objectId: java.lang.String
  var peeledObjectId: java.lang.String
  var statuses: js.Array[GitStatus]
  var url: java.lang.String
}

