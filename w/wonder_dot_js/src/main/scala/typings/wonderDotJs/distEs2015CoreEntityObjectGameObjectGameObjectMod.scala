package typings.wonderDotJs

import typings.wonderDotJs.distEs2015ComponentTransformThreeDTransformMod.ThreeDTransform
import typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject
import typings.wonderDotJs.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/core/entityObject/gameObject/GameObject", JSImport.Namespace)
@js.native
object distEs2015CoreEntityObjectGameObjectGameObjectMod extends js.Object {
  @js.native
  class GameObject () extends EntityObject {
    var children: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<GameObject> */ js.Any = js.native
    var isVisible: Boolean = js.native
    @JSName("parent")
    var parent_GameObject: GameObject = js.native
    var renderGroup: Double = js.native
    var renderPriority: Double = js.native
    @JSName("transform")
    var transform_GameObject: ThreeDTransform = js.native
  }
  
  /* static members */
  @js.native
  object GameObject extends js.Object {
    def create(): GameObject = js.native
  }
  
}

