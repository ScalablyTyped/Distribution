package typings.treeify.treeifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("treeify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def asLines(
    treeObj: TreeObject,
    showValues: Boolean,
    hideFunctions: Boolean,
    lineCallback: js.Function1[/* line */ String, Unit]
  ): String = js.native
  def asLines(treeObj: TreeObject, showValues: Boolean, lineCallback: js.Function1[/* line */ String, Unit]): String = js.native
  def asTree(treeObj: TreeObject, showValues: Boolean, hideFunctions: Boolean): String = js.native
}

