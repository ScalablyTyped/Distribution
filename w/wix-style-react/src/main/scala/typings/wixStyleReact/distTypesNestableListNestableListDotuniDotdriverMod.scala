package typings.wixStyleReact

import typings.wixStyleReact.anon.ActionIndex
import typings.wixStyleReact.distTypesNestableListBaseNestableListBaseDotuniDotdriverMod.NestableListBaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNestableListNestableListDotuniDotdriverMod {
  
  trait NestableItemDetails extends StObject {
    
    var dataHook: String
    
    var depthLevel: Double
  }
  object NestableItemDetails {
    
    inline def apply(dataHook: String, depthLevel: Double): NestableItemDetails = {
      val __obj = js.Dynamic.literal(dataHook = dataHook.asInstanceOf[js.Any], depthLevel = depthLevel.asInstanceOf[js.Any])
      __obj.asInstanceOf[NestableItemDetails]
    }
    
    extension [Self <: NestableItemDetails](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDepthLevel(value: Double): Self = StObject.set(x, "depthLevel", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NestableListUniDriver
    extends StObject
       with NestableListBaseUniDriver {
    
    def changeItemDepth(itemDetails: NestableItemDetails): js.Promise[Unit] = js.native
    
    def clickActionAt(pointer: ActionIndex): js.Promise[Unit] = js.native
    
    def getActionLabelAt(pointer: ActionIndex): js.Promise[String] = js.native
    
    def getActionsCount(): js.Promise[Double] = js.native
    def getActionsCount(dataHook: String): js.Promise[Double] = js.native
    
    def hoverActionsContainer(): js.Promise[Unit] = js.native
    def hoverActionsContainer(parentDataHook: String): js.Promise[Unit] = js.native
  }
}
