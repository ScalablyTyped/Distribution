package typings
package undertakerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object undertakerMod {
  type Task = java.lang.String | TaskFunction
  type TaskFlags = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type TaskFunctionBase = js.Function1[
    /* done */ js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit | nodeLib.streamMod.Duplex | nodeLib.NodeJSNs.Process | js.Promise[scala.Nothing] | js.Any
  ]
}
