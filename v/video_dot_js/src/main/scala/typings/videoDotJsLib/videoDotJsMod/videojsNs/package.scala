package typings
package videoDotJsLib.videoDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object videojsNs {
  type Child = java.lang.String | videoDotJsLib.Anon_Children
  type Content = java.lang.String | stdLib.Element | stdLib.Node | (js.Function0[java.lang.String | stdLib.Element | stdLib.Node])
  type XhrCallback = js.Function3[
    /* error */ js.UndefOr[stdLib.Error], 
    /* response */ js.UndefOr[XhrResponse], 
    /* body */ js.UndefOr[js.Any], 
    scala.Unit
  ]
}
