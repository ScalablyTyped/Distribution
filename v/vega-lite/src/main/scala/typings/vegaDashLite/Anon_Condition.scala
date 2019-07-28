package typings.vegaDashLite

import typings.vegaDashLite.buildSrcFielddefMod.Conditional
import typings.vegaDashLite.buildSrcFielddefMod.FieldDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Condition[F] extends js.Object {
  var condition: Conditional[FieldDef[F]]
}

object Anon_Condition {
  @scala.inline
  def apply[F](condition: Conditional[FieldDef[F]]): Anon_Condition[F] = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Condition[F]]
  }
}

