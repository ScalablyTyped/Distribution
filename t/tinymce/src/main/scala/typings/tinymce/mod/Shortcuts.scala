package typings.tinymce.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shortcuts extends js.Object {
  def add(pattern: String, desc: String, cmdFunc: js.Function0[Unit | String]): Boolean = js.native
  def add(pattern: String, desc: String, cmdFunc: js.Function0[Unit | String], scope: js.Object): Boolean = js.native
  def remove(pattern: String): Boolean = js.native
}

