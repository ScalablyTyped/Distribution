package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildSummary extends js.Object {
  var build: XamlBuildReference
  var finishTime: Date
  var keepForever: Boolean
  var quality: String
  var reason: BuildReason
  var requestedFor: IdentityRef
  var startTime: Date
  var status: BuildStatus
}

object BuildSummary {
  @scala.inline
  def apply(
    build: XamlBuildReference,
    finishTime: Date,
    keepForever: Boolean,
    quality: String,
    reason: BuildReason,
    requestedFor: IdentityRef,
    startTime: Date,
    status: BuildStatus
  ): BuildSummary = {
    val __obj = js.Dynamic.literal(build = build, finishTime = finishTime, keepForever = keepForever, quality = quality, reason = reason, requestedFor = requestedFor, startTime = startTime, status = status)
  
    __obj.asInstanceOf[BuildSummary]
  }
}

