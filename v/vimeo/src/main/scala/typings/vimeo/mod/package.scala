package typings.vimeo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CompleteCallback = js.Function4[
    /* err */ js.UndefOr[java.lang.String], 
    /* result */ js.Any, 
    /* statusCode */ js.UndefOr[scala.Double], 
    /* headers */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  type ErrorCallback = js.Function1[/* err */ java.lang.String, scala.Unit]
  type ProgressCallback = js.Function2[/* bytesUploaded */ scala.Double, /* bytesTotal */ scala.Double, scala.Unit]
  type UriCallback = js.Function1[/* uri */ java.lang.String, scala.Unit]
}
