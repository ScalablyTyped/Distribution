package typings.underscore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ChainSingle[V] = typings.underscore.mod.Chain[typings.underscore.mod.TypeOfCollection[V], V]
  type Collection[T] = typings.underscore.mod.List[T] | typings.underscore.mod.Dictionary[T]
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type IterateeMatcherShorthand[T] = typings.underscore.mod.Dictionary[T]
  type IterateePropertyShorthand = java.lang.String | scala.Double
  type ListIterator[T, TResult] = js.Function3[
    /* value */ T, 
    /* index */ scala.Double, 
    /* list */ typings.underscore.mod.List[T], 
    TResult
  ]
  type MemoIterator[T, TResult] = js.Function4[
    /* prev */ TResult, 
    /* curr */ T, 
    /* index */ scala.Double, 
    /* list */ typings.underscore.mod.List[T], 
    TResult
  ]
  type MemoObjectIterator[T, TResult] = js.Function4[
    /* prev */ TResult, 
    /* curr */ T, 
    /* key */ java.lang.String, 
    /* list */ typings.underscore.mod.Dictionary[T], 
    TResult
  ]
  type ObjectIterator[T, TResult] = js.Function3[
    /* element */ T, 
    /* key */ java.lang.String, 
    /* list */ typings.underscore.mod.Dictionary[T], 
    TResult
  ]
  type Predicate[T] = js.Function1[/* value */ T, scala.Boolean]
  type TypeOfCollection[V] = js.Any
  type TypeOfDictionary[V] = js.Any
  type TypeOfList[V] = js.Any
}
