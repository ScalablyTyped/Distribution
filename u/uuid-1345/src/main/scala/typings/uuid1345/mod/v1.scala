package typings.uuid1345.mod

import typings.node.Buffer
import typings.uuid1345.anon.Encoding
import typings.uuid1345.anon.EncodingMac
import typings.uuid1345.anon.Mac
import typings.uuid1345.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("uuid-1345", "v1")
@js.native
object v1 extends js.Object {
  
  def apply(): String = js.native
  def apply(callback: ASCIICallback): Unit = js.native
  def apply(options: Encoding): String = js.native
  def apply(options: EncodingMac): Buffer = js.native
  def apply(options: EncodingMac, callback: BinaryCallback): Unit = js.native
  def apply(options: Encoding, callback: ASCIICallback): Unit = js.native
  def apply(options: Mac): String = js.native
  def apply(options: Mac, callback: ASCIICallback): Unit = js.native
  def apply(options: `0`): UUID = js.native
  def apply(options: `0`, callback: ObjectCallback): Unit = js.native
}
