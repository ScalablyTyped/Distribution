package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Behavior {
  type Constructor = js.Function1[
    /* options */ typings.wechatMiniprogram.WechatMiniprogram.Behavior.Options[
      typings.wechatMiniprogram.WechatMiniprogram.Behavior.DataOption, 
      typings.wechatMiniprogram.WechatMiniprogram.Behavior.PropertyOption, 
      typings.wechatMiniprogram.WechatMiniprogram.Behavior.MethodOption
    ], 
    java.lang.String
  ]
  type Data[D /* <: typings.wechatMiniprogram.WechatMiniprogram.Behavior.DataOption */] = typings.wechatMiniprogram.WechatMiniprogram.Component.Data[D]
  type DataOption = typings.wechatMiniprogram.WechatMiniprogram.Component.DataOption
  type DefinitionFilter = typings.wechatMiniprogram.WechatMiniprogram.Component.DefinitionFilter
  type Instance[TData /* <: typings.wechatMiniprogram.WechatMiniprogram.Behavior.DataOption */, TProperty /* <: typings.wechatMiniprogram.WechatMiniprogram.Behavior.PropertyOption */, TMethod /* <: typings.wechatMiniprogram.WechatMiniprogram.Behavior.MethodOption */] = typings.wechatMiniprogram.WechatMiniprogram.Component.Instance[TData, TProperty, TMethod, js.Object]
  type Lifetimes = typings.wechatMiniprogram.WechatMiniprogram.Component.Lifetimes
  type Method[M /* <: typings.wechatMiniprogram.WechatMiniprogram.Behavior.MethodOption */] = typings.wechatMiniprogram.WechatMiniprogram.Component.Method[M]
  type MethodOption = typings.wechatMiniprogram.WechatMiniprogram.Component.MethodOption
  type Property[P /* <: typings.wechatMiniprogram.WechatMiniprogram.Behavior.PropertyOption */] = typings.wechatMiniprogram.WechatMiniprogram.Component.Property[P]
  type PropertyOption = typings.wechatMiniprogram.WechatMiniprogram.Component.PropertyOption
  type TrivialInstance = typings.wechatMiniprogram.WechatMiniprogram.Behavior.Instance[
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject
  ]
}
