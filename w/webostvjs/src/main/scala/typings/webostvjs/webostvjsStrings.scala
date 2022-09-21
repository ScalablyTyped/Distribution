package typings.webostvjs

import typings.webostvjs.mod.ConnectionState
import typings.webostvjs.mod.DrmType
import typings.webostvjs.mod.WfdDeviceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webostvjsStrings {
  
  @js.native
  sealed trait `2D` extends StObject
  inline def `2D`: `2D` = "2D".asInstanceOf[`2D`]
  
  @js.native
  sealed trait HLS extends StObject
  inline def HLS: HLS = "HLS".asInstanceOf[HLS]
  
  @js.native
  sealed trait Manual extends StObject
  inline def Manual: Manual = "Manual".asInstanceOf[Manual]
  
  @js.native
  sealed trait PLAYREADY
    extends StObject
       with DrmType
  inline def PLAYREADY: PLAYREADY = "PLAYREADY".asInstanceOf[PLAYREADY]
  
  @js.native
  sealed trait URI extends StObject
  inline def URI: URI = "URI".asInstanceOf[URI]
  
  @js.native
  sealed trait WIDEVINE
    extends StObject
       with DrmType
  inline def WIDEVINE: WIDEVINE = "WIDEVINE".asInstanceOf[WIDEVINE]
  
  @js.native
  sealed trait audio extends StObject
  inline def audio: audio = "audio".asInstanceOf[audio]
  
  @js.native
  sealed trait audio_test extends StObject
  inline def audio_test: audio_test = "audio_test".asInstanceOf[audio_test]
  
  @js.native
  sealed trait bottom_top extends StObject
  inline def bottom_top: bottom_top = "bottom_top".asInstanceOf[bottom_top]
  
  @js.native
  sealed trait check_board extends StObject
  inline def check_board: check_board = "check_board".asInstanceOf[check_board]
  
  @js.native
  sealed trait column_interleave extends StObject
  inline def column_interleave: column_interleave = "column_interleave".asInstanceOf[column_interleave]
  
  @js.native
  sealed trait connected
    extends StObject
       with ConnectionState
  inline def connected: connected = "connected".asInstanceOf[connected]
  
  @js.native
  sealed trait dhcp extends StObject
  inline def dhcp: dhcp = "dhcp".asInstanceOf[dhcp]
  
  @js.native
  sealed trait disconnected
    extends StObject
       with ConnectionState
  inline def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  
  @js.native
  sealed trait `false` extends StObject
  inline def `false`: `false` = "false".asInstanceOf[`false`]
  
  @js.native
  sealed trait field_alternative extends StObject
  inline def field_alternative: field_alternative = "field_alternative".asInstanceOf[field_alternative]
  
  @js.native
  sealed trait `frame-sequential` extends StObject
  inline def `frame-sequential`: `frame-sequential` = "frame-sequential".asInstanceOf[`frame-sequential`]
  
  @js.native
  sealed trait frame_packing extends StObject
  inline def frame_packing: frame_packing = "frame_packing".asInstanceOf[frame_packing]
  
  @js.native
  sealed trait line_alternative extends StObject
  inline def line_alternative: line_alternative = "line_alternative".asInstanceOf[line_alternative]
  
  @js.native
  sealed trait no extends StObject
  inline def no: no = "no".asInstanceOf[no]
  
  @js.native
  sealed trait playready_ extends StObject
  inline def playready_ : playready_ = "playready".asInstanceOf[playready_]
  
  @js.native
  sealed trait `primary-sink`
    extends StObject
       with WfdDeviceType
  inline def `primary-sink`: `primary-sink` = "primary-sink".asInstanceOf[`primary-sink`]
  
  @js.native
  sealed trait `secondary-sink`
    extends StObject
       with WfdDeviceType
  inline def `secondary-sink`: `secondary-sink` = "secondary-sink".asInstanceOf[`secondary-sink`]
  
  @js.native
  sealed trait side_by_side_LR extends StObject
  inline def side_by_side_LR: side_by_side_LR = "side_by_side_LR".asInstanceOf[side_by_side_LR]
  
  @js.native
  sealed trait side_by_side_RL extends StObject
  inline def side_by_side_RL: side_by_side_RL = "side_by_side_RL".asInstanceOf[side_by_side_RL]
  
  @js.native
  sealed trait side_by_side_full_LR extends StObject
  inline def side_by_side_full_LR: side_by_side_full_LR = "side_by_side_full_LR".asInstanceOf[side_by_side_full_LR]
  
  @js.native
  sealed trait side_by_side_full_RL extends StObject
  inline def side_by_side_full_RL: side_by_side_full_RL = "side_by_side_full_RL".asInstanceOf[side_by_side_full_RL]
  
  @js.native
  sealed trait source
    extends StObject
       with WfdDeviceType
  inline def source: source = "source".asInstanceOf[source]
  
  @js.native
  sealed trait top_bottom extends StObject
  inline def top_bottom: top_bottom = "top_bottom".asInstanceOf[top_bottom]
  
  @js.native
  sealed trait `true` extends StObject
  inline def `true`: `true` = "true".asInstanceOf[`true`]
  
  @js.native
  sealed trait video extends StObject
  inline def video: video = "video".asInstanceOf[video]
  
  @js.native
  sealed trait video_only extends StObject
  inline def video_only: video_only = "video_only".asInstanceOf[video_only]
  
  @js.native
  sealed trait web extends StObject
  inline def web: web = "web".asInstanceOf[web]
  
  @js.native
  sealed trait widevine_ extends StObject
  inline def widevine_ : widevine_ = "widevine".asInstanceOf[widevine_]
  
  @js.native
  sealed trait yes extends StObject
  inline def yes: yes = "yes".asInstanceOf[yes]
}
