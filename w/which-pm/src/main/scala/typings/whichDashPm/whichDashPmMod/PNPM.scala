package typings.whichDashPm.whichDashPmMod

import typings.whichDashPm.whichDashPmStrings.pnpm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PNPM extends Result {
  val name: pnpm
  val version: String
}

object PNPM {
  @scala.inline
  def apply(name: pnpm, version: String): PNPM = {
    val __obj = js.Dynamic.literal(name = name, version = version)
  
    __obj.asInstanceOf[PNPM]
  }
}

