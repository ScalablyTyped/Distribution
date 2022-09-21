package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collection {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.yandexMaps.mod.IEventEmitter because Already inherited
  - typings.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ @JSImport("yandex-maps", "collection.Item")
  @js.native
  open class Item ()
    extends StObject
       with IChild[IControlParent]
       with IParentOnMap {
    def this(options: js.Object) = this()
    
    /* CompleteClass */
    var events: IEventManager[js.Object] = js.native
    
    /* CompleteClass */
    override def getMap(): Map_ = js.native
    
    def onAddToMap(map: Map_): Unit = js.native
    
    def onRemoveFromMap(oldMap: Map_): Unit = js.native
    
    var options: IOptionManager = js.native
    
    def setParent(parent: IControlParent): this.type = js.native
  }
}
