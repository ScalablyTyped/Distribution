package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StreamedBatch[T] extends js.Object {
  var continuationToken: java.lang.String
  var isLastBatch: scala.Boolean
  var nextLink: java.lang.String
  var values: js.Array[T]
}

