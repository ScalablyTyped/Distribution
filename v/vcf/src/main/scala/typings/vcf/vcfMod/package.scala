package typings.vcf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vcfMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.vcf.vcfStrings.vcard

  type CardHeader = vcard
  /** jCard standard format */
  type jCard = js.Tuple2[CardHeader, js.Array[jCardProperty]]
  type jCardParameters = StringDictionary[String | js.Array[String]]
  type jCardProperty = js.Tuple4[PropertyType, jCardParameters, ValueDataType, String | js.Array[String]]
}
