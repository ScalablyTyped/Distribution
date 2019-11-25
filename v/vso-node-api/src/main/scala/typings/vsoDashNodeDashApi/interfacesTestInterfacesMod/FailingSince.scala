package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailingSince extends js.Object {
  var build: BuildReference
  var date: Date
  var release: ReleaseReference
}

object FailingSince {
  @scala.inline
  def apply(build: BuildReference, date: Date, release: ReleaseReference): FailingSince = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FailingSince]
  }
}

