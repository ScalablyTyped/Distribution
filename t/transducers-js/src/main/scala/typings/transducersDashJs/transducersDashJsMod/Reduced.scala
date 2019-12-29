package typings.transducersDashJs.transducersDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reduced[TResult] extends js.Object {
  @JSName("@@transducer/reduced")
  var `@@transducerSlashreduced`: Boolean
  @JSName("@@transducer/value")
  var `@@transducerSlashvalue`: TResult
}

object Reduced {
  @scala.inline
  def apply[TResult](`@@transducerSlashreduced`: Boolean, `@@transducerSlashvalue`: TResult): Reduced[TResult] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@@transducer/reduced")(`@@transducerSlashreduced`.asInstanceOf[js.Any])
    __obj.updateDynamic("@@transducer/value")(`@@transducerSlashvalue`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reduced[TResult]]
  }
}

@JSImport("transducers-js", "reduced")
@js.native
object reduced extends js.Object {
  def apply[TResult](x: TResult): Reduced[TResult] = js.native
}

