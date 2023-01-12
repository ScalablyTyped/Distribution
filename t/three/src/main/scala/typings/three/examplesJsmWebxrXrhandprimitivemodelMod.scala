package typings.three

import typings.three.examplesJsmWebxrXrhandmodelfactoryMod.XRHandModel
import typings.three.examplesJsmWebxrXrhandmodelfactoryMod.XRHandModelHandedness
import typings.three.srcThreeMod.Group
import typings.three.srcThreeMod.Texture
import typings.three.threeStrings.box
import typings.three.threeStrings.sphere
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmWebxrXrhandprimitivemodelMod {
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XRHandPrimitiveModelOptions] (val x: Self) extends AnyVal {
      
      inline def setPrimitive(value: sphere | box): Self = StObject.set(x, "primitive", value.asInstanceOf[js.Any])
      
      inline def setPrimitiveUndefined: Self = StObject.set(x, "primitive", js.undefined)
    }
  }
}
