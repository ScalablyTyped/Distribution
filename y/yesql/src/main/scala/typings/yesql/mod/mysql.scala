package typings.yesql.mod

import typings.yesql.anon.Sql
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yesql", "mysql")
@js.native
object mysql extends js.Object {
  
  def apply[TParams /* <: js.Object */](query: String): js.Function1[/* params */ TParams, Sql[TParams]] = js.native
  def apply[TParams /* <: js.Object */](query: String, options: Options): js.Function1[/* params */ TParams, Sql[TParams]] = js.native
}
