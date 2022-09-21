package typings.trouter

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("trouter", JSImport.Namespace)
  @js.native
  open class ^[T] ()
    extends StObject
       with Trouter[T]
  
  trait FindResult[T] extends StObject {
    
    var handlers: js.Array[T]
    
    var params: StringDictionary[String]
  }
  object FindResult {
    
    inline def apply[T](handlers: js.Array[T], params: StringDictionary[String]): FindResult[T] = {
      val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindResult[T]]
    }
    
    extension [Self <: FindResult[?], T](x: Self & FindResult[T]) {
      
      inline def setHandlers(value: js.Array[T]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersVarargs(value: T*): Self = StObject.set(x, "handlers", js.Array(value*))
      
      inline def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.trouter.trouterStrings.ACL
    - typings.trouter.trouterStrings.BIND
    - typings.trouter.trouterStrings.CHECKOUT
    - typings.trouter.trouterStrings.CONNECT
    - typings.trouter.trouterStrings.COPY
    - typings.trouter.trouterStrings.DELETE
    - typings.trouter.trouterStrings.GET
    - typings.trouter.trouterStrings.HEAD
    - typings.trouter.trouterStrings.LINK
    - typings.trouter.trouterStrings.LOCK
    - typings.trouter.trouterStrings.`M-SEARCH`
    - typings.trouter.trouterStrings.MERGE
    - typings.trouter.trouterStrings.MKACTIVITY
    - typings.trouter.trouterStrings.MKCALENDAR
    - typings.trouter.trouterStrings.MKCOL
    - typings.trouter.trouterStrings.MOVE
    - typings.trouter.trouterStrings.NOTIFY
    - typings.trouter.trouterStrings.OPTIONS
    - typings.trouter.trouterStrings.PATCH
    - typings.trouter.trouterStrings.POST
    - typings.trouter.trouterStrings.PROPFIND
    - typings.trouter.trouterStrings.PROPPATCH
    - typings.trouter.trouterStrings.PURGE
    - typings.trouter.trouterStrings.PUT
    - typings.trouter.trouterStrings.REBIND
    - typings.trouter.trouterStrings.REPORT
    - typings.trouter.trouterStrings.SEARCH
    - typings.trouter.trouterStrings.SOURCE
    - typings.trouter.trouterStrings.SUBSCRIBE
    - typings.trouter.trouterStrings.TRACE
    - typings.trouter.trouterStrings.UNBIND
    - typings.trouter.trouterStrings.UNLINK
    - typings.trouter.trouterStrings.UNLOCK
    - typings.trouter.trouterStrings.UNSUBSCRIBE
  */
  trait HTTPMethod extends StObject
  object HTTPMethod {
    
    inline def ACL: typings.trouter.trouterStrings.ACL = "ACL".asInstanceOf[typings.trouter.trouterStrings.ACL]
    
    inline def BIND: typings.trouter.trouterStrings.BIND = "BIND".asInstanceOf[typings.trouter.trouterStrings.BIND]
    
    inline def CHECKOUT: typings.trouter.trouterStrings.CHECKOUT = "CHECKOUT".asInstanceOf[typings.trouter.trouterStrings.CHECKOUT]
    
    inline def CONNECT: typings.trouter.trouterStrings.CONNECT = "CONNECT".asInstanceOf[typings.trouter.trouterStrings.CONNECT]
    
    inline def COPY: typings.trouter.trouterStrings.COPY = "COPY".asInstanceOf[typings.trouter.trouterStrings.COPY]
    
    inline def DELETE: typings.trouter.trouterStrings.DELETE = "DELETE".asInstanceOf[typings.trouter.trouterStrings.DELETE]
    
    inline def GET: typings.trouter.trouterStrings.GET = "GET".asInstanceOf[typings.trouter.trouterStrings.GET]
    
    inline def HEAD: typings.trouter.trouterStrings.HEAD = "HEAD".asInstanceOf[typings.trouter.trouterStrings.HEAD]
    
    inline def LINK: typings.trouter.trouterStrings.LINK = "LINK".asInstanceOf[typings.trouter.trouterStrings.LINK]
    
    inline def LOCK: typings.trouter.trouterStrings.LOCK = "LOCK".asInstanceOf[typings.trouter.trouterStrings.LOCK]
    
    inline def `M-SEARCH`: typings.trouter.trouterStrings.`M-SEARCH` = "M-SEARCH".asInstanceOf[typings.trouter.trouterStrings.`M-SEARCH`]
    
    inline def MERGE: typings.trouter.trouterStrings.MERGE = "MERGE".asInstanceOf[typings.trouter.trouterStrings.MERGE]
    
    inline def MKACTIVITY: typings.trouter.trouterStrings.MKACTIVITY = "MKACTIVITY".asInstanceOf[typings.trouter.trouterStrings.MKACTIVITY]
    
    inline def MKCALENDAR: typings.trouter.trouterStrings.MKCALENDAR = "MKCALENDAR".asInstanceOf[typings.trouter.trouterStrings.MKCALENDAR]
    
    inline def MKCOL: typings.trouter.trouterStrings.MKCOL = "MKCOL".asInstanceOf[typings.trouter.trouterStrings.MKCOL]
    
    inline def MOVE: typings.trouter.trouterStrings.MOVE = "MOVE".asInstanceOf[typings.trouter.trouterStrings.MOVE]
    
    inline def NOTIFY: typings.trouter.trouterStrings.NOTIFY = "NOTIFY".asInstanceOf[typings.trouter.trouterStrings.NOTIFY]
    
    inline def OPTIONS: typings.trouter.trouterStrings.OPTIONS = "OPTIONS".asInstanceOf[typings.trouter.trouterStrings.OPTIONS]
    
    inline def PATCH: typings.trouter.trouterStrings.PATCH = "PATCH".asInstanceOf[typings.trouter.trouterStrings.PATCH]
    
    inline def POST: typings.trouter.trouterStrings.POST = "POST".asInstanceOf[typings.trouter.trouterStrings.POST]
    
    inline def PROPFIND: typings.trouter.trouterStrings.PROPFIND = "PROPFIND".asInstanceOf[typings.trouter.trouterStrings.PROPFIND]
    
    inline def PROPPATCH: typings.trouter.trouterStrings.PROPPATCH = "PROPPATCH".asInstanceOf[typings.trouter.trouterStrings.PROPPATCH]
    
    inline def PURGE: typings.trouter.trouterStrings.PURGE = "PURGE".asInstanceOf[typings.trouter.trouterStrings.PURGE]
    
    inline def PUT: typings.trouter.trouterStrings.PUT = "PUT".asInstanceOf[typings.trouter.trouterStrings.PUT]
    
    inline def REBIND: typings.trouter.trouterStrings.REBIND = "REBIND".asInstanceOf[typings.trouter.trouterStrings.REBIND]
    
    inline def REPORT: typings.trouter.trouterStrings.REPORT = "REPORT".asInstanceOf[typings.trouter.trouterStrings.REPORT]
    
    inline def SEARCH: typings.trouter.trouterStrings.SEARCH = "SEARCH".asInstanceOf[typings.trouter.trouterStrings.SEARCH]
    
    inline def SOURCE: typings.trouter.trouterStrings.SOURCE = "SOURCE".asInstanceOf[typings.trouter.trouterStrings.SOURCE]
    
    inline def SUBSCRIBE: typings.trouter.trouterStrings.SUBSCRIBE = "SUBSCRIBE".asInstanceOf[typings.trouter.trouterStrings.SUBSCRIBE]
    
    inline def TRACE: typings.trouter.trouterStrings.TRACE = "TRACE".asInstanceOf[typings.trouter.trouterStrings.TRACE]
    
    inline def UNBIND: typings.trouter.trouterStrings.UNBIND = "UNBIND".asInstanceOf[typings.trouter.trouterStrings.UNBIND]
    
    inline def UNLINK: typings.trouter.trouterStrings.UNLINK = "UNLINK".asInstanceOf[typings.trouter.trouterStrings.UNLINK]
    
    inline def UNLOCK: typings.trouter.trouterStrings.UNLOCK = "UNLOCK".asInstanceOf[typings.trouter.trouterStrings.UNLOCK]
    
    inline def UNSUBSCRIBE: typings.trouter.trouterStrings.UNSUBSCRIBE = "UNSUBSCRIBE".asInstanceOf[typings.trouter.trouterStrings.UNSUBSCRIBE]
  }
  
  @js.native
  trait Trouter[T] extends StObject {
    
    def add(method: HTTPMethod, pattern: String, handlers: T*): this.type = js.native
    def add(method: HTTPMethod, pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def all(pattern: String, handlers: T*): this.type = js.native
    def all(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def connect(pattern: String, handlers: T*): this.type = js.native
    def connect(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def delete(pattern: String, handlers: T*): this.type = js.native
    def delete(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def find(method: HTTPMethod, url: String): FindResult[T] = js.native
    
    def get(pattern: String, handlers: T*): this.type = js.native
    def get(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def head(pattern: String, handlers: T*): this.type = js.native
    def head(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def options(pattern: String, handlers: T*): this.type = js.native
    def options(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def patch(pattern: String, handlers: T*): this.type = js.native
    def patch(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def post(pattern: String, handlers: T*): this.type = js.native
    def post(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def put(pattern: String, handlers: T*): this.type = js.native
    def put(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def trace(pattern: String, handlers: T*): this.type = js.native
    def trace(pattern: js.RegExp, handlers: T*): this.type = js.native
    
    def use(pattern: String, handlers: T*): this.type = js.native
    def use(pattern: js.RegExp, handlers: T*): this.type = js.native
  }
}
