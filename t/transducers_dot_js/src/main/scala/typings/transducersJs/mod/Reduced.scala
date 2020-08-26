package typings.transducersJs.mod

import org.scalablytyped.runtime.TopLevel
import typings.transducersJs.transducersJsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reduced[T] extends js.Object {
  @JSName("@@transducer/reduced")
  var `@@transducerSlashreduced`: `true` = js.native
  @JSName("@@transducer/value")
  var `@@transducerSlashvalue`: T = js.native
}

@JSImport("transducers.js", "Reduced")
@js.native
object Reduced extends TopLevel[ReducedConstructor]

