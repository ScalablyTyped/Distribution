package typings
package treeifyLib.treeifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("treeify", JSImport.Namespace)
@js.native
object treeifyModMembers extends js.Object {
  def asLines(
    treeObj: TreeObject,
    showValues: scala.Boolean,
    hideFunctions: scala.Boolean,
    lineCallback: js.Function1[/* line */ java.lang.String, scala.Unit]
  ): java.lang.String = js.native
  def asLines(
    treeObj: TreeObject,
    showValues: scala.Boolean,
    lineCallback: js.Function1[/* line */ java.lang.String, scala.Unit]
  ): java.lang.String = js.native
  def asTree(treeObj: TreeObject, showValues: scala.Boolean, hideFunctions: scala.Boolean): java.lang.String = js.native
}

