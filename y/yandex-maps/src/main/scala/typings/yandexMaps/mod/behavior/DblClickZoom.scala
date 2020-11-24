package typings.yandexMaps.mod.behavior

import typings.yandexMaps.mod.IBehavior
import typings.yandexMaps.mod.IControlParent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "behavior.DblClickZoom")
@js.native
class DblClickZoom () extends IBehavior {
  def this(options: IDblClickZoomOptions) = this()
  
  def setParent(parent: IControlParent): this.type = js.native
}
