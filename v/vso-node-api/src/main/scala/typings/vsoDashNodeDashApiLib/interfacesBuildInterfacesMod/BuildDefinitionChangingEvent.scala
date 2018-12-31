package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildDefinitionChangingEvent extends js.Object {
  var changeType: AuditAction
  var newDefinition: BuildDefinition
  var originalDefinition: BuildDefinition
}

