package typings.wouter.wouterMod

import typings.wouter.wouterUseLocationMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wouter/static-location", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(): StaticLocationHook = js.native
  def apply(path: js.UndefOr[scala.Nothing], options: StaticLocationHookOptions): StaticLocationHook = js.native
  def apply(path: Path): StaticLocationHook = js.native
  def apply(path: Path, options: StaticLocationHookOptions): StaticLocationHook = js.native
}
