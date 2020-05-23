package typings.typescript.anon

import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Affected[T] extends js.Object {
  var affected: SourceFile | Program
  var result: T
}

object Affected {
  @scala.inline
  def apply[T](affected: SourceFile | Program, result: T): Affected[T] = {
    val __obj = js.Dynamic.literal(affected = affected.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Affected[T]]
  }
}

