package typings.tern.ternMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tern/lib/tern", "registerPlugin")
@js.native
object registerPlugin extends js.Object {
  
  def apply(
    name: String,
    init: js.Function2[/* server */ Server, /* options */ js.UndefOr[ConstructorOptions], Unit]
  ): Unit = js.native
}
