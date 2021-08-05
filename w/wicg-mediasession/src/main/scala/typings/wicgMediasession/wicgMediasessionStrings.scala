package typings.wicgMediasession

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wicgMediasessionStrings {
  
  @js.native
  sealed trait nexttrack
    extends StObject
       with MediaSessionAction
  inline def nexttrack: nexttrack = "nexttrack".asInstanceOf[nexttrack]
  
  @js.native
  sealed trait none
    extends StObject
       with MediaSessionPlaybackState
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait pause
    extends StObject
       with MediaSessionAction
  inline def pause: pause = "pause".asInstanceOf[pause]
  
  @js.native
  sealed trait paused
    extends StObject
       with MediaSessionPlaybackState
  inline def paused: paused = "paused".asInstanceOf[paused]
  
  @js.native
  sealed trait play
    extends StObject
       with MediaSessionAction
  inline def play: play = "play".asInstanceOf[play]
  
  @js.native
  sealed trait playing
    extends StObject
       with MediaSessionPlaybackState
  inline def playing: playing = "playing".asInstanceOf[playing]
  
  @js.native
  sealed trait previoustrack
    extends StObject
       with MediaSessionAction
  inline def previoustrack: previoustrack = "previoustrack".asInstanceOf[previoustrack]
  
  @js.native
  sealed trait seekbackward
    extends StObject
       with MediaSessionAction
  inline def seekbackward: seekbackward = "seekbackward".asInstanceOf[seekbackward]
  
  @js.native
  sealed trait seekforward
    extends StObject
       with MediaSessionAction
  inline def seekforward: seekforward = "seekforward".asInstanceOf[seekforward]
  
  @js.native
  sealed trait seekto
    extends StObject
       with MediaSessionAction
  inline def seekto: seekto = "seekto".asInstanceOf[seekto]
  
  @js.native
  sealed trait skipad
    extends StObject
       with MediaSessionAction
  inline def skipad: skipad = "skipad".asInstanceOf[skipad]
  
  @js.native
  sealed trait stop
    extends StObject
       with MediaSessionAction
  inline def stop: stop = "stop".asInstanceOf[stop]
}
