package typings.typeFest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("type-fest/source/merge-exclusive", JSImport.Namespace)
@js.native
object mergeExclusiveMod extends js.Object {
  type MergeExclusive[FirstType, SecondType] = FirstType | SecondType | ((Without[FirstType, SecondType]) with SecondType) | ((Without[SecondType, FirstType]) with FirstType)
  type Without[FirstType, SecondType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ KeyType in std.Exclude<keyof FirstType, keyof SecondType> ]:? never}
    */ typings.typeFest.typeFestStrings.Without with js.Any
}

