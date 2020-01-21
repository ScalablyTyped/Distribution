package typings.typedoc

import typings.typedoc.abstractMod.Reflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/ReflectionCategory", JSImport.Namespace)
@js.native
object reflectionCategoryMod extends js.Object {
  @js.native
  class ReflectionCategory protected () extends js.Object {
    def this(title: String) = this()
    var allChildrenHaveOwnDocument: js.Function = js.native
    var children: js.Array[Reflection] = js.native
    var getAllChildrenHaveOwnDocument: js.Any = js.native
    var title: String = js.native
    def toObject(): js.Any = js.native
  }
  
}

