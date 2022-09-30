package typings.testcafeHammerhead.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("testcafe-hammerhead", "ConfigureResponseEventOptions")
@js.native
open class ConfigureResponseEventOptions protected () extends StObject {
  /** Creates an instance of ConfigureResponseEventOptions **/
  def this(includeHeaders: Boolean, includeBody: Boolean) = this()
  
  /** Specified whether to include body to Response **/
  var includeBody: Boolean = js.native
  
  /** Specified whether to include headers to ResponseEvent **/
  var includeHeaders: Boolean = js.native
}
