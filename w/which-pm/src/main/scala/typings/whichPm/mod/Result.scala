package typings.whichPm.mod

import typings.whichPm.whichPmStrings.npm
import typings.whichPm.whichPmStrings.pnpm
import typings.whichPm.whichPmStrings.yarn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.whichPm.mod.NPM
  - typings.whichPm.mod.YARN
  - typings.whichPm.mod.PNPM
  - typings.whichPm.mod.Other
*/
trait Result extends js.Object

object Result {
  @scala.inline
  def NPM(name: npm): Result = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  def YARN(name: yarn): Result = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  def PNPM(name: pnpm, version: String): Result = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  def Other(name: String, version: String = null): Result = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

