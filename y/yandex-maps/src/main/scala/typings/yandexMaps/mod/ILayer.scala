package typings.yandexMaps.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.yandexMaps.mod.IEventEmitter because Already inherited
- typings.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ @js.native
trait ILayer
  extends StObject
     with IChild[IControlParent] {
  
  var getBrightness: js.UndefOr[js.Function0[Double]] = js.native
  
  var getCopyrights: js.UndefOr[
    js.Function2[
      /* coords */ js.Array[Double], 
      /* zoom */ Double, 
      js.Promise[js.Array[String | HTMLElement]]
    ]
  ] = js.native
  
  var getZoomRange: js.UndefOr[js.Function1[/* point */ js.Array[Double], js.Promise[js.Array[Double]]]] = js.native
  
  var options: IOptionManager = js.native
}
