package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import typings.webdriverio.webdriverioBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiRemoteBrowser
  extends StObject
     with Browser {
  
  /**
    * multiremote browser instance names
    */
  var instances: js.Array[String] = js.native
  
  /**
    * flag to indicate multiremote browser session
    */
  var isMultiremote: `true` = js.native
}
