package typings.tslint

import typings.tslint.runnerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readingMod {
  
  @JSImport("tslint/lib/files/reading", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def tryReadFile(filename: String, logger: Logger): js.Promise[js.UndefOr[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryReadFile")(filename.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[String]]]
}
