package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Canvas")
@js.native
class Canvas () extends js.Object {
  /**
    * 画布的高度
    */
  var height: scala.Double = js.native
  /**
    * 画布的宽度
    */
  var width: scala.Double = js.native
  /**
    * 获取画布对象的绘图上下文
    * @param contextType 上下文类型
    * @param contextAttributes webgl 上下文属性，仅当 contextType 为 webgl 时有效
    */
  @JSName("getContext")
  def getContext_2d(contextType: wegameDashApiLib.wegameDashApiLibStrings.`2d`): WxRenderingContext | WxWebGLRenderingContext = js.native
  @JSName("getContext")
  def getContext_2d(
    contextType: wegameDashApiLib.wegameDashApiLibStrings.`2d`,
    contextAttributes: wegameDashApiLib.wxNs.typesNs.RenderingContextConfig
  ): WxRenderingContext | WxWebGLRenderingContext = js.native
  @JSName("getContext")
  def getContext_webgl(contextType: wegameDashApiLib.wegameDashApiLibStrings.webgl): WxRenderingContext | WxWebGLRenderingContext = js.native
  @JSName("getContext")
  def getContext_webgl(
    contextType: wegameDashApiLib.wegameDashApiLibStrings.webgl,
    contextAttributes: wegameDashApiLib.wxNs.typesNs.RenderingContextConfig
  ): WxRenderingContext | WxWebGLRenderingContext = js.native
  /**
    * 把画布上的绘制内容以一个 data URI 的格式返回
    */
  def toDataURL(): java.lang.String = js.native
  /**
    * 将当前 Canvas 保存为一个临时文件，并生成相应的临时文件路径。
    */
  def toTempFilePath(p: wegameDashApiLib.wxNs.typesNs.ToTempFileParams): scala.Unit = js.native
  /**
    * toTempFilePath 的同步版本
    */
  def toTempFilePathSync(p: wegameDashApiLib.wxNs.typesNs.ToTempFileSyncParams): java.lang.String = js.native
}

