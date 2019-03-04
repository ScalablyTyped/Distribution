package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildSummary extends js.Object {
  var build: XamlBuildReference
  var finishTime: stdLib.Date
  var keepForever: scala.Boolean
  var quality: java.lang.String
  var reason: BuildReason
  var requestedFor: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  var startTime: stdLib.Date
  var status: BuildStatus
}

object BuildSummary {
  @scala.inline
  def apply(
    build: XamlBuildReference,
    finishTime: stdLib.Date,
    keepForever: scala.Boolean,
    quality: java.lang.String,
    reason: BuildReason,
    requestedFor: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    startTime: stdLib.Date,
    status: BuildStatus
  ): BuildSummary = {
    val __obj = js.Dynamic.literal(build = build, finishTime = finishTime, keepForever = keepForever, quality = quality, reason = reason, requestedFor = requestedFor, startTime = startTime, status = status)
  
    __obj.asInstanceOf[BuildSummary]
  }
}

