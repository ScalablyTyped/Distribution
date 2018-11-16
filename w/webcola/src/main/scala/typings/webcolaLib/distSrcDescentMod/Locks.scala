package typings
package webcolaLib.distSrcDescentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/descent", "Locks")
@js.native
class Locks () extends js.Object {
  var locks: ScalablyTyped.runtime.NumberDictionary[js.Array[scala.Double]] = js.native
  def add(id: scala.Double, x: js.Array[scala.Double]): scala.Unit = js.native
  @JSName("apply")
  def apply(f: js.Function2[/* id */ scala.Double, /* x */ js.Array[scala.Double], scala.Unit]): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def isEmpty(): scala.Boolean = js.native
}

