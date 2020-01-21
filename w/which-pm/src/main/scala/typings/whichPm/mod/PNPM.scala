package typings.whichPm.mod

import typings.whichPm.whichPmStrings.pnpm
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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PNPM]
  }
}

