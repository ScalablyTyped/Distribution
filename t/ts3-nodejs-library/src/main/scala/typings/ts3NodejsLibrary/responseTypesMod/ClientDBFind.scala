package typings.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientDBFind extends js.Object {
  var cldbid: Double
}

object ClientDBFind {
  @scala.inline
  def apply(cldbid: Double): ClientDBFind = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientDBFind]
  }
}

