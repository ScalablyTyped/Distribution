package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object uniApp {
  type AnyObject = typings.std.Record[java.lang.String, js.Any]
  type KVInfer[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K]}
    */ typings.uniApp.uniAppStrings.KVInfer with T
  type Void[T] = js.UndefOr[T | scala.Null]
}
