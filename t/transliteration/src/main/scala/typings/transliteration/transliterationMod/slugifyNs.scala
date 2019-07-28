package typings.transliteration.transliterationMod

import org.scalablytyped.runtime.StringDictionary
import typings.transliteration.transliterationMod.slugifyNs.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transliteration", "slugify")
@js.native
object slugifyNs extends js.Object {
  trait Options extends js.Object {
    /**
      * Strings in the ignore list will be bypassed from transliteration
      */
    var ignore: js.UndefOr[js.Array[String]] = js.undefined
    /**
      * Whether to force slugs to be lowercased
      * default: true
      */
    var lowercase: js.UndefOr[Boolean] = js.undefined
    /**
      * Custom replacement of the strings before transliteration
      */
    var replace: js.UndefOr[js.Array[js.Array[String]] | StringDictionary[String]] = js.undefined
    /**
      * Separator of the slug
      * default: "-"
      */
    var separator: js.UndefOr[String] = js.undefined
  }
  
  /**
    * Bind options globally so any following calls will be using
    * optionsObj by default. If optionsObj argument is omitted,
    * it will return current default option object.
    */
  def config(): Options = js.native
  def config(optionsObj: Options): Options = js.native
}

