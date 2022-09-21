package typings.three.nodesMod

import typings.three.cameraNodeMod.CameraNodeScope
import typings.three.cameraNodeMod.default
import typings.three.threeStrings.projectionMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/nodes/Nodes", "CameraNode")
@js.native
open class CameraNode () extends default {
  def this(scope: CameraNodeScope) = this()
}
/* static members */
object CameraNode {
  
  @JSImport("three/examples/jsm/nodes/Nodes", "CameraNode")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three/examples/jsm/nodes/Nodes", "CameraNode.PROJECTION_MATRIX")
  @js.native
  def PROJECTION_MATRIX: projectionMatrix = js.native
  inline def PROJECTION_MATRIX_=(x: projectionMatrix): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROJECTION_MATRIX")(x.asInstanceOf[js.Any])
}
