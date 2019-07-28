package typings.vegaDashTypings

import org.scalablytyped.runtime.StringDictionary
import typings.vegaDashTypings.Anon_Source
import typings.vegaDashTypings.Anon_Url
import typings.vegaDashTypings.Anon_Values
import typings.vegaDashTypings.vegaDashTypingsStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesSpecDataMod {
  type Data = SourceData | ValuesData | UrlData | BaseData
  type Datum = js.Any
  type Parse = auto | (StringDictionary[DataType | String])
  type SourceData = Anon_Source with BaseData
  type UrlData = Anon_Url with BaseData
  type ValuesData = Anon_Values with BaseData
}
