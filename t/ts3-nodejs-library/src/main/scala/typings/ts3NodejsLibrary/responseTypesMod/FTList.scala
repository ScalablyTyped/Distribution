package typings.ts3NodejsLibrary.responseTypesMod

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
    val __obj = js.Dynamic.literal(average_speed = average_speed.asInstanceOf[js.Any], clid = clid.asInstanceOf[js.Any], clientftfid = clientftfid.asInstanceOf[js.Any], current_speed = current_speed.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], serverftfid = serverftfid.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sizedone = sizedone.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FTList]
  }
}

