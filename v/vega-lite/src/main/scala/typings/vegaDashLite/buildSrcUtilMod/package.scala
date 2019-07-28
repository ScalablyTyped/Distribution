package typings.vegaDashLite

import org.scalablytyped.runtime.StringDictionary
import typings.std.Exclude
import typings.std.Pick
import typings.vegaDashLite.vegaDashLiteNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcUtilMod {
  type Dict[T] = StringDictionary[T]
  type Flag[S /* <: String */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in S ]: 1}
    */ typings.vegaDashLite.vegaDashLiteStrings.Flag with js.Any
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type StringSet = Dict[`true`]
}
