package typings.webcola.distSrcPowergraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/powergraph", "LinkSets")
@js.native
class LinkSets () extends js.Object {
  var n: Double = js.native
  var sets: js.Any = js.native
  def add(linktype: Double, m: Module): Unit = js.native
  def contains(id: Double): Boolean = js.native
  def count(): Double = js.native
  def forAll(f: js.Function2[/* ms */ ModuleSet, /* linktype */ Double, Unit]): Unit = js.native
  def forAllModules(f: js.Function1[/* m */ Module, Unit]): Unit = js.native
  def intersection(other: LinkSets): LinkSets = js.native
  def remove(linktype: Double, m: Module): Unit = js.native
}

