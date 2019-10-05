package typings.treeify.treeifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("treeify", "asLines")
@js.native
object asLines extends js.Object {
  def apply(
    treeObj: TreeObject,
    showValues: Boolean,
    hideFunctions: Boolean,
    lineCallback: js.Function1[/* line */ String, Unit]
  ): String = js.native
  def apply(treeObj: TreeObject, showValues: Boolean, lineCallback: js.Function1[/* line */ String, Unit]): String = js.native
}

