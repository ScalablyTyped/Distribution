package typings.wikibaseSdk

import typings.std.IArguments
import typings.std.Partial
import typings.std.PropertyKey
import typings.std.Record
import typings.wikibaseSdk.distSrcTypesOptionsMod.WmLanguageCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsUtilsMod {
  
  @JSImport("wikibase-sdk/dist/src/utils/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fixedEncodeURIComponent(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fixedEncodeURIComponent")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def forceArray[T /* <: String */](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("forceArray")().asInstanceOf[js.Array[T]]
  inline def forceArray[T /* <: String */](array: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("forceArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def forceArray[T /* <: String */](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("forceArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def isAKey[T /* <: PropertyKey */](obj: Partial[Record[T, Any]], key: PropertyKey): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAKey")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  
  inline def isOfType[T /* <: String */](all: js.Array[T], element: Any): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isOfType")(all.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  
  inline def isPlainObject(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def rejectObsoleteInterface(args: IArguments): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rejectObsoleteInterface")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def replaceSpaceByUnderscores(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceSpaceByUnderscores")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def shortLang(language: String): WmLanguageCode = ^.asInstanceOf[js.Dynamic].applyDynamic("shortLang")(language.asInstanceOf[js.Any]).asInstanceOf[WmLanguageCode]
  
  inline def typedEntries[K /* <: String */, V](input: Partial[Record[K, V]]): js.Array[js.Tuple2[K, V]] = ^.asInstanceOf[js.Dynamic].applyDynamic("typedEntries")(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[K, V]]]
  
  inline def uniq[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniq")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
