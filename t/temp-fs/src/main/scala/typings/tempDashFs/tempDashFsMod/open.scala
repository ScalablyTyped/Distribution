package typings.tempDashFs.tempDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("temp-fs", "open")
@js.native
object open extends js.Object {
  /**
    * Try to open a unique tempfile asynchronously.
    *
    * @param callback function receives two arguments <code>error</code> and
    *                 <code>file</code>. If <code>error</code> is
    *                 <code>null</code>, <code>file</code> has the properties
    *                 of {@link file}.
    */
  def apply(): js.Any = js.native
  def apply(callback: js.Function2[/* err */ js.Any, /* file */ file, _]): js.Any = js.native
  def apply(options: options): js.Any = js.native
  def apply(options: options, callback: js.Function2[/* err */ js.Any, /* file */ file, _]): js.Any = js.native
}

