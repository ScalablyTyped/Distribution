package typings.typedoc.mod

import typings.std.PropertyKey
import typings.typedoc.anon.ApplicationApplication
import typings.typedoc.anon.OptionsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "BindOption")
@js.native
object BindOption extends js.Object {
  def apply(name: String): js.Function2[/* target */ ApplicationApplication | OptionsOptions, /* key */ PropertyKey, Unit] = js.native
}

