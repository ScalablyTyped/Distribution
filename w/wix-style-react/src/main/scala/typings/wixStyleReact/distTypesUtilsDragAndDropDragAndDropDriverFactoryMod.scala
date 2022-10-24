package typings.wixStyleReact

import typings.wixStyleReact.anon.Base
import typings.wixStyleReact.anon.BeginDrag
import typings.wixStyleReact.anon.DepthLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsDragAndDropDragAndDropDriverFactoryMod {
  
  @JSImport("wix-style-react/dist/types/utils/DragAndDrop/dragAndDropDriverFactory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def changeItemDepth(param0: DepthLevel): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("changeItemDepth")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def dragAndDropDriverFactory(param0: Base): BeginDrag = ^.asInstanceOf[js.Dynamic].applyDynamic("dragAndDropDriverFactory")(param0.asInstanceOf[js.Any]).asInstanceOf[BeginDrag]
}
