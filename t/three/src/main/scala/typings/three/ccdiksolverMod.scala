package typings.three

import typings.three.anon.Enabled
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.eventDispatcherMod.Event
import typings.three.materialMod.Material
import typings.three.threeMod.Object3D
import typings.three.threeMod.SkinnedMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ccdiksolverMod {
  
  @JSImport("three/examples/jsm/animation/CCDIKSolver", "CCDIKHelper")
  @js.native
  open class CCDIKHelper protected () extends Object3D[Event] {
    def this(mesh: SkinnedMesh[BufferGeometry, Material | js.Array[Material]], iks: js.Array[IKS]) = this()
  }
  
  @JSImport("three/examples/jsm/animation/CCDIKSolver", "CCDIKSolver")
  @js.native
  open class CCDIKSolver protected () extends StObject {
    def this(mesh: SkinnedMesh[BufferGeometry, Material | js.Array[Material]], iks: js.Array[IKS]) = this()
    
    def createHelper(): CCDIKHelper = js.native
    
    def update(): this.type = js.native
    
    def updateOne(iks: IKS): this.type = js.native
  }
  
  trait IKS extends StObject {
    
    var effector: Double
    
    var iteration: Double
    
    var links: Enabled
    
    var maxAngle: Double
    
    var target: Double
  }
  object IKS {
    
    inline def apply(effector: Double, iteration: Double, links: Enabled, maxAngle: Double, target: Double): IKS = {
      val __obj = js.Dynamic.literal(effector = effector.asInstanceOf[js.Any], iteration = iteration.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], maxAngle = maxAngle.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKS]
    }
    
    extension [Self <: IKS](x: Self) {
      
      inline def setEffector(value: Double): Self = StObject.set(x, "effector", value.asInstanceOf[js.Any])
      
      inline def setIteration(value: Double): Self = StObject.set(x, "iteration", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: Enabled): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setMaxAngle(value: Double): Self = StObject.set(x, "maxAngle", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
