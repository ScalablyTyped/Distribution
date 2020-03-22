package typings.vastClient

import typings.std.Error
import typings.std.XMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(err: Null, xml: XMLDocument): Unit = js.native
  def apply(err: Error): Unit = js.native
}

