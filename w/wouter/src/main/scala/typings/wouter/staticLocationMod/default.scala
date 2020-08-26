package typings.wouter.staticLocationMod

import typings.wouter.useLocationMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wouter/preact/static-location", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(): StaticLocationHook = js.native
  def apply(path: js.UndefOr[scala.Nothing], options: StaticLocationHookOptions): StaticLocationHook = js.native
  def apply(path: Path): StaticLocationHook = js.native
  def apply(path: Path, options: StaticLocationHookOptions): StaticLocationHook = js.native
}

