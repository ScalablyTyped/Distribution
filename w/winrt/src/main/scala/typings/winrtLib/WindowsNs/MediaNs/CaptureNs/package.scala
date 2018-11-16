package typings
package winrtLib.WindowsNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CaptureNs {
  type MediaCaptureFailedEventHandler = js.Function2[
    /* sender */ MediaCapture, 
    /* errorEventArgs */ MediaCaptureFailedEventArgs, 
    scala.Unit
  ]
  type RecordLimitationExceededEventHandler = js.Function1[/* sender */ MediaCapture, scala.Unit]
}
