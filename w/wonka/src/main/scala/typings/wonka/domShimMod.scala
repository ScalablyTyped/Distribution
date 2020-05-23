package typings.wonka

import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonka/dist/types/src/shims/Dom.shim", JSImport.Namespace)
@js.native
object domShimMod extends js.Object {
  type element = HTMLElement
  type event = Event
}

