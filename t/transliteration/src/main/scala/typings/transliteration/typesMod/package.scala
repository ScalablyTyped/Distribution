package typings.transliteration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type IntervalArray = js.Array[js.Tuple2[scala.Double, scala.Double]]
  
  type OptionReplaceArray = js.Array[typings.transliteration.typesMod.OptionReplaceArrayItem]
  
  type OptionReplaceArrayItem = js.Tuple2[java.lang.String | typings.std.RegExp, java.lang.String]
  
  type OptionReplaceCombined = typings.transliteration.typesMod.OptionReplaceArray | typings.transliteration.typesMod.OptionReplaceObject
  
  type OptionReplaceObject = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type SlugifyFunction = typings.transliteration.typesMod.TransliterationFunction[typings.transliteration.typesMod.OptionsSlugify]
  
  type TransliterateFunction = typings.transliteration.typesMod.TransliterationFunction[typings.transliteration.typesMod.OptionsTransliterate]
}
