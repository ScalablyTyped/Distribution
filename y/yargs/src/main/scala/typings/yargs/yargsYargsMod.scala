package typings.yargs

import typings.yargs.yargsMod.Argv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yargs/yargs", JSImport.Namespace)
@js.native
object yargsYargsMod extends js.Object {
  def apply(): Argv[js.Object] = js.native
  def apply(processArgs: js.Array[String]): Argv[js.Object] = js.native
  def apply(processArgs: js.Array[String], cwd: String): Argv[js.Object] = js.native
  def apply(
    processArgs: js.Array[String],
    cwd: String,
    parentRequire: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeRequireFunction */ js.Any
  ): Argv[js.Object] = js.native
}

