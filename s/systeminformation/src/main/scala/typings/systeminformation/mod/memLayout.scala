package typings.systeminformation.mod

import typings.systeminformation.mod.Systeminformation.MemLayoutData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("systeminformation", "memLayout")
@js.native
object memLayout extends js.Object {
  
  def apply(): js.Promise[js.Array[MemLayoutData]] = js.native
  def apply(cb: js.Function1[/* data */ js.Array[MemLayoutData], _]): js.Promise[js.Array[MemLayoutData]] = js.native
}
