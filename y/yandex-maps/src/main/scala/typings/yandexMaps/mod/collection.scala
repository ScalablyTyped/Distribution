package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collection {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.yandexMaps.mod.IEventEmitter because Already inherited
  - typings.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ @JSImport("yandex-maps", "collection.Item")
  @js.native
  class Item ()
    extends IChild[IControlParent]
       with IParentOnMap {
    def this(options: js.Object) = this()
    
    def onAddToMap(map: Map_): Unit = js.native
    
    def onRemoveFromMap(oldMap: Map_): Unit = js.native
    
    var options: IOptionManager = js.native
    
    def setParent(parent: IControlParent): this.type = js.native
  }
}
