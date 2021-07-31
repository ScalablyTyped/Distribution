package typings.trtcJsSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def VERSION: java.lang.String = typings.trtcJsSdk.mod.^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[java.lang.String]

@scala.inline
def checkSystemRequirements(): js.Promise[scala.Boolean] = typings.trtcJsSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("checkSystemRequirements")().asInstanceOf[js.Promise[scala.Boolean]]

@scala.inline
def createClient(config: typings.trtcJsSdk.mod.ClientConfig): typings.trtcJsSdk.mod.Client = typings.trtcJsSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(config.asInstanceOf[js.Any]).asInstanceOf[typings.trtcJsSdk.mod.Client]

@scala.inline
def createStream(config: typings.trtcJsSdk.mod.StreamConfig): typings.trtcJsSdk.mod.LocalStream = typings.trtcJsSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(config.asInstanceOf[js.Any]).asInstanceOf[typings.trtcJsSdk.mod.LocalStream]

@scala.inline
def getCameras(): js.Promise[js.Array[typings.std.MediaDeviceInfo]] = typings.trtcJsSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getCameras")().asInstanceOf[js.Promise[js.Array[typings.std.MediaDeviceInfo]]]

@scala.inline
def getDevices(): js.Promise[js.Array[typings.std.MediaDeviceInfo]] = typings.trtcJsSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getDevices")().asInstanceOf[js.Promise[js.Array[typings.std.MediaDeviceInfo]]]

@scala.inline
def getMicrophones(): js.Promise[js.Array[typings.std.MediaDeviceInfo]] = typings.trtcJsSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getMicrophones")().asInstanceOf[js.Promise[js.Array[typings.std.MediaDeviceInfo]]]

@scala.inline
def getSpeakers(): js.Promise[js.Array[typings.std.MediaDeviceInfo]] = typings.trtcJsSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getSpeakers")().asInstanceOf[js.Promise[js.Array[typings.std.MediaDeviceInfo]]]

@scala.inline
def isScreenShareSupported(): scala.Boolean = typings.trtcJsSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isScreenShareSupported")().asInstanceOf[scala.Boolean]

type Callback[T] = js.Function1[/* event */ T, scala.Unit]

type LocalAudioStats = typings.trtcJsSdk.mod.SentMediaStats

type LocalAudioStatsMap = org.scalablytyped.runtime.StringDictionary[typings.trtcJsSdk.mod.LocalAudioStats]

type LocalVideoStatsMap = org.scalablytyped.runtime.StringDictionary[typings.trtcJsSdk.mod.LocalVideoStats]

type Nullable[T] = T | scala.Null

type Omit[T, K /* <: /* keyof any */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]

type RemoteAudioStats = typings.trtcJsSdk.mod.ReceivedMediaStats

type RemoteAudioStatsMap = org.scalablytyped.runtime.StringDictionary[typings.trtcJsSdk.mod.RemoteAudioStats]

type RemoteVideoStatsMap = org.scalablytyped.runtime.StringDictionary[typings.trtcJsSdk.mod.RemoteVideoStats]
