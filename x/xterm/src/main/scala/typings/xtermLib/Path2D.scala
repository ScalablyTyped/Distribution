package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Path2D extends CanvasPath {
  def addPath(path: Path2D): scala.Unit = js.native
  def addPath(path: Path2D, transform: DOMMatrix2DInit): scala.Unit = js.native
}

@JSGlobal("Path2D")
@js.native
object Path2D
  extends ScalablyTyped.runtime.Instantiable1[(/* path */ Path2D) | (/* path */ java.lang.String), Path2D]
     with ScalablyTyped.runtime.Instantiable0[Path2D]

