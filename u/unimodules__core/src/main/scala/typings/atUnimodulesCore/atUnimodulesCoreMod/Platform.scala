package typings.atUnimodulesCore.atUnimodulesCoreMod

import typings.atUnimodulesCore.atUnimodulesCoreStrings.android
import typings.atUnimodulesCore.atUnimodulesCoreStrings.ios
import typings.atUnimodulesCore.atUnimodulesCoreStrings.macos
import typings.atUnimodulesCore.atUnimodulesCoreStrings.web
import typings.atUnimodulesCore.atUnimodulesCoreStrings.windows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@unimodules/core", "Platform")
@js.native
object Platform extends js.Object {
  var OS: ios | android | windows | macos | web = js.native
}

