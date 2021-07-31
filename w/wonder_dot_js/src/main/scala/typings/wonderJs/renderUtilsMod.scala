package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderUtilsMod {
  
  @JSImport("wonder.js/dist/es2015/utils/RenderUtils", "RenderUtils")
  @js.native
  class RenderUtils () extends StObject
  /* static members */
  object RenderUtils {
    
    @JSImport("wonder.js/dist/es2015/utils/RenderUtils", "RenderUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getGameObjectRenderList(
      sourceList: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<GameObject> */ js.Any
    ): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getGameObjectRenderList")(sourceList.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
}
