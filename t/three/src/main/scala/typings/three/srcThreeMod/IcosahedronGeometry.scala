package typings.three.srcThreeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "IcosahedronGeometry")
@js.native
/**
  * @param [radius=1]
  * @param [detail=0]
  */
open class IcosahedronGeometry ()
  extends typings.three.srcGeometriesGeometriesMod.IcosahedronGeometry {
  def this(radius: Double) = this()
  def this(radius: Double, detail: Double) = this()
  def this(radius: Unit, detail: Double) = this()
}
/* static members */
object IcosahedronGeometry {
  
  @JSImport("three/src/Three", "IcosahedronGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(data: Any): typings.three.srcGeometriesIcosahedronGeometryMod.IcosahedronGeometry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[typings.three.srcGeometriesIcosahedronGeometryMod.IcosahedronGeometry]
}
