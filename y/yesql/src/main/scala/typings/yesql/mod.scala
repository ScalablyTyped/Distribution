package typings.yesql

import typings.std.Record
import typings.yesql.anon.Pg
import typings.yesql.anon.Sql
import typings.yesql.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yesql", JSImport.Namespace)
  @js.native
  def apply(dir: String): String = js.native
  @JSImport("yesql", JSImport.Namespace)
  @js.native
  def apply(dir: String, options: Pg): String = js.native
  
  @JSImport("yesql", "mysql")
  @js.native
  def mysql[TParams /* <: js.Object */](query: String): js.Function1[/* params */ TParams, Sql[TParams]] = js.native
  @JSImport("yesql", "mysql")
  @js.native
  def mysql[TParams /* <: js.Object */](query: String, options: Options): js.Function1[/* params */ TParams, Sql[TParams]] = js.native
  
  @JSImport("yesql", "pg")
  @js.native
  def pg[TParams /* <: js.Object */](query: String): js.Function1[/* params */ TParams, Text[TParams]] = js.native
  @JSImport("yesql", "pg")
  @js.native
  def pg[TParams /* <: js.Object */](query: String, options: Options): js.Function1[/* params */ TParams, Text[TParams]] = js.native
  
  type AnyParams = Record[String, js.Any]
  
  @js.native
  trait Options extends StObject {
    
    var useNullForMissing: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUseNullForMissing(value: Boolean): Self = StObject.set(x, "useNullForMissing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNullForMissingUndefined: Self = StObject.set(x, "useNullForMissing", js.undefined)
    }
  }
}
