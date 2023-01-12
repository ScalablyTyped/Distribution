package typings.unfetch

import typings.std.Document
import typings.std.Record
import typings.std.XMLHttpRequestBodyInit
import typings.unfetch.unfetchStrings.include
import typings.unfetch.unfetchStrings.omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Body extends StObject {
    
    var body: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<unfetch.anon.FnCall>[0] */ js.Any
      ] = js.undefined
    
    var credentials: js.UndefOr[include | omit] = js.undefined
    
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
  }
  object Body {
    
    inline def apply(): Body = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Body]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
      
      inline def setBody(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<unfetch.anon.FnCall>[0] */ js.Any
      ): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCredentials(value: include | omit): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    }
  }
  
  trait Entries extends StObject {
    
    def entries(): js.Array[js.Tuple2[String, String]]
    
    def get(key: String): js.UndefOr[String]
    
    def has(key: String): Boolean
    
    def keys(): js.Array[String]
  }
  object Entries {
    
    inline def apply(
      entries: () => js.Array[js.Tuple2[String, String]],
      get: String => js.UndefOr[String],
      has: String => Boolean,
      keys: () => js.Array[String]
    ): Entries = {
      val __obj = js.Dynamic.literal(entries = js.Any.fromFunction0(entries), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys))
      __obj.asInstanceOf[Entries]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Entries] (val x: Self) extends AnyVal {
      
      inline def setEntries(value: () => js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
      
      inline def setGet(value: String => js.UndefOr[String]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setKeys(value: () => js.Array[String]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): Unit = js.native
    def apply(body: Document): Unit = js.native
    def apply(body: XMLHttpRequestBodyInit): Unit = js.native
  }
}
