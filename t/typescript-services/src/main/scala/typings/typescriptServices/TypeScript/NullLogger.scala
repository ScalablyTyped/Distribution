package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NullLogger extends ILogger
object NullLogger {
  
  @scala.inline
  def apply(
    debug: () => Boolean,
    error: () => Boolean,
    fatal: () => Boolean,
    information: () => Boolean,
    log: String => Unit,
    warning: () => Boolean
  ): NullLogger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction0(debug), error = js.Any.fromFunction0(error), fatal = js.Any.fromFunction0(fatal), information = js.Any.fromFunction0(information), log = js.Any.fromFunction1(log), warning = js.Any.fromFunction0(warning))
    __obj.asInstanceOf[NullLogger]
  }
}
