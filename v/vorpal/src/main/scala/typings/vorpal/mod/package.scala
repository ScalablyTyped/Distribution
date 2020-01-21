package typings.vorpal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Action = js.Function1[/* args */ typings.vorpal.mod.Args, js.Promise[scala.Unit]]
  type Cancel = js.Function0[scala.Unit]
  type PromptObject = org.scalablytyped.runtime.StringDictionary[js.Any]
}
