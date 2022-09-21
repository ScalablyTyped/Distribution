package typings.trtcJsSdk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Exclude
import typings.std.MediaDeviceInfo
import typings.std.Pick
import typings.trtcJsSdk.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def VERSION: String = ^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[String]

inline def checkSystemRequirements(): js.Promise[CheckResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkSystemRequirements")().asInstanceOf[js.Promise[CheckResult]]

inline def createClient(config: ClientConfig): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(config.asInstanceOf[js.Any]).asInstanceOf[Client]

inline def createStream(config: StreamConfig): LocalStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(config.asInstanceOf[js.Any]).asInstanceOf[LocalStream]

inline def getCameras(): js.Promise[js.Array[MediaDeviceInfo]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCameras")().asInstanceOf[js.Promise[js.Array[MediaDeviceInfo]]]

inline def getDevices(): js.Promise[js.Array[MediaDeviceInfo]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevices")().asInstanceOf[js.Promise[js.Array[MediaDeviceInfo]]]

inline def getMicrophones(): js.Promise[js.Array[MediaDeviceInfo]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMicrophones")().asInstanceOf[js.Promise[js.Array[MediaDeviceInfo]]]

inline def getSpeakers(): js.Promise[js.Array[MediaDeviceInfo]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpeakers")().asInstanceOf[js.Promise[js.Array[MediaDeviceInfo]]]

inline def isScreenShareSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScreenShareSupported")().asInstanceOf[Boolean]

type Callback[T] = js.Function1[/* event */ T, Unit]

type LocalAudioStats = SentMediaStats

type LocalAudioStatsMap = StringDictionary[LocalAudioStats]

type LocalVideoStatsMap = StringDictionary[LocalVideoStats]

type Nullable[T] = T | Null

type Omit[T, K /* <: /* keyof any */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]

type RemoteAudioStats = ReceivedMediaStats

type RemoteAudioStatsMap = StringDictionary[RemoteAudioStats]

type RemoteVideoStatsMap = StringDictionary[RemoteVideoStats]
