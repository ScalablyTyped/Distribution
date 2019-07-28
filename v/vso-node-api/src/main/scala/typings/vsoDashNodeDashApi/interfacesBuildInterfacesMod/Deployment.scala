package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deployment extends js.Object {
  var `type`: String
}

object Deployment {
  @scala.inline
  def apply(`type`: String): Deployment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Deployment]
  }
}

