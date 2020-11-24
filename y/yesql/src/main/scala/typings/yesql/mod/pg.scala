package typings.yesql.mod

import typings.yesql.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yesql", "pg")
@js.native
object pg extends js.Object {
  
  def apply[TParams /* <: js.Object */](query: String): js.Function1[/* params */ TParams, Text[TParams]] = js.native
  def apply[TParams /* <: js.Object */](query: String, options: Options): js.Function1[/* params */ TParams, Text[TParams]] = js.native
}
