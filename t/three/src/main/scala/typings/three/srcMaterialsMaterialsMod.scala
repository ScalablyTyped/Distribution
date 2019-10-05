package typings.three

import typings.three.srcMaterialsLineBasicMaterialMod.LineBasicMaterialParameters
import typings.three.srcMaterialsLineDashedMaterialMod.LineDashedMaterialParameters
import typings.three.srcMaterialsMeshBasicMaterialMod.MeshBasicMaterialParameters
import typings.three.srcMaterialsMeshDepthMaterialMod.MeshDepthMaterialParameters
import typings.three.srcMaterialsMeshDistanceMaterialMod.MeshDistanceMaterialParameters
import typings.three.srcMaterialsMeshLambertMaterialMod.MeshLambertMaterialParameters
import typings.three.srcMaterialsMeshMatcapMaterialMod.MeshMatcapMaterialParameters
import typings.three.srcMaterialsMeshNormalMaterialMod.MeshNormalMaterialParameters
import typings.three.srcMaterialsMeshPhongMaterialMod.MeshPhongMaterialParameters
import typings.three.srcMaterialsMeshPhysicalMaterialMod.MeshPhysicalMaterialParameters
import typings.three.srcMaterialsMeshStandardMaterialMod.MeshStandardMaterialParameters
import typings.three.srcMaterialsMeshToonMaterialMod.MeshToonMaterialParameters
import typings.three.srcMaterialsPointsMaterialMod.PointsMaterialParameters
import typings.three.srcMaterialsShaderMaterialMod.ShaderMaterialParameters
import typings.three.srcMaterialsSpriteMaterialMod.SpriteMaterialParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/materials/Materials", JSImport.Namespace)
@js.native
object srcMaterialsMaterialsMod extends js.Object {
  @js.native
  class LineBasicMaterial ()
    extends typings.three.srcMaterialsLineBasicMaterialMod.LineBasicMaterial {
    def this(parameters: LineBasicMaterialParameters) = this()
  }
  
  @js.native
  class LineDashedMaterial ()
    extends typings.three.srcMaterialsLineDashedMaterialMod.LineDashedMaterial {
    def this(parameters: LineDashedMaterialParameters) = this()
  }
  
  @js.native
  class Material ()
    extends typings.three.srcMaterialsMaterialMod.Material
  
  @js.native
  class MeshBasicMaterial ()
    extends typings.three.srcMaterialsMeshBasicMaterialMod.MeshBasicMaterial {
    def this(parameters: MeshBasicMaterialParameters) = this()
  }
  
  @js.native
  class MeshDepthMaterial ()
    extends typings.three.srcMaterialsMeshDepthMaterialMod.MeshDepthMaterial {
    def this(parameters: MeshDepthMaterialParameters) = this()
  }
  
  @js.native
  class MeshDistanceMaterial ()
    extends typings.three.srcMaterialsMeshDistanceMaterialMod.MeshDistanceMaterial {
    def this(parameters: MeshDistanceMaterialParameters) = this()
  }
  
  @js.native
  class MeshLambertMaterial ()
    extends typings.three.srcMaterialsMeshLambertMaterialMod.MeshLambertMaterial {
    def this(parameters: MeshLambertMaterialParameters) = this()
  }
  
  @js.native
  class MeshMatcapMaterial ()
    extends typings.three.srcMaterialsMeshMatcapMaterialMod.MeshMatcapMaterial {
    def this(parameters: MeshMatcapMaterialParameters) = this()
  }
  
  @js.native
  class MeshNormalMaterial ()
    extends typings.three.srcMaterialsMeshNormalMaterialMod.MeshNormalMaterial {
    def this(parameters: MeshNormalMaterialParameters) = this()
  }
  
  @js.native
  class MeshPhongMaterial ()
    extends typings.three.srcMaterialsMeshPhongMaterialMod.MeshPhongMaterial {
    def this(parameters: MeshPhongMaterialParameters) = this()
  }
  
  @js.native
  class MeshPhysicalMaterial protected ()
    extends typings.three.srcMaterialsMeshPhysicalMaterialMod.MeshPhysicalMaterial {
    def this(parameters: MeshPhysicalMaterialParameters) = this()
  }
  
  @js.native
  class MeshStandardMaterial ()
    extends typings.three.srcMaterialsMeshStandardMaterialMod.MeshStandardMaterial {
    def this(parameters: MeshStandardMaterialParameters) = this()
  }
  
  @js.native
  class MeshToonMaterial ()
    extends typings.three.srcMaterialsMeshToonMaterialMod.MeshToonMaterial {
    def this(parameters: MeshToonMaterialParameters) = this()
  }
  
  @js.native
  class MultiMaterial ()
    extends typings.three.srcMaterialsPointsMaterialMod.MultiMaterial {
    def this(materials: js.Array[typings.three.srcMaterialsMaterialMod.Material]) = this()
  }
  
  @js.native
  class PointsMaterial ()
    extends typings.three.srcMaterialsPointsMaterialMod.PointsMaterial {
    def this(parameters: PointsMaterialParameters) = this()
  }
  
  @js.native
  class RawShaderMaterial ()
    extends typings.three.srcMaterialsRawShaderMaterialMod.RawShaderMaterial {
    def this(parameters: ShaderMaterialParameters) = this()
  }
  
  @js.native
  class ShaderMaterial ()
    extends typings.three.srcMaterialsShaderMaterialMod.ShaderMaterial {
    def this(parameters: ShaderMaterialParameters) = this()
  }
  
  @js.native
  class ShadowMaterial ()
    extends typings.three.srcMaterialsShadowMaterialMod.ShadowMaterial {
    def this(parameters: ShaderMaterialParameters) = this()
  }
  
  @js.native
  class SpriteMaterial ()
    extends typings.three.srcMaterialsSpriteMaterialMod.SpriteMaterial {
    def this(parameters: SpriteMaterialParameters) = this()
  }
  
  var MaterialIdCount: Double = js.native
}

