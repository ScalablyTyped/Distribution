package typings
package atUirouterCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libRouterMod {
  type PluginFactory[T] = js.Function2[/* router */ UIRouter, /* options */ js.UndefOr[js.Any], T]
}
