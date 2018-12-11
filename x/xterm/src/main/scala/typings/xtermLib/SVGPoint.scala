package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SVGPoint")
@js.native
object SVGPoint
  extends ScalablyTyped.runtime.Instantiable0[DOMPoint]
     with ScalablyTyped.runtime.Instantiable1[/* x */ scala.Double, DOMPoint]
     with ScalablyTyped.runtime.Instantiable2[/* x */ scala.Double, /* y */ scala.Double, DOMPoint]
     with ScalablyTyped.runtime.Instantiable3[/* x */ scala.Double, /* y */ scala.Double, /* z */ scala.Double, DOMPoint]
     with ScalablyTyped.runtime.Instantiable4[
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* z */ scala.Double, 
      /* w */ scala.Double, 
      DOMPoint
    ] {
  def fromPoint(): xtermLib.DOMPoint = js.native
  def fromPoint(other: xtermLib.DOMPointInit): xtermLib.DOMPoint = js.native
}

