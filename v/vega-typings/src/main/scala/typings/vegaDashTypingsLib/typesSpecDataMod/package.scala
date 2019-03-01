package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSpecDataMod {
  type Data = SourceData | ValuesData | UrlData | BaseData
  type Datum = js.Any
  type Format = _Format | FormatTopoJSON
  type FormatTopoJSON = vegaDashTypingsLib.Anon_Property with (vegaDashTypingsLib.Anon_Feature | vegaDashTypingsLib.Anon_Mesh)
  type Parse = vegaDashTypingsLib.vegaDashTypingsLibStrings.auto | (org.scalablytyped.runtime.StringDictionary[DataType | java.lang.String])
  type SourceData = vegaDashTypingsLib.Anon_Source with BaseData
  type UrlData = vegaDashTypingsLib.Anon_Url with BaseData
  type ValuesData = vegaDashTypingsLib.Anon_Values with BaseData
}
