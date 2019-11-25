package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DidChangeConfigurationParams extends js.Object {
  /**
    * The actual changed settings
    */
  var settings: js.Any
}

object DidChangeConfigurationParams {
  @scala.inline
  def apply(settings: js.Any): DidChangeConfigurationParams = {
    val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DidChangeConfigurationParams]
  }
}

