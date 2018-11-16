package typings
package webcolaLib.distSrcVpscMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/vpsc", "Blocks")
@js.native
class Blocks protected () extends js.Object {
  def this(vs: js.Array[Variable]) = this()
  var list: js.Any = js.native
  var vs: js.Array[Variable] = js.native
  def cost(): scala.Double = js.native
  def forEach(f: js.Function2[/* b */ Block, /* i */ scala.Double, scala.Unit]): scala.Unit = js.native
  def insert(b: Block): scala.Unit = js.native
  def merge(c: Constraint): scala.Unit = js.native
  def remove(b: Block): scala.Unit = js.native
  def split(inactive: js.Array[Constraint]): scala.Unit = js.native
  def updateBlockPositions(): scala.Unit = js.native
}

