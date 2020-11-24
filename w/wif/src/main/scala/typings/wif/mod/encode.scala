package typings.wif.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wif", "encode")
@js.native
object encode extends js.Object {
  
  def apply(version: Double, privateKey: Buffer, compressed: Boolean): String = js.native
}
