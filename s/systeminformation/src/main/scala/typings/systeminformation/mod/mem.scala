package typings.systeminformation.mod

import typings.systeminformation.mod.Systeminformation.MemData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("systeminformation", "mem")
@js.native
object mem extends js.Object {
  
  def apply(): js.Promise[MemData] = js.native
  def apply(cb: js.Function1[/* data */ MemData, _]): js.Promise[MemData] = js.native
}
