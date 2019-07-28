package typings.webcola.distSrcDescentMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola/dist/src/descent", "Locks")
@js.native
class Locks () extends js.Object {
  var locks: NumberDictionary[js.Array[Double]] = js.native
  def add(id: Double, x: js.Array[Double]): Unit = js.native
  @JSName("apply")
  def apply(f: js.Function2[/* id */ Double, /* x */ js.Array[Double], Unit]): Unit = js.native
  def clear(): Unit = js.native
  def isEmpty(): Boolean = js.native
}

