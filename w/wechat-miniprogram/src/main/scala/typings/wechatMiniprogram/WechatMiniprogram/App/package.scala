package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object App {
  type Constructor = js.Function1[
    /* options */ typings.wechatMiniprogram.WechatMiniprogram.App.Options[typings.wechatMiniprogram.WechatMiniprogram.IAnyObject], 
    scala.Unit
  ]
  type GetApp = js.Function1[
    /* opts */ js.UndefOr[typings.wechatMiniprogram.WechatMiniprogram.App.GetAppOption], 
    typings.wechatMiniprogram.WechatMiniprogram.App.Instance[typings.wechatMiniprogram.WechatMiniprogram.IAnyObject]
  ]
  type Instance[T /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.App.Option with T
  type Options[T /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.anon.PartialOption with T with typings.std.ThisType[typings.wechatMiniprogram.WechatMiniprogram.App.Instance[T]]
  type TrivialInstance = typings.wechatMiniprogram.WechatMiniprogram.App.Instance[typings.wechatMiniprogram.WechatMiniprogram.IAnyObject]
}
