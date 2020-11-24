package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Behavior {
  
  type BehaviorIdentifier = java.lang.String
  
  type Constructor = js.Function1[
    /* options */ typings.wechatMiniprogram.WechatMiniprogram.Behavior.Options[
      typings.wechatMiniprogram.WechatMiniprogram.Behavior.DataOption, 
      typings.wechatMiniprogram.WechatMiniprogram.Behavior.PropertyOption, 
      typings.wechatMiniprogram.WechatMiniprogram.Behavior.MethodOption, 
      typings.std.Record[java.lang.String, scala.Nothing]
    ], 
    typings.wechatMiniprogram.WechatMiniprogram.Behavior.BehaviorIdentifier
  ]
  
  type Data[D /* <: typings.wechatMiniprogram.WechatMiniprogram.Behavior.DataOption */] = typings.wechatMiniprogram.WechatMiniprogram.Component.Data[D]
  
  type DataOption = typings.wechatMiniprogram.WechatMiniprogram.Component.DataOption
  
  type DefinitionFilter = typings.wechatMiniprogram.WechatMiniprogram.Component.DefinitionFilter
  
  type Instance[TData /* <: typings.wechatMiniprogram.WechatMiniprogram.Behavior.DataOption */, TProperty /* <: typings.wechatMiniprogram.WechatMiniprogram.Behavior.PropertyOption */, TMethod /* <: typings.wechatMiniprogram.WechatMiniprogram.Behavior.MethodOption */, TCustomInstanceProperty /* <: typings.wechatMiniprogram.WechatMiniprogram.IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.Component.Instance[
    TData, 
    TProperty, 
    TMethod, 
    TCustomInstanceProperty, 
    typings.wechatMiniprogram.wechatMiniprogramBooleans.`false`
  ]
  
  type Lifetimes = typings.wechatMiniprogram.WechatMiniprogram.Component.Lifetimes
  
  type Method[M /* <: typings.wechatMiniprogram.WechatMiniprogram.Behavior.MethodOption */] = typings.wechatMiniprogram.WechatMiniprogram.Component.Method[M, typings.wechatMiniprogram.wechatMiniprogramBooleans.`false`]
  
  type MethodOption = typings.wechatMiniprogram.WechatMiniprogram.Component.MethodOption
  
  type Property[P /* <: typings.wechatMiniprogram.WechatMiniprogram.Behavior.PropertyOption */] = typings.wechatMiniprogram.WechatMiniprogram.Component.Property[P]
  
  type PropertyOption = typings.wechatMiniprogram.WechatMiniprogram.Component.PropertyOption
  
  type TrivialInstance = typings.wechatMiniprogram.WechatMiniprogram.Behavior.Instance[
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.wechatMiniprogram.WechatMiniprogram.IAnyObject, 
    typings.std.Record[java.lang.String, scala.Nothing]
  ]
}
