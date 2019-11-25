package typings.vegaDashTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSpecDataMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.vegaDashTypings.Anon_Exterior
  import typings.vegaDashTypings.Anon_Feature
  import typings.vegaDashTypings.Anon_Property
  import typings.vegaDashTypings.Anon_Source
  import typings.vegaDashTypings.Anon_Url
  import typings.vegaDashTypings.Anon_Values
  import typings.vegaDashTypings.vegaDashTypingsStrings.auto

  type Data = SourceData | ValuesData | UrlData | BaseData
  type Datum = js.Any
  /* Rewritten from type alias, can be one of: 
    - typings.vegaDashTypings.typesSpecDataMod.FormatJSON
    - typings.vegaDashTypings.typesSpecDataMod.FormatSV
    - typings.vegaDashTypings.typesSpecDataMod.FormatDSV
    - typings.vegaDashTypings.typesSpecDataMod.FormatTopoJSON
    - typings.vegaDashTypings.Anon_Parse
  */
  type Format = _Format | FormatTopoJSON
  type FormatTopoJSON = Anon_Property with (Anon_Feature | Anon_Exterior)
  type Parse = auto | (StringDictionary[DataType | String])
  type SourceData = Anon_Source with BaseData
  type UrlData = Anon_Url with BaseData
  type ValuesData = Anon_Values with BaseData
}
