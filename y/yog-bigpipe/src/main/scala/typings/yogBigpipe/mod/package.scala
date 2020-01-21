package typings.yogBigpipe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function1[/* done */ js.Function2[/* err */ js.Any, /* data */ js.Any, js.Any], js.Any]
  type Pagelet = typings.yogBigpipe.mod.Pagelet_
  type PageletConstructor[T] = org.scalablytyped.runtime.Instantiable1[/* obj */ typings.yogBigpipe.mod.PageletOption, T]
}
