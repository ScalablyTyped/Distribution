package typings.unfetch

import typings.std.BodyInit
import typings.std.Document
import typings.std.Record
import typings.unfetch.unfetchStrings.include
import typings.unfetch.unfetchStrings.omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Body extends StObject {
    
    var body: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<unfetch.anon.FnCall>[0] */ js.Any
      ] = js.native
    
    var credentials: js.UndefOr[include | omit] = js.native
    
    var headers: js.UndefOr[Record[String, String]] = js.native
    
    var method: js.UndefOr[String] = js.native
  }
  object Body {
    
    @scala.inline
    def apply(): Body = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Body]
    }
    
    @scala.inline
    implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<unfetch.anon.FnCall>[0] */ js.Any
      ): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCredentials(value: include | omit): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      @scala.inline
      def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    }
  }
  
  @js.native
  trait Entries extends StObject {
    
    def entries(): js.Array[js.Tuple2[String, String]] = js.native
    
    def get(key: String): js.UndefOr[String] = js.native
    
    def has(key: String): Boolean = js.native
    
    def keys(): js.Array[String] = js.native
  }
  object Entries {
    
    @scala.inline
    def apply(
      entries: () => js.Array[js.Tuple2[String, String]],
      get: String => js.UndefOr[String],
      has: String => Boolean,
      keys: () => js.Array[String]
    ): Entries = {
      val __obj = js.Dynamic.literal(entries = js.Any.fromFunction0(entries), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), keys = js.Any.fromFunction0(keys))
      __obj.asInstanceOf[Entries]
    }
    
    @scala.inline
    implicit class EntriesMutableBuilder[Self <: Entries] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEntries(value: () => js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGet(value: String => js.UndefOr[String]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeys(value: () => js.Array[String]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): Unit = js.native
    def apply(body: BodyInit): Unit = js.native
    def apply(body: Document): Unit = js.native
  }
}
