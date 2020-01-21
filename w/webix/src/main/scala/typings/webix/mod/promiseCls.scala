package typings.webix.mod

import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webix", "promise")
@js.native
class promiseCls protected ()
  extends Promise[js.Any] {
  def this(executor: js.Function2[
        /* resolve */ js.Function1[/* value */ js.UndefOr[js.Any], Unit], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
        Unit
      ]) = this()
}

