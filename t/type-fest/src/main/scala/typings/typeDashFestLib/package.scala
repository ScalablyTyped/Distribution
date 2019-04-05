package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typeDashFestLib {
  // Helper type. Not useful on its own.
  type Without[FirstType, SecondType] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ KeyType in std.Exclude<keyof FirstType, keyof SecondType> ]:? never}
    */ typeDashFestLib.typeDashFestLibStrings.Without with js.Any
}
