package typings.typescript

import typings.typescript.typescriptMod.Program
import typings.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Affected[T] extends js.Object {
  var affected: SourceFile | Program
  var result: T
}

object Anon_Affected {
  @scala.inline
  def apply[T](affected: SourceFile | Program, result: T): Anon_Affected[T] = {
    val __obj = js.Dynamic.literal(affected = affected.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Affected[T]]
  }
}

