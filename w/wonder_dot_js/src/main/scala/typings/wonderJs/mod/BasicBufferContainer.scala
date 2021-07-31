package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "BasicBufferContainer")
@js.native
class BasicBufferContainer protected ()
  extends typings.wonderJs.basicBufferContainerMod.BasicBufferContainer {
  def this(entityObject: typings.wonderJs.gameObjectMod.GameObject) = this()
}
/* static members */
object BasicBufferContainer {
  
  @JSImport("wonder.js/dist/es2015", "BasicBufferContainer")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(entityObject: typings.wonderJs.gameObjectMod.GameObject): typings.wonderJs.basicBufferContainerMod.BasicBufferContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(entityObject.asInstanceOf[js.Any]).asInstanceOf[typings.wonderJs.basicBufferContainerMod.BasicBufferContainer]
}
