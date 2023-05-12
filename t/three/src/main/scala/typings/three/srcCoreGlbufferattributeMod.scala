package typings.three

import typings.std.GLenum
import typings.std.WebGLBuffer
import typings.three.threeBooleans.`true`
import typings.three.threeInts.`1`
import typings.three.threeInts.`2`
import typings.three.threeInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreGlbufferattributeMod {
  
  @JSImport("three/src/core/GLBufferAttribute", "GLBufferAttribute")
  @js.native
  open class GLBufferAttribute protected () extends StObject {
    /**
      * This creates a new GLBufferAttribute object.
      * @param buffer Must be a {@link https://developer.mozilla.org/en-US/docs/Web/API/WebGLBuffer | WebGLBuffer}. See {@link GLBufferAttribute.buffer | .buffer}
      * @param type One of {@link https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#Data_types | WebGL Data Types}. See {@link GLBufferAttribute.type | .type}
      * @param itemSize How many values make up each item (vertex). See {@link GLBufferAttribute.itemSize | .itemSize}
      * @param elementSize `1`, `2` or `4`. The corresponding size (in bytes) for the given {@link type} param. See {@link GLBufferAttribute.elementSize | .elementSize}
      * @param count The expected number of vertices in VBO. See {@link GLBufferAttribute.count | .count}
      */
    def this(buffer: WebGLBuffer, `type`: GLenum, itemSize: Double, elementSize: `1` | `2` | `4`, count: Double) = this()
    
    /**
      * The current {@link https://developer.mozilla.org/en-US/docs/Web/API/WebGLBuffer | WebGLBuffer} instance.
      */
    var buffer: WebGLBuffer = js.native
    
    /**
      * The expected number of vertices in VBO.
      * @remarks Expects a `Integer`
      */
    var count: Double = js.native
    
    /**
      * Stores the corresponding size in bytes for the current {@link type | .type} property value.
      *
      * The corresponding size (_in bytes_) for the given "type" param.
      * #### WebGL Data Type (`GLenum`)
      * - gl.BYTE: 1
      * - gl.UNSIGNED_BYTE: 1
      * - gl.SHORT: 2
      * - gl.UNSIGNED_SHORT: 2
      * - gl.INT: 4
      * - gl.UNSIGNED_INT: 4
      * - gl.FLOAT: 4
      * @remarks Set this property together with {@link type | .type}. The recommended way is using the {@link setType | .setType} method.
      * @see `constructor`` for a list of known type sizes.
      * @remarks Expects a `1`, `2` or `4`
      */
    var elementSize: `1` | `2` | `4` = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link GLBufferAttribute}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isGLBufferAttribute: `true` = js.native
    
    /**
      * How many values make up each item (vertex).
      * @remarks The number of values of the array that should be associated with a particular vertex.
      * For instance, if this attribute is storing a 3-component vector (such as a position, normal, or color), then itemSize should be 3.
      * @remarks Expects a `Integer`
      */
    var itemSize: Double = js.native
    
    /**
      * Optional name for this attribute instance.
      * @defaultValue `""`
      */
    var name: String = js.native
    
    /**
      * Setting this to true increments {@link version | .version}.
      * @remarks _set-only property_.
      */
    def needsUpdate_=(value: Boolean): Unit = js.native
    
    /**
      * Sets the {@link buffer | .buffer} property.
      */
    def setBuffer(buffer: WebGLBuffer): this.type = js.native
    
    /**
      * Sets the {@link GLBufferAttribute.count | count} property.
      */
    def setCount(count: Double): this.type = js.native
    
    /**
      * Sets the {@link GLBufferAttribute.itemSize | itemSize} property.
      */
    def setItemSize(itemSize: Double): this.type = js.native
    
    /**
      * Sets the both {@link GLBufferAttribute.type | type} and {@link GLBufferAttribute.elementSize | elementSize} properties.
      */
    def setType(`type`: GLenum, elementSize: `1` | `2` | `4`): this.type = js.native
    
    /**
      * A {@link https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants#Data_types | WebGL Data Type} describing the underlying VBO contents.
      *
      * #### WebGL Data Type (`GLenum`)
      * - gl.BYTE: 0x1400
      * - gl.UNSIGNED_BYTE: 0x1401
      * - gl.SHORT: 0x1402
      * - gl.UNSIGNED_SHORT: 0x1403
      * - gl.INT: 0x1404
      * - gl.UNSIGNED_INT: 0x1405
      * - gl.FLOAT: 0x1406
      * @remarks Set this property together with {@link elementSize | .elementSize}. The recommended way is using the {@link setType | .setType()} method.
      * @remarks Expects a `DataType` `GLenum` _possible values:_ `0x1400` `0x1401` `0x1402` `0x1403` `0x1404` `0x1405` `0x1406`
      */
    var `type`: GLenum = js.native
    
    /**
      * A version number, incremented every time the needsUpdate property is set to true.
      * @remarks Expects a `Integer`
      */
    var version: Double = js.native
  }
}
