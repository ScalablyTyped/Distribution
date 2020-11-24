package typings.strongLogTransformer.mod

import typings.node.NodeJS.ReadWriteStream
import typings.strongLogTransformer.anon.PartialOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StrongLogTransformer extends js.Object {
  
  def apply(): ReadWriteStream = js.native
  def apply(options: PartialOptions): ReadWriteStream = js.native
  
  var DEFAULTS: Options = js.native
  
  def cli(args: js.Array[String]): Unit = js.native
}
