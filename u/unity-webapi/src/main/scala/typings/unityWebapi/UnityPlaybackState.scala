package typings.unityWebapi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UnityPlaybackState extends StObject
@JSGlobal("UnityPlaybackState")
@js.native
object UnityPlaybackState extends StObject {
  
  @js.native
  sealed trait Paused
    extends StObject
       with UnityPlaybackState
  
  @js.native
  sealed trait Playing
    extends StObject
       with UnityPlaybackState
}
