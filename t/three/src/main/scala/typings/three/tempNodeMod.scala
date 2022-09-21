package typings.three

import typings.three.constantsMod.NodeTypeOption
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tempNodeMod {
  
  @JSImport("three/examples/jsm/nodes/core/TempNode", JSImport.Default)
  @js.native
  open class default () extends TempNode {
    def this(`type`: NodeTypeOption) = this()
  }
  
  @js.native
  trait TempNode
    extends typings.three.nodeMod.default {
    
    var isTempNode: `true` = js.native
  }
}
