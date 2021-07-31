package typings.webglExt

import typings.std.EXTTextureFilterAnisotropic
import typings.std.WEBGLCompressedTextureS3tc
import typings.std.WEBGLDepthTexture
import typings.std.WEBGLLoseContext
import typings.webglExt.webglExtStrings.EXT_color_buffer_half_float
import typings.webglExt.webglExtStrings.WEBGL_compressed_texture_atc
import typings.webglExt.webglExtStrings.WEBGL_compressed_texture_etc1
import typings.webglExt.webglExtStrings.WEBGL_compressed_texture_pvrtc
import typings.webglExt.webglExtStrings.WEBKIT_EXT_texture_filter_anisotropic
import typings.webglExt.webglExtStrings.WEBKIT_WEBGL_compressed_texture_atc
import typings.webglExt.webglExtStrings.WEBKIT_WEBGL_compressed_texture_pvrtc
import typings.webglExt.webglExtStrings.WEBKIT_WEBGL_compressed_texture_s3tc
import typings.webglExt.webglExtStrings.WEBKIT_WEBGL_depth_texture
import typings.webglExt.webglExtStrings.WEBKIT_WEBGL_lose_context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGL1Extensions extends StObject {
  
  @JSName("getExtension")
  def getExtension_EXTcolorbufferhalffloat(name: EXT_color_buffer_half_float): EXTColorBufferHalfFloat = js.native
  @JSName("getExtension")
  def getExtension_WEBGLcompressedtextureatc(name: WEBGL_compressed_texture_atc): WEBGLCompressedTextureAtc = js.native
  @JSName("getExtension")
  def getExtension_WEBGLcompressedtextureetc1(name: WEBGL_compressed_texture_etc1): WEBGLCompressedTextureEtc1 = js.native
  @JSName("getExtension")
  def getExtension_WEBGLcompressedtexturepvrtc(name: WEBGL_compressed_texture_pvrtc): WEBKITWEBGLCompressedTexturePvrtc = js.native
  // Prefixed versions appearing in the wild as per February 2018
  @JSName("getExtension")
  def getExtension_WEBKITEXTtexturefilteranisotropic(name: WEBKIT_EXT_texture_filter_anisotropic): EXTTextureFilterAnisotropic = js.native
  // Chrome
  @JSName("getExtension")
  def getExtension_WEBKITWEBGLcompressedtextureatc(name: WEBKIT_WEBGL_compressed_texture_atc): WEBGLCompressedTextureAtc = js.native
  // Android
  @JSName("getExtension")
  def getExtension_WEBKITWEBGLcompressedtexturepvrtc(name: WEBKIT_WEBGL_compressed_texture_pvrtc): WEBKITWEBGLCompressedTexturePvrtc = js.native
  // Safari iOS
  @JSName("getExtension")
  def getExtension_WEBKITWEBGLcompressedtextures3tc(name: WEBKIT_WEBGL_compressed_texture_s3tc): WEBGLCompressedTextureS3tc = js.native
  // Chrome
  @JSName("getExtension")
  def getExtension_WEBKITWEBGLdepthtexture(name: WEBKIT_WEBGL_depth_texture): WEBGLDepthTexture = js.native
  // Chrome
  @JSName("getExtension")
  def getExtension_WEBKITWEBGLlosecontext(name: WEBKIT_WEBGL_lose_context): WEBGLLoseContext = js.native
}
