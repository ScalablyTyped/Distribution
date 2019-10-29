package typings.transliteration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distNodeSrcTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.RegExp

  type IntervalArray = js.Array[js.Tuple2[Double, Double]]
  type OptionReplaceArray = js.Array[OptionReplaceArrayItem]
  type OptionReplaceArrayItem = js.Tuple2[String | RegExp, String]
  type OptionReplaceCombined = OptionReplaceArray | OptionReplaceObject
  type OptionReplaceObject = StringDictionary[String]
  type SlugifyFunction = TransliterationFunction[OptionsSlugify]
  type TransliterateFunction = TransliterationFunction[OptionsTransliterate]
}
