package typings.swfobject.swfobjectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFlashPlayerVersion extends js.Object {
  var major: Double
  var minor: Double
  var release: Double
}

object IFlashPlayerVersion {
  @scala.inline
  def apply(major: Double, minor: Double, release: Double): IFlashPlayerVersion = {
    val __obj = js.Dynamic.literal(major = major, minor = minor, release = release)
  
    __obj.asInstanceOf[IFlashPlayerVersion]
  }
}

