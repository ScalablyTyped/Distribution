package typings.three

import typings.std.HTMLElement
import typings.three.mod.Mesh
import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcMaterialsMaterialMod.Material
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmInteractiveHtmlmeshMod {
  
  @JSImport("three/examples/jsm/interactive/HTMLMesh", "HTMLMesh")
  @js.native
  open class HTMLMesh protected ()
    extends Mesh[BufferGeometry, Material | js.Array[Material]] {
    def this(dom: HTMLElement) = this()
    
    def dispose(): Unit = js.native
  }
}
