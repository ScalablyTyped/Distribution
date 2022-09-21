package typings.wonderJs

import typings.wonderJs.componentMod.Component
import typings.wonderJs.etransformstateMod.ETransformState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformMod {
  
  @JSImport("wonder.js/dist/es2015/component/transform/Transform", "Transform")
  @js.native
  abstract class Transform () extends Component {
    
    def addChild(child: Transform): Unit = js.native
    
    /* protected */ var children: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<Transform> */ Any = js.native
    
    /* protected */ def clearCache(): Unit = js.native
    
    var dirtyLocal: Boolean = js.native
    
    /* protected */ def getMatrix[T](syncMethod: String, matrixAttriName: String): T = js.native
    
    /* protected */ def handleWhenSetTransformState(): Unit = js.native
    /* protected */ def handleWhenSetTransformState(transformState: ETransformState): Unit = js.native
    
    var isLocalRotate: Boolean = js.native
    
    var isLocalScale: Boolean = js.native
    
    var isLocalTranslate: Boolean = js.native
    
    var isRotate: Boolean = js.native
    
    var isScale: Boolean = js.native
    
    var isTransform: Boolean = js.native
    
    var isTranslate: Boolean = js.native
    
    /* protected */ var p_parent: Transform = js.native
    
    var parent: Transform = js.native
    
    def removeChild(child: Transform): Unit = js.native
    
    def setChildrenTransformState(state: Boolean): Any = js.native
    def setChildrenTransformState(transformState: ETransformState, state: Boolean): Any = js.native
    
    /* protected */ def setParent(parent: Transform): Unit = js.native
  }
}
