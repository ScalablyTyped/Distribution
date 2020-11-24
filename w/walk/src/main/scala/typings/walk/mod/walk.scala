package typings.walk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("walk", "walk")
@js.native
object walk extends js.Object {
  
  def apply(path: String): Walker = js.native
  def apply(path: String, options: WalkOptions): Walker = js.native
}
