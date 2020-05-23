package typings.urbanairshipCordova.UrbanAirshipPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Data Types
@js.native
trait PushEvent extends Event {
  var extras: StringDictionary[js.Any] = js.native
  var message: String = js.native
}

