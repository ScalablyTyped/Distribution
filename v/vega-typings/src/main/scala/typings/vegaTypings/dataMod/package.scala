package typings.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object dataMod {
  
  type Datum = js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.dataMod.FormatJSON
    - typings.vegaTypings.dataMod.FormatSV
    - typings.vegaTypings.dataMod.FormatDSV
    - typings.vegaTypings.dataMod.FormatTopoJSON
    - typings.vegaTypings.anon.Parse
  */
  type Format = typings.vegaTypings.dataMod._Format | typings.vegaTypings.dataMod.FormatTopoJSON
  
  type FormatTopoJSON = typings.vegaTypings.anon.Property with (typings.vegaTypings.anon.Feature | typings.vegaTypings.anon.Filter)
  
  type Parse = typings.vegaTypings.vegaTypingsStrings.auto | (org.scalablytyped.runtime.StringDictionary[typings.vegaTypings.dataMod.DataType | java.lang.String])
  
  type URI = java.lang.String
}
