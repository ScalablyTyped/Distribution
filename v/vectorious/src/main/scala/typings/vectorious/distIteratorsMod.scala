package typings.vectorious

import typings.std.ArrayLike
import typings.vectorious.mod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIteratorsMod {
  
  @JSImport("vectorious/dist/iterators", "NDIter")
  @js.native
  open class NDIter protected ()
    extends typings.vectorious.distIteratorsSingleMod.NDIter {
    def this(x: ArrayLike[Any]) = this()
    def this(x: NDArray) = this()
  }
  
  @JSImport("vectorious/dist/iterators", "NDMultiIter")
  @js.native
  open class NDMultiIter protected ()
    extends typings.vectorious.distIteratorsMultiMod.NDMultiIter {
    def this(args: (NDArray | ArrayLike[Any])*) = this()
  }
}
