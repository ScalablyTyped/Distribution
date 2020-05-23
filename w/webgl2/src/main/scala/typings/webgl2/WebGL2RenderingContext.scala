package typings.webgl2

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.ArrayLike
import typings.std.DataView
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.ImageData
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import typings.std.WebGLActiveInfo
import typings.std.WebGLBuffer
import typings.std.WebGLProgram
import typings.std.WebGLQuery
import typings.std.WebGLRenderingContextBase
import typings.std.WebGLRenderingContextOverloads
import typings.std.WebGLSampler
import typings.std.WebGLSync
import typings.std.WebGLTexture
import typings.std.WebGLTransformFeedback
import typings.std.WebGLUniformLocation
import typings.std.WebGLVertexArrayObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGL2RenderingContext
  extends WebGLRenderingContextBase
     with WebGLRenderingContextOverloads {
                 // 0x8A34
  val ACTIVE_UNIFORM_BLOCKS: Double = js.native
                                        // 0x9119
  val ALREADY_SIGNALED: Double = js.native
                     // 0x88FE
  val ANY_SAMPLES_PASSED: Double = js.native
                              // 0x8C2F
  val ANY_SAMPLES_PASSED_CONSERVATIVE: Double = js.native
                                // 0x0D04
  val COLOR: Double = js.native
                           // 0x8CDF
  val COLOR_ATTACHMENT1: Double = js.native
                               // 0x8CE9
  val COLOR_ATTACHMENT10: Double = js.native
                              // 0x8CEA
  val COLOR_ATTACHMENT11: Double = js.native
                              // 0x8CEB
  val COLOR_ATTACHMENT12: Double = js.native
                              // 0x8CEC
  val COLOR_ATTACHMENT13: Double = js.native
                              // 0x8CED
  val COLOR_ATTACHMENT14: Double = js.native
                              // 0x8CEE
  val COLOR_ATTACHMENT15: Double = js.native
                               // 0x8CE1
  val COLOR_ATTACHMENT2: Double = js.native
                               // 0x8CE2
  val COLOR_ATTACHMENT3: Double = js.native
                               // 0x8CE3
  val COLOR_ATTACHMENT4: Double = js.native
                               // 0x8CE4
  val COLOR_ATTACHMENT5: Double = js.native
                               // 0x8CE5
  val COLOR_ATTACHMENT6: Double = js.native
                               // 0x8CE6
  val COLOR_ATTACHMENT7: Double = js.native
                               // 0x8CE7
  val COLOR_ATTACHMENT8: Double = js.native
                               // 0x8CE8
  val COLOR_ATTACHMENT9: Double = js.native
                                    // 0x8C43
  val COMPARE_REF_TO_TEXTURE: Double = js.native
                                 // 0x911B
  val CONDITION_SATISFIED: Double = js.native
                               // 0x8F9C
  val COPY_READ_BUFFER: Double = js.native
                               // 0x8F37
  val COPY_READ_BUFFER_BINDING: Double = js.native
                                // 0x8F36
  val COPY_WRITE_BUFFER: Double = js.native
                        // 0x8F36 /* Same as COPY_READ_BUFFER */
  val COPY_WRITE_BUFFER_BINDING: Double = js.native
                            // 0x884D
  val CURRENT_QUERY: Double = js.native
                                           // 0x1800
  val DEPTH: Double = js.native
                               // 0x84FA
  val DEPTH24_STENCIL8: Double = js.native
                              // 0x8CAC
  val DEPTH32F_STENCIL8: Double = js.native
                                             // 0x8008
  val DEPTH_COMPONENT24: Double = js.native
                   // 0x8DD7
  val DEPTH_COMPONENT32F: Double = js.native
                                // 0x8824
  val DRAW_BUFFER0: Double = js.native
                                    // 0x8825
  val DRAW_BUFFER1: Double = js.native
                                    // 0x882E
  val DRAW_BUFFER10: Double = js.native
                                   // 0x882F
  val DRAW_BUFFER11: Double = js.native
                                   // 0x8830
  val DRAW_BUFFER12: Double = js.native
                                   // 0x8831
  val DRAW_BUFFER13: Double = js.native
                                   // 0x8832
  val DRAW_BUFFER14: Double = js.native
                                   // 0x8833
  val DRAW_BUFFER15: Double = js.native
                                    // 0x8826
  val DRAW_BUFFER2: Double = js.native
                                    // 0x8827
  val DRAW_BUFFER3: Double = js.native
                                    // 0x8828
  val DRAW_BUFFER4: Double = js.native
                                    // 0x8829
  val DRAW_BUFFER5: Double = js.native
                                    // 0x882A
  val DRAW_BUFFER6: Double = js.native
                                    // 0x882B
  val DRAW_BUFFER7: Double = js.native
                                    // 0x882C
  val DRAW_BUFFER8: Double = js.native
                                    // 0x882D
  val DRAW_BUFFER9: Double = js.native
                                // 0x8CA8
  val DRAW_FRAMEBUFFER: Double = js.native
                             // 0x8C17
  val DRAW_FRAMEBUFFER_BINDING: Double = js.native
                                    // 0x88E9
  val DYNAMIC_COPY: Double = js.native
                                     // 0x88E6
  val DYNAMIC_READ: Double = js.native
                               // 0x8CAD
  val FLOAT_32_UNSIGNED_INT_24_8_REV: Double = js.native
                     // 0x88EF
  val FLOAT_MAT2x3: Double = js.native
                                    // 0x8B65
  val FLOAT_MAT2x4: Double = js.native
                                    // 0x8B66
  val FLOAT_MAT3x2: Double = js.native
                                    // 0x8B67
  val FLOAT_MAT3x4: Double = js.native
                                    // 0x8B68
  val FLOAT_MAT4x2: Double = js.native
                                    // 0x8B69
  val FLOAT_MAT4x3: Double = js.native
                               // 0x8B62
  val FRAGMENT_SHADER_DERIVATIVE_HINT: Double = js.native
                // 0x8214
  val FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE: Double = js.native
               // 0x8213
  val FRAMEBUFFER_ATTACHMENT_BLUE_SIZE: Double = js.native
                  // 0x8DAD
  val FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING: Double = js.native
           // 0x8210
  val FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE: Double = js.native
               // 0x8215
  val FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE: Double = js.native
                 // 0x8212
  val FRAMEBUFFER_ATTACHMENT_GREEN_SIZE: Double = js.native
           // 0x8211
  val FRAMEBUFFER_ATTACHMENT_RED_SIZE: Double = js.native
               // 0x8216
  val FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE: Double = js.native
                            // 0x8CAB
  val FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER: Double = js.native
             // 0x8217
  val FRAMEBUFFER_DEFAULT: Double = js.native
                              // 0x8CEF
  val FRAMEBUFFER_INCOMPLETE_MULTISAMPLE: Double = js.native
                                     // 0x8D57
  val HALF_FLOAT: Double = js.native
         // 0x8C8B
  val INTERLEAVED_ATTRIBS: Double = js.native
                                      // 0x906F
  val INT_2_10_10_10_REV: Double = js.native
                               // 0x8DC8
  val INT_SAMPLER_2D: Double = js.native
                                // 0x8DCC
  val INT_SAMPLER_2D_ARRAY: Double = js.native
                                  // 0x8DCA
  val INT_SAMPLER_3D: Double = js.native
                                  // 0x8DCB
  val INT_SAMPLER_CUBE: Double = js.native
     // 0x8A46
  val INVALID_INDEX: Double = js.native
                                             // 0x8007
  val MAX: Double = js.native
                                  // 0x8072
  val MAX_3D_TEXTURE_SIZE: Double = js.native
                     // 0x88FD
  val MAX_ARRAY_TEXTURE_LAYERS: Double = js.native
                                 // -1
  /* WebGL-specific enums */
  val MAX_CLIENT_WAIT_TIMEOUT_WEBGL: Double = js.native
            // 0x8CD4
  val MAX_COLOR_ATTACHMENTS: Double = js.native
          // 0x8A31
  val MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS: Double = js.native
                     // 0x8A2D
  val MAX_COMBINED_UNIFORM_BLOCKS: Double = js.native
                          // 0x8A30
  val MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS: Double = js.native
                                    // 0x88EA
  val MAX_DRAW_BUFFERS: Double = js.native
                           // 0x80E8
  val MAX_ELEMENTS_INDICES: Double = js.native
                     // 0x8368
  val MAX_ELEMENTS_VERTICES: Double = js.native
                        // 0x912F
  val MAX_ELEMENT_INDEX: Double = js.native
                    // 0x9122
  val MAX_FRAGMENT_INPUT_COMPONENTS: Double = js.native
                       // 0x8A2B
  val MAX_FRAGMENT_UNIFORM_BLOCKS: Double = js.native
                                   // 0x8834
  val MAX_FRAGMENT_UNIFORM_COMPONENTS: Double = js.native
                        // 0x8904
  val MAX_PROGRAM_TEXEL_OFFSET: Double = js.native
              // 0x8D56
  val MAX_SAMPLES: Double = js.native
                   // 0x9125
  val MAX_SERVER_WAIT_TIMEOUT: Double = js.native
                               // 0x81A6
  val MAX_TEXTURE_LOD_BIAS: Double = js.native
                              // 0x8C89
  val MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS: Double = js.native
   // 0x8C8A
  val MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS: Double = js.native
                  // 0x8C7F
  val MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS: Double = js.native
                     // 0x8A2F
  val MAX_UNIFORM_BLOCK_SIZE: Double = js.native
                     // 0x8A2E
  val MAX_UNIFORM_BUFFER_BINDINGS: Double = js.native
                        // 0x8905
  val MAX_VARYING_COMPONENTS: Double = js.native
                                   // 0xFFFFFFFF
  val MAX_VERTEX_OUTPUT_COMPONENTS: Double = js.native
                             // 0x8A2A
  val MAX_VERTEX_UNIFORM_BLOCKS: Double = js.native
                 // 0x8B49
  val MAX_VERTEX_UNIFORM_COMPONENTS: Double = js.native
                               // 0x813D
  val MIN: Double = js.native
                        // 0x88FF
  val MIN_PROGRAM_TEXEL_OFFSET: Double = js.native
                         // 0x9111
  val OBJECT_TYPE: Double = js.native
                              // 0x0CF4
  val PACK_ROW_LENGTH: Double = js.native
                                  // 0x0D03
  val PACK_SKIP_PIXELS: Double = js.native
                                 // 0x0D02
  val PACK_SKIP_ROWS: Double = js.native
                 // 0x8B8B
  val PIXEL_PACK_BUFFER: Double = js.native
                             // 0x88EC
  val PIXEL_PACK_BUFFER_BINDING: Double = js.native
                               // 0x88EB
  val PIXEL_UNPACK_BUFFER: Double = js.native
                       // 0x88ED
  val PIXEL_UNPACK_BUFFER_BINDING: Double = js.native
                                   // 0x8865
  val QUERY_RESULT: Double = js.native
                                    // 0x8866
  val QUERY_RESULT_AVAILABLE: Double = js.native
                        // 0x8C1D
  val R11F_G11F_B10F: Double = js.native
                                             // 0x822B
  val R16F: Double = js.native
                                            // 0x8232
  val R16I: Double = js.native
                                            // 0x8233
  val R16UI: Double = js.native
                                            // 0x822D
  val R32F: Double = js.native
                                           // 0x8234
  val R32I: Double = js.native
                                            // 0x8235
  val R32UI: Double = js.native
                                      // 0x8228
  val R8: Double = js.native
                                           // 0x8230
  val R8I: Double = js.native
                                             // 0x8231
  val R8UI: Double = js.native
                            // 0x85B5
  val R8_SNORM: Double = js.native
           // 0x8C88
  val RASTERIZER_DISCARD: Double = js.native
  val READ_BUFFER: Double = js.native
                        // 0x8CA6 /* Same as FRAMEBUFFER_BINDING */
  val READ_FRAMEBUFFER: Double = js.native
                                // 0x8CA9
  val READ_FRAMEBUFFER_BINDING: Double = js.native
                                         // 0x1802
  val RED: Double = js.native
                                           // 0x8D8F
  val RED_INTEGER: Double = js.native
                        // 0x8CAA
  val RENDERBUFFER_SAMPLES: Double = js.native
                                      // 0x140B
  val RG: Double = js.native
                                            // 0x822E
  val RG16F: Double = js.native
                                           // 0x8238
  val RG16I: Double = js.native
                                           // 0x8239
  val RG16UI: Double = js.native
                                           // 0x822F
  val RG32F: Double = js.native
                                          // 0x823A
  val RG32I: Double = js.native
                                           // 0x823B
  val RG32UI: Double = js.native
                                              // 0x8229
  val RG8: Double = js.native
                                           // 0x8236
  val RG8I: Double = js.native
                                            // 0x8237
  val RG8UI: Double = js.native
                                        // 0x8F94
  val RG8_SNORM: Double = js.native
                                           // 0x8058
  val RGB10_A2: Double = js.native
                                 // 0x8919
  val RGB10_A2UI: Double = js.native
                                         // 0x881A
  val RGB16F: Double = js.native
                                         // 0x8D88
  val RGB16I: Double = js.native
                                        // 0x8D76
  val RGB16UI: Double = js.native
                                         // 0x8814
  val RGB32F: Double = js.native
                                         // 0x8D82
  val RGB32I: Double = js.native
                                        // 0x8D70
  val RGB32UI: Double = js.native
                                             // 0x1903
  val RGB8: Double = js.native
                                          // 0x8D8E
  val RGB8I: Double = js.native
                                         // 0x8D7C
  val RGB8UI: Double = js.native
                                       // 0x8F95
  val RGB8_SNORM: Double = js.native
                    // 0x8C3B
  val RGB9_E5: Double = js.native
                                          // 0x8815
  val RGBA16F: Double = js.native
                                          // 0x8D83
  val RGBA16I: Double = js.native
                                         // 0x8D71
  val RGBA16UI: Double = js.native
                          // 0x884E
  val RGBA32F: Double = js.native
                                          // 0x8D7D
  val RGBA32I: Double = js.native
               // 0x8C8F
  val RGBA32UI: Double = js.native
                                            // 0x8051
  val RGBA8: Double = js.native
                                          // 0x8D89
  val RGBA8I: Double = js.native
                                         // 0x8D77
  val RGBA8UI: Double = js.native
                                      // 0x8F96
  val RGBA8_SNORM: Double = js.native
                                     // 0x8D98
  val RGBA_INTEGER: Double = js.native
                                     // 0x8D94
  val RGB_INTEGER: Double = js.native
                                              // 0x8227
  val RG_INTEGER: Double = js.native
                                    // 0x8D99
  val SAMPLER_2D_ARRAY: Double = js.native
                                // 0x8DC1
  val SAMPLER_2D_ARRAY_SHADOW: Double = js.native
                                      // 0x8B5F
  val SAMPLER_2D_SHADOW: Double = js.native
                   // 0x8B4A
  val SAMPLER_3D: Double = js.native
                 // 0x8D6A
  val SAMPLER_BINDING: Double = js.native
                         // 0x8DC4
  val SAMPLER_CUBE_SHADOW: Double = js.native
                             // 0x8C8C
  val SEPARATE_ATTRIBS: Double = js.native
                                      // 0x9118
  val SIGNALED: Double = js.native
                                     // 0x8F97
  val SIGNED_NORMALIZED: Double = js.native
                                    // 0x8B6A
  val SRGB: Double = js.native
                                            // 0x8C40
  val SRGB8: Double = js.native
                                           // 0x8C41
  val SRGB8_ALPHA8: Double = js.native
                                     // 0x88E5
  val STATIC_COPY: Double = js.native
                                     // 0x88E2
  val STATIC_READ: Double = js.native
                                           // 0x1801
  val STENCIL: Double = js.native
                                     // 0x88E1
  val STREAM_COPY: Double = js.native
                          // 0x8867
  val STREAM_READ: Double = js.native
                                     // 0x9112
  val SYNC_CONDITION: Double = js.native
                                      // 0x9115
  val SYNC_FENCE: Double = js.native
                                     // 0x9114
  val SYNC_FLAGS: Double = js.native
                                     // 0x911D
  val SYNC_FLUSH_COMMANDS_BIT: Double = js.native
                                      // 0x9116
  val SYNC_GPU_COMMANDS_COMPLETE: Double = js.native
                                  // 0x9113
  val SYNC_STATUS: Double = js.native
                          // 0x8B4B
  val TEXTURE_2D_ARRAY: Double = js.native
                             // 0x806E
  val TEXTURE_3D: Double = js.native
                                 // 0x813B
  val TEXTURE_BASE_LEVEL: Double = js.native
                                // 0x8C1A
  val TEXTURE_BINDING_2D_ARRAY: Double = js.native
                                        // 0x8059
  val TEXTURE_BINDING_3D: Double = js.native
                            // 0x884C
  val TEXTURE_COMPARE_FUNC: Double = js.native
                            // 0x84FD
  val TEXTURE_COMPARE_MODE: Double = js.native
                      // 0x8E25
  val TEXTURE_IMMUTABLE_FORMAT: Double = js.native
                               // 0x8D6B
  val TEXTURE_IMMUTABLE_LEVELS: Double = js.native
                              // 0x813C
  val TEXTURE_MAX_LEVEL: Double = js.native
                                 // 0x813A
  val TEXTURE_MAX_LOD: Double = js.native
                            // 0x80E9
  val TEXTURE_MIN_LOD: Double = js.native
                                      // 0x806F
  val TEXTURE_WRAP_R: Double = js.native
                                // 0x911A
  val TIMEOUT_EXPIRED: Double = js.native
                        // 0x82DF
  val TIMEOUT_IGNORED: Double = js.native
                              // 0x8D9F
  val TRANSFORM_FEEDBACK: Double = js.native
                       // 0x8E23
  val TRANSFORM_FEEDBACK_ACTIVE: Double = js.native
                       // 0x8E24
  val TRANSFORM_FEEDBACK_BINDING: Double = js.native
                                // 0x8C8D
  val TRANSFORM_FEEDBACK_BUFFER: Double = js.native
                       // 0x8C8E
  val TRANSFORM_FEEDBACK_BUFFER_BINDING: Double = js.native
                        // 0x8C3E
  val TRANSFORM_FEEDBACK_BUFFER_MODE: Double = js.native
                 // 0x8C84
  val TRANSFORM_FEEDBACK_BUFFER_SIZE: Double = js.native
                     // 0x8C83
  val TRANSFORM_FEEDBACK_BUFFER_START: Double = js.native
                              // 0x8E22
  val TRANSFORM_FEEDBACK_PAUSED: Double = js.native
                  // 0x8C85
  val TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN: Double = js.native
      // 0x8C80
  val TRANSFORM_FEEDBACK_VARYINGS: Double = js.native
                                  // 0x8A3B
  val UNIFORM_ARRAY_STRIDE: Double = js.native
                         // 0x8A40
  val UNIFORM_BLOCK_ACTIVE_UNIFORMS: Double = js.native
                   // 0x8A42
  val UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES: Double = js.native
                            // 0x8A3E
  val UNIFORM_BLOCK_BINDING: Double = js.native
                           // 0x8A3F
  val UNIFORM_BLOCK_DATA_SIZE: Double = js.native
                                    // 0x8A38
  val UNIFORM_BLOCK_INDEX: Double = js.native
       // 0x8A44
  val UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER: Double = js.native
            // 0x8A43
  val UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER: Double = js.native
                       // 0x8F37 /* Same as COPY_WRITE_BUFFER */
  val UNIFORM_BUFFER: Double = js.native
                                  // 0x8A11
  val UNIFORM_BUFFER_BINDING: Double = js.native
        // 0x8A33
  val UNIFORM_BUFFER_OFFSET_ALIGNMENT: Double = js.native
                            // 0x8A29
  val UNIFORM_BUFFER_SIZE: Double = js.native
                          // 0x8A28
  val UNIFORM_BUFFER_START: Double = js.native
                           // 0x8A3D
  val UNIFORM_IS_ROW_MAJOR: Double = js.native
                            // 0x8A3C
  val UNIFORM_MATRIX_STRIDE: Double = js.native
                             // 0x8A3A
  val UNIFORM_OFFSET: Double = js.native
                                    // 0x8A37
  val UNIFORM_SIZE: Double = js.native
                           // 0x8A36
  val UNIFORM_TYPE: Double = js.native
                              // 0x806D
  val UNPACK_IMAGE_HEIGHT: Double = js.native
                                     // 0x0C02
  val UNPACK_ROW_LENGTH: Double = js.native
                              // 0x806A
  val UNPACK_SKIP_IMAGES: Double = js.native
                                // 0x0CF3
  val UNPACK_SKIP_PIXELS: Double = js.native
                               // 0x0CF2
  val UNPACK_SKIP_ROWS: Double = js.native
                      // 0x9117
  val UNSIGNALED: Double = js.native
                                  // 0x8C3A
  val UNSIGNED_INT_10F_11F_11F_REV: Double = js.native
                             // 0x8218
  //readonly DEPTH_STENCIL_ATTACHMENT: number;                      // 0x821A /* Already defined in WebGL1 constants */
  //readonly DEPTH_STENCIL: number;                                 // 0x84F9 /* Already defined in WebGL1 constants */
  val UNSIGNED_INT_24_8: Double = js.native
                             // 0x8073
  val UNSIGNED_INT_2_10_10_10_REV: Double = js.native
                                         // 0x8C3D
  val UNSIGNED_INT_5_9_9_9_REV: Double = js.native
                            // 0x8DCF
  val UNSIGNED_INT_SAMPLER_2D: Double = js.native
                       // 0x8DD4
  val UNSIGNED_INT_SAMPLER_2D_ARRAY: Double = js.native
                         // 0x8DD2
  val UNSIGNED_INT_SAMPLER_3D: Double = js.native
                         // 0x8DD3
  val UNSIGNED_INT_SAMPLER_CUBE: Double = js.native
                             // 0x8DC5
  val UNSIGNED_INT_VEC2: Double = js.native
                               // 0x8DC6
  val UNSIGNED_INT_VEC3: Double = js.native
                               // 0x8DC7
  val UNSIGNED_INT_VEC4: Double = js.native
                                // 0x88F0
  val UNSIGNED_NORMALIZED: Double = js.native
                                          // 0x823C
  val VERTEX_ARRAY_BINDING: Double = js.native
                         // 0x00000001
  val VERTEX_ATTRIB_ARRAY_DIVISOR: Double = js.native
                                          // 0x881B
  val VERTEX_ATTRIB_ARRAY_INTEGER: Double = js.native
                             // 0x911C
  val WAIT_FAILED: Double = js.native
   //[WebGLHandlesContextLoss]
  def beginQuery(target: Double, query: WebGLQuery): Unit = js.native
  def beginTransformFeedback(primitiveMode: Double): Unit = js.native
  def bindBufferBase(target: Double, index: Double): Unit = js.native
  /* Uniform Buffer Objects and Transform Feedback Buffers */
  def bindBufferBase(target: Double, index: Double, buffer: WebGLBuffer): Unit = js.native
  def bindBufferRange(target: Double, index: Double, buffer: Null, offset: Double, size: Double): Unit = js.native
  def bindBufferRange(target: Double, index: Double, buffer: WebGLBuffer, offset: Double, size: Double): Unit = js.native
  def bindSampler(unit: Double): Unit = js.native
   //[WebGLHandlesContextLoss]
  def bindSampler(unit: Double, sampler: WebGLSampler): Unit = js.native
  def bindTransformFeedback(target: Double): Unit = js.native
   //[WebGLHandlesContextLoss]
  def bindTransformFeedback(target: Double, tf: WebGLTransformFeedback): Unit = js.native
  def bindVertexArray(): Unit = js.native
   //[WebGLHandlesContextLoss]
  def bindVertexArray(array: WebGLVertexArrayObject): Unit = js.native
  /* Framebuffer objects */
  def blitFramebuffer(
    srcX0: Double,
    srcY0: Double,
    srcX1: Double,
    srcY1: Double,
    dstX0: Double,
    dstY0: Double,
    dstX1: Double,
    dstY1: Double,
    mask: Double,
    filter: Double
  ): Unit = js.native
  // For compatibility with WebGL 1 context in older Typescript versions.
  def bufferData(target: Double, data: ArrayBufferView, usage: Double): Unit = js.native
                   // 0x9247
  /* Buffer objects */
  // WebGL1:
  def bufferData(
    target: Double,
    sizeOrData: Double | Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer | Null,
    usage: Double
  ): Unit = js.native
  // WebGL2:
  def bufferData(
    target: Double,
    srcData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer | Null,
    usage: Double,
    srcOffset: Double
  ): Unit = js.native
  def bufferData(
    target: Double,
    srcData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer | Null,
    usage: Double,
    srcOffset: Double,
    length: Double
  ): Unit = js.native
  def bufferSubData(target: Double, dstByteOffset: Double): Unit = js.native
  def bufferSubData(
    target: Double,
    dstByteOffset: Double,
    srcData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView | ArrayBuffer
  ): Unit = js.native
  def bufferSubData(target: Double, dstByteOffset: Double, srcData: ArrayBufferView): Unit = js.native
  def bufferSubData(target: Double, dstByteOffset: Double, srcData: ArrayBufferView, srcOffset: Double): Unit = js.native
  def bufferSubData(target: Double, dstByteOffset: Double, srcData: ArrayBufferView, srcOffset: Double, length: Double): Unit = js.native
  def clearBufferfi(buffer: Double, drawbuffer: Double, depth: Double, stencil: Double): Unit = js.native
  def clearBufferfv(buffer: Double, drawbuffer: Double, values: ArrayLike[Double]): Unit = js.native
  def clearBufferfv(buffer: Double, drawbuffer: Double, values: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def clearBufferfv(buffer: Double, drawbuffer: Double, values: Float32Array): Unit = js.native
  def clearBufferfv(buffer: Double, drawbuffer: Double, values: Float32Array, srcOffset: Double): Unit = js.native
  def clearBufferiv(buffer: Double, drawbuffer: Double, values: ArrayLike[Double]): Unit = js.native
  def clearBufferiv(buffer: Double, drawbuffer: Double, values: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def clearBufferiv(buffer: Double, drawbuffer: Double, values: Int32Array): Unit = js.native
  def clearBufferiv(buffer: Double, drawbuffer: Double, values: Int32Array, srcOffset: Double): Unit = js.native
  def clearBufferuiv(buffer: Double, drawbuffer: Double, values: ArrayLike[Double]): Unit = js.native
  def clearBufferuiv(buffer: Double, drawbuffer: Double, values: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def clearBufferuiv(buffer: Double, drawbuffer: Double, values: Uint32Array): Unit = js.native
  def clearBufferuiv(buffer: Double, drawbuffer: Double, values: Uint32Array, srcOffset: Double): Unit = js.native
  def clientWaitSync(sync: WebGLSync, flags: Double, timeout: Double): Double = js.native
  def compressedTexImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double
  ): Unit = js.native
  def compressedTexImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double,
    imageSize: Double,
    offset: Double
  ): Unit = js.native
  def compressedTexImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double,
    srcData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView
  ): Unit = js.native
  def compressedTexImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double,
    srcData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView,
    srcOffset: Double
  ): Unit = js.native
  def compressedTexImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double,
    srcData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView,
    srcOffset: Double,
    srcLengthOverride: Double
  ): Unit = js.native
  def compressedTexImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double,
    srcData: ArrayBufferView,
    srcOffset: Double
  ): Unit = js.native
  def compressedTexImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double,
    srcData: ArrayBufferView,
    srcOffset: Double,
    srcLengthOverride: Double
  ): Unit = js.native
  def compressedTexImage3D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    depth: Double,
    border: Double,
    imageSize: Double,
    offset: Double
  ): Unit = js.native
  def compressedTexImage3D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    depth: Double,
    border: Double,
    srcData: ArrayBufferView
  ): Unit = js.native
  def compressedTexImage3D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    depth: Double,
    border: Double,
    srcData: ArrayBufferView,
    srcOffset: Double
  ): Unit = js.native
  def compressedTexImage3D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    depth: Double,
    border: Double,
    srcData: ArrayBufferView,
    srcOffset: Double,
    srcLengthOverride: Double
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    width: Double,
    height: Double,
    format: Double
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    width: Double,
    height: Double,
    format: Double,
    imageSize: Double,
    offset: Double
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    width: Double,
    height: Double,
    format: Double,
    srcData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    width: Double,
    height: Double,
    format: Double,
    srcData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView,
    srcOffset: Double
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    width: Double,
    height: Double,
    format: Double,
    srcData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView,
    srcOffset: Double,
    srcLengthOverride: Double
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    width: Double,
    height: Double,
    format: Double,
    srcData: Null,
    srcOffset: Double
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    width: Double,
    height: Double,
    format: Double,
    srcData: Null,
    srcOffset: Double,
    srcLengthOverride: Double
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    width: Double,
    height: Double,
    format: Double,
    srcData: ArrayBufferView,
    srcOffset: Double
  ): Unit = js.native
  def compressedTexSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    width: Double,
    height: Double,
    format: Double,
    srcData: ArrayBufferView,
    srcOffset: Double,
    srcLengthOverride: Double
  ): Unit = js.native
  def compressedTexSubImage3D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    zoffset: Double,
    width: Double,
    height: Double,
    depth: Double,
    format: Double,
    imageSize: Double,
    offset: Double
  ): Unit = js.native
  def compressedTexSubImage3D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    zoffset: Double,
    width: Double,
    height: Double,
    depth: Double,
    format: Double,
    srcData: ArrayBufferView
  ): Unit = js.native
  def compressedTexSubImage3D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    zoffset: Double,
    width: Double,
    height: Double,
    depth: Double,
    format: Double,
    srcData: ArrayBufferView,
    srcOffset: Double
  ): Unit = js.native
  def compressedTexSubImage3D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    zoffset: Double,
    width: Double,
    height: Double,
    depth: Double,
    format: Double,
    srcData: ArrayBufferView,
    srcOffset: Double,
    srcLengthOverride: Double
  ): Unit = js.native
  def copyBufferSubData(readTarget: Double, writeTarget: Double, readOffset: Double, writeOffset: Double, size: Double): Unit = js.native
  def copyTexSubImage3D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    zoffset: Double,
    x: Double,
    y: Double,
    width: Double,
    height: Double
  ): Unit = js.native
  /* Query Objects */
  def createQuery(): WebGLQuery | Null = js.native
  /* Sampler Objects */
  def createSampler(): WebGLSampler | Null = js.native
  /* Transform Feedback */
  def createTransformFeedback(): WebGLTransformFeedback | Null = js.native
  /* Vertex Array Objects */
  def createVertexArray(): WebGLVertexArrayObject | Null = js.native
  def deleteQuery(): Unit = js.native
  def deleteQuery(query: WebGLQuery): Unit = js.native
  def deleteSampler(): Unit = js.native
  def deleteSampler(sampler: WebGLSampler): Unit = js.native
  def deleteSync(): Unit = js.native
   //[WebGLHandlesContextLoss]
  def deleteSync(sync: WebGLSync): Unit = js.native
  def deleteTransformFeedback(): Unit = js.native
  def deleteTransformFeedback(tf: WebGLTransformFeedback): Unit = js.native
  def deleteVertexArray(): Unit = js.native
  def deleteVertexArray(vertexArray: WebGLVertexArrayObject): Unit = js.native
  def drawArraysInstanced(mode: Double, first: Double, count: Double, instanceCount: Double): Unit = js.native
  /* Multiple Render Targets */
  def drawBuffers(buffers: js.Array[Double]): Unit = js.native
  def drawElementsInstanced(mode: Double, count: Double, `type`: Double, offset: Double, instanceCount: Double): Unit = js.native
  def drawRangeElements(mode: Double, start: Double, end: Double, count: Double, `type`: Double, offset: Double): Unit = js.native
  def endQuery(target: Double): Unit = js.native
  def endTransformFeedback(): Unit = js.native
  /* Sync objects */
  def fenceSync(condition: Double, flags: Double): WebGLSync | Null = js.native
  def framebufferTextureLayer(target: Double, attachment: Double, texture: Null, level: Double, layer: Double): Unit = js.native
  def framebufferTextureLayer(target: Double, attachment: Double, texture: WebGLTexture, level: Double, layer: Double): Unit = js.native
  def getActiveUniformBlockName(program: WebGLProgram, uniformBlockIndex: Double): String | Null = js.native
  def getActiveUniformBlockParameter(program: WebGLProgram, uniformBlockIndex: Double, pname: Double): js.Any = js.native
  def getActiveUniforms(program: WebGLProgram, uniformIndices: js.Array[Double], pname: Double): js.Any = js.native
  // MapBufferRange, in particular its read-only and write-only modes,
  // can not be exposed safely to JavaScript. GetBufferSubData
  // replaces it for the purpose of fetching data back from the GPU.
  def getBufferSubData(target: Double, srcByteOffset: Double, dstBuffer: ArrayBufferView): Unit = js.native
  def getBufferSubData(target: Double, srcByteOffset: Double, dstBuffer: ArrayBufferView, dstOffset: Double): Unit = js.native
  def getBufferSubData(
    target: Double,
    srcByteOffset: Double,
    dstBuffer: ArrayBufferView,
    dstOffset: Double,
    length: Double
  ): Unit = js.native
  /* Programs and shaders */
  def getFragDataLocation(program: WebGLProgram, name: String): Double = js.native
  def getIndexedParameter(target: Double, index: Double): js.Any = js.native
  /* Renderbuffer objects */
  def getInternalformatParameter(target: Double, internalformat: Double, pname: Double): js.Any = js.native
  def getQuery(target: Double, pname: Double): WebGLQuery | Null = js.native
  def getQueryParameter(query: WebGLQuery, pname: Double): js.Any = js.native
  def getSamplerParameter(sampler: WebGLSampler, pname: Double): js.Any = js.native
  def getSyncParameter(sync: WebGLSync, pname: Double): js.Any = js.native
  def getTransformFeedbackVarying(program: WebGLProgram, index: Double): WebGLActiveInfo | Null = js.native
  def getUniformBlockIndex(program: WebGLProgram, uniformBlockName: String): Double = js.native
  def getUniformIndices(program: WebGLProgram, uniformNames: js.Array[String]): js.Array[Double] | Null = js.native
  def invalidateFramebuffer(target: Double, attachments: js.Array[Double]): Unit = js.native
  def invalidateSubFramebuffer(target: Double, attachments: js.Array[Double], x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def isQuery(): Boolean = js.native
  def isQuery(query: WebGLQuery): Boolean = js.native
  def isSampler(): Boolean = js.native
  def isSampler(sampler: WebGLSampler): Boolean = js.native
  def isSync(): Boolean = js.native
  def isSync(sync: WebGLSync): Boolean = js.native
  def isTransformFeedback(): Boolean = js.native
  def isTransformFeedback(tf: WebGLTransformFeedback): Boolean = js.native
  def isVertexArray(): Boolean = js.native
  def isVertexArray(vertexArray: WebGLVertexArrayObject): Boolean = js.native
  def pauseTransformFeedback(): Unit = js.native
  def readBuffer(src: Double): Unit = js.native
  def readPixels(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    format: Double,
    `type`: Double,
    dstData: Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array | Uint8ClampedArray | Float32Array | Float64Array | DataView
  ): Unit = js.native
  def readPixels(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    format: Double,
    `type`: Double,
    dstData: ArrayBufferView,
    dstOffset: Double
  ): Unit = js.native
  // WebGL2:
  def readPixels(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    format: Double,
    `type`: Double,
    offset: Double
  ): Unit = js.native
  def renderbufferStorageMultisample(target: Double, samples: Double, internalformat: Double, width: Double, height: Double): Unit = js.native
  def resumeTransformFeedback(): Unit = js.native
  def samplerParameterf(sampler: WebGLSampler, pname: Double, param: Double): Unit = js.native
  def samplerParameteri(sampler: WebGLSampler, pname: Double, param: Double): Unit = js.native
  def texImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    format: Double,
    `type`: Double,
    source: HTMLImageElement
  ): Unit = js.native
  def texImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    format: Double,
    `type`: Double,
    source: HTMLVideoElement
  ): Unit = js.native
  def texImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    format: Double,
    `type`: Double,
    source: ImageData
  ): Unit = js.native
  def texImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    format: Double,
    `type`: Double,
    source: HTMLCanvasElement
  ): Unit = js.native
   // May throw DOMException
  def texImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    format: Double,
    `type`: Double,
    source: ImageBitmap
  ): Unit = js.native
   // May throw DOMException
  // WebGL2 entrypoints:
  def texImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double,
    format: Double,
    `type`: Double,
    pboOffset: Double
  ): Unit = js.native
  def texImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double,
    format: Double,
    `type`: Double,
    source: HTMLImageElement
  ): Unit = js.native
  def texImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double,
    format: Double,
    `type`: Double,
    source: HTMLVideoElement
  ): Unit = js.native
  def texImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double,
    format: Double,
    `type`: Double,
    source: ImageData
  ): Unit = js.native
  def texImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double,
    format: Double,
    `type`: Double,
    source: HTMLCanvasElement
  ): Unit = js.native
  def texImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double,
    format: Double,
    `type`: Double,
    source: ImageBitmap
  ): Unit = js.native
   // May throw DOMException
  def texImage2D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    border: Double,
    format: Double,
    `type`: Double,
    srcData: ArrayBufferView,
    srcOffset: Double
  ): Unit = js.native
  def texImage3D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    depth: Double,
    border: Double,
    format: Double,
    `type`: Double
  ): Unit = js.native
  def texImage3D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    depth: Double,
    border: Double,
    format: Double,
    `type`: Double,
    pboOffset: Double
  ): Unit = js.native
  def texImage3D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    depth: Double,
    border: Double,
    format: Double,
    `type`: Double,
    source: HTMLImageElement
  ): Unit = js.native
  def texImage3D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    depth: Double,
    border: Double,
    format: Double,
    `type`: Double,
    source: HTMLVideoElement
  ): Unit = js.native
  def texImage3D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    depth: Double,
    border: Double,
    format: Double,
    `type`: Double,
    source: ImageData
  ): Unit = js.native
  def texImage3D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    depth: Double,
    border: Double,
    format: Double,
    `type`: Double,
    source: HTMLCanvasElement
  ): Unit = js.native
  def texImage3D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    depth: Double,
    border: Double,
    format: Double,
    `type`: Double,
    source: ImageBitmap
  ): Unit = js.native
   // May throw DOMException
  def texImage3D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    depth: Double,
    border: Double,
    format: Double,
    `type`: Double,
    srcData: ArrayBufferView
  ): Unit = js.native
  def texImage3D(
    target: Double,
    level: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    depth: Double,
    border: Double,
    format: Double,
    `type`: Double,
    srcData: ArrayBufferView,
    srcOffset: Double
  ): Unit = js.native
  /* Texture objects */
  def texStorage2D(target: Double, levels: Double, internalformat: Double, width: Double, height: Double): Unit = js.native
  def texStorage3D(
    target: Double,
    levels: Double,
    internalformat: Double,
    width: Double,
    height: Double,
    depth: Double
  ): Unit = js.native
  def texSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    format: Double,
    `type`: Double,
    source: HTMLImageElement
  ): Unit = js.native
  def texSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    format: Double,
    `type`: Double,
    source: HTMLVideoElement
  ): Unit = js.native
  def texSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    format: Double,
    `type`: Double,
    source: ImageData
  ): Unit = js.native
  def texSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    format: Double,
    `type`: Double,
    source: HTMLCanvasElement
  ): Unit = js.native
   // May throw DOMException
  def texSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    format: Double,
    `type`: Double,
    source: ImageBitmap
  ): Unit = js.native
  def texSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    width: Double,
    height: Double,
    format: Double,
    `type`: Double,
    pboOffset: Double
  ): Unit = js.native
  def texSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    width: Double,
    height: Double,
    format: Double,
    `type`: Double,
    source: HTMLImageElement
  ): Unit = js.native
  def texSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    width: Double,
    height: Double,
    format: Double,
    `type`: Double,
    source: HTMLVideoElement
  ): Unit = js.native
  def texSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    width: Double,
    height: Double,
    format: Double,
    `type`: Double,
    source: ImageData
  ): Unit = js.native
  def texSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    width: Double,
    height: Double,
    format: Double,
    `type`: Double,
    source: HTMLCanvasElement
  ): Unit = js.native
  def texSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    width: Double,
    height: Double,
    format: Double,
    `type`: Double,
    source: ImageBitmap
  ): Unit = js.native
   // May throw DOMException
  def texSubImage2D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    width: Double,
    height: Double,
    format: Double,
    `type`: Double,
    srcData: ArrayBufferView,
    srcOffset: Double
  ): Unit = js.native
  def texSubImage3D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    zoffset: Double,
    width: Double,
    height: Double,
    depth: Double,
    format: Double,
    `type`: Double
  ): Unit = js.native
  def texSubImage3D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    zoffset: Double,
    width: Double,
    height: Double,
    depth: Double,
    format: Double,
    `type`: Double,
    pboOffset: Double
  ): Unit = js.native
  def texSubImage3D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    zoffset: Double,
    width: Double,
    height: Double,
    depth: Double,
    format: Double,
    `type`: Double,
    source: HTMLImageElement
  ): Unit = js.native
  def texSubImage3D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    zoffset: Double,
    width: Double,
    height: Double,
    depth: Double,
    format: Double,
    `type`: Double,
    source: HTMLVideoElement
  ): Unit = js.native
  def texSubImage3D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    zoffset: Double,
    width: Double,
    height: Double,
    depth: Double,
    format: Double,
    `type`: Double,
    source: ImageData
  ): Unit = js.native
  def texSubImage3D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    zoffset: Double,
    width: Double,
    height: Double,
    depth: Double,
    format: Double,
    `type`: Double,
    source: HTMLCanvasElement
  ): Unit = js.native
  def texSubImage3D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    zoffset: Double,
    width: Double,
    height: Double,
    depth: Double,
    format: Double,
    `type`: Double,
    source: ImageBitmap
  ): Unit = js.native
  def texSubImage3D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    zoffset: Double,
    width: Double,
    height: Double,
    depth: Double,
    format: Double,
    `type`: Double,
    srcData: Null,
    srcOffset: Double
  ): Unit = js.native
   // May throw DOMException
  def texSubImage3D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    zoffset: Double,
    width: Double,
    height: Double,
    depth: Double,
    format: Double,
    `type`: Double,
    srcData: ArrayBufferView
  ): Unit = js.native
  def texSubImage3D(
    target: Double,
    level: Double,
    xoffset: Double,
    yoffset: Double,
    zoffset: Double,
    width: Double,
    height: Double,
    depth: Double,
    format: Double,
    `type`: Double,
    srcData: ArrayBufferView,
    srcOffset: Double
  ): Unit = js.native
  def transformFeedbackVaryings(program: WebGLProgram, varyings: js.Array[String], bufferMode: Double): Unit = js.native
  def uniform1fv(location: Null, data: ArrayLike[Double]): Unit = js.native
  def uniform1fv(location: Null, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniform1fv(location: Null, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform1fv(location: Null, data: Float32Array): Unit = js.native
  def uniform1fv(location: Null, data: Float32Array, srcOffset: Double): Unit = js.native
  def uniform1fv(location: Null, data: Float32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform1fv(location: WebGLUniformLocation, data: ArrayLike[Double]): Unit = js.native
  def uniform1fv(location: WebGLUniformLocation, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniform1fv(location: WebGLUniformLocation, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform1fv(location: WebGLUniformLocation, data: Float32Array): Unit = js.native
  def uniform1fv(location: WebGLUniformLocation, data: Float32Array, srcOffset: Double): Unit = js.native
  def uniform1fv(location: WebGLUniformLocation, data: Float32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform1iv(location: Null, data: ArrayLike[Double]): Unit = js.native
  def uniform1iv(location: Null, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniform1iv(location: Null, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform1iv(location: Null, data: Int32Array): Unit = js.native
  def uniform1iv(location: Null, data: Int32Array, srcOffset: Double): Unit = js.native
  def uniform1iv(location: Null, data: Int32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform1iv(location: WebGLUniformLocation, data: ArrayLike[Double]): Unit = js.native
  def uniform1iv(location: WebGLUniformLocation, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniform1iv(location: WebGLUniformLocation, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform1iv(location: WebGLUniformLocation, data: Int32Array): Unit = js.native
  def uniform1iv(location: WebGLUniformLocation, data: Int32Array, srcOffset: Double): Unit = js.native
  def uniform1iv(location: WebGLUniformLocation, data: Int32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform1ui(location: Null, v0: Double): Unit = js.native
  /* Uniforms */
  def uniform1ui(location: WebGLUniformLocation, v0: Double): Unit = js.native
  def uniform1uiv(location: Null, data: ArrayLike[Double]): Unit = js.native
  def uniform1uiv(location: Null, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniform1uiv(location: Null, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform1uiv(location: Null, data: Uint32Array): Unit = js.native
  def uniform1uiv(location: Null, data: Uint32Array, srcOffset: Double): Unit = js.native
  def uniform1uiv(location: Null, data: Uint32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform1uiv(location: WebGLUniformLocation, data: ArrayLike[Double]): Unit = js.native
  def uniform1uiv(location: WebGLUniformLocation, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniform1uiv(location: WebGLUniformLocation, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform1uiv(location: WebGLUniformLocation, data: Uint32Array): Unit = js.native
  def uniform1uiv(location: WebGLUniformLocation, data: Uint32Array, srcOffset: Double): Unit = js.native
  def uniform1uiv(location: WebGLUniformLocation, data: Uint32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform2fv(location: Null, data: ArrayLike[Double]): Unit = js.native
  def uniform2fv(location: Null, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniform2fv(location: Null, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform2fv(location: Null, data: Float32Array): Unit = js.native
  def uniform2fv(location: Null, data: Float32Array, srcOffset: Double): Unit = js.native
  def uniform2fv(location: Null, data: Float32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform2fv(location: WebGLUniformLocation, data: ArrayLike[Double]): Unit = js.native
  def uniform2fv(location: WebGLUniformLocation, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniform2fv(location: WebGLUniformLocation, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform2fv(location: WebGLUniformLocation, data: Float32Array): Unit = js.native
  def uniform2fv(location: WebGLUniformLocation, data: Float32Array, srcOffset: Double): Unit = js.native
  def uniform2fv(location: WebGLUniformLocation, data: Float32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform2iv(location: Null, data: ArrayLike[Double]): Unit = js.native
  def uniform2iv(location: Null, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniform2iv(location: Null, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform2iv(location: Null, data: Int32Array): Unit = js.native
  def uniform2iv(location: Null, data: Int32Array, srcOffset: Double): Unit = js.native
  def uniform2iv(location: Null, data: Int32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform2iv(location: WebGLUniformLocation, data: ArrayLike[Double]): Unit = js.native
  def uniform2iv(location: WebGLUniformLocation, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniform2iv(location: WebGLUniformLocation, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform2iv(location: WebGLUniformLocation, data: Int32Array): Unit = js.native
  def uniform2iv(location: WebGLUniformLocation, data: Int32Array, srcOffset: Double): Unit = js.native
  def uniform2iv(location: WebGLUniformLocation, data: Int32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform2ui(location: Null, v0: Double, v1: Double): Unit = js.native
  def uniform2ui(location: WebGLUniformLocation, v0: Double, v1: Double): Unit = js.native
  def uniform2uiv(location: Null, data: ArrayLike[Double]): Unit = js.native
  def uniform2uiv(location: Null, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniform2uiv(location: Null, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform2uiv(location: Null, data: Uint32Array): Unit = js.native
  def uniform2uiv(location: Null, data: Uint32Array, srcOffset: Double): Unit = js.native
  def uniform2uiv(location: Null, data: Uint32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform2uiv(location: WebGLUniformLocation, data: ArrayLike[Double]): Unit = js.native
  def uniform2uiv(location: WebGLUniformLocation, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniform2uiv(location: WebGLUniformLocation, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform2uiv(location: WebGLUniformLocation, data: Uint32Array): Unit = js.native
  def uniform2uiv(location: WebGLUniformLocation, data: Uint32Array, srcOffset: Double): Unit = js.native
  def uniform2uiv(location: WebGLUniformLocation, data: Uint32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform3fv(location: Null, data: ArrayLike[Double]): Unit = js.native
  def uniform3fv(location: Null, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniform3fv(location: Null, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform3fv(location: Null, data: Float32Array): Unit = js.native
  def uniform3fv(location: Null, data: Float32Array, srcOffset: Double): Unit = js.native
  def uniform3fv(location: Null, data: Float32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform3fv(location: WebGLUniformLocation, data: ArrayLike[Double]): Unit = js.native
  def uniform3fv(location: WebGLUniformLocation, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniform3fv(location: WebGLUniformLocation, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform3fv(location: WebGLUniformLocation, data: Float32Array): Unit = js.native
  def uniform3fv(location: WebGLUniformLocation, data: Float32Array, srcOffset: Double): Unit = js.native
  def uniform3fv(location: WebGLUniformLocation, data: Float32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform3iv(location: Null, data: ArrayLike[Double]): Unit = js.native
  def uniform3iv(location: Null, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniform3iv(location: Null, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform3iv(location: Null, data: Int32Array): Unit = js.native
  def uniform3iv(location: Null, data: Int32Array, srcOffset: Double): Unit = js.native
  def uniform3iv(location: Null, data: Int32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform3iv(location: WebGLUniformLocation, data: ArrayLike[Double]): Unit = js.native
  def uniform3iv(location: WebGLUniformLocation, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniform3iv(location: WebGLUniformLocation, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform3iv(location: WebGLUniformLocation, data: Int32Array): Unit = js.native
  def uniform3iv(location: WebGLUniformLocation, data: Int32Array, srcOffset: Double): Unit = js.native
  def uniform3iv(location: WebGLUniformLocation, data: Int32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform3ui(location: Null, v0: Double, v1: Double, v2: Double): Unit = js.native
  def uniform3ui(location: WebGLUniformLocation, v0: Double, v1: Double, v2: Double): Unit = js.native
  def uniform3uiv(location: Null, data: ArrayLike[Double]): Unit = js.native
  def uniform3uiv(location: Null, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniform3uiv(location: Null, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform3uiv(location: Null, data: Uint32Array): Unit = js.native
  def uniform3uiv(location: Null, data: Uint32Array, srcOffset: Double): Unit = js.native
  def uniform3uiv(location: Null, data: Uint32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform3uiv(location: WebGLUniformLocation, data: ArrayLike[Double]): Unit = js.native
  def uniform3uiv(location: WebGLUniformLocation, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniform3uiv(location: WebGLUniformLocation, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform3uiv(location: WebGLUniformLocation, data: Uint32Array): Unit = js.native
  def uniform3uiv(location: WebGLUniformLocation, data: Uint32Array, srcOffset: Double): Unit = js.native
  def uniform3uiv(location: WebGLUniformLocation, data: Uint32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform4fv(location: Null, data: ArrayLike[Double]): Unit = js.native
  def uniform4fv(location: Null, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniform4fv(location: Null, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform4fv(location: Null, data: Float32Array): Unit = js.native
  def uniform4fv(location: Null, data: Float32Array, srcOffset: Double): Unit = js.native
  def uniform4fv(location: Null, data: Float32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform4fv(location: WebGLUniformLocation, data: ArrayLike[Double]): Unit = js.native
  def uniform4fv(location: WebGLUniformLocation, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniform4fv(location: WebGLUniformLocation, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform4fv(location: WebGLUniformLocation, data: Float32Array): Unit = js.native
  def uniform4fv(location: WebGLUniformLocation, data: Float32Array, srcOffset: Double): Unit = js.native
  def uniform4fv(location: WebGLUniformLocation, data: Float32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform4iv(location: Null, data: ArrayLike[Double]): Unit = js.native
  def uniform4iv(location: Null, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniform4iv(location: Null, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform4iv(location: Null, data: Int32Array): Unit = js.native
  def uniform4iv(location: Null, data: Int32Array, srcOffset: Double): Unit = js.native
  def uniform4iv(location: Null, data: Int32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform4iv(location: WebGLUniformLocation, data: ArrayLike[Double]): Unit = js.native
  def uniform4iv(location: WebGLUniformLocation, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniform4iv(location: WebGLUniformLocation, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform4iv(location: WebGLUniformLocation, data: Int32Array): Unit = js.native
  def uniform4iv(location: WebGLUniformLocation, data: Int32Array, srcOffset: Double): Unit = js.native
  def uniform4iv(location: WebGLUniformLocation, data: Int32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform4ui(location: Null, v0: Double, v1: Double, v2: Double, v3: Double): Unit = js.native
  def uniform4ui(location: WebGLUniformLocation, v0: Double, v1: Double, v2: Double, v3: Double): Unit = js.native
  def uniform4uiv(location: Null, data: ArrayLike[Double]): Unit = js.native
  def uniform4uiv(location: Null, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniform4uiv(location: Null, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform4uiv(location: Null, data: Uint32Array): Unit = js.native
  def uniform4uiv(location: Null, data: Uint32Array, srcOffset: Double): Unit = js.native
  def uniform4uiv(location: Null, data: Uint32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform4uiv(location: WebGLUniformLocation, data: ArrayLike[Double]): Unit = js.native
  def uniform4uiv(location: WebGLUniformLocation, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniform4uiv(location: WebGLUniformLocation, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniform4uiv(location: WebGLUniformLocation, data: Uint32Array): Unit = js.native
  def uniform4uiv(location: WebGLUniformLocation, data: Uint32Array, srcOffset: Double): Unit = js.native
  def uniform4uiv(location: WebGLUniformLocation, data: Uint32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniformBlockBinding(program: WebGLProgram, uniformBlockIndex: Double, uniformBlockBinding: Double): Unit = js.native
  def uniformMatrix2fv(location: Null, transpose: Boolean, data: ArrayLike[Double]): Unit = js.native
  def uniformMatrix2fv(location: Null, transpose: Boolean, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniformMatrix2fv(location: Null, transpose: Boolean, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniformMatrix2fv(location: Null, transpose: Boolean, data: Float32Array): Unit = js.native
  def uniformMatrix2fv(location: Null, transpose: Boolean, data: Float32Array, srcOffset: Double): Unit = js.native
  def uniformMatrix2fv(location: Null, transpose: Boolean, data: Float32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniformMatrix2fv(location: WebGLUniformLocation, transpose: Boolean, data: ArrayLike[Double]): Unit = js.native
  def uniformMatrix2fv(location: WebGLUniformLocation, transpose: Boolean, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniformMatrix2fv(
    location: WebGLUniformLocation,
    transpose: Boolean,
    data: ArrayLike[Double],
    srcOffset: Double,
    srcLength: Double
  ): Unit = js.native
  def uniformMatrix2fv(location: WebGLUniformLocation, transpose: Boolean, data: Float32Array): Unit = js.native
  def uniformMatrix2fv(location: WebGLUniformLocation, transpose: Boolean, data: Float32Array, srcOffset: Double): Unit = js.native
  def uniformMatrix2fv(
    location: WebGLUniformLocation,
    transpose: Boolean,
    data: Float32Array,
    srcOffset: Double,
    srcLength: Double
  ): Unit = js.native
  def uniformMatrix2x3fv(location: Null, transpose: Boolean, data: ArrayLike[Double]): Unit = js.native
  def uniformMatrix2x3fv(location: Null, transpose: Boolean, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniformMatrix2x3fv(location: Null, transpose: Boolean, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniformMatrix2x3fv(location: Null, transpose: Boolean, data: Float32Array): Unit = js.native
  def uniformMatrix2x3fv(location: Null, transpose: Boolean, data: Float32Array, srcOffset: Double): Unit = js.native
  def uniformMatrix2x3fv(location: Null, transpose: Boolean, data: Float32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniformMatrix2x3fv(location: WebGLUniformLocation, transpose: Boolean, data: ArrayLike[Double]): Unit = js.native
  def uniformMatrix2x3fv(location: WebGLUniformLocation, transpose: Boolean, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniformMatrix2x3fv(
    location: WebGLUniformLocation,
    transpose: Boolean,
    data: ArrayLike[Double],
    srcOffset: Double,
    srcLength: Double
  ): Unit = js.native
  def uniformMatrix2x3fv(location: WebGLUniformLocation, transpose: Boolean, data: Float32Array): Unit = js.native
  def uniformMatrix2x3fv(location: WebGLUniformLocation, transpose: Boolean, data: Float32Array, srcOffset: Double): Unit = js.native
  def uniformMatrix2x3fv(
    location: WebGLUniformLocation,
    transpose: Boolean,
    data: Float32Array,
    srcOffset: Double,
    srcLength: Double
  ): Unit = js.native
  def uniformMatrix2x4fv(location: Null, transpose: Boolean, data: ArrayLike[Double]): Unit = js.native
  def uniformMatrix2x4fv(location: Null, transpose: Boolean, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniformMatrix2x4fv(location: Null, transpose: Boolean, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniformMatrix2x4fv(location: Null, transpose: Boolean, data: Float32Array): Unit = js.native
  def uniformMatrix2x4fv(location: Null, transpose: Boolean, data: Float32Array, srcOffset: Double): Unit = js.native
  def uniformMatrix2x4fv(location: Null, transpose: Boolean, data: Float32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniformMatrix2x4fv(location: WebGLUniformLocation, transpose: Boolean, data: ArrayLike[Double]): Unit = js.native
  def uniformMatrix2x4fv(location: WebGLUniformLocation, transpose: Boolean, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniformMatrix2x4fv(
    location: WebGLUniformLocation,
    transpose: Boolean,
    data: ArrayLike[Double],
    srcOffset: Double,
    srcLength: Double
  ): Unit = js.native
  def uniformMatrix2x4fv(location: WebGLUniformLocation, transpose: Boolean, data: Float32Array): Unit = js.native
  def uniformMatrix2x4fv(location: WebGLUniformLocation, transpose: Boolean, data: Float32Array, srcOffset: Double): Unit = js.native
  def uniformMatrix2x4fv(
    location: WebGLUniformLocation,
    transpose: Boolean,
    data: Float32Array,
    srcOffset: Double,
    srcLength: Double
  ): Unit = js.native
  def uniformMatrix3fv(location: Null, transpose: Boolean, data: ArrayLike[Double]): Unit = js.native
  def uniformMatrix3fv(location: Null, transpose: Boolean, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniformMatrix3fv(location: Null, transpose: Boolean, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniformMatrix3fv(location: Null, transpose: Boolean, data: Float32Array): Unit = js.native
  def uniformMatrix3fv(location: Null, transpose: Boolean, data: Float32Array, srcOffset: Double): Unit = js.native
  def uniformMatrix3fv(location: Null, transpose: Boolean, data: Float32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniformMatrix3fv(location: WebGLUniformLocation, transpose: Boolean, data: ArrayLike[Double]): Unit = js.native
  def uniformMatrix3fv(location: WebGLUniformLocation, transpose: Boolean, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniformMatrix3fv(
    location: WebGLUniformLocation,
    transpose: Boolean,
    data: ArrayLike[Double],
    srcOffset: Double,
    srcLength: Double
  ): Unit = js.native
  def uniformMatrix3fv(location: WebGLUniformLocation, transpose: Boolean, data: Float32Array): Unit = js.native
  def uniformMatrix3fv(location: WebGLUniformLocation, transpose: Boolean, data: Float32Array, srcOffset: Double): Unit = js.native
  def uniformMatrix3fv(
    location: WebGLUniformLocation,
    transpose: Boolean,
    data: Float32Array,
    srcOffset: Double,
    srcLength: Double
  ): Unit = js.native
  def uniformMatrix3x2fv(location: Null, transpose: Boolean, data: ArrayLike[Double]): Unit = js.native
  def uniformMatrix3x2fv(location: Null, transpose: Boolean, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniformMatrix3x2fv(location: Null, transpose: Boolean, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniformMatrix3x2fv(location: Null, transpose: Boolean, data: Float32Array): Unit = js.native
  def uniformMatrix3x2fv(location: Null, transpose: Boolean, data: Float32Array, srcOffset: Double): Unit = js.native
  def uniformMatrix3x2fv(location: Null, transpose: Boolean, data: Float32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniformMatrix3x2fv(location: WebGLUniformLocation, transpose: Boolean, data: ArrayLike[Double]): Unit = js.native
  def uniformMatrix3x2fv(location: WebGLUniformLocation, transpose: Boolean, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniformMatrix3x2fv(
    location: WebGLUniformLocation,
    transpose: Boolean,
    data: ArrayLike[Double],
    srcOffset: Double,
    srcLength: Double
  ): Unit = js.native
  def uniformMatrix3x2fv(location: WebGLUniformLocation, transpose: Boolean, data: Float32Array): Unit = js.native
  def uniformMatrix3x2fv(location: WebGLUniformLocation, transpose: Boolean, data: Float32Array, srcOffset: Double): Unit = js.native
  def uniformMatrix3x2fv(
    location: WebGLUniformLocation,
    transpose: Boolean,
    data: Float32Array,
    srcOffset: Double,
    srcLength: Double
  ): Unit = js.native
  def uniformMatrix3x4fv(location: Null, transpose: Boolean, data: ArrayLike[Double]): Unit = js.native
  def uniformMatrix3x4fv(location: Null, transpose: Boolean, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniformMatrix3x4fv(location: Null, transpose: Boolean, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniformMatrix3x4fv(location: Null, transpose: Boolean, data: Float32Array): Unit = js.native
  def uniformMatrix3x4fv(location: Null, transpose: Boolean, data: Float32Array, srcOffset: Double): Unit = js.native
  def uniformMatrix3x4fv(location: Null, transpose: Boolean, data: Float32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniformMatrix3x4fv(location: WebGLUniformLocation, transpose: Boolean, data: ArrayLike[Double]): Unit = js.native
  def uniformMatrix3x4fv(location: WebGLUniformLocation, transpose: Boolean, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniformMatrix3x4fv(
    location: WebGLUniformLocation,
    transpose: Boolean,
    data: ArrayLike[Double],
    srcOffset: Double,
    srcLength: Double
  ): Unit = js.native
  def uniformMatrix3x4fv(location: WebGLUniformLocation, transpose: Boolean, data: Float32Array): Unit = js.native
  def uniformMatrix3x4fv(location: WebGLUniformLocation, transpose: Boolean, data: Float32Array, srcOffset: Double): Unit = js.native
  def uniformMatrix3x4fv(
    location: WebGLUniformLocation,
    transpose: Boolean,
    data: Float32Array,
    srcOffset: Double,
    srcLength: Double
  ): Unit = js.native
  def uniformMatrix4fv(location: Null, transpose: Boolean, data: ArrayLike[Double]): Unit = js.native
  def uniformMatrix4fv(location: Null, transpose: Boolean, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniformMatrix4fv(location: Null, transpose: Boolean, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniformMatrix4fv(location: Null, transpose: Boolean, data: Float32Array): Unit = js.native
  def uniformMatrix4fv(location: Null, transpose: Boolean, data: Float32Array, srcOffset: Double): Unit = js.native
  def uniformMatrix4fv(location: Null, transpose: Boolean, data: Float32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniformMatrix4fv(location: WebGLUniformLocation, transpose: Boolean, data: ArrayLike[Double]): Unit = js.native
  def uniformMatrix4fv(location: WebGLUniformLocation, transpose: Boolean, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniformMatrix4fv(
    location: WebGLUniformLocation,
    transpose: Boolean,
    data: ArrayLike[Double],
    srcOffset: Double,
    srcLength: Double
  ): Unit = js.native
  def uniformMatrix4fv(location: WebGLUniformLocation, transpose: Boolean, data: Float32Array): Unit = js.native
  def uniformMatrix4fv(location: WebGLUniformLocation, transpose: Boolean, data: Float32Array, srcOffset: Double): Unit = js.native
  def uniformMatrix4fv(
    location: WebGLUniformLocation,
    transpose: Boolean,
    data: Float32Array,
    srcOffset: Double,
    srcLength: Double
  ): Unit = js.native
  def uniformMatrix4x2fv(location: Null, transpose: Boolean, data: ArrayLike[Double]): Unit = js.native
  def uniformMatrix4x2fv(location: Null, transpose: Boolean, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniformMatrix4x2fv(location: Null, transpose: Boolean, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniformMatrix4x2fv(location: Null, transpose: Boolean, data: Float32Array): Unit = js.native
  def uniformMatrix4x2fv(location: Null, transpose: Boolean, data: Float32Array, srcOffset: Double): Unit = js.native
  def uniformMatrix4x2fv(location: Null, transpose: Boolean, data: Float32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniformMatrix4x2fv(location: WebGLUniformLocation, transpose: Boolean, data: ArrayLike[Double]): Unit = js.native
  def uniformMatrix4x2fv(location: WebGLUniformLocation, transpose: Boolean, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniformMatrix4x2fv(
    location: WebGLUniformLocation,
    transpose: Boolean,
    data: ArrayLike[Double],
    srcOffset: Double,
    srcLength: Double
  ): Unit = js.native
  def uniformMatrix4x2fv(location: WebGLUniformLocation, transpose: Boolean, data: Float32Array): Unit = js.native
  def uniformMatrix4x2fv(location: WebGLUniformLocation, transpose: Boolean, data: Float32Array, srcOffset: Double): Unit = js.native
  def uniformMatrix4x2fv(
    location: WebGLUniformLocation,
    transpose: Boolean,
    data: Float32Array,
    srcOffset: Double,
    srcLength: Double
  ): Unit = js.native
  def uniformMatrix4x3fv(location: Null, transpose: Boolean, data: ArrayLike[Double]): Unit = js.native
  def uniformMatrix4x3fv(location: Null, transpose: Boolean, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniformMatrix4x3fv(location: Null, transpose: Boolean, data: ArrayLike[Double], srcOffset: Double, srcLength: Double): Unit = js.native
  def uniformMatrix4x3fv(location: Null, transpose: Boolean, data: Float32Array): Unit = js.native
  def uniformMatrix4x3fv(location: Null, transpose: Boolean, data: Float32Array, srcOffset: Double): Unit = js.native
  def uniformMatrix4x3fv(location: Null, transpose: Boolean, data: Float32Array, srcOffset: Double, srcLength: Double): Unit = js.native
  def uniformMatrix4x3fv(location: WebGLUniformLocation, transpose: Boolean, data: ArrayLike[Double]): Unit = js.native
  def uniformMatrix4x3fv(location: WebGLUniformLocation, transpose: Boolean, data: ArrayLike[Double], srcOffset: Double): Unit = js.native
  def uniformMatrix4x3fv(
    location: WebGLUniformLocation,
    transpose: Boolean,
    data: ArrayLike[Double],
    srcOffset: Double,
    srcLength: Double
  ): Unit = js.native
  def uniformMatrix4x3fv(location: WebGLUniformLocation, transpose: Boolean, data: Float32Array): Unit = js.native
  def uniformMatrix4x3fv(location: WebGLUniformLocation, transpose: Boolean, data: Float32Array, srcOffset: Double): Unit = js.native
  def uniformMatrix4x3fv(
    location: WebGLUniformLocation,
    transpose: Boolean,
    data: Float32Array,
    srcOffset: Double,
    srcLength: Double
  ): Unit = js.native
  /* Writing to the drawing buffer */
  def vertexAttribDivisor(index: Double, divisor: Double): Unit = js.native
  /* Vertex attribs */
  def vertexAttribI4i(index: Double, x: Double, y: Double, z: Double, w: Double): Unit = js.native
  def vertexAttribI4iv(index: Double, values: ArrayLike[Double]): Unit = js.native
  def vertexAttribI4iv(index: Double, values: Int32Array): Unit = js.native
  def vertexAttribI4ui(index: Double, x: Double, y: Double, z: Double, w: Double): Unit = js.native
  def vertexAttribI4uiv(index: Double, values: ArrayLike[Double]): Unit = js.native
  def vertexAttribI4uiv(index: Double, values: Uint32Array): Unit = js.native
  def vertexAttribIPointer(index: Double, size: Double, `type`: Double, stride: Double, offset: Double): Unit = js.native
  def waitSync(sync: WebGLSync, flags: Double, timeout: Double): Unit = js.native
}

