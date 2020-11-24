package typings.walk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("walk", "walkSync")
@js.native
object walkSync extends js.Object {
  
  def apply(path: String): Walker = js.native
  def apply(path: String, options: WalkOptions): Walker = js.native
}
