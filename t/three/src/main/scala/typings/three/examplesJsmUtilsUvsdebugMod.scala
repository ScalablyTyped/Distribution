package typings.three

import typings.std.HTMLCanvasElement
import typings.three.srcThreeMod.BufferGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmUtilsUvsdebugMod {
  
  @JSImport("three/examples/jsm/utils/UVsDebug", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def UVsDebug(geometry: BufferGeometry, size: Double): HTMLCanvasElement = (^.asInstanceOf[js.Dynamic].applyDynamic("UVsDebug")(geometry.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[HTMLCanvasElement]
}
