package typings.uapiJson.libAirMod

import org.scalablytyped.runtime.StringDictionary
import typings.uapiJson.anon.AddSegments
import typings.uapiJson.libAirMod.^
import typings.uapiJson.libSettingsMod.Settings
import typings.uapiJson.uapiJsonStrings.Business
import typings.uapiJson.uapiJsonStrings.Economy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createAirService(settings: Settings): AddSegments = ^.asInstanceOf[js.Dynamic].applyDynamic("createAirService")(settings.asInstanceOf[js.Any]).asInstanceOf[AddSegments]

type Cabins = (js.Array[Economy | Business]) | (js.Tuple2[Economy, Business])

type GetUniversalRecordByPNRParams = GetBookingParams

type GetUniversalRecordParams = GetBookingParams

type SearchPassengers = StringDictionary[Double]
