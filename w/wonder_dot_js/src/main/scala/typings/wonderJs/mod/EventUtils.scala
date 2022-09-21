package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "EventUtils")
@js.native
open class EventUtils ()
  extends typings.wonderJs.eventUtilsMod.EventUtils
/* static members */
object EventUtils {
  
  @JSImport("wonder.js/dist/es2015", "EventUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isEntityObject(arg: typings.wonderJs.entityObjectMod.EntityObject): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEntityObject")(arg.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEvent(arg: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEvent")(arg.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
