package typings.yandexMaps.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
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
  
  def getAlias(): String = js.native
  
  def getElement(): HTMLElement = js.native
  
  def setParent(parent: IControlParent): this.type = js.native
}
