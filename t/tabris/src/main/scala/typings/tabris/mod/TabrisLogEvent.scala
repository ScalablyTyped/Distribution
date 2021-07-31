package typings.tabris.mod

import typings.tabris.tabrisStrings.debug
import typings.tabris.tabrisStrings.error
import typings.tabris.tabrisStrings.info
import typings.tabris.tabrisStrings.log
import typings.tabris.tabrisStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabrisLogEvent[Target] extends EventObject[Target] {
  
  val level: debug | info | log | warn | error = js.native
  
  val message: String = js.native
}
