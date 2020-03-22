package typings.uiBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object boxTypesMod {
  type Is[P] = typings.react.mod.ElementType[P]
  type RefType[T] = /* import warning: importer.ImportType#apply Failed type conversion: T['prototype'] */ js.Any
  type Without[T, K] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
  /**
    * Remove box props from object `T` if they're present
    * @template T Object
    */
  type WithoutBoxProps[T] = typings.uiBox.boxTypesMod.Without[T, typings.uiBox.uiBoxStrings.is | typings.uiBox.uiBoxStrings.innerRef]
}
