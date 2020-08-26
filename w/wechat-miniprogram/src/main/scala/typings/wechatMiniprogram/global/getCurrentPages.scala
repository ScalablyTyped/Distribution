package typings.wechatMiniprogram.global

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 获取当前页面栈。数组中第一个元素为首页，最后一个元素为当前页面。
  *  __注意：__
  *  - __不要尝试修改页面栈，会导致路由以及页面状态错误。__
  *  - 不要在 `App.onLaunch` 的时候调用 `getCurrentPages()`，此时 `page` 还没有生成。
  */
@JSGlobal("getCurrentPages")
@js.native
object getCurrentPages
  extends TopLevel[typings.wechatMiniprogram.WechatMiniprogram.Page.getCurrentPages]

