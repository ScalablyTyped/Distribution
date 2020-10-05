package typings.typescript.anon

import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Affected[T] extends js.Object {
  var affected: SourceFile | Program = js.native
  var result: T = js.native
}

object Affected {
  @scala.inline
  def apply[T](affected: SourceFile | Program, result: T): Affected[T] = {
    val __obj = js.Dynamic.literal(affected = affected.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Affected[T]]
  }
  @scala.inline
  implicit class AffectedOps[Self <: Affected[_], T] (val x: Self with Affected[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAffected(value: SourceFile | Program): Self = this.set("affected", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: T): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

