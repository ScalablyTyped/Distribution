package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTexturesTypesMod {
  
  trait Texture3DImageData
    extends StObject
       with TextureImageData {
    
    val depth: Double
  }
  object Texture3DImageData {
    
    inline def apply(data: js.typedarray.Uint8ClampedArray, depth: Double, height: Double, width: Double): Texture3DImageData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Texture3DImageData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Texture3DImageData] (val x: Self) extends AnyVal {
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextureImageData extends StObject {
    
    val data: js.typedarray.Uint8ClampedArray
    
    val height: Double
    
    val width: Double
  }
  object TextureImageData {
    
    inline def apply(data: js.typedarray.Uint8ClampedArray, height: Double, width: Double): TextureImageData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextureImageData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextureImageData] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
