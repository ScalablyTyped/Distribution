package typings
package styletronDashEngineDashAtomicLib.styletronDashEngineDashAtomicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styletron-engine-atomic", "SequentialIDGenerator")
@js.native
class SequentialIDGenerator protected () extends js.Object {
  def this(prefix: java.lang.String) = this()
  var count: scala.Double = js.native
  var msb: scala.Double = js.native
  var offset: scala.Double = js.native
  var power: scala.Double = js.native
  var prefix: java.lang.String = js.native
  def increment(): scala.Double = js.native
  def next(): java.lang.String = js.native
}

