package typings.wouter

import typings.wouter.preactMod.LocationHook
import typings.wouter.preactMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wouter/preact/static-location", JSImport.Namespace)
@js.native
object staticLocationMod extends js.Object {
  def apply(): LocationHook = js.native
  def apply(path: Path): LocationHook = js.native
}

