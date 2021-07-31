package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geoObject {
  
  @JSImport("yandex-maps", "geoObject.Balloon")
  @js.native
  class Balloon protected ()
    extends StObject
       with IBalloonManager[GeoObject_[IGeometry, js.Object]] {
    def this(geoObject: GeoObject_[IGeometry, js.Object]) = this()
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
  }
  
  @JSImport("yandex-maps", "geoObject.Hint")
  @js.native
  class Hint protected ()
    extends StObject
       with IPopupManager[GeoObject_[IGeometry, js.Object]] {
    def this(geoObject: GeoObject_[IGeometry, js.Object]) = this()
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.yandexMaps.mod.IEventEmitter because Already inherited
  - typings.yandexMaps.mod.IParentOnMap because Already inherited
  - typings.yandexMaps.mod.ICustomizable because Already inherited
  - typings.yandexMaps.mod.IGeoObjectSequence because var conflicts: events, options. Inlined each, each, get, getBounds, getIterator, getLength, getPixelBounds, indexOf */ @JSImport("yandex-maps", "geoObject.Sequence")
  @js.native
  class Sequence protected ()
    extends StObject
       with IGeoObject[IGeometry] {
    def this(geoObject: GeoObject_[IGeometry, js.Object]) = this()
    
    def each(callback: js.Function1[/* geoObject */ IGeoObject[IGeometry], Unit]): Unit = js.native
    def each(callback: js.Function1[/* geoObject */ IGeoObject[IGeometry], Unit], context: js.Object): Unit = js.native
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    def get(index: Double): IGeoObject[IGeometry] = js.native
    
    def getBounds(): js.Array[js.Array[Double]] | Null = js.native
    
    def getIterator(): IIterator = js.native
    
    def getLength(): Double = js.native
    
    /* CompleteClass */
    override def getMap(): Map_ = js.native
    
    def getPixelBounds(): js.Array[js.Array[Double]] | Null = js.native
    
    def indexOf(geoObject: IGeoObject[IGeometry]): Double = js.native
    
    def setParent(parent: IControlParent): this.type = js.native
  }
}
