package typings.transducersJs.mod

import typings.transducersJs.transducersJsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transducers.js", "Reduced")
@js.native
class ReducedCls[T] protected () extends Reduced[T] {
  def this(value: T) = this()
  /* CompleteClass */
  @JSName("@@transducer/reduced")
  override var `@@transducerSlashreduced`: `true` = js.native
  /* CompleteClass */
  @JSName("@@transducer/value")
  override var `@@transducerSlashvalue`: T = js.native
}

