package typings
package wonderDotJsLib.distEs2015ComponentTransformTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/transform/Transform", "Transform")
@js.native
abstract class Transform ()
  extends wonderDotJsLib.distEs2015CoreComponentMod.Component {
  var children: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<Transform> */ js.Any = js.native
  var dirtyLocal: scala.Boolean = js.native
  var isLocalRotate: scala.Boolean = js.native
  var isLocalScale: scala.Boolean = js.native
  var isLocalTranslate: scala.Boolean = js.native
  var isRotate: scala.Boolean = js.native
  var isScale: scala.Boolean = js.native
  var isTransform: scala.Boolean = js.native
  var isTranslate: scala.Boolean = js.native
  var p_parent: Transform = js.native
  var parent: Transform = js.native
  def addChild(child: Transform): scala.Unit = js.native
  /* protected */ def clearCache(): scala.Unit = js.native
  /* protected */ def getMatrix[T](syncMethod: java.lang.String, matrixAttriName: java.lang.String): T = js.native
  /* protected */ def handleWhenSetTransformState(): scala.Unit = js.native
  /* protected */ def handleWhenSetTransformState(transformState: wonderDotJsLib.distEs2015ComponentTransformETransformStateMod.ETransformState): scala.Unit = js.native
  def removeChild(child: Transform): scala.Unit = js.native
  def setChildrenTransformState(state: scala.Boolean): js.Any = js.native
  def setChildrenTransformState(
    transformState: wonderDotJsLib.distEs2015ComponentTransformETransformStateMod.ETransformState,
    state: scala.Boolean
  ): js.Any = js.native
  /* protected */ def setParent(parent: Transform): scala.Unit = js.native
}

