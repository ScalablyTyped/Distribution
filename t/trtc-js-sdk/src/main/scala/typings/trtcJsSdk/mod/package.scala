package typings.trtcJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function1[/* event */ T, scala.Unit]
  type LocalAudioStats = typings.trtcJsSdk.mod.SentMediaStats
  type LocalAudioStatsMap = org.scalablytyped.runtime.StringDictionary[typings.trtcJsSdk.mod.LocalAudioStats]
  type LocalVideoStatsMap = org.scalablytyped.runtime.StringDictionary[typings.trtcJsSdk.mod.LocalVideoStats]
  type Nullable[T] = T | scala.Null
  type Omit[T, K /* <: /* keyof any */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  type RemoteAudioStats = typings.trtcJsSdk.mod.ReceivedMediaStats
  type RemoteAudioStatsMap = org.scalablytyped.runtime.StringDictionary[typings.trtcJsSdk.mod.RemoteAudioStats]
  type RemoteVideoStatsMap = org.scalablytyped.runtime.StringDictionary[typings.trtcJsSdk.mod.RemoteVideoStats]
}
