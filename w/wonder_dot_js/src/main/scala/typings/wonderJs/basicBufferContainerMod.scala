package typings.wonderJs

import typings.wonderJs.commonBufferContainerMod.CommonBufferContainer
import typings.wonderJs.gameObjectMod.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/geometry/data/BasicBufferContainer", JSImport.Namespace)
@js.native
object basicBufferContainerMod extends js.Object {
  @js.native
  class BasicBufferContainer () extends CommonBufferContainer
  
  /* static members */
  @js.native
  object BasicBufferContainer extends js.Object {
    def create(entityObject: GameObject): BasicBufferContainer = js.native
  }
  
}

