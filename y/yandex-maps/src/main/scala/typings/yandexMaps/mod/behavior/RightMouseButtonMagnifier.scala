package typings.yandexMaps.mod.behavior

import typings.yandexMaps.mod.IBehavior
import typings.yandexMaps.mod.IControlParent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "behavior.RightMouseButtonMagnifier")
@js.native
class RightMouseButtonMagnifier () extends IBehavior {
  def this(options: IRightMouseButtonMagnifierOptions) = this()
  
  def setParent(parent: IControlParent): this.type = js.native
}
