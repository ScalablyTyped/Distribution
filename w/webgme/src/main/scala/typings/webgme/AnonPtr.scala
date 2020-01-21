package typings.webgme

import typings.webgme.GmeCommon.MetaCardRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPtr extends js.Object {
  var ptr: MetaCardRule with Anon1
  var set: MetaCardRule with AnonMax
}

object AnonPtr {
  @scala.inline
  def apply(ptr: MetaCardRule with Anon1, set: MetaCardRule with AnonMax): AnonPtr = {
    val __obj = js.Dynamic.literal(ptr = ptr.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPtr]
  }
}

