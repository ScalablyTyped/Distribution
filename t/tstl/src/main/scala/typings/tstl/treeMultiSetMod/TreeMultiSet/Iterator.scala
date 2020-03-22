package typings.tstl.treeMultiSetMod.TreeMultiSet

import org.scalablytyped.runtime.Instantiable0
import typings.tstl.IteratoranyanyanyConstructor
import typings.tstl.setContainerMod.SetContainer
import typings.tstl.setElementListMod.SetElementList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/TreeMultiSet", "TreeMultiSet.Iterator")
@js.native
object Iterator
  extends Instantiable0[
      typings.tstl.setElementListMod.SetElementList.Iterator[
        js.Object, 
        Boolean, 
        SetContainer[
          /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
          IteratoranyanyanyConstructor, 
          typings.tstl.setElementListMod.SetElementList.ReverseIterator[
            /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
          ]
        ]
      ]
    ] {
  /**
    * @internal
    */
  def create[Key, Unique /* <: Boolean */, Source /* <: SetContainer[
    Key, 
    Unique, 
    Source, 
    typings.tstl.setElementListMod.SetElementList.Iterator[Key, Unique, Source], 
    typings.tstl.setElementListMod.SetElementList.ReverseIterator[Key, Unique, Source]
  ] */](
    list: SetElementList[Key, Unique, Source],
    prev: typings.tstl.setElementListMod.SetElementList.Iterator[Key, Unique, Source],
    next: typings.tstl.setElementListMod.SetElementList.Iterator[Key, Unique, Source],
    `val`: Key
  ): typings.tstl.setElementListMod.SetElementList.Iterator[Key, Unique, Source] = js.native
}

