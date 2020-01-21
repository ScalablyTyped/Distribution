package typings.strongLogTransformer.mod

import typings.node.NodeJS.ReadWriteStream
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrongLogTransformer extends js.Object {
  var DEFAULTS: Options = js.native
  def apply(): ReadWriteStream = js.native
  def apply(options: Partial[Options]): ReadWriteStream = js.native
  def cli(args: js.Array[String]): Unit = js.native
}

