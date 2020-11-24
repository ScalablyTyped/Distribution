package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object wechatMiniprogram {
  
  type AnyArray = js.Array[js.Any]
  
  type AnyFunction = js.Function1[/* repeated */ js.Any, js.Any]
  
  type AnyObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type IAPIFunction[T, P /* <: typings.wechatMiniprogram.IAPIParam[T] */] = js.Function1[/* param */ js.UndefOr[P], js.Promise[T]]
  
  type ICloudServices = org.scalablytyped.runtime.StringDictionary[typings.wechatMiniprogram.ICloudService]
  
  type OQ[T /* <: typings.wechatMiniprogram.anon.OptionalRecordcompletesuc */] = (typings.wechatMiniprogram.RQ[T] with (typings.std.Required[typings.std.Pick[T, typings.wechatMiniprogram.wechatMiniprogramStrings.success]])) | (typings.wechatMiniprogram.RQ[T] with (typings.std.Required[typings.std.Pick[T, typings.wechatMiniprogram.wechatMiniprogramStrings.fail]])) | (typings.wechatMiniprogram.RQ[T] with (typings.std.Required[typings.std.Pick[T, typings.wechatMiniprogram.wechatMiniprogramStrings.complete]])) | (typings.wechatMiniprogram.RQ[T] with (typings.std.Required[
    typings.std.Pick[
      T, 
      typings.wechatMiniprogram.wechatMiniprogramStrings.success | typings.wechatMiniprogram.wechatMiniprogramStrings.fail
    ]
  ])) | (typings.wechatMiniprogram.RQ[T] with (typings.std.Required[
    typings.std.Pick[
      T, 
      typings.wechatMiniprogram.wechatMiniprogramStrings.success | typings.wechatMiniprogram.wechatMiniprogramStrings.complete
    ]
  ])) | (typings.wechatMiniprogram.RQ[T] with (typings.std.Required[
    typings.std.Pick[
      T, 
      typings.wechatMiniprogram.wechatMiniprogramStrings.fail | typings.wechatMiniprogram.wechatMiniprogramStrings.complete
    ]
  ])) | (typings.wechatMiniprogram.RQ[T] with (typings.std.Required[
    typings.std.Pick[
      T, 
      typings.wechatMiniprogram.wechatMiniprogramStrings.fail | typings.wechatMiniprogram.wechatMiniprogramStrings.complete | typings.wechatMiniprogram.wechatMiniprogramStrings.success
    ]
  ]))
  
  type Optional[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? T[K]}
    */ typings.wechatMiniprogram.wechatMiniprogramStrings.Optional with org.scalablytyped.runtime.TopLevel[T]
  
  type RQ[T /* <: typings.wechatMiniprogram.anon.OptionalRecordcompletesuc */] = typings.std.Pick[
    T, 
    typings.std.Exclude[
      /* keyof T */ java.lang.String, 
      typings.wechatMiniprogram.wechatMiniprogramStrings.complete | typings.wechatMiniprogram.wechatMiniprogramStrings.success | typings.wechatMiniprogram.wechatMiniprogramStrings.fail
    ]
  ]
}
