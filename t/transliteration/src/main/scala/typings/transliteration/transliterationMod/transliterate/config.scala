package typings.transliteration.transliterationMod.transliterate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transliteration", "transliterate.config")
@js.native
object config extends js.Object {
  /**
    * Bind options globally so any following calls will be using
    * optionsObj by default. If optionsObj argument is omitted,
    * it will return current default option object.
    */
  def apply(): Options = js.native
  def apply(optionsObj: Options): Options = js.native
}

