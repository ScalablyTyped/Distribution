package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filter extends js.Object {
  var filter: js.Array[webgmeLib.GmeCommonNs.Path]
}

object Anon_Filter {
  @scala.inline
  def apply(filter: js.Array[webgmeLib.GmeCommonNs.Path]): Anon_Filter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filter")(filter)
    __obj.asInstanceOf[Anon_Filter]
  }
}

