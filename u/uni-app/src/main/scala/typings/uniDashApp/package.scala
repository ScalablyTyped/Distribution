package typings

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object uniDashApp {
  type AnyObject = Record[String, js.Any]
  type KVInfer[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K]}
    */ typings.uniDashApp.uniDashAppStrings.KVInfer with T
  type Void[T] = js.UndefOr[T | Null]
}
