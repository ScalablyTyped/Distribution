package typings.systeminformation.mod

import typings.systeminformation.mod.Systeminformation.BiosData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("systeminformation", "bios")
@js.native
object bios extends js.Object {
  
  def apply(): js.Promise[BiosData] = js.native
  def apply(cb: js.Function1[/* data */ BiosData, _]): js.Promise[BiosData] = js.native
}
