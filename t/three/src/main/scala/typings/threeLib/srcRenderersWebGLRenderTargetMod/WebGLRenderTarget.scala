package typings
package threeLib.srcRenderersWebGLRenderTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/WebGLRenderTarget", "WebGLRenderTarget")
@js.native
class WebGLRenderTarget protected ()
  extends threeLib.srcCoreEventDispatcherMod.EventDispatcher {
  def this(width: scala.Double, height: scala.Double) = this()
  def this(width: scala.Double, height: scala.Double, options: WebGLRenderTargetOptions) = this()
  /**
  	 * @deprecated Use {@link Texture#anisotropy texture.anisotropy} instead.
  	 */
  var anisotropy: js.Any = js.native
  var depthBuffer: scala.Boolean = js.native
  var depthTexture: threeLib.srcTexturesTextureMod.Texture = js.native
  /**
  	 * @deprecated Use {@link Texture#format texture.format} instead.
  	 */
  var format: js.Any = js.native
  /**
  	 * @deprecated Use {@link Texture#generateMipmaps texture.generateMipmaps} instead.
  	 */
  var generateMipmaps: js.Any = js.native
  var height: scala.Double = js.native
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
  var scissor: threeLib.srcMathVector4Mod.Vector4 = js.native
  var scissorTest: scala.Boolean = js.native
  var stencilBuffer: scala.Boolean = js.native
  var texture: threeLib.srcTexturesTextureMod.Texture = js.native
  /**
  	 * @deprecated Use {@link Texture#type texture.type} instead.
  	 */
  var `type`: js.Any = js.native
  var uuid: java.lang.String = js.native
  var viewport: threeLib.srcMathVector4Mod.Vector4 = js.native
  var width: scala.Double = js.native
  /**
  	 * @deprecated Use {@link Texture#wrapS texture.wrapS} instead.
  	 */
  var wrapS: js.Any = js.native
  /**
  	 * @deprecated Use {@link Texture#wrapT texture.wrapT} instead.
  	 */
  var wrapT: js.Any = js.native
  def copy(source: WebGLRenderTarget): this.type = js.native
  def dispose(): scala.Unit = js.native
  def setSize(width: scala.Double, height: scala.Double): scala.Unit = js.native
}

