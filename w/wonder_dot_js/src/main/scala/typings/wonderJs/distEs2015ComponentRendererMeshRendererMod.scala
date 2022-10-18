package typings.wonderJs

import typings.wonderJs.distEs2015ComponentGeometryGeometryMod.Geometry
import typings.wonderJs.distEs2015ComponentRendererRendererComponentMod.RendererComponent
import typings.wonderJs.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject
import typings.wonderJs.distEs2015RendererCommandQuadCommandMod.QuadCommand
import typings.wonderJs.distEs2015RendererRendererRendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015ComponentRendererMeshRendererMod {
  
  @JSImport("wonder.js/dist/es2015/component/renderer/MeshRenderer", "MeshRenderer")
  @js.native
  open class MeshRenderer () extends RendererComponent {
    
    /* protected */ def createDrawCommand(target: GameObject, geometry: Geometry, camera: GameObject): QuadCommand = js.native
    
    @JSName("entityObject")
    var entityObject_MeshRenderer: GameObject = js.native
    
    def render(renderer: Renderer, target: GameObject, camera: GameObject): Unit = js.native
  }
  /* static members */
  object MeshRenderer {
    
    @JSImport("wonder.js/dist/es2015/component/renderer/MeshRenderer", "MeshRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): MeshRenderer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[MeshRenderer]
  }
}
