package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildProcess extends js.Object {
  /**
    * The type of the process.
    */
  var `type`: Double
}

object BuildProcess {
  @scala.inline
  def apply(`type`: Double): BuildProcess = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildProcess]
  }
}

