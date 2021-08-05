package typings.yesql

import typings.std.Record
import typings.yesql.anon.Pg
import typings.yesql.anon.Sql
import typings.yesql.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(dir: String): String = ^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(dir: String, options: Pg): String = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("yesql", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mysql[TParams /* <: js.Object */](query: String): js.Function1[/* params */ TParams, Sql[TParams]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mysql")(query.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* params */ TParams, Sql[TParams]]]
  inline def mysql[TParams /* <: js.Object */](query: String, options: Options): js.Function1[/* params */ TParams, Sql[TParams]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mysql")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* params */ TParams, Sql[TParams]]]
  
  inline def pg[TParams /* <: js.Object */](query: String): js.Function1[/* params */ TParams, Text[TParams]] = ^.asInstanceOf[js.Dynamic].applyDynamic("pg")(query.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* params */ TParams, Text[TParams]]]
  inline def pg[TParams /* <: js.Object */](query: String, options: Options): js.Function1[/* params */ TParams, Text[TParams]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pg")(query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* params */ TParams, Text[TParams]]]
  
  type AnyParams = Record[String, js.Any]
  
  trait Options extends StObject {
    
    var useNullForMissing: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setUseNullForMissing(value: Boolean): Self = StObject.set(x, "useNullForMissing", value.asInstanceOf[js.Any])
      
      inline def setUseNullForMissingUndefined: Self = StObject.set(x, "useNullForMissing", js.undefined)
    }
  }
}
