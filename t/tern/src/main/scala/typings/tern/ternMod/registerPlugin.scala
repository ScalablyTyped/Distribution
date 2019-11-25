package typings.tern.ternMod

import typings.tern.libTernMod.ConstructorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "registerPlugin")
@js.native
object registerPlugin extends js.Object {
  def apply(
    name: String,
    init: js.Function2[
      /* server */ typings.tern.libTernMod.Server, 
      /* options */ js.UndefOr[ConstructorOptions], 
      Unit
    ]
  ): Unit = js.native
}

