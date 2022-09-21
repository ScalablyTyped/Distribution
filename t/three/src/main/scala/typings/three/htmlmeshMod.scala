package typings.three

import typings.std.HTMLElement
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.materialMod.Material
import typings.three.mod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlmeshMod {
  
  @JSImport("three/examples/jsm/interactive/HTMLMesh", "HTMLMesh")
  @js.native
  open class HTMLMesh protected ()
    extends Mesh[BufferGeometry, Material | js.Array[Material]] {
    def this(dom: HTMLElement) = this()
    
    def dispose(): Unit = js.native
  }
}
