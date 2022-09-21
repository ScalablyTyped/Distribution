package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web", "VoiceControlCommand")
@js.native
open class VoiceControlCommand protected () extends StObject {
  def this(command: String) = this()
  def this(command: String, `type`: VoiceControlCommandType) = this()
  
  /**
    * The command text
    *
    * The command should be set as text you want to be recognized.
    */
  var command: String = js.native
  
  /**
    * The type of the command processing
    *
    * The default value is "FOREGROUND"
    */
  var `type`: VoiceControlCommandType = js.native
}
