package typings.three

import typings.std.BufferSource
import typings.three.srcConstantsMod.Wrapping
import typings.three.srcTexturesTextureMod.Texture
import typings.three.srcTexturesTypesMod.Texture3DImageData
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTexturesData3DTextureMod {
  
  @JSImport("three/src/textures/Data3DTexture", "Data3DTexture")
  @js.native
  /**
    * Create a new instance of {@link Data3DTexture}
    * @param data {@link https://developer.mozilla.org/en-US/docs/Web/API/ArrayBufferView | ArrayBufferView} of the texture. Default `null`.
    * @param width Width of the texture. Default `1`.
    * @param height Height of the texture. Default `1`.
    * @param depth Depth of the texture. Default `1`.
    */
  open class Data3DTexture () extends Texture {
    def this(data: BufferSource) = this()
    def this(data: Null, width: Double) = this()
    def this(data: Unit, width: Double) = this()
    def this(data: BufferSource, width: Double) = this()
    def this(data: Null, width: Double, height: Double) = this()
    def this(data: Null, width: Unit, height: Double) = this()
    def this(data: Unit, width: Double, height: Double) = this()
    def this(data: Unit, width: Unit, height: Double) = this()
    def this(data: BufferSource, width: Double, height: Double) = this()
    def this(data: BufferSource, width: Unit, height: Double) = this()
    def this(data: Null, width: Double, height: Double, depth: Double) = this()
    def this(data: Null, width: Double, height: Unit, depth: Double) = this()
    def this(data: Null, width: Unit, height: Double, depth: Double) = this()
    def this(data: Null, width: Unit, height: Unit, depth: Double) = this()
    def this(data: Unit, width: Double, height: Double, depth: Double) = this()
    def this(data: Unit, width: Double, height: Unit, depth: Double) = this()
    def this(data: Unit, width: Unit, height: Double, depth: Double) = this()
    def this(data: Unit, width: Unit, height: Unit, depth: Double) = this()
    def this(data: BufferSource, width: Double, height: Double, depth: Double) = this()
    def this(data: BufferSource, width: Double, height: Unit, depth: Double) = this()
    def this(data: BufferSource, width: Unit, height: Double, depth: Double) = this()
    def this(data: BufferSource, width: Unit, height: Unit, depth: Double) = this()
    
    def image_=(data: Texture3DImageData): Unit = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link Data3DTexture}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isData3DTexture: `true` = js.native
    
    /**
      * @override
      * @defaultValue {@link THREE.ClampToEdgeWrapping}
      */
    var wrapR: Wrapping = js.native
  }
}
