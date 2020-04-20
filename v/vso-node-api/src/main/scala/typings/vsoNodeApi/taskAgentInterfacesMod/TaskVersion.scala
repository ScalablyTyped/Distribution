package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskVersion extends js.Object {
  var isTest: Boolean
  var major: Double
  var minor: Double
  var patch: Double
}

object TaskVersion {
  @scala.inline
  def apply(isTest: Boolean, major: Double, minor: Double, patch: Double): TaskVersion = {
    val __obj = js.Dynamic.literal(isTest = isTest.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskVersion]
  }
}

