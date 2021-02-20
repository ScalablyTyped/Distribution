package typings.three

import typings.three.polyfillsMod.TypedArray
import typings.three.textureMod.Texture
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTexture2DArrayMod {
  
  @JSImport("three/src/textures/DataTexture2DArray", "DataTexture2DArray")
  @js.native
  class DataTexture2DArray protected () extends Texture {
    def this(data: TypedArray, width: Double, height: Double, depth: Double) = this()
    
    val isDataTexture2DArray: `true` = js.native
    
    /**
    	 * @default THREE.ClampToEdgeWrapping
    	 */
    var wrapR: Boolean = js.native
  }
}
