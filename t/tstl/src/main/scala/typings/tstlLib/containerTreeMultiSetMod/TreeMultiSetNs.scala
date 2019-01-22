package typings
package tstlLib.containerTreeMultiSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/TreeMultiSet", "TreeMultiSet")
@js.native
object TreeMultiSetNs extends js.Object {
  val Iterator: org.scalablytyped.runtime.Instantiable4[
    /* list */ tstlLib.baseContainerUnderscoreSetElementListMod._SetElementList[
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
    ], 
    /* prev */ tstlLib.baseIteratorSetIteratorMod.SetIterator[
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
    ], 
    /* next */ tstlLib.baseIteratorSetIteratorMod.SetIterator[
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
    ], 
    /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ /* key */ js.Any, 
    tstlLib.baseIteratorSetIteratorMod.SetIterator[
      js.Object, 
      scala.Boolean, 
      tstlLib.baseContainerSetContainerMod.SetContainer[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
      ]
    ]
  ] = js.native
  val ReverseIterator: org.scalablytyped.runtime.Instantiable1[
    /* base */ tstlLib.baseIteratorSetIteratorMod.SetIterator[
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
    ], 
    tstlLib.baseIteratorSetIteratorMod.SetReverseIterator[
      js.Object, 
      scala.Boolean, 
      tstlLib.baseContainerSetContainerMod.SetContainer[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
      ]
    ]
  ] = js.native
  val iterator: org.scalablytyped.runtime.Instantiable4[
    /* list */ tstlLib.baseContainerUnderscoreSetElementListMod._SetElementList[
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
    ], 
    /* prev */ tstlLib.baseIteratorSetIteratorMod.SetIterator[
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
    ], 
    /* next */ tstlLib.baseIteratorSetIteratorMod.SetIterator[
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
    ], 
    /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ /* key */ js.Any, 
    tstlLib.baseIteratorSetIteratorMod.SetIterator[
      js.Object, 
      scala.Boolean, 
      tstlLib.baseContainerSetContainerMod.SetContainer[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
      ]
    ]
  ] = js.native
  val reverse_iterator: org.scalablytyped.runtime.Instantiable1[
    /* base */ tstlLib.baseIteratorSetIteratorMod.SetIterator[
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
    ], 
    tstlLib.baseIteratorSetIteratorMod.SetReverseIterator[
      js.Object, 
      scala.Boolean, 
      tstlLib.baseContainerSetContainerMod.SetContainer[
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Key */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Unique */ js.Any, 
        /* import warning: RewrittenClass.unapply cls $anonfun was tparam Source */ js.Any
      ]
    ]
  ] = js.native
  type Iterator[Key] = tstlLib.baseIteratorSetIteratorMod.SetIterator[
    Key, 
    tstlLib.tstlLibNumbers.`false`, 
    tstlLib.containerTreeMultiSetMod.TreeMultiSet[Key]
  ]
  type ReverseIterator[Key] = tstlLib.baseIteratorSetIteratorMod.SetReverseIterator[
    Key, 
    tstlLib.tstlLibNumbers.`false`, 
    tstlLib.containerTreeMultiSetMod.TreeMultiSet[Key]
  ]
  type iterator[Key] = Iterator[Key]
  type reverse_iterator[Key] = ReverseIterator[Key]
}

