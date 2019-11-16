package typings.vcf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vcfMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.vcf.vcfStrings.vcard

  /** jCard standard format */
  type jCard = js.Tuple2[vcard, js.Array[jCardProperty]]
  type jCardProperty = js.Tuple4[String, StringDictionary[String | js.Array[String]], String, String | js.Array[String]]
}
