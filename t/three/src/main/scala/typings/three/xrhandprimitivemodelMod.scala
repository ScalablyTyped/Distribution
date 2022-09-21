package typings.three

import typings.three.threeMod.Group
import typings.three.threeMod.Texture
import typings.three.threeStrings.box
import typings.three.threeStrings.sphere
import typings.three.xrhandmodelfactoryMod.XRHandModel
import typings.three.xrhandmodelfactoryMod.XRHandModelHandedness
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xrhandprimitivemodelMod {
  
  @JSImport("three/examples/jsm/webxr/XRHandPrimitiveModel", "XRHandPrimitiveModel")
  @js.native
  open class XRHandPrimitiveModel protected () extends StObject {
    def this(
      handModel: XRHandModel,
      controller: Group,
      path: String,
      handedness: XRHandModelHandedness,
      options: XRHandPrimitiveModelOptions
    ) = this()
    
    var controller: Group = js.native
    
    var envMap: Texture | Null = js.native
    
    var handMesh: Group = js.native
    
    var handModel: XRHandModel = js.native
    
    def updateMesh(): Unit = js.native
  }
  
  trait XRHandPrimitiveModelOptions extends StObject {
    
    var primitive: js.UndefOr[sphere | box] = js.undefined
  }
  object XRHandPrimitiveModelOptions {
    
    inline def apply(): XRHandPrimitiveModelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XRHandPrimitiveModelOptions]
    }
    
    extension [Self <: XRHandPrimitiveModelOptions](x: Self) {
      
      inline def setPrimitive(value: sphere | box): Self = StObject.set(x, "primitive", value.asInstanceOf[js.Any])
      
      inline def setPrimitiveUndefined: Self = StObject.set(x, "primitive", js.undefined)
    }
  }
}
