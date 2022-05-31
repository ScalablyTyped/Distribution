package typings.yandexMaps.global.ymaps

import typings.std.HTMLElement
import typings.yandexMaps.anon.AutoFitToViewport
import typings.yandexMaps.mod.IPanorama
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panorama {
  
  @JSGlobal("ymaps.panorama.Manager")
  @js.native
  class Manager ()
    extends typings.yandexMaps.mod.panorama.Manager
  
  @JSGlobal("ymaps.panorama.Player")
  @js.native
  class Player protected ()
    extends typings.yandexMaps.mod.panorama.Player {
    def this(element: String, panorama: IPanorama) = this()
    def this(element: HTMLElement, panorama: IPanorama) = this()
    def this(element: String, panorama: IPanorama, options: AutoFitToViewport) = this()
    def this(element: HTMLElement, panorama: IPanorama, options: AutoFitToViewport) = this()
  }
}
