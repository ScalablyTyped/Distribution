package typings.wif.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wif", "decodeRaw")
@js.native
object decodeRaw extends js.Object {
  
  def apply(buffer: Buffer): WIFReturn = js.native
  def apply(buffer: Buffer, version: Double): WIFReturn = js.native
}
