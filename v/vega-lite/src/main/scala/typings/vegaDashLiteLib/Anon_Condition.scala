package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Condition[F] extends js.Object {
  var condition: vegaDashLiteLib.buildSrcFielddefMod.Conditional[vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F]]
}

object Anon_Condition {
  @scala.inline
  def apply[F](
    condition: vegaDashLiteLib.buildSrcFielddefMod.Conditional[vegaDashLiteLib.buildSrcFielddefMod.FieldDef[F]]
  ): Anon_Condition[F] = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Condition[F]]
  }
}

