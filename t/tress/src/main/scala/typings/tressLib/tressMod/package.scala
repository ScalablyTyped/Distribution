package typings
package tressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tressMod {
  type TressJobCallback = js.ThisFunction1[/* this */ TressJobData, /* repeated */ js.Any, scala.Unit]
  type TressJobData = org.scalablytyped.runtime.StringDictionary[js.Object]
  type TressWorkerDoneCallback = js.Function2[
    /* err */ js.UndefOr[scala.Boolean | stdLib.Error | scala.Null], 
    /* repeated */ js.Any, 
    scala.Unit
  ]
}
