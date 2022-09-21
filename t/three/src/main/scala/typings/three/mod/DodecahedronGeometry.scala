package typings.three.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "DodecahedronGeometry")
@js.native
/**
  * @param [radius=1]
  * @param [detail=0]
  */
open class DodecahedronGeometry ()
  extends typings.three.threeMod.DodecahedronGeometry {
  def this(radius: Double) = this()
  def this(radius: Double, detail: Double) = this()
  def this(radius: Unit, detail: Double) = this()
}
/* static members */
object DodecahedronGeometry {
  
  @JSImport("three", "DodecahedronGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(data: Any): typings.three.dodecahedronGeometryMod.DodecahedronGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.dodecahedronGeometryMod.DodecahedronGeometry]
}
