package typings.toughCookieFileStore

import org.scalablytyped.runtime.StringDictionary
import typings.toughCookie.mod.Cookie
import typings.toughCookie.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tough-cookie-file-store", "FileCookieStore")
  @js.native
  open class FileCookieStore protected () extends Store {
    def this(filePath: String) = this()
    
    var filePath: String = js.native
    
    def findCookies(
      domain: String,
      path: String,
      cb: js.Function2[/* err */ js.Error | Null, /* cookie */ js.Array[Cookie], Unit]
    ): Unit = js.native
    
    var idx: StringDictionary[StringDictionary[StringDictionary[Cookie]]] = js.native
    
    def removeAllCookies(cb: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  }
}
