package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckAuthMode extends js.Object {
  var checkAuthMode: wepyLib.wepyLibStrings.fingerPrint | wepyLib.wepyLibStrings.facial | wepyLib.wepyLibStrings.speech
}

object Anon_CheckAuthMode {
  @scala.inline
  def apply(
    checkAuthMode: wepyLib.wepyLibStrings.fingerPrint | wepyLib.wepyLibStrings.facial | wepyLib.wepyLibStrings.speech
  ): Anon_CheckAuthMode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checkAuthMode")(checkAuthMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CheckAuthMode]
  }
}

