package typings.waitme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WaitMe {
  import typings.waitme.JQuery
  import typings.waitme.waitmeStrings.hide

  type WaitMeStatic = js.Function1[/* options */ js.UndefOr[WaitMeOptions | hide], JQuery]
}
