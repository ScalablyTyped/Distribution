package typings.winrt.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SoundLevel extends js.Object
@JSGlobal("Windows.Media.SoundLevel")
@js.native
object SoundLevel extends js.Object {
  
  @js.native
  sealed trait full extends SoundLevel
  
  @js.native
  sealed trait low extends SoundLevel
  
  @js.native
  sealed trait muted extends SoundLevel
}
