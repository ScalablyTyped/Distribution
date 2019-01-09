package typings
package wegameDashApiLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesNs {
  type AudioSourceType = wegameDashApiLib.wegameDashApiLibStrings.auto | wegameDashApiLib.wegameDashApiLibStrings.buildInMic | wegameDashApiLib.wegameDashApiLibStrings.headsetMic | wegameDashApiLib.wegameDashApiLibStrings.mic | wegameDashApiLib.wegameDashApiLibStrings.camcorder
  type ButtonType = wegameDashApiLib.wegameDashApiLibStrings.text | wegameDashApiLib.wegameDashApiLibStrings.image
  type FileContentEncoding = wegameDashApiLib.wegameDashApiLibStrings.ascii | wegameDashApiLib.wegameDashApiLibStrings.base64 | wegameDashApiLib.wegameDashApiLibStrings.binary | wegameDashApiLib.wegameDashApiLibStrings.hex | wegameDashApiLib.wegameDashApiLibStrings.ucs2 | wegameDashApiLib.wegameDashApiLibStrings.`ucs-2` | wegameDashApiLib.wegameDashApiLibStrings.utf16le | wegameDashApiLib.wegameDashApiLibStrings.`utf-16le` | wegameDashApiLib.wegameDashApiLibStrings.`utf-8` | wegameDashApiLib.wegameDashApiLibStrings.utf8 | wegameDashApiLib.wegameDashApiLibStrings.latin1
  type GameClubButtonIcon = wegameDashApiLib.wegameDashApiLibStrings.green | wegameDashApiLib.wegameDashApiLibStrings.white | wegameDashApiLib.wegameDashApiLibStrings.dark | wegameDashApiLib.wegameDashApiLibStrings.light
  type NetworkType = wegameDashApiLib.wegameDashApiLibStrings.wifi | wegameDashApiLib.wegameDashApiLibStrings.`2g` | wegameDashApiLib.wegameDashApiLibStrings.`3g` | wegameDashApiLib.wegameDashApiLibStrings.`4g` | wegameDashApiLib.wegameDashApiLibStrings.unknown | wegameDashApiLib.wegameDashApiLibStrings.none
  type RequestMethod = wegameDashApiLib.wegameDashApiLibStrings.GET | wegameDashApiLib.wegameDashApiLibStrings.HEAD | wegameDashApiLib.wegameDashApiLibStrings.POST | wegameDashApiLib.wegameDashApiLibStrings.PUT | wegameDashApiLib.wegameDashApiLibStrings.DELETE | wegameDashApiLib.wegameDashApiLibStrings.TRACE | wegameDashApiLib.wegameDashApiLibStrings.CONNECT
  type SocketErrorCallback = js.Function1[/* res */ wegameDashApiLib.Anon_ErrMsg, scala.Unit]
  type SocketMessageCallback = js.Function1[/* res */ wegameDashApiLib.Anon_Data, scala.Unit]
  type SocketOpenCallback = js.Function1[/* res */ wegameDashApiLib.Anon_Header, scala.Unit]
}
