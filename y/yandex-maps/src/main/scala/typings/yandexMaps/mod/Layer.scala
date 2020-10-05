package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "Layer")
@js.native
class Layer protected ()
  extends ILayer
     with IParentOnMap
     with IPositioningContext {
  def this(tileUrlTemplate: String) = this()
  def this(tileUrlTemplate: js.Function2[/* tileNumber */ js.Array[Double], /* tileZoom */ Double, String]) = this()
  def setParent(parent: IControlParent): this.type = js.native
}

