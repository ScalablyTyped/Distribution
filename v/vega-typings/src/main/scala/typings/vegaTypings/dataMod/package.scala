package typings.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dataMod {
  type Datum = js.Any
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.dataMod.FormatJSON
    - typings.vegaTypings.dataMod.FormatSV
    - typings.vegaTypings.dataMod.FormatDSV
    - typings.vegaTypings.dataMod.FormatTopoJSON
    - typings.vegaTypings.AnonParse
  */
  type Format = typings.vegaTypings.dataMod._Format | typings.vegaTypings.dataMod.FormatTopoJSON
  type FormatTopoJSON = typings.vegaTypings.AnonProperty with (typings.vegaTypings.AnonFeature | typings.vegaTypings.AnonFilter)
  type Parse = typings.vegaTypings.vegaTypingsStrings.auto | (org.scalablytyped.runtime.StringDictionary[typings.vegaTypings.dataMod.DataType | java.lang.String])
}
