package typings.vinylFs.mod._Global_

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("NodeJS")
@js.native
object NodeJS extends js.Object {
  @js.native
  trait WritableStream extends js.Object {
    def write(buffer: js.Any): Boolean = js.native
    def write(buffer: js.Any, cb: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Boolean = js.native
  }
  
}

