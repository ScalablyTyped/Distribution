package typings.three

import typings.std.BufferSource
import typings.three.srcTexturesTextureMod.Texture
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTexturesDataArrayTextureMod {
  
  @JSImport("three/src/textures/DataArrayTexture", "DataArrayTexture")
  @js.native
  open class DataArrayTexture () extends Texture {
    def this(data: BufferSource) = this()
    def this(data: Unit, width: Double) = this()
    def this(data: BufferSource, width: Double) = this()
    def this(data: Unit, width: Double, height: Double) = this()
    def this(data: Unit, width: Unit, height: Double) = this()
    def this(data: BufferSource, width: Double, height: Double) = this()
    def this(data: BufferSource, width: Unit, height: Double) = this()
    def this(data: Unit, width: Double, height: Double, depth: Double) = this()
    def this(data: Unit, width: Double, height: Unit, depth: Double) = this()
    def this(data: Unit, width: Unit, height: Double, depth: Double) = this()
    def this(data: Unit, width: Unit, height: Unit, depth: Double) = this()
    def this(data: BufferSource, width: Double, height: Double, depth: Double) = this()
    def this(data: BufferSource, width: Double, height: Unit, depth: Double) = this()
    def this(data: BufferSource, width: Unit, height: Double, depth: Double) = this()
    def this(data: BufferSource, width: Unit, height: Unit, depth: Double) = this()
    
    val isDataArrayTexture: `true` = js.native
    
    /**
      * @default THREE.ClampToEdgeWrapping
      */
    var wrapR: Boolean = js.native
  }
}
