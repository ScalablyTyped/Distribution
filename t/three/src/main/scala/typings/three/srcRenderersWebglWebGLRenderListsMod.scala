package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreObject3DMod.Object3D
import typings.three.srcMaterialsMaterialMod.Material
import typings.three.srcObjectsGroupMod.Group
import typings.three.srcRenderersWebglWebGLProgramMod.WebGLProgram
import typings.three.srcRenderersWebglWebGLPropertiesMod.WebGLProperties
import typings.three.srcScenesSceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersWebglWebGLRenderListsMod {
  
  @JSImport("three/src/renderers/webgl/WebGLRenderLists", "WebGLRenderList")
  @js.native
  open class WebGLRenderList protected () extends StObject {
    def this(properties: WebGLProperties) = this()
    
    def finish(): Unit = js.native
    
    def init(): Unit = js.native
    
    /**
      * @default []
      */
    var opaque: js.Array[RenderItem] = js.native
    
    def push(`object`: Object3D[Event], geometry: Null, material: Material, groupOrder: Double, z: Double): Unit = js.native
    def push(
      `object`: Object3D[Event],
      geometry: Null,
      material: Material,
      groupOrder: Double,
      z: Double,
      group: Group
    ): Unit = js.native
    def push(
      `object`: Object3D[Event],
      geometry: BufferGeometry[NormalBufferAttributes],
      material: Material,
      groupOrder: Double,
      z: Double
    ): Unit = js.native
    def push(
      `object`: Object3D[Event],
      geometry: BufferGeometry[NormalBufferAttributes],
      material: Material,
      groupOrder: Double,
      z: Double,
      group: Group
    ): Unit = js.native
    
    def sort(
      opaqueSort: js.Function2[/* a */ Any, /* b */ Any, Double],
      transparentSort: js.Function2[/* a */ Any, /* b */ Any, Double]
    ): Unit = js.native
    
    /**
      * @default []
      */
    var transmissive: js.Array[RenderItem] = js.native
    
    /**
      * @default []
      */
    var transparent: js.Array[RenderItem] = js.native
    
    def unshift(`object`: Object3D[Event], geometry: Null, material: Material, groupOrder: Double, z: Double): Unit = js.native
    def unshift(
      `object`: Object3D[Event],
      geometry: Null,
      material: Material,
      groupOrder: Double,
      z: Double,
      group: Group
    ): Unit = js.native
    def unshift(
      `object`: Object3D[Event],
      geometry: BufferGeometry[NormalBufferAttributes],
      material: Material,
      groupOrder: Double,
      z: Double
    ): Unit = js.native
    def unshift(
      `object`: Object3D[Event],
      geometry: BufferGeometry[NormalBufferAttributes],
      material: Material,
      groupOrder: Double,
      z: Double,
      group: Group
    ): Unit = js.native
  }
  
  @JSImport("three/src/renderers/webgl/WebGLRenderLists", "WebGLRenderLists")
  @js.native
  open class WebGLRenderLists protected () extends StObject {
    def this(properties: WebGLProperties) = this()
    
    def dispose(): Unit = js.native
    
    def get(scene: Scene, renderCallDepth: Double): WebGLRenderList = js.native
  }
  
  trait RenderItem extends StObject {
    
    var geometry: BufferGeometry[NormalBufferAttributes] | Null
    
    var group: Group | Null
    
    var groupOrder: Double
    
    var id: Double
    
    var material: Material
    
    var `object`: Object3D[Event]
    
    var program: WebGLProgram
    
    var renderOrder: Double
    
    var z: Double
  }
  object RenderItem {
    
    inline def apply(
      groupOrder: Double,
      id: Double,
      material: Material,
      `object`: Object3D[Event],
      program: WebGLProgram,
      renderOrder: Double,
      z: Double
    ): RenderItem = {
      val __obj = js.Dynamic.literal(groupOrder = groupOrder.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], material = material.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], renderOrder = renderOrder.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any], geometry = null, group = null)
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderItem] (val x: Self) extends AnyVal {
      
      inline def setGeometry(value: BufferGeometry[NormalBufferAttributes]): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setGeometryNull: Self = StObject.set(x, "geometry", null)
      
      inline def setGroup(value: Group): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupNull: Self = StObject.set(x, "group", null)
      
      inline def setGroupOrder(value: Double): Self = StObject.set(x, "groupOrder", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMaterial(value: Material): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
      
      inline def setObject(value: Object3D[Event]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setProgram(value: WebGLProgram): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      inline def setRenderOrder(value: Double): Self = StObject.set(x, "renderOrder", value.asInstanceOf[js.Any])
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
}
