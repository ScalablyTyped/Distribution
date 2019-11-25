package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region 媒体API列表
// 媒体-----图片
/* Rewritten from type alias, can be one of: 
  - typings.weixinDashApp.weixinDashAppStrings.original
  - typings.weixinDashApp.weixinDashAppStrings.compressed
*/
trait ImageSizeType extends js.Object

object ImageSizeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compressed: typings.weixinDashApp.weixinDashAppStrings.compressed = this.cast("compressed")
  @scala.inline
  def original: typings.weixinDashApp.weixinDashAppStrings.original = this.cast("original")
}

