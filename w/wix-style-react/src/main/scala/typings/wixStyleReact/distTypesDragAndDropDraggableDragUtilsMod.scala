package typings.wixStyleReact

import typings.wixStyleReact.anon.ClientOffset
import typings.wixStyleReact.anon.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDragAndDropDraggableDragUtilsMod {
  
  @JSImport("wix-style-react/dist/types/DragAndDrop/Draggable/DragUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dragCoordinates(param0: Component): ClientOffset = ^.asInstanceOf[js.Dynamic].applyDynamic("dragCoordinates")(param0.asInstanceOf[js.Any]).asInstanceOf[ClientOffset]
  
  inline def getEmptyImage(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getEmptyImage")().asInstanceOf[Any]
}
