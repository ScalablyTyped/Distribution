package typings
package treeifyLib.treeifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("treeify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def asLines(
    treeObj: treeifyLib.treeifyMod.TreeObject,
    showValues: scala.Boolean,
    hideFunctions: scala.Boolean,
    lineCallback: js.Function1[/* line */ java.lang.String, scala.Unit]
  ): java.lang.String = js.native
  def asLines(
    treeObj: treeifyLib.treeifyMod.TreeObject,
    showValues: scala.Boolean,
    lineCallback: js.Function1[/* line */ java.lang.String, scala.Unit]
  ): java.lang.String = js.native
  def asTree(treeObj: treeifyLib.treeifyMod.TreeObject, showValues: scala.Boolean, hideFunctions: scala.Boolean): java.lang.String = js.native
}

