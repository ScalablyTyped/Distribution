package typings.tslint.anon

import typings.typescript.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Files extends js.Object {
  var files: js.Array[String]
  var program: js.UndefOr[Program] = js.undefined
}

object Files {
  @scala.inline
  def apply(files: js.Array[String], program: Program = null): Files = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    if (program != null) __obj.updateDynamic("program")(program.asInstanceOf[js.Any])
    __obj.asInstanceOf[Files]
  }
}

