package typings.transducersDashJs.transducersDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reduced[TResult] extends js.Object {
  var `@@transducer/reduced`: Boolean
  var `@@transducer/value`: TResult
}

object Reduced {
  @scala.inline
  def apply[TResult](`@@transducer/reduced`: Boolean, `@@transducer/value`: TResult): Reduced[TResult] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@@transducer/reduced")(`@@transducer/reduced`)
    __obj.updateDynamic("@@transducer/value")(`@@transducer/value`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reduced[TResult]]
  }
}

@JSImport("transducers-js", "reduced")
@js.native
object reduced extends js.Object {
  def apply[TResult](x: TResult): Reduced[TResult] = js.native
}

