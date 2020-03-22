package typings.typedoc.mod

import typings.std.PropertyKey
import typings.typedoc.AnonApplicationApplication
import typings.typedoc.AnonOptionsOptions
import typings.typedoc.typedocStrings.excludeNotExported
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "BindOption")
@js.native
object BindOption_excludeNotExported extends js.Object {
  def apply(name: excludeNotExported): js.Function2[
    /* target */ (AnonApplicationApplication | AnonOptionsOptions) with typings.typedoc.typedocStrings.BindOption with js.Any, 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
}

