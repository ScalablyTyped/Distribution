package typings.tsXor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-xor/dist/types/Without.type", JSImport.Namespace)
@js.native
object withoutTypeMod extends js.Object {
  type Without[T, U] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Exclude<keyof T, keyof U> ]:? never}
    */ typings.tsXor.tsXorStrings.Without with js.Any
}

