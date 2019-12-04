package typings.tslint

import typings.typescript.typescriptMod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Files extends js.Object {
  var files: js.Array[String]
  var program: js.UndefOr[Program] = js.undefined
}

object Anon_Files {
  @scala.inline
  def apply(files: js.Array[String], program: Program = null): Anon_Files = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    if (program != null) __obj.updateDynamic("program")(program.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Files]
  }
}

