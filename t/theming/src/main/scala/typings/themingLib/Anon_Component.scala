package typings
package themingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Component extends js.Object {
  def apply[P](component: reactLib.reactMod.ComponentType[P with Anon_Theme]): reactLib.reactMod.ComponentType[
    stdLib.Pick[P, stdLib.Exclude[java.lang.String, themingLib.themingLibStrings.theme]]
  ] = js.native
}

