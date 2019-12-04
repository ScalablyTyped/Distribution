package typings.wonderDotJs

import typings.wonderDotJs.distEs2015ComponentTransformETransformStateMod.ETransformState
import typings.wonderDotJs.distEs2015ComponentTransformTransformMod.Transform
import typings.wonderDotJs.distEs2015CoreComponentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/transform/Transform", JSImport.Namespace)
@js.native
object distEs2015ComponentTransformTransformMod extends js.Object {
  @js.native
  abstract class Transform () extends Component {
    var children: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<Transform> */ js.Any = js.native
    var dirtyLocal: Boolean = js.native
    var isLocalRotate: Boolean = js.native
    var isLocalScale: Boolean = js.native
    var isLocalTranslate: Boolean = js.native
    var isRotate: Boolean = js.native
    var isScale: Boolean = js.native
    var isTransform: Boolean = js.native
    var isTranslate: Boolean = js.native
    var p_parent: Transform = js.native
    var parent: Transform = js.native
    def addChild(child: Transform): Unit = js.native
    /* protected */ def clearCache(): Unit = js.native
    /* protected */ def getMatrix[T](syncMethod: String, matrixAttriName: String): T = js.native
    /* protected */ def handleWhenSetTransformState(): Unit = js.native
    /* protected */ def handleWhenSetTransformState(transformState: ETransformState): Unit = js.native
    def removeChild(child: Transform): Unit = js.native
    def setChildrenTransformState(state: Boolean): js.Any = js.native
    def setChildrenTransformState(transformState: ETransformState, state: Boolean): js.Any = js.native
    /* protected */ def setParent(parent: Transform): Unit = js.native
  }
  
}

