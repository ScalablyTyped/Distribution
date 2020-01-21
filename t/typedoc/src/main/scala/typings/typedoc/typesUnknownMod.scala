package typings.typedoc

import typings.typedoc.typesAbstractMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/types/unknown", JSImport.Namespace)
@js.native
object typesUnknownMod extends js.Object {
  @js.native
  class UnknownType protected () extends Type {
    def this(name: String) = this()
    var name: String = js.native
    def equals(`type`: UnknownType): Boolean = js.native
  }
  
}

