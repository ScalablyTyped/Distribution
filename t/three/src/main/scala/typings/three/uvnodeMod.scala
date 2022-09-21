package typings.three

import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uvnodeMod {
  
  @JSImport("three/examples/jsm/nodes/accessors/UVNode", JSImport.Default)
  @js.native
  open class default () extends UVNode {
    def this(index: Double) = this()
  }
  
  @js.native
  trait UVNode
    extends typings.three.attributeNodeMod.default {
    
    var index: Double = js.native
    
    var isUVNode: `true` = js.native
  }
}
