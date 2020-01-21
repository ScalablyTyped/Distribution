package typings.vegaUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AccessorFn[R] = typings.vegaUtil.mod.Fn[R] with typings.vegaUtil.AnonFields
  type Fn[R] = js.Function1[/* repeated */ js.Any, R]
}
