package typings.wonderJs

import typings.wonderJs.entityObjectMod.EntityObject
import typings.wonderJs.threeDTransformMod.ThreeDTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gameObjectMod {
  
  @JSImport("wonder.js/dist/es2015/core/entityObject/gameObject/GameObject", "GameObject")
  @js.native
  class GameObject () extends EntityObject {
    
    var children: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<GameObject> */ js.Any = js.native
    
    var isVisible: Boolean = js.native
    
    @JSName("parent")
    var parent_GameObject: GameObject = js.native
    
    var renderGroup: Double = js.native
    
    var renderPriority: Double = js.native
    
    @JSName("transform")
    var transform_GameObject: ThreeDTransform = js.native
  }
  /* static members */
  object GameObject {
    
    @JSImport("wonder.js/dist/es2015/core/entityObject/gameObject/GameObject", "GameObject")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(): GameObject = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[GameObject]
  }
}
