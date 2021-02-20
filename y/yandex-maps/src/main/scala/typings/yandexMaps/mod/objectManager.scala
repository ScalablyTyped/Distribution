package typings.yandexMaps.mod

import typings.yandexMaps.mod.option.Manager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectManager {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.yandexMaps.mod.IEventEmitter because Already inherited
  - typings.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ @JSImport("yandex-maps", "objectManager.ObjectCollection")
  @js.native
  class ObjectCollection () extends ICollection {
    
    def getById(): js.Object | Null = js.native
    def getById(id: String): js.Object | Null = js.native
    
    var options: IOptionManager | Manager = js.native
  }
}
