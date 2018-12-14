package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RTCError
  extends stdLib.Error {
  var errorDetail: java.lang.String
  var httpRequestStatusCode: scala.Double
  var receivedAlert: scala.Double | scala.Null
  var sctpCauseCode: scala.Double
  var sdpLineNumber: scala.Double
  var sentAlert: scala.Double | scala.Null
}

@JSGlobal("RTCError")
@js.native
object RTCError
  extends org.scalablytyped.runtime.Instantiable0[RTCError]
     with org.scalablytyped.runtime.Instantiable1[/* errorDetail */ java.lang.String, RTCError]
     with org.scalablytyped.runtime.Instantiable2[/* errorDetail */ java.lang.String, /* message */ java.lang.String, RTCError]

