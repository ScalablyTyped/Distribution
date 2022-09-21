package typings.wechatMiniprogramXmly

import typings.wechatMiniprogramXmly.playerMod.PLAY_EVENT
import typings.wechatMiniprogramXmly.playerMod.PLAY_MODE
import typings.wechatMiniprogramXmly.playerMod.PLAY_STATE
import typings.wechatMiniprogramXmly.xmlyMod.RequestType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wechatMiniprogramXmlyStrings {
  
  @js.native
  sealed trait GET
    extends StObject
       with RequestType
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait POST
    extends StObject
       with RequestType
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait canplay
    extends StObject
       with PLAY_EVENT
  inline def canplay: canplay = "canplay".asInstanceOf[canplay]
  
  @js.native
  sealed trait changeDotplayMode
    extends StObject
       with PLAY_EVENT
  inline def changeDotplayMode: changeDotplayMode = "change.playMode".asInstanceOf[changeDotplayMode]
  
  @js.native
  sealed trait changeDotplayState
    extends StObject
       with PLAY_EVENT
  inline def changeDotplayState: changeDotplayState = "change.playState".asInstanceOf[changeDotplayState]
  
  @js.native
  sealed trait changeDotplaybackRate
    extends StObject
       with PLAY_EVENT
  inline def changeDotplaybackRate: changeDotplaybackRate = "change.playbackRate".asInstanceOf[changeDotplaybackRate]
  
  @js.native
  sealed trait changeDotplaylist
    extends StObject
       with PLAY_EVENT
  inline def changeDotplaylist: changeDotplaylist = "change.playlist".asInstanceOf[changeDotplaylist]
  
  @js.native
  sealed trait changeDotsound
    extends StObject
       with PLAY_EVENT
  inline def changeDotsound: changeDotsound = "change.sound".asInstanceOf[changeDotsound]
  
  @js.native
  sealed trait end
    extends StObject
       with PLAY_EVENT
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait error
    extends StObject
       with PLAY_EVENT
       with PLAY_STATE
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait errorDotaccessToken
    extends StObject
       with PLAY_EVENT
  inline def errorDotaccessToken: errorDotaccessToken = "error.accessToken".asInstanceOf[errorDotaccessToken]
  
  @js.native
  sealed trait loading
    extends StObject
       with PLAY_EVENT
       with PLAY_STATE
  inline def loading: loading = "loading".asInstanceOf[loading]
  
  @js.native
  sealed trait loop
    extends StObject
       with PLAY_MODE
  inline def loop: loop = "loop".asInstanceOf[loop]
  
  @js.native
  sealed trait next
    extends StObject
       with PLAY_EVENT
  inline def next: next = "next".asInstanceOf[next]
  
  @js.native
  sealed trait order
    extends StObject
       with PLAY_MODE
  inline def order: order = "order".asInstanceOf[order]
  
  @js.native
  sealed trait pause
    extends StObject
       with PLAY_EVENT
  inline def pause: pause = "pause".asInstanceOf[pause]
  
  @js.native
  sealed trait paused
    extends StObject
       with PLAY_STATE
  inline def paused: paused = "paused".asInstanceOf[paused]
  
  @js.native
  sealed trait play
    extends StObject
       with PLAY_EVENT
  inline def play: play = "play".asInstanceOf[play]
  
  @js.native
  sealed trait playing
    extends StObject
       with PLAY_STATE
  inline def playing: playing = "playing".asInstanceOf[playing]
  
  @js.native
  sealed trait prev
    extends StObject
       with PLAY_EVENT
  inline def prev: prev = "prev".asInstanceOf[prev]
  
  @js.native
  sealed trait random
    extends StObject
       with PLAY_MODE
  inline def random: random = "random".asInstanceOf[random]
  
  @js.native
  sealed trait ready
    extends StObject
       with PLAY_STATE
  inline def ready: ready = "ready".asInstanceOf[ready]
  
  @js.native
  sealed trait resume
    extends StObject
       with PLAY_EVENT
  inline def resume: resume = "resume".asInstanceOf[resume]
  
  @js.native
  sealed trait single
    extends StObject
       with PLAY_MODE
  inline def single: single = "single".asInstanceOf[single]
  
  @js.native
  sealed trait soundDotneedPay
    extends StObject
       with PLAY_EVENT
  inline def soundDotneedPay: soundDotneedPay = "sound.needPay".asInstanceOf[soundDotneedPay]
  
  @js.native
  sealed trait stop
    extends StObject
       with PLAY_EVENT
  inline def stop: stop = "stop".asInstanceOf[stop]
  
  @js.native
  sealed trait stoped
    extends StObject
       with PLAY_STATE
  inline def stoped: stoped = "stoped".asInstanceOf[stoped]
  
  @js.native
  sealed trait timeupdate
    extends StObject
       with PLAY_EVENT
  inline def timeupdate: timeupdate = "timeupdate".asInstanceOf[timeupdate]
}
