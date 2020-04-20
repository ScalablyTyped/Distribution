package typings.typescript

import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAffected[T] extends js.Object {
  var affected: SourceFile | Program
  var result: T
}

object AnonAffected {
  @scala.inline
  def apply[T](affected: SourceFile | Program, result: T): AnonAffected[T] = {
    val __obj = js.Dynamic.literal(affected = affected.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAffected[T]]
  }
}

