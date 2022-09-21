package typings.wechatMiniprogram

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.Exclude
import typings.std.Pick
import typings.std.Required
import typings.wechatMiniprogram.anon.OptionalRecordcompletesuc
import typings.wechatMiniprogram.wechatMiniprogramStrings.complete
import typings.wechatMiniprogram.wechatMiniprogramStrings.fail
import typings.wechatMiniprogram.wechatMiniprogramStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnyArray = js.Array[Any]

type AnyObject = StringDictionary[Any]

type IAPIFunction[T, P /* <: IAPIParam[T] */] = js.Function1[/* param */ js.UndefOr[P], js.Promise[T]]

type ICloudServices = StringDictionary[ICloudService]

type OQ[T /* <: OptionalRecordcompletesuc */] = (RQ[T] & (Required[Pick[T, success]])) | (RQ[T] & (Required[Pick[T, fail]])) | (RQ[T] & (Required[Pick[T, complete]])) | (RQ[T] & (Required[Pick[T, success | fail]])) | (RQ[T] & (Required[Pick[T, success | complete]])) | (RQ[T] & (Required[Pick[T, fail | complete]])) | (RQ[T] & (Required[Pick[T, fail | complete | success]]))

type Optional[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]:? T[K]}
  */ typings.wechatMiniprogram.wechatMiniprogramStrings.Optional & TopLevel[T]

type RQ[T /* <: OptionalRecordcompletesuc */] = Pick[T, Exclude[/* keyof T */ String, complete | success | fail]]
