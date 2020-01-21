package typings.vimeoPlayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CallbackFunction = js.Function1[/* repeated */ js.Any, js.Any]
  type EventCallback = js.Function1[/* data */ js.Any, js.Any]
  /* Rewritten from type alias, can be one of: 
    - typings.vimeoPlayer.vimeoPlayerStrings.play
    - typings.vimeoPlayer.vimeoPlayerStrings.pause
    - typings.vimeoPlayer.vimeoPlayerStrings.ended
    - typings.vimeoPlayer.vimeoPlayerStrings.timeupdate
    - typings.vimeoPlayer.vimeoPlayerStrings.progress
    - typings.vimeoPlayer.vimeoPlayerStrings.seeked
    - typings.vimeoPlayer.vimeoPlayerStrings.seeking
    - typings.vimeoPlayer.vimeoPlayerStrings.texttrackchange
    - typings.vimeoPlayer.vimeoPlayerStrings.cuechange
    - typings.vimeoPlayer.vimeoPlayerStrings.cuepoint
    - typings.vimeoPlayer.vimeoPlayerStrings.volumechange
    - typings.vimeoPlayer.vimeoPlayerStrings.playbackratechange
    - typings.vimeoPlayer.vimeoPlayerStrings.bufferstart
    - typings.vimeoPlayer.vimeoPlayerStrings.bufferend
    - typings.vimeoPlayer.vimeoPlayerStrings.error
    - typings.vimeoPlayer.vimeoPlayerStrings.loaded
    - java.lang.String
  */
  type EventName = typings.vimeoPlayer.mod._EventName | java.lang.String
  type VimeoCuePointData = org.scalablytyped.runtime.StringDictionary[js.Any]
  type VimeoTimeRange = js.Tuple2[scala.Double, scala.Double]
}
