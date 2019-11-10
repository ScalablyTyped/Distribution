package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FTList extends js.Object {
  var average_speed: Double
  var clid: Double
  var clientftfid: Double
  var current_speed: Double
  var name: String
  var path: String
  var runtime: Double
  var sender: Double
  var serverftfid: Double
  var size: Double
  var sizedone: Double
  var status: Double
}

object FTList {
  @scala.inline
  def apply(
    average_speed: Double,
    clid: Double,
    clientftfid: Double,
    current_speed: Double,
    name: String,
    path: String,
    runtime: Double,
    sender: Double,
    serverftfid: Double,
    size: Double,
    sizedone: Double,
    status: Double
  ): FTList = {
    val __obj = js.Dynamic.literal(average_speed = average_speed, clid = clid, clientftfid = clientftfid, current_speed = current_speed, name = name, path = path, runtime = runtime, sender = sender, serverftfid = serverftfid, size = size, sizedone = sizedone, status = status)
  
    __obj.asInstanceOf[FTList]
  }
}

