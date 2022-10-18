package typings.wonderFrp.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("wonder-frp/dist/es2015", "Entity")
@js.native
open class Entity protected ()
  extends typings.wonderFrp.distEs2015CoreEntityMod.Entity {
  def this(uidPre: String) = this()
}
/* static members */
object Entity {
  
  @JSImport("wonder-frp/dist/es2015", "Entity")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wonder-frp/dist/es2015", "Entity.UID")
  @js.native
  def UID: Double = js.native
  inline def UID_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UID")(x.asInstanceOf[js.Any])
}
