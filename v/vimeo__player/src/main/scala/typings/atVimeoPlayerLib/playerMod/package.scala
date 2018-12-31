package typings
package atVimeoPlayerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object playerMod {
  type CallbackFunction = js.Function1[/* repeated */ js.Any, js.Any]
  type EventCallback = js.Function1[/* data */ js.Any, js.Any]
  type EventName = atVimeoPlayerLib.atVimeoPlayerLibStrings.play | atVimeoPlayerLib.atVimeoPlayerLibStrings.pause | atVimeoPlayerLib.atVimeoPlayerLibStrings.ended | atVimeoPlayerLib.atVimeoPlayerLibStrings.timeupdate | atVimeoPlayerLib.atVimeoPlayerLibStrings.progress | atVimeoPlayerLib.atVimeoPlayerLibStrings.seeked | atVimeoPlayerLib.atVimeoPlayerLibStrings.texttrackchange | atVimeoPlayerLib.atVimeoPlayerLibStrings.cuechange | atVimeoPlayerLib.atVimeoPlayerLibStrings.cuepoint | atVimeoPlayerLib.atVimeoPlayerLibStrings.volumechange | atVimeoPlayerLib.atVimeoPlayerLibStrings.playbackratechange | atVimeoPlayerLib.atVimeoPlayerLibStrings.bufferstart | atVimeoPlayerLib.atVimeoPlayerLibStrings.bufferend | atVimeoPlayerLib.atVimeoPlayerLibStrings.error | atVimeoPlayerLib.atVimeoPlayerLibStrings.loaded | java.lang.String
}
