package typings.whitelistObject

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(`object`: StringDictionary[js.Any], keys: js.Array[String]): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  inline def apply(`object`: StringDictionary[js.Any], keys: js.Array[String], shallow: Boolean): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], shallow.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  @JSImport("whitelist-object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
