package typings
package tressLib.tressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tressNs {
  type TressJobCallback = js.ThisFunction1[/* this */ TressJobData, /* repeated */js.Any, scala.Unit]
  type TressWorkerDoneCallback = js.Function2[
    /* err */ js.UndefOr[scala.Boolean | stdLib.Error | scala.Null], 
    /* repeated */js.Any, 
    scala.Unit
  ]
}
