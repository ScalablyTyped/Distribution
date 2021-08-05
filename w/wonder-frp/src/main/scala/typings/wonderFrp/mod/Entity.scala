package typings.wonderFrp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "Entity")
@js.native
abstract class Entity protected ()
  extends typings.wonderFrp.entityMod.Entity {
  def this(uidPre: String) = this()
}
/* static members */
object Entity {
  
  @JSImport("wonder-frp/dist/commonjs", "Entity")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wonder-frp/dist/commonjs", "Entity.UID")
  @js.native
  def UID: Double = js.native
  inline def UID_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UID")(x.asInstanceOf[js.Any])
}
