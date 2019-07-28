package typings.webcola.distSrcVpscMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/vpsc", "Blocks")
@js.native
class Blocks protected () extends js.Object {
  def this(vs: js.Array[Variable]) = this()
  var list: js.Any = js.native
  var vs: js.Array[Variable] = js.native
  def cost(): Double = js.native
  def forEach(f: js.Function2[/* b */ Block, /* i */ Double, Unit]): Unit = js.native
  def insert(b: Block): Unit = js.native
  def merge(c: Constraint): Unit = js.native
  def remove(b: Block): Unit = js.native
  def split(inactive: js.Array[Constraint]): Unit = js.native
  def updateBlockPositions(): Unit = js.native
}

