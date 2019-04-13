package typings
package tv4Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tv4Mod {
  type AsyncValidationCallback = js.Function2[/* isValid */ scala.Boolean, /* error */ ValidationError, scala.Unit]
  type ErrorCodes = org.scalablytyped.runtime.StringDictionary[scala.Double]
  type ErrorMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type FormatValidationFunction = js.Function2[/* data */ js.Any, /* schema */ JsonSchema, java.lang.String]
  type KeywordValidationFunction = js.Function4[
    /* data */ js.Any, 
    /* value */ js.Any, 
    /* schema */ JsonSchema, 
    /* dataPointerPath */ java.lang.String, 
    java.lang.String | ValidationError
  ]
  type SchemaMap = org.scalablytyped.runtime.StringDictionary[JsonSchema]
}
