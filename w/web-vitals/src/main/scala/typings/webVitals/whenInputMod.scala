package typings.webVitals

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web-vitals/dist/lib/whenInput", JSImport.Namespace)
@js.native
object whenInputMod extends js.Object {
  def whenInput(): js.Promise[Event] = js.native
}

