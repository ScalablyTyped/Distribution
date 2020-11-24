package typings.tstl

import typings.tstl.ibidirectionaliteratorMod.IBidirectionalIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/iterator/IRandomAccessIterator", JSImport.Namespace)
@js.native
object irandomaccessiteratorMod extends js.Object {
  
  @js.native
  trait IRandomAccessIterator[T, Iterator /* <: IRandomAccessIterator[T, Iterator] */] extends IBidirectionalIterator[T, Iterator] {
    
    /**
      * Advance iterator.
      *
      * @param n Step to advance.
      * @return The advanced iterator.
      */
    def advance(n: Double): Iterator = js.native
    
    /**
      * Get index.
      *
      * @return The index.
      */
    def index(): Double = js.native
  }
}
