package typings.tampermonkey

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  /**
    * The unsafeWindow object provides full access to the pages javascript
    * functions and variables
    */
  var unsafeWindow: Window = js.native
}

