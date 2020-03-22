package typings.tstl.mod.TreeMultiMap

import org.scalablytyped.runtime.Instantiable0
import typings.tstl.IteratoranyanyanyanyConstructor
import typings.tstl.entryMod.Entry
import typings.tstl.mapContainerMod.MapContainer
import typings.tstl.mapElementListMod.MapElementList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "TreeMultiMap.Iterator")
@js.native
object Iterator
  extends Instantiable0[
      typings.tstl.mapElementListMod.MapElementList.Iterator[
        js.Object, 
        js.Object, 
        Boolean, 
        MapContainer[
          /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
          /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
          /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
          /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
          IteratoranyanyanyanyConstructor, 
          typings.tstl.mapElementListMod.MapElementList.ReverseIterator[
            /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
          ]
        ]
      ]
    ] {
  /**
    * @internal
    */
  def create[Key, T, Unique /* <: Boolean */, Source /* <: MapContainer[
    Key, 
    T, 
    Unique, 
    Source, 
    typings.tstl.mapElementListMod.MapElementList.Iterator[Key, T, Unique, Source], 
    typings.tstl.mapElementListMod.MapElementList.ReverseIterator[Key, T, Unique, Source]
  ] */](
    list: MapElementList[Key, T, Unique, Source],
    prev: typings.tstl.mapElementListMod.MapElementList.Iterator[Key, T, Unique, Source],
    next: typings.tstl.mapElementListMod.MapElementList.Iterator[Key, T, Unique, Source],
    `val`: Entry[Key, T]
  ): typings.tstl.mapElementListMod.MapElementList.Iterator[Key, T, Unique, Source] = js.native
}

