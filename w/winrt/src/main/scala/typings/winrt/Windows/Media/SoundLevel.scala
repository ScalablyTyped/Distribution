package typings.winrt.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SoundLevel extends StObject
@JSGlobal("Windows.Media.SoundLevel")
@js.native
object SoundLevel extends StObject {
  
  @js.native
  sealed trait full
    extends StObject
       with SoundLevel
  
  @js.native
  sealed trait low
    extends StObject
       with SoundLevel
  
  @js.native
  sealed trait muted
    extends StObject
       with SoundLevel
}
