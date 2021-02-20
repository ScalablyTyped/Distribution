package typings.yandexMaps.mod

import typings.yandexMaps.mod.clusterer.Hint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.yandexMaps.mod.IEventEmitter because Already inherited
- typings.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ @JSImport("yandex-maps", "Clusterer")
@js.native
class Clusterer_ ()
  extends IChild[IControlParent]
     with IParentOnMap {
  def this(options: IClustererOptions) = this()
  
  var balloon: typings.yandexMaps.mod.clusterer.Balloon = js.native
  
  //     balloonopen:
  var hint: Hint = js.native
  
  var options: IOptionManager = js.native
  
  def setParent(parent: IControlParent): this.type = js.native
}
