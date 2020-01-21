package typings.tstl

import typings.tstl.icomparableMod.IComparable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/utility/Entry", JSImport.Namespace)
@js.native
object entryMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {readonly [ P in keyof tstl.tstl/utility/IPair.IPair<Key, T> ]: tstl.tstl/utility/IPair.IPair<Key, T>[P]} */ @js.native
  class Entry[Key, T] protected () extends IComparable[Entry[Key, T]] {
    /**
      * Intializer Constructor.
      *
      * @param first The first, key element.
      * @param second The second, mapped element.
      */
    def this(first: Key, second: T) = this()
    /**
      * The first, key element.
      */
    val first: Key = js.native
    /**
      * The second, mapped element.
      */
    var second: T = js.native
    /**
      * Test whether less than some object.
      *
      * @param obj The object to compare.
      * @return Whether less or not.
      */
    /* CompleteClass */
    override def less(obj: Entry[Key, T]): Boolean = js.native
  }
  
}

