package typings.whichDashPm.whichDashPmMod

import typings.whichDashPm.whichDashPmStrings.npm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NPM extends Result {
  val name: npm
}

object NPM {
  @scala.inline
  def apply(name: npm): NPM = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[NPM]
  }
}

