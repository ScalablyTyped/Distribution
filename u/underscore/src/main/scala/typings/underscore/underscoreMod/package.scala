package typings.underscore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object underscoreMod {
  type IterateeMatcherShorthand[T] = Dictionary[T]
  type IterateePropertyShorthand = String | Double
  type ListIterator[T, TResult] = js.Function3[/* value */ T, /* index */ Double, /* list */ List[T], TResult]
  type MemoIterator[T, TResult] = js.Function4[/* prev */ TResult, /* curr */ T, /* index */ Double, /* list */ List[T], TResult]
  type MemoObjectIterator[T, TResult] = js.Function4[/* prev */ TResult, /* curr */ T, /* key */ String, /* list */ Dictionary[T], TResult]
  type ObjectIterator[T, TResult] = js.Function3[/* element */ T, /* key */ String, /* list */ Dictionary[T], TResult]
  type Predicate[T] = js.Function1[/* value */ T, Boolean]
  type TypeOfDictionary[T] = js.Any
}
