package typings
package wonderDotJsLib.distEs2015CoreEntityObjectGameObjectGameObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/core/entityObject/gameObject/GameObject", "GameObject")
@js.native
class GameObject ()
  extends wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject {
  var children: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<GameObject> */ js.Any = js.native
  var isVisible: scala.Boolean = js.native
  @JSName("parent")
  var parent_GameObject: GameObject = js.native
  var renderGroup: scala.Double = js.native
  var renderPriority: scala.Double = js.native
  @JSName("transform")
  var transform_GameObject: wonderDotJsLib.distEs2015ComponentTransformThreeDTransformMod.ThreeDTransform = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/core/entityObject/gameObject/GameObject", "GameObject")
@js.native
object GameObject extends js.Object {
  def create(): wonderDotJsLib.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject = js.native
}

