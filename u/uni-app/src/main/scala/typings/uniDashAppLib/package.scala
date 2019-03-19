package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object uniDashAppLib {
  type AnyObject = stdLib.Record[java.lang.String, js.Any]
  type KVInfer[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K]}
    */ uniDashAppLib.uniDashAppLibStrings.KVInfer with T
  type Void[T] = js.UndefOr[T | scala.Null]
}
