package typings.tslint

import typings.tslint.libRunnerMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/files/reading", JSImport.Namespace)
@js.native
object libFilesReadingMod extends js.Object {
  def tryReadFile(filename: String, logger: Logger): js.Promise[js.UndefOr[String]] = js.native
}

