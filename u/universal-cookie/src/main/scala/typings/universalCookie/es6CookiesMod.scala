package typings.universalCookie

import typings.universalCookie.es6TypesMod.Cookie
import typings.universalCookie.es6TypesMod.CookieChangeListener
import typings.universalCookie.es6TypesMod.CookieGetOptions
import typings.universalCookie.es6TypesMod.CookieParseOptions
import typings.universalCookie.es6TypesMod.CookieSetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6CookiesMod {
  
  @JSImport("universal-cookie/es6/Cookies", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Cookies {
    def this(cookies: String) = this()
    def this(cookies: js.Object) = this()
    def this(cookies: String, options: CookieParseOptions) = this()
    def this(cookies: js.Object, options: CookieParseOptions) = this()
    def this(cookies: Null, options: CookieParseOptions) = this()
    def this(cookies: Unit, options: CookieParseOptions) = this()
  }
  
  @js.native
  trait Cookies extends StObject {
    
    /* private */ var HAS_DOCUMENT_COOKIE: Any = js.native
    
    /* private */ var _emitChange: Any = js.native
    
    /* private */ var _updateBrowserValues: Any = js.native
    
    def addChangeListener(callback: CookieChangeListener): Unit = js.native
    
    /* private */ var changeListeners: Any = js.native
    
    /* private */ var cookies: Any = js.native
    
    def get(name: String): Any = js.native
    def get(name: String, options: CookieGetOptions): Any = js.native
    
    def getAll(): Any = js.native
    def getAll(options: CookieGetOptions): Any = js.native
    @JSName("getAll")
    def getAll_T_T[T](): T = js.native
    @JSName("getAll")
    def getAll_T_T[T](options: CookieGetOptions): T = js.native
    
    @JSName("get")
    def get_T_T[T](name: String): T = js.native
    @JSName("get")
    def get_T_T[T](name: String, options: CookieGetOptions): T = js.native
    
    def remove(name: String): Unit = js.native
    def remove(name: String, options: CookieSetOptions): Unit = js.native
    
    def removeChangeListener(callback: CookieChangeListener): Unit = js.native
    
    def set(name: String, value: Cookie): Unit = js.native
    def set(name: String, value: Cookie, options: CookieSetOptions): Unit = js.native
  }
}
