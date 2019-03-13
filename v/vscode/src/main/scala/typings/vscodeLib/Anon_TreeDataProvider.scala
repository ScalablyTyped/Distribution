package typings
package vscodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TreeDataProvider[T] extends js.Object {
  var treeDataProvider: vscodeLib.vscodeMod.TreeDataProvider[T]
}

object Anon_TreeDataProvider {
  @scala.inline
  def apply[T](treeDataProvider: vscodeLib.vscodeMod.TreeDataProvider[T]): Anon_TreeDataProvider[T] = {
    val __obj = js.Dynamic.literal(treeDataProvider = treeDataProvider)
  
    __obj.asInstanceOf[Anon_TreeDataProvider[T]]
  }
}

