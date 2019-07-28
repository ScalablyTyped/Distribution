package typings.webcola.distSrcPowergraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/powergraph", "ModuleSet")
@js.native
class ModuleSet () extends js.Object {
  var table: js.Any = js.native
  def add(m: Module): Unit = js.native
  def contains(id: Double): Boolean = js.native
  def count(): Double = js.native
  def forAll(f: js.Function1[/* m */ Module, Unit]): Unit = js.native
  def intersection(other: ModuleSet): ModuleSet = js.native
  def intersectionCount(other: ModuleSet): Double = js.native
  def modules(): js.Array[Module] = js.native
  def remove(m: Module): Unit = js.native
}

