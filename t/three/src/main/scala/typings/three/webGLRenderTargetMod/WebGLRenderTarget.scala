package typings.three.webGLRenderTargetMod

import typings.three.depthTextureMod.DepthTexture
import typings.three.eventDispatcherMod.EventDispatcher
import typings.three.textureMod.Texture
import typings.three.threeBooleans.`true`
import typings.three.vector4Mod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/WebGLRenderTarget", "WebGLRenderTarget")
@js.native
class WebGLRenderTarget protected () extends EventDispatcher {
  def this(width: Double, height: Double) = this()
  def this(width: Double, height: Double, options: WebGLRenderTargetOptions) = this()
  /**
  	 * @deprecated Use {@link Texture#anisotropy texture.anisotropy} instead.
  	 */
  var anisotropy: js.Any = js.native
  var depthBuffer: Boolean = js.native
  var depthTexture: DepthTexture = js.native
  /**
  	 * @deprecated Use {@link Texture#format texture.format} instead.
  	 */
  var format: js.Any = js.native
  /**
  	 * @deprecated Use {@link Texture#generateMipmaps texture.generateMipmaps} instead.
  	 */
  var generateMipmaps: js.Any = js.native
  var height: Double = js.native
  val isWebGLRenderTarget: `true` = js.native
  /**
  	 * @deprecated Use {@link Texture#magFilter texture.magFilter} instead.
  	 */
  var magFilter: js.Any = js.native
  /**
  	 * @deprecated Use {@link Texture#minFilter texture.minFilter} instead.
  	 */
  var minFilter: js.Any = js.native
  /**
  	 * @deprecated Use {@link Texture#offset texture.offset} instead.
  	 */
  var offset: js.Any = js.native
  /**
  	 * @deprecated Use {@link Texture#repeat texture.repeat} instead.
  	 */
  var repeat: js.Any = js.native
  var scissor: Vector4 = js.native
  var scissorTest: Boolean = js.native
  var stencilBuffer: Boolean = js.native
  var texture: Texture = js.native
  /**
  	 * @deprecated Use {@link Texture#type texture.type} instead.
  	 */
  var `type`: js.Any = js.native
  var uuid: String = js.native
  var viewport: Vector4 = js.native
  var width: Double = js.native
  /**
  	 * @deprecated Use {@link Texture#wrapS texture.wrapS} instead.
  	 */
  var wrapS: js.Any = js.native
  /**
  	 * @deprecated Use {@link Texture#wrapT texture.wrapT} instead.
  	 */
  var wrapT: js.Any = js.native
  def copy(source: WebGLRenderTarget): this.type = js.native
  def dispose(): Unit = js.native
  def setSize(width: Double, height: Double): Unit = js.native
}

