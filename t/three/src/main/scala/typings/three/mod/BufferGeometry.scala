package typings.three.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "BufferGeometry")
@js.native
/**
	 * This creates a new BufferGeometry. It also sets several properties to an default value.
	 */
class BufferGeometry ()
  extends typings.three.bufferGeometryMod.BufferGeometry
/* static members */
object BufferGeometry {
  
  @JSImport("three", "BufferGeometry")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three", "BufferGeometry.MaxIndex")
  @js.native
  def MaxIndex: Double = js.native
  inline def MaxIndex_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MaxIndex")(x.asInstanceOf[js.Any])
}
