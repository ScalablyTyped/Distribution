package typings
package webixLib.webixNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseBind extends js.Object {
  def bind(target: js.Any): scala.Unit = js.native
  def bind(target: js.Any, rule: WebixCallback): scala.Unit = js.native
  def bind(target: js.Any, rule: WebixCallback, format: java.lang.String): scala.Unit = js.native
  def unbind(): scala.Unit = js.native
}

