package typings.yandexMaps.mod

import typings.std.HTMLElement
import typings.yandexMaps.anon.BalloonAutoPan
import typings.yandexMaps.mod.option.Manager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectManager {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof yandex-maps.yandex-maps.IBalloonManager<yandex-maps.yandex-maps.map.Balloon>, 'open'> ]: yandex-maps.yandex-maps.IBalloonManager<yandex-maps.yandex-maps.map.Balloon>[P]} */ @JSImport("yandex-maps", "objectManager.Balloon")
  @js.native
  open class Balloon () extends StObject {
    
    def autoPan(): js.Promise[BalloonAutoPan] = js.native
    
    def close(): js.Promise[BalloonAutoPan] = js.native
    def close(force: Boolean): js.Promise[BalloonAutoPan] = js.native
    
    def destroy(): Unit = js.native
    
    var events: IEventManager[js.Object] = js.native
    
    def getData(): js.Object | Null = js.native
    
    def getOptions(): IOptionManager | Null = js.native
    
    def getOverlay(): js.Promise[IOverlay | Null] = js.native
    
    def getOverlaySync(): IOverlay | Null = js.native
    
    def getPosition(): js.Array[Double] | Null = js.native
    
    def isOpen(): Boolean = js.native
    
    def open(objectId: String): js.Promise[BalloonAutoPan] = js.native
    def open(objectId: String, anchorPixelPosition: Boolean): js.Promise[BalloonAutoPan] = js.native
    def open(objectId: js.Object): js.Promise[BalloonAutoPan] = js.native
    def open(objectId: js.Object, anchorPixelPosition: Boolean): js.Promise[BalloonAutoPan] = js.native
    
    def setData(data: String): js.Promise[BalloonAutoPan] = js.native
    def setData(data: js.Object): js.Promise[BalloonAutoPan] = js.native
    def setData(data: HTMLElement): js.Promise[BalloonAutoPan] = js.native
    
    def setOptions(options: js.Object): js.Promise[BalloonAutoPan] = js.native
    
    def setPosition(position: js.Array[Double]): js.Promise[BalloonAutoPan] = js.native
  }
  
  @JSImport("yandex-maps", "objectManager.ClusterCollection")
  @js.native
  open class ClusterCollection ()
    extends StObject
       with ICustomizable {
    
    var balloon: typings.yandexMaps.anon.Balloon = js.native
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    def getAll(): js.Array[js.Object] = js.native
    
    def getById(): Cluster | Null = js.native
    def getById(id: String): Cluster | Null = js.native
    
    def getIterator(): IIterator = js.native
    
    def getLength(): Double = js.native
    
    def getObjectManager(): ObjectManager_ = js.native
    
    var hint: typings.yandexMaps.anon.Hint = js.native
    
    /* CompleteClass */
    var options: IOptionManager = js.native
    @JSName("options")
    var options_ClusterCollection: Manager = js.native
    
    def setClusterOptions(objectId: String, options: js.Object): ObjectCollection = js.native
    
    var state: typings.yandexMaps.mod.data.Manager = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof yandex-maps.yandex-maps.IHintManager<yandex-maps.yandex-maps.map.Hint>, 'open'> ]: yandex-maps.yandex-maps.IHintManager<yandex-maps.yandex-maps.map.Hint>[P]} */ @JSImport("yandex-maps", "objectManager.Hint")
  @js.native
  open class Hint () extends StObject {
    
    def close(): js.Promise[typings.yandexMaps.mod.map.Hint] = js.native
    def close(force: Boolean): js.Promise[typings.yandexMaps.mod.map.Hint] = js.native
    
    def destroy(): Unit = js.native
    
    var events: IEventManager[js.Object] = js.native
    
    def getData(): js.Object | Null = js.native
    
    def getOptions(): IOptionManager | Null = js.native
    
    def getOverlay(): js.Promise[IOverlay | Null] = js.native
    
    def getOverlaySync(): IOverlay | Null = js.native
    
    def getPosition(): js.Array[Double] | Null = js.native
    
    def isOpen(): Boolean = js.native
    
    def open(objectId: String): js.Promise[typings.yandexMaps.mod.map.Hint] = js.native
    def open(objectId: String, position: js.Array[Double]): js.Promise[typings.yandexMaps.mod.map.Hint] = js.native
    def open(objectId: js.Object): js.Promise[typings.yandexMaps.mod.map.Hint] = js.native
    def open(objectId: js.Object, position: js.Array[Double]): js.Promise[typings.yandexMaps.mod.map.Hint] = js.native
    
    def setData(data: String): js.Promise[typings.yandexMaps.mod.map.Hint] = js.native
    def setData(data: js.Object): js.Promise[typings.yandexMaps.mod.map.Hint] = js.native
    def setData(data: HTMLElement): js.Promise[typings.yandexMaps.mod.map.Hint] = js.native
    
    def setOptions(options: js.Object): js.Promise[typings.yandexMaps.mod.map.Hint] = js.native
    
    def setPosition(position: js.Array[Double]): js.Promise[typings.yandexMaps.mod.map.Hint] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.yandexMaps.mod.IEventEmitter because Already inherited
  - typings.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ @JSImport("yandex-maps", "objectManager.ObjectCollection")
  @js.native
  open class ObjectCollection ()
    extends StObject
       with ICollection {
    
    /* CompleteClass */
    override def add(`object`: js.Object): this.type = js.native
    
    def each(callback: js.Function1[/* object */ js.Object, Unit]): Unit = js.native
    def each(callback: js.Function1[/* object */ js.Object, Unit], context: js.Object): Unit = js.native
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    def getById(): js.Object | Null = js.native
    def getById(id: String): js.Object | Null = js.native
    
    /* CompleteClass */
    override def getIterator(): IIterator = js.native
    
    var options: IOptionManager | Manager = js.native
    
    /* CompleteClass */
    override def remove(`object`: js.Object): this.type = js.native
    
    def setObjectOptions(objectId: String, options: js.Object): ObjectCollection = js.native
  }
}
