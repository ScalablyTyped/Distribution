package typings.tempFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("temp-fs", "mkdir")
@js.native
object mkdir extends js.Object {
  /**
    * Try to create a new tempdir asynchronously.
    *
    * @param callback function receives two arguments <code>error</code> and
    *                 <code>dir</code>. If <code>error</code> is
    *                 <code>null</code>, <code>dir</code> has the properties of
    *                 {@link dir}.
    */
  def apply(): js.Any = js.native
  def apply(options: options): js.Any = js.native
  def apply(options: options, callback: js.Function2[/* err */ js.Any, /* dir */ dir, _]): js.Any = js.native
}

