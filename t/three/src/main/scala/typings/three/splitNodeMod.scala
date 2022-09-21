package typings.three

import typings.three.constantsMod.SwizzleOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitNodeMod {
  
  @JSImport("three/examples/jsm/nodes/utils/SplitNode", JSImport.Default)
  @js.native
  open class default protected () extends SplitNode {
    /**
      *
      * @param node the input node
      * @param components swizzle like string, default = "x"
      */
    def this(node: typings.three.nodeMod.default) = this()
    def this(node: typings.three.nodeMod.default, components: SwizzleOption) = this()
  }
  
  @js.native
  trait SplitNode
    extends typings.three.nodeMod.default {
    
    var components: String = js.native
    
    def getVectorLength(): Double = js.native
    
    var node: typings.three.nodeMod.default = js.native
  }
}
