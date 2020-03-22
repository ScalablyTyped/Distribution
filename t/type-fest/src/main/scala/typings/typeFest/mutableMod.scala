package typings.typeFest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("type-fest/source/mutable", JSImport.Namespace)
@js.native
object mutableMod extends js.Object {
  type Mutable[ObjectType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ KeyType in keyof ObjectType ]: ObjectType[KeyType]}
    */ typings.typeFest.typeFestStrings.Mutable with ObjectType
}

