package typings.tv4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tv4Mod {
  import org.scalablytyped.runtime.StringDictionary

  type AsyncValidationCallback = js.Function2[/* isValid */ Boolean, /* error */ ValidationError, Unit]
  type ErrorCodes = StringDictionary[Double]
  type ErrorMap = StringDictionary[String]
  type FormatValidationFunction = js.Function2[/* data */ js.Any, /* schema */ JsonSchema, String]
  type KeywordValidationFunction = js.Function4[
    /* data */ js.Any, 
    /* value */ js.Any, 
    /* schema */ JsonSchema, 
    /* dataPointerPath */ String, 
    String | ValidationError
  ]
  type SchemaMap = StringDictionary[JsonSchema]
}
