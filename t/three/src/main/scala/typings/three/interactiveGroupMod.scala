package typings.three

import typings.three.mod.Camera
import typings.three.mod.Group
import typings.three.mod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactiveGroupMod {
  
  @JSImport("three/examples/jsm/interactive/InteractiveGroup", "InteractiveGroup")
  @js.native
  open class InteractiveGroup protected () extends Group {
    def this(renderer: WebGLRenderer, camera: Camera) = this()
  }
}
