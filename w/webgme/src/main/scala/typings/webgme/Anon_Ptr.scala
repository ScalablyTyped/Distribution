package typings.webgme

import typings.webgme.GmeCommon.MetaCardRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ptr extends js.Object {
  var ptr: MetaCardRule with Anon_1
  var set: MetaCardRule with Anon_Max
}

object Anon_Ptr {
  @scala.inline
  def apply(ptr: MetaCardRule with Anon_1, set: MetaCardRule with Anon_Max): Anon_Ptr = {
    val __obj = js.Dynamic.literal(ptr = ptr.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Ptr]
  }
}

