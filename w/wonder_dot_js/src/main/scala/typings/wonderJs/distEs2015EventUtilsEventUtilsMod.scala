package typings.wonderJs

import typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015EventUtilsEventUtilsMod {
  
  @JSImport("wonder.js/dist/es2015/event/utils/EventUtils", "EventUtils")
  @js.native
  open class EventUtils () extends StObject
  /* static members */
  object EventUtils {
    
    @JSImport("wonder.js/dist/es2015/event/utils/EventUtils", "EventUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isEntityObject(arg: EntityObject): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEntityObject")(arg.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isEvent(arg: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEvent")(arg.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
