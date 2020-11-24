package typings.tern.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tern", "markVariablesDefinedBy")
@js.native
object markVariablesDefinedBy extends js.Object {
  
  def apply(scope: typings.tern.inferMod.Scope, origins: js.Array[String]): Unit = js.native
  def apply(
    scope: typings.tern.inferMod.Scope,
    origins: js.Array[String],
    start: js.UndefOr[scala.Nothing],
    end: Double
  ): Unit = js.native
  def apply(scope: typings.tern.inferMod.Scope, origins: js.Array[String], start: Double): Unit = js.native
  def apply(scope: typings.tern.inferMod.Scope, origins: js.Array[String], start: Double, end: Double): Unit = js.native
}
