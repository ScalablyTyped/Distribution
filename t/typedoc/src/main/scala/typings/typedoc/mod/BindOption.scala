package typings.typedoc.mod

import typings.std.PropertyKey
import typings.typedoc.AnonApplicationApplication
import typings.typedoc.AnonOptionsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "BindOption")
@js.native
object BindOption extends js.Object {
  def apply(name: String): js.Function2[
    /* target */ AnonApplicationApplication | AnonOptionsOptions, 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
}

