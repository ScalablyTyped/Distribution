package typings.atVimeoPlayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atVimeoPlayerMod {
  import org.scalablytyped.runtime.StringDictionary

  type CallbackFunction = js.Function1[/* repeated */ js.Any, js.Any]
  type EventCallback = js.Function1[/* data */ js.Any, js.Any]
  /* Rewritten from type alias, can be one of: 
    - typings.atVimeoPlayer.atVimeoPlayerStrings.play
    - typings.atVimeoPlayer.atVimeoPlayerStrings.pause
    - typings.atVimeoPlayer.atVimeoPlayerStrings.ended
    - typings.atVimeoPlayer.atVimeoPlayerStrings.timeupdate
    - typings.atVimeoPlayer.atVimeoPlayerStrings.progress
    - typings.atVimeoPlayer.atVimeoPlayerStrings.seeked
    - typings.atVimeoPlayer.atVimeoPlayerStrings.seeking
    - typings.atVimeoPlayer.atVimeoPlayerStrings.texttrackchange
    - typings.atVimeoPlayer.atVimeoPlayerStrings.cuechange
    - typings.atVimeoPlayer.atVimeoPlayerStrings.cuepoint
    - typings.atVimeoPlayer.atVimeoPlayerStrings.volumechange
    - typings.atVimeoPlayer.atVimeoPlayerStrings.playbackratechange
    - typings.atVimeoPlayer.atVimeoPlayerStrings.bufferstart
    - typings.atVimeoPlayer.atVimeoPlayerStrings.bufferend
    - typings.atVimeoPlayer.atVimeoPlayerStrings.error
    - typings.atVimeoPlayer.atVimeoPlayerStrings.loaded
    - java.lang.String
  */
  type EventName = _EventName | String
  type VimeoCuePointData = StringDictionary[js.Any]
  type VimeoTimeRange = js.Tuple2[Double, Double]
}
