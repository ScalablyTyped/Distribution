package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMRect extends DOMRectReadOnly

@JSGlobal("DOMRect")
@js.native
object DOMRect
  extends org.scalablytyped.runtime.Instantiable0[DOMRect]
     with org.scalablytyped.runtime.Instantiable1[/* x */ scala.Double, DOMRect]
     with org.scalablytyped.runtime.Instantiable2[/* x */ scala.Double, /* y */ scala.Double, DOMRect]
     with org.scalablytyped.runtime.Instantiable3[/* x */ scala.Double, /* y */ scala.Double, /* width */ scala.Double, DOMRect]
     with org.scalablytyped.runtime.Instantiable4[
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* width */ scala.Double, 
      /* height */ scala.Double, 
      DOMRect
    ] {
  def fromRect(): xtermLib.DOMRect = js.native
  def fromRect(other: xtermLib.DOMRectInit): xtermLib.DOMRect = js.native
}

