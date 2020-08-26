package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Page {
  type Constructor = js.Function1[
    /* options */ typings.wechatMiniprogram.WechatMiniprogram.Page.Options[
      typings.wechatMiniprogram.WechatMiniprogram.Page.DataOption, 
      typings.wechatMiniprogram.WechatMiniprogram.Page.CustomOption
    ], 
    scala.Unit
  ]
  type CustomOption = typings.std.Record[java.lang.String, js.Any]
  type DataOption = typings.std.Record[java.lang.String, js.Any]
  type Instance[TData /* <: typings.wechatMiniprogram.WechatMiniprogram.Page.DataOption */, TCustom /* <: typings.wechatMiniprogram.WechatMiniprogram.Page.CustomOption */] = typings.wechatMiniprogram.anon.OptionalInterfaceILifetim with typings.wechatMiniprogram.WechatMiniprogram.Page.InstanceProperties with typings.wechatMiniprogram.WechatMiniprogram.Page.InstanceMethods[TData] with typings.wechatMiniprogram.WechatMiniprogram.Page.Data[TData] with TCustom
  type InstanceMethods[D /* <: typings.wechatMiniprogram.WechatMiniprogram.Page.DataOption */] = typings.wechatMiniprogram.WechatMiniprogram.Component.InstanceMethods[D]
  type Options[TData /* <: typings.wechatMiniprogram.WechatMiniprogram.Page.DataOption */, TCustom /* <: typings.wechatMiniprogram.WechatMiniprogram.Page.CustomOption */] = TCustom with typings.std.Partial[typings.wechatMiniprogram.WechatMiniprogram.Page.Data[TData]] with typings.wechatMiniprogram.anon.PartialILifetime with (typings.std.ThisType[typings.wechatMiniprogram.WechatMiniprogram.Page.Instance[TData, TCustom]])
  type TrivialInstance = typings.wechatMiniprogram.WechatMiniprogram.Page.Instance[
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
  type getCurrentPages = js.Function0[
    js.Array[
      typings.wechatMiniprogram.WechatMiniprogram.Page.Instance[
        typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
        typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
      ]
    ]
  ]
}
