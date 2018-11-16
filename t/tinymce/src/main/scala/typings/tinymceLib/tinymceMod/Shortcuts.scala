package typings
package tinymceLib.tinymceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shortcuts extends js.Object {
  def add(
    pattern: java.lang.String,
    desc: java.lang.String,
    cmdFunc: js.Function0[scala.Unit | java.lang.String]
  ): scala.Boolean = js.native
  def add(
    pattern: java.lang.String,
    desc: java.lang.String,
    cmdFunc: js.Function0[scala.Unit | java.lang.String],
    scope: js.Object
  ): scala.Boolean = js.native
  def remove(pattern: java.lang.String): scala.Boolean = js.native
}

