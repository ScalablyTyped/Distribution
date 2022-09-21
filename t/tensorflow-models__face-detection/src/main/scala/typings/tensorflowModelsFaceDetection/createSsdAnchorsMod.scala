package typings.tensorflowModelsFaceDetection

import typings.tensorflowModelsFaceDetection.configInterfacesMod.AnchorConfig
import typings.tensorflowModelsFaceDetection.shapeInterfacesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createSsdAnchorsMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/calculators/create_ssd_anchors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSsdAnchors(config: AnchorConfig): js.Array[Rect] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSsdAnchors")(config.asInstanceOf[js.Any]).asInstanceOf[js.Array[Rect]]
}
