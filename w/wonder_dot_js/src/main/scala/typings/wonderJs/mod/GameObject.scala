package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "GameObject")
@js.native
open class GameObject ()
  extends typings.wonderJs.gameObjectMod.GameObject
/* static members */
object GameObject {
  
  @JSImport("wonder.js/dist/es2015", "GameObject")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): typings.wonderJs.gameObjectMod.GameObject = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.wonderJs.gameObjectMod.GameObject]
}
