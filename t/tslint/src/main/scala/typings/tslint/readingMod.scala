package typings.tslint

import typings.tslint.runnerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readingMod {
  
  @JSImport("tslint/lib/files/reading", "tryReadFile")
  @js.native
  def tryReadFile(filename: String, logger: Logger): js.Promise[js.UndefOr[String]] = js.native
}
