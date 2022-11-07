package typings.three.examplesJsmNodesNodesMod

import typings.three.examplesJsmNodesShadernodeShaderNodeMod.Swizzable
import typings.three.examplesJsmNodesUtilsTriplanarTexturesNodeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/nodes/Nodes", "TriplanarTexturesNode")
@js.native
open class TriplanarTexturesNode protected () extends default {
  def this(
    textureXNode: typings.three.examplesJsmNodesCoreNodeMod.default,
    textureYNode: js.UndefOr[TextureNode | Null],
    textureZNode: js.UndefOr[TextureNode | Null],
    scaleNode: js.UndefOr[Swizzable[Node]],
    positionNode: js.UndefOr[Swizzable[PositionNode]],
    normalNode: js.UndefOr[Swizzable[PositionNode]]
  ) = this()
}
