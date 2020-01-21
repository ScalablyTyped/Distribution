package typings.tv4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AsyncValidationCallback = js.Function2[/* isValid */ scala.Boolean, /* error */ typings.tv4.mod.ValidationError, scala.Unit]
  type ErrorCodes = org.scalablytyped.runtime.StringDictionary[scala.Double]
  type ErrorMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type FormatValidationFunction = js.Function2[/* data */ js.Any, /* schema */ typings.tv4.mod.JsonSchema, java.lang.String]
  type KeywordValidationFunction = js.Function4[
    /* data */ js.Any, 
    /* value */ js.Any, 
    /* schema */ typings.tv4.mod.JsonSchema, 
    /* dataPointerPath */ java.lang.String, 
    java.lang.String | typings.tv4.mod.ValidationError
  ]
  type SchemaMap = org.scalablytyped.runtime.StringDictionary[typings.tv4.mod.JsonSchema]
}
