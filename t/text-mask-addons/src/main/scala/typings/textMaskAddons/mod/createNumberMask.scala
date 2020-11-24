package typings.textMaskAddons.mod

import typings.textMaskAddons.anon.PartialNumberMaskOptions
import typings.textMaskCore.mod.Mask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("text-mask-addons", "createNumberMask")
@js.native
object createNumberMask extends js.Object {
  
  def apply(): js.Function1[/* rawValue */ String, Mask] = js.native
  def apply(maskOptions: PartialNumberMaskOptions): js.Function1[/* rawValue */ String, Mask] = js.native
}
