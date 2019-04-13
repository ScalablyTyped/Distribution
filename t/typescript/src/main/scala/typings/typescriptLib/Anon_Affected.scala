package typings
package typescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Affected[T] extends js.Object {
  var affected: typescriptLib.typescriptMod.SourceFile | typescriptLib.typescriptMod.Program
  var result: T
}

object Anon_Affected {
  @scala.inline
  def apply[T](affected: typescriptLib.typescriptMod.SourceFile | typescriptLib.typescriptMod.Program, result: T): Anon_Affected[T] = {
    val __obj = js.Dynamic.literal(affected = affected.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Affected[T]]
  }
}

