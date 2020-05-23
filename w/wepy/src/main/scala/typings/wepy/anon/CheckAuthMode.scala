package typings.wepy.anon

import typings.wepy.wepyStrings.facial
import typings.wepy.wepyStrings.fingerPrint
import typings.wepy.wepyStrings.speech
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckAuthMode extends js.Object {
  var checkAuthMode: fingerPrint | facial | speech
}

object CheckAuthMode {
  @scala.inline
  def apply(checkAuthMode: fingerPrint | facial | speech): CheckAuthMode = {
    val __obj = js.Dynamic.literal(checkAuthMode = checkAuthMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckAuthMode]
  }
}

