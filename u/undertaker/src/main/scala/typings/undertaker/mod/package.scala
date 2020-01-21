package typings.undertaker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Task = java.lang.String | typings.undertaker.mod.TaskFunction
  type TaskFlags = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type TaskFunctionBase = js.Function1[
    /* done */ js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit | typings.node.streamMod.Duplex | typings.node.NodeJS.Process | js.Promise[scala.Nothing] | js.Any
  ]
}
