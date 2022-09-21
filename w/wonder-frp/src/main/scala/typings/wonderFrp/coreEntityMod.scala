package typings.wonderFrp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreEntityMod {
  
  @JSImport("wonder-frp/dist/es2015/core/Entity", "Entity")
  @js.native
  abstract class Entity protected () extends StObject {
    def this(uidPre: String) = this()
    
    /* private */ var _uid: Any = js.native
    
    var uid: String = js.native
  }
  /* static members */
  object Entity {
    
    @JSImport("wonder-frp/dist/es2015/core/Entity", "Entity")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wonder-frp/dist/es2015/core/Entity", "Entity.UID")
    @js.native
    def UID: Double = js.native
    inline def UID_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UID")(x.asInstanceOf[js.Any])
  }
}
