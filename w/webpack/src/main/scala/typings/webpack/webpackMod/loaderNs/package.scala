package typings.webpack.webpackMod

import typings.node.Buffer
import typings.sourceDashMap.sourceDashMapMod.RawSourceMap
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loaderNs {
  type loaderCallback = js.Function3[
    /* err */ js.UndefOr[Error | Null], 
    /* content */ js.UndefOr[String | Buffer], 
    /* sourceMap */ js.UndefOr[RawSourceMap], 
    Unit
  ]
}
