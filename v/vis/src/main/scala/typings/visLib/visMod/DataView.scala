package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vis", "DataView")
@js.native
class DataView[T /* <: DataItem | DataGroup */] protected () extends js.Object {
  def this(items: js.Array[T]) = this()
  var length: scala.Double = js.native
}

