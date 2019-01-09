package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSpecDataMod {
  type Data = (vegaDashTypingsLib.Anon_Source | vegaDashTypingsLib.Anon_Values | vegaDashTypingsLib.Anon_Url | js.Object) with vegaDashTypingsLib.Anon_Format
  type DataType = vegaDashTypingsLib.vegaDashTypingsLibStrings.boolean | vegaDashTypingsLib.vegaDashTypingsLibStrings.number | vegaDashTypingsLib.vegaDashTypingsLibStrings.date | vegaDashTypingsLib.vegaDashTypingsLibStrings.string
  type Datum = js.Any
  type Format = FormatJSON | FormatSV | FormatDSV | FormatTopoJSON | vegaDashTypingsLib.Anon_Parse
  type FormatTopoJSON = vegaDashTypingsLib.Anon_Property with (vegaDashTypingsLib.Anon_Feature | vegaDashTypingsLib.Anon_Mesh)
  type Parse = vegaDashTypingsLib.vegaDashTypingsLibStrings.auto | (org.scalablytyped.runtime.StringDictionary[DataType | java.lang.String])
}
