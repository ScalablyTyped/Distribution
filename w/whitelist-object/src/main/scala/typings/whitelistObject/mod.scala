package typings.whitelistObject

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(`object`: StringDictionary[Any], keys: js.Array[String]): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  inline def apply(`object`: StringDictionary[Any], keys: js.Array[String], shallow: Boolean): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], shallow.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  @JSImport("whitelist-object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
