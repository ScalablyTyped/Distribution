package typings.winrt.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SoundLevel extends StObject
@JSGlobal("Windows.Media.SoundLevel")
@js.native
object SoundLevel extends StObject {
  
  @js.native
  sealed trait full extends SoundLevel
  
  @js.native
  sealed trait low extends SoundLevel
  
  @js.native
  sealed trait muted extends SoundLevel
}
