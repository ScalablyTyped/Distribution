package typings.three

import typings.three.srcConstantsMod.TextureEncoding
import typings.three.threeStrings.LinearToLinear
import typings.three.threeStrings.LinearTosRGB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorSpaceNodeMod {
  
  @JSImport("three/examples/jsm/nodes/display/ColorSpaceNode", JSImport.Default)
  @js.native
  open class default protected () extends ColorSpaceNode {
    def this(method: Null, node: typings.three.nodeMod.default) = this()
    def this(method: ColorSpaceNodeMethod, node: typings.three.nodeMod.default) = this()
  }
  /* static members */
  object default {
    
    @JSImport("three/examples/jsm/nodes/display/ColorSpaceNode", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/nodes/display/ColorSpaceNode", "default.LINEAR_TO_LINEAR")
    @js.native
    def LINEAR_TO_LINEAR: LinearToLinear = js.native
    inline def LINEAR_TO_LINEAR_=(x: LinearToLinear): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINEAR_TO_LINEAR")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/display/ColorSpaceNode", "default.LINEAR_TO_SRGB")
    @js.native
    def LINEAR_TO_SRGB: LinearTosRGB = js.native
    inline def LINEAR_TO_SRGB_=(x: LinearTosRGB): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINEAR_TO_SRGB")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ColorSpaceNode
    extends typings.three.tempNodeMod.default {
    
    def fromEncoding(encoding: TextureEncoding): this.type = js.native
    
    var method: ColorSpaceNodeMethod = js.native
    
    var node: typings.three.nodeMod.default = js.native
  }
  
  type ColorSpaceNodeMethod = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ColorSpaceNode.LINEAR_TO_LINEAR */ Any
}
