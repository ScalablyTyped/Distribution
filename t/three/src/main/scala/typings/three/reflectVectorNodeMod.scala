package typings.three

import typings.three.threeStrings.reflectVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectVectorNodeMod {
  
  @JSImport("three/examples/jsm/nodes/accessors/ReflectVectorNode", JSImport.Default)
  @js.native
  open class default () extends ReflectVectorNode
  
  @js.native
  trait ReflectVectorNode
    extends typings.three.nodeMod.default {
    
    def construct(): typings.three.nodeMod.default = js.native
    
    def getHash(): reflectVector = js.native
  }
}
