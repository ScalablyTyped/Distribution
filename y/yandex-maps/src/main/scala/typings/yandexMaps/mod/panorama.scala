package typings.yandexMaps.mod

import typings.std.HTMLElement
import typings.yandexMaps.anon.AngularBBox
import typings.yandexMaps.anon.AutoFitToViewport
import typings.yandexMaps.anon.Direction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object panorama {
  
  @JSImport("yandex-maps", "panorama")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yandex-maps", "panorama.Base")
  @js.native
  open class Base ()
    extends StObject
       with IPanorama {
    
    /* CompleteClass */
    override def getAngularBBox(): js.Array[Double] = js.native
    
    /* CompleteClass */
    override def getConnectionArrows(): js.Array[IPanoramaConnectionArrow] = js.native
    
    /* CompleteClass */
    override def getConnectionMarkers(): js.Array[IPanoramaConnectionMarker] = js.native
    
    def getConnections(): js.Array[IPanoramaConnectionMarker] = js.native
    
    /* CompleteClass */
    override def getCoordSystem(): ICoordSystem = js.native
    
    /* CompleteClass */
    override def getDefaultDirection(): js.Array[Double] = js.native
    
    /* CompleteClass */
    override def getDefaultSpan(): js.Array[Double] = js.native
    
    /* CompleteClass */
    override def getGraph(): IPanoramaGraph | Null = js.native
    
    /* CompleteClass */
    override def getMarkers(): js.Array[IPanoramaMarker] = js.native
    
    /* CompleteClass */
    override def getName(): String = js.native
    
    /* CompleteClass */
    override def getPosition(): js.Array[Double] = js.native
    
    def getThoroughfares(): js.Array[IPanoramaConnectionArrow] = js.native
    
    /* CompleteClass */
    override def getTileLevels(): js.Array[IPanoramaTileLevel] = js.native
    
    /* CompleteClass */
    override def getTileSize(): js.Array[Double] = js.native
    
    def validate(): Unit = js.native
  }
  object Base {
    
    @JSImport("yandex-maps", "panorama.Base")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def createPanorama(params: AngularBBox): IPanorama = ^.asInstanceOf[js.Dynamic].applyDynamic("createPanorama")(params.asInstanceOf[js.Any]).asInstanceOf[IPanorama]
    
    /* static member */
    inline def getMarkerPositionFromDirection(panorama: IPanorama, direction: js.Array[Double], distance: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMarkerPositionFromDirection")(panorama.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  }
  
  @JSImport("yandex-maps", "panorama.Manager")
  @js.native
  open class Manager ()
    extends StObject
       with IEventEmitter {
    
    def closePlayer(): Unit = js.native
    
    def disableLookup(): Unit = js.native
    
    def enableLookup(): Unit = js.native
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    def getPlayer(): Player = js.native
    
    def isLookupEnabled(): Boolean = js.native
    
    def openPlayer(panorama: js.Array[IPanorama]): js.Promise[Unit] = js.native
    def openPlayer(panorama: Double): js.Promise[Unit] = js.native
  }
  
  @JSImport("yandex-maps", "panorama.Player")
  @js.native
  open class Player protected ()
    extends StObject
       with IEventEmitter {
    def this(element: String, panorama: IPanorama) = this()
    def this(element: HTMLElement, panorama: IPanorama) = this()
    def this(element: String, panorama: IPanorama, options: AutoFitToViewport) = this()
    def this(element: HTMLElement, panorama: IPanorama, options: AutoFitToViewport) = this()
    
    def destroy(): Unit = js.native
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    def fitToViewport(): Unit = js.native
    
    def getDirection(): js.Array[Double] = js.native
    
    def getPanorama(): IPanorama = js.native
    
    def getSpan(): js.Array[Double] = js.native
    
    def lookAt(point: js.Array[Double]): this.type = js.native
    
    def moveTo(point: js.Array[Double]): js.Promise[Unit] = js.native
    def moveTo(point: js.Array[Double], options: Direction): js.Promise[Unit] = js.native
    
    def setDirection(direction: String): this.type = js.native
    def setDirection(direction: js.Array[Double]): this.type = js.native
    
    def setPanorama(panorama: IPanorama): this.type = js.native
    
    def setSpan(span: String): this.type = js.native
    def setSpan(span: js.Array[Double]): this.type = js.native
  }
  
  inline def createPlayer(element: String, point: js.Array[Double]): js.Promise[Player] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPlayer")(element.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Player]]
  inline def createPlayer(element: String, point: js.Array[Double], options: Direction): js.Promise[Player] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPlayer")(element.asInstanceOf[js.Any], point.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Player]]
  inline def createPlayer(element: HTMLElement, point: js.Array[Double]): js.Promise[Player] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPlayer")(element.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Player]]
  inline def createPlayer(element: HTMLElement, point: js.Array[Double], options: Direction): js.Promise[Player] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPlayer")(element.asInstanceOf[js.Any], point.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Player]]
  
  inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
  
  inline def locate(point: js.Array[Double]): js.Promise[js.Array[IPanorama]] = ^.asInstanceOf[js.Dynamic].applyDynamic("locate")(point.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[IPanorama]]]
  inline def locate(point: js.Array[Double], options: typings.yandexMaps.anon.Layer): js.Promise[js.Array[IPanorama]] = (^.asInstanceOf[js.Dynamic].applyDynamic("locate")(point.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[IPanorama]]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.yandexMaps.yandexMapsStrings.yandexNumbersignpanorama
    - typings.yandexMaps.yandexMapsStrings.yandexNumbersignairPanorama
  */
  trait Layer extends StObject
  object Layer {
    
    inline def yandexNumbersignairPanorama: typings.yandexMaps.yandexMapsStrings.yandexNumbersignairPanorama = "yandex#airPanorama".asInstanceOf[typings.yandexMaps.yandexMapsStrings.yandexNumbersignairPanorama]
    
    inline def yandexNumbersignpanorama: typings.yandexMaps.yandexMapsStrings.yandexNumbersignpanorama = "yandex#panorama".asInstanceOf[typings.yandexMaps.yandexMapsStrings.yandexNumbersignpanorama]
  }
}
