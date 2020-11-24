package typings.videoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object videojs {
  
  type Child = java.lang.String | typings.videoJs.anon.Children
  
  type Component = typings.videoJs.mod.videojs.Component_
  
  type Content = java.lang.String | typings.std.Element | typings.std.Node | (js.Function0[java.lang.String | typings.std.Element | typings.std.Node])
  
  type Dom = typings.videoJs.mod.videojs.Dom_
  
  type LanguageTranslations = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type Player = typings.videoJs.mod.VideoJsPlayer
  
  type PlayerOptions = typings.videoJs.mod.VideoJsPlayerOptions
  
  type Plugin = typings.videoJs.mod.videojs.Plugin_
  
  type Tech = typings.videoJs.mod.videojs.Tech_
  
  type TextTrack = typings.videoJs.mod.videojs.TextTrack_
  
  type TextTrackCueList = typings.videoJs.mod.videojs.TextTrackCueList_
  
  type XhrCallback = js.Function3[
    /* error */ js.UndefOr[typings.std.Error], 
    /* response */ js.UndefOr[typings.videoJs.mod.videojs.XhrResponse], 
    /* body */ js.UndefOr[js.Any], 
    scala.Unit
  ]
}
