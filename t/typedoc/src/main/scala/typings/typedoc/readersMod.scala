package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/readers", JSImport.Namespace)
@js.native
object readersMod extends js.Object {
  @js.native
  class ArgumentsReader protected ()
    extends typings.typedoc.argumentsMod.ArgumentsReader {
    def this(priority: Double) = this()
    def this(priority: Double, args: js.Array[String]) = this()
  }
  
  @js.native
  class TSConfigReader ()
    extends typings.typedoc.tsconfigMod.TSConfigReader
  
  @js.native
  class TypeDocReader ()
    extends typings.typedoc.typedocMod.TypeDocReader
  
}

