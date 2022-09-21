package typings.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typings.std.HTMLElement
import typings.yandexMaps.mod.IPanorama
import typings.yandexMaps.mod.panorama.Player
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofpanorama extends StObject {
  
  var Base: Instantiable0[typings.yandexMaps.mod.panorama.Base] & TypeofBase_ = js.native
  
  var Manager: Instantiable0[typings.yandexMaps.mod.panorama.Manager] = js.native
  
  var Player: Instantiable3[
    /* element */ HTMLElement | String, 
    /* panorama */ IPanorama, 
    /* options */ js.UndefOr[AutoFitToViewport], 
    typings.yandexMaps.mod.panorama.Player
  ] = js.native
  
  def createPlayer(element: String, point: js.Array[Double]): js.Promise[Player] = js.native
  def createPlayer(element: String, point: js.Array[Double], options: Direction): js.Promise[Player] = js.native
  def createPlayer(element: HTMLElement, point: js.Array[Double]): js.Promise[Player] = js.native
  def createPlayer(element: HTMLElement, point: js.Array[Double], options: Direction): js.Promise[Player] = js.native
  
  def isSupported(): Boolean = js.native
  
  def locate(point: js.Array[Double]): js.Promise[js.Array[IPanorama]] = js.native
  def locate(point: js.Array[Double], options: Layer): js.Promise[js.Array[IPanorama]] = js.native
}
