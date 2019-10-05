package typings.winrt.Windows.Networking

import typings.winrt.Windows.Networking.Connectivity.IPInformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHostName extends js.Object {
  var canonicalName: String
  var displayName: String
  var iPInformation: IPInformation
  var rawName: String
  var `type`: HostNameType
  def isEqual(hostName: HostName): Boolean
}

object IHostName {
  @scala.inline
  def apply(
    canonicalName: String,
    displayName: String,
    iPInformation: IPInformation,
    isEqual: HostName => Boolean,
    rawName: String,
    `type`: HostNameType
  ): IHostName = {
    val __obj = js.Dynamic.literal(canonicalName = canonicalName, displayName = displayName, iPInformation = iPInformation, isEqual = js.Any.fromFunction1(isEqual), rawName = rawName)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IHostName]
  }
}

