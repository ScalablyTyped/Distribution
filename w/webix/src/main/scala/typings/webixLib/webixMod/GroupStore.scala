package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupStore extends js.Object {
  def group(stats: js.Any): scala.Unit
  def ungroup(): scala.Unit
}

object GroupStore {
  @scala.inline
  def apply(group: js.Function1[js.Any, scala.Unit], ungroup: js.Function0[scala.Unit]): GroupStore = {
    val __obj = js.Dynamic.literal(group = group, ungroup = ungroup)
  
    __obj.asInstanceOf[GroupStore]
  }
}

