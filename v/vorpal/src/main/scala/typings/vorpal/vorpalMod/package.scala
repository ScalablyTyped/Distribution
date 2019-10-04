package typings.vorpal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vorpalMod {
  import org.scalablytyped.runtime.StringDictionary

  type Action = js.Function1[/* args */ Args, js.Promise[Unit]]
  type Cancel = js.Function0[Unit]
  type PromptObject = StringDictionary[js.Any]
}
