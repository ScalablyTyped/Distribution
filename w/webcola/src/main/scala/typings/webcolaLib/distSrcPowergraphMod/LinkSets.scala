package typings
package webcolaLib.distSrcPowergraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/powergraph", "LinkSets")
@js.native
class LinkSets () extends js.Object {
  var n: scala.Double = js.native
  var sets: js.Any = js.native
  def add(linktype: scala.Double, m: Module): scala.Unit = js.native
  def contains(id: scala.Double): scala.Boolean = js.native
  def count(): scala.Double = js.native
  def forAll(f: js.Function2[/* ms */ ModuleSet, /* linktype */ scala.Double, scala.Unit]): scala.Unit = js.native
  def forAllModules(f: js.Function1[/* m */ Module, scala.Unit]): scala.Unit = js.native
  def intersection(other: LinkSets): LinkSets = js.native
  def remove(linktype: scala.Double, m: Module): scala.Unit = js.native
}

