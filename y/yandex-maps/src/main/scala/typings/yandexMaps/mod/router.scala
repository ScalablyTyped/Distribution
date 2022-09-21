package typings.yandexMaps.mod

import typings.yandexMaps.anon.AddViaPoints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object router {
  
  @JSImport("yandex-maps", "router.Editor")
  @js.native
  open class Editor ()
    extends StObject
       with ICustomizable {
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    /* CompleteClass */
    var options: IOptionManager = js.native
    
    def start(): Unit = js.native
    def start(options: AddViaPoints): Unit = js.native
    
    def stop(): Unit = js.native
  }
  
  @JSImport("yandex-maps", "router.Route")
  @js.native
  abstract class Route ()
    extends StObject
       with IGeoObject[IGeometry] {
    
    var editor: Editor = js.native
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    def getHumanJamsTime(): String = js.native
    
    def getHumanLength(): String = js.native
    
    def getHumanTime(): String = js.native
    
    def getJamsTime(): Double = js.native
    
    def getLength(): Double = js.native
    
    /* CompleteClass */
    override def getMap(): Map_ = js.native
    
    def getPaths(): GeoObjectCollection = js.native
    
    def getTime(): Double = js.native
    
    def getViaPoints(): GeoObjectCollection = js.native
    
    def getWayPoints(): GeoObjectCollection = js.native
    
    def setParent(parent: IControlParent): this.type = js.native
  }
}
