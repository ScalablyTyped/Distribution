package typings.webdriver.typesMod

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseClient
  extends EventEmitter
     with SessionFlags {
  
  var capabilities: DesiredCapabilities | W3CCapabilities = js.native
  
  var options: Options = js.native
  
  var requestedCapabilities: DesiredCapabilities | W3CCapabilities = js.native
  
  var sessionId: String = js.native
}
