package typings.wegameApi.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IOS及安卓不支持：
  *     pixelStorei 当第一个参数是 gl.UNPACK_COLORSPACE_CONVERSION_WEBGL 时不支持
  *     compressedTexImage2D不支持
  *     compressedTexSubImage2D不支持
  * 安卓不支持：
  *     getExtension
  *     getSupportedExtensions
  */
@JSGlobal("WxWebGLRenderingContext")
@js.native
class WxWebGLRenderingContext ()
  extends typings.wegameApi.WxWebGLRenderingContext

