package typings.web3StorageMultipartParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsMod {
  
  @JSImport("@web3-storage/multipart-parser/types/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayToString(a: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayToString")(a.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def arraysEqual(a: String, b: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arraysEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def arraysEqual(a: String, b: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arraysEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def arraysEqual(a: String, b: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arraysEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def arraysEqual(a: js.Array[Any], b: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arraysEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def arraysEqual(a: js.Array[Any], b: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arraysEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def arraysEqual(a: js.Array[Any], b: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arraysEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def mergeArrays(arrays: js.typedarray.Uint8Array*): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeArrays")(arrays.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def stringToArray(s: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToArray")(s.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def stringToArray(s: Boolean): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToArray")(s.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def stringToArray(s: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToArray")(s.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
