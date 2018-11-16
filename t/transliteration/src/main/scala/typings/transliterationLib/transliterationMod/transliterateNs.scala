package typings
package transliterationLib.transliterationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("transliteration", "transliterate")
@js.native
object transliterateNs extends js.Object {
  
  trait Options extends js.Object {
    /**
             * Strings in the ignore list will be bypassed from transliteration
             */
    var ignore: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    /**
             * Custom replacement of the strings before transliteration
             */
    var replace: js.UndefOr[
        js.Array[js.Array[java.lang.String]] | ScalablyTyped.runtime.StringDictionary[java.lang.String]
      ] = js.undefined
    /**
             * Unicode characters that are not in the database will be replaced with `unknown`
             * default: "[?]"
             */
    var unknown: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /**
       * Bind options globally so any following calls will be using
       * optionsObj by default. If optionsObj argument is omitted,
       * it will return current default option object.
       */
  def config(): Options = js.native
  /**
       * Bind options globally so any following calls will be using
       * optionsObj by default. If optionsObj argument is omitted,
       * it will return current default option object.
       */
  def config(optionsObj: Options): Options = js.native
}

