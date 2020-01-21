package typings.transducersJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reduced_[TResult] extends js.Object {
  @JSName("@@transducer/reduced")
  var `@@transducerSlashreduced`: Boolean
  @JSName("@@transducer/value")
  var `@@transducerSlashvalue`: TResult
}

object Reduced_ {
  @scala.inline
  def apply[TResult](`@@transducerSlashreduced`: Boolean, `@@transducerSlashvalue`: TResult): Reduced_[TResult] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@@transducer/reduced")(`@@transducerSlashreduced`.asInstanceOf[js.Any])
    __obj.updateDynamic("@@transducer/value")(`@@transducerSlashvalue`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reduced_[TResult]]
  }
}

