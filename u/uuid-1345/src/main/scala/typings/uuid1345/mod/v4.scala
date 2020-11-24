package typings.uuid1345.mod

import typings.node.Buffer
import typings.uuid1345.anon.`1`
import typings.uuid1345.anon.`2`
import typings.uuid1345.anon.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("uuid-1345", "v4")
@js.native
object v4 extends js.Object {
  
  def apply(): String = js.native
  def apply(callback: ASCIICallback): Unit = js.native
  def apply(options: `1`): String = js.native
  def apply(options: `1`, callback: ASCIICallback): Unit = js.native
  def apply(options: `2`): Buffer = js.native
  def apply(options: `2`, callback: BinaryCallback): Unit = js.native
  def apply(options: `3`): UUID = js.native
  def apply(options: `3`, callback: ObjectCallback): Unit = js.native
}
