package typings
package webpackLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loaderNs {
  type loaderCallback = js.Function3[
    /* err */ js.UndefOr[stdLib.Error | scala.Null], 
    /* content */ js.UndefOr[java.lang.String | nodeLib.Buffer], 
    /* sourceMap */ js.UndefOr[sourceDashMapLib.sourceDashMapMod.RawSourceMap], 
    scala.Unit
  ]
}
