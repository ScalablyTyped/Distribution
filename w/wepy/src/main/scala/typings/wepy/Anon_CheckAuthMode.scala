package typings.wepy

import typings.wepy.wepyStrings.facial
import typings.wepy.wepyStrings.fingerPrint
import typings.wepy.wepyStrings.speech
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckAuthMode extends js.Object {
  var checkAuthMode: fingerPrint | facial | speech
}

object Anon_CheckAuthMode {
  @scala.inline
  def apply(checkAuthMode: fingerPrint | facial | speech): Anon_CheckAuthMode = {
    val __obj = js.Dynamic.literal(checkAuthMode = checkAuthMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CheckAuthMode]
  }
}

