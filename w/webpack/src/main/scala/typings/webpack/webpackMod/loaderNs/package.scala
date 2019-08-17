package typings.webpack.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loaderNs {
  import typings.node.Buffer
  import typings.sourceDashMap.sourceDashMapMod.RawSourceMap
  import typings.std.Error

  type loaderCallback = js.Function3[
    /* err */ js.UndefOr[Error | Null], 
    /* content */ js.UndefOr[String | Buffer], 
    /* sourceMap */ js.UndefOr[RawSourceMap], 
    Unit
  ]
}
