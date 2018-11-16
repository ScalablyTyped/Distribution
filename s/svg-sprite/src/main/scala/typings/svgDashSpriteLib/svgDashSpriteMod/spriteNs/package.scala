package typings
package svgDashSpriteLib.svgDashSpriteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object spriteNs {
  type CompileCallback = js.Function3[/* error */ nodeLib.Error, /* result */ js.Any, /* data */ js.Any, js.Any]
  type GetShapesCallback = js.Function2[/* error */ nodeLib.Error, /* result */ js.Array[vinylLib.vinylMod.File], js.Any]
  type SvgTransformer = js.Function1[/* svg */ java.lang.String, java.lang.String]
}
