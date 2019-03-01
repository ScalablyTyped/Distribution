package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ptr extends js.Object {
  var ptr: webgmeLib.GmeCommonNs.MetaCardRule with Anon_1
  var set: webgmeLib.GmeCommonNs.MetaCardRule with Anon_Max
}

object Anon_Ptr {
  @scala.inline
  def apply(
    ptr: webgmeLib.GmeCommonNs.MetaCardRule with Anon_1,
    set: webgmeLib.GmeCommonNs.MetaCardRule with Anon_Max
  ): Anon_Ptr = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ptr")(ptr)
    __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[Anon_Ptr]
  }
}

