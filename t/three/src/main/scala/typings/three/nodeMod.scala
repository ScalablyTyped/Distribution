package typings.three

import typings.three.anon.Images
import typings.three.constantsMod.AnyJson
import typings.three.constantsMod.NodeTypeOption
import typings.three.constantsMod.NodeUpdateTypeOption
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod {
  
  @JSImport("three/examples/jsm/nodes/core/Node", JSImport.Default)
  @js.native
  abstract class default ()
    extends StObject
       with Node {
    def this(nodeType: NodeTypeOption) = this()
  }
  
  @js.native
  trait Node extends StObject {
    
    def analyze(builder: typings.three.nodeBuilderMod.default): Unit = js.native
    
    def build(builder: typings.three.nodeBuilderMod.default): String = js.native
    def build(builder: typings.three.nodeBuilderMod.default, output: String): String = js.native
    
    def construct(builder: typings.three.nodeBuilderMod.default): Node | Null = js.native
    
    def deserialize(json: AnyJson): Unit = js.native
    
    def generate(builder: typings.three.nodeBuilderMod.default): String = js.native
    def generate(builder: typings.three.nodeBuilderMod.default, output: String): String = js.native
    
    def getCacheKey(): String = js.native
    
    def getChildren(): js.Array[Node] = js.native
    
    def getConstructHash(builder: typings.three.nodeBuilderMod.default): String = js.native
    
    def getHash(builder: typings.three.nodeBuilderMod.default): String = js.native
    
    def getNodeType(builder: typings.three.nodeBuilderMod.default): NodeTypeOption | Null = js.native
    def getNodeType(builder: typings.three.nodeBuilderMod.default, output: String): NodeTypeOption | Null = js.native
    
    def getReference(builder: typings.three.nodeBuilderMod.default): Node = js.native
    
    def getUpdateType(builder: typings.three.nodeBuilderMod.default): NodeUpdateTypeOption = js.native
    
    var id: Double = js.native
    
    var isNode: `true` = js.native
    
    var nodeType: NodeTypeOption | Null = js.native
    
    def serialize(json: AnyJson): Unit = js.native
    
    def toJSON(): AnyJson = js.native
    def toJSON(meta: String): AnyJson = js.native
    def toJSON(meta: Images): AnyJson = js.native
    
    var `type`: String = js.native
    
    /** This method must be overriden when {@link updateType} !== 'none' */
    def update(frame: typings.three.nodeFrameMod.default): Unit = js.native
    
    var updateType: NodeUpdateTypeOption = js.native
    
    var uuid: String = js.native
  }
}
