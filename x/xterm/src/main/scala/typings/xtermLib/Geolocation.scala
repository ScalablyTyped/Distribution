package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geolocation extends js.Object {
  def clearWatch(watchId: scala.Double): scala.Unit = js.native
  def getCurrentPosition(successCallback: PositionCallback): scala.Unit = js.native
  def getCurrentPosition(successCallback: PositionCallback, errorCallback: PositionErrorCallback): scala.Unit = js.native
  def getCurrentPosition(successCallback: PositionCallback, errorCallback: PositionErrorCallback, options: PositionOptions): scala.Unit = js.native
  def watchPosition(successCallback: PositionCallback): scala.Double = js.native
  def watchPosition(successCallback: PositionCallback, errorCallback: PositionErrorCallback): scala.Double = js.native
  def watchPosition(successCallback: PositionCallback, errorCallback: PositionErrorCallback, options: PositionOptions): scala.Double = js.native
}

