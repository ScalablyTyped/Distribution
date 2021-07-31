package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.yandexMaps.mod.IEventEmitter because Already inherited
- typings.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ @js.native
trait IBehavior
  extends StObject
     with IChild[IControlParent] {
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  
  def isEnabled(): Boolean = js.native
  
  var options: IOptionManager = js.native
}
