package typings.strongLogTransformer.mod

import typings.node.NodeJS.ReadWriteStream
import typings.strongLogTransformer.anon.PartialOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrongLogTransformer extends js.Object {
  var DEFAULTS: Options = js.native
  def apply(): ReadWriteStream = js.native
  def apply(options: PartialOptions): ReadWriteStream = js.native
  def cli(args: js.Array[String]): Unit = js.native
}

