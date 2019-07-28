package typings.winrt.WindowsNs.ApplicationModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageVersion extends js.Object {
  var build: Double
  var major: Double
  var minor: Double
  var revision: Double
}

object PackageVersion {
  @scala.inline
  def apply(build: Double, major: Double, minor: Double, revision: Double): PackageVersion = {
    val __obj = js.Dynamic.literal(build = build, major = major, minor = minor, revision = revision)
  
    __obj.asInstanceOf[PackageVersion]
  }
}

