package typings
package underscoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object underscoreMod {
  type IterateeMatcherShorthand[T] = Dictionary[T]
  type IterateePropertyShorthand = java.lang.String | scala.Double
  type ListIterator[T, TResult] = js.Function3[/* value */ T, /* index */ scala.Double, /* list */ List[T], TResult]
  type MemoIterator[T, TResult] = js.Function4[/* prev */ TResult, /* curr */ T, /* index */ scala.Double, /* list */ List[T], TResult]
  type MemoObjectIterator[T, TResult] = js.Function4[
    /* prev */ TResult, 
    /* curr */ T, 
    /* key */ java.lang.String, 
    /* list */ Dictionary[T], 
    TResult
  ]
  type ObjectIterator[T, TResult] = js.Function3[/* element */ T, /* key */ java.lang.String, /* list */ Dictionary[T], TResult]
  type Predicate[T] = js.Function1[/* value */ T, scala.Boolean]
}
