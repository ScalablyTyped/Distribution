package typings.typescriptCollections

import org.scalablytyped.runtime.StringDictionary
import typings.typescriptCollections.anon.Nodes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiRootTreeMod {
  
  @JSImport("typescript-collections/dist/lib/MultiRootTree", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with MultiRootTree {
    def this(rootIds: js.Array[String]) = this()
    def this(rootIds: js.Array[String], nodes: StringDictionary[js.Array[String]]) = this()
    def this(rootIds: Unit, nodes: StringDictionary[js.Array[String]]) = this()
  }
  
  trait FlatTreeNode extends StObject {
    
    var childrenCount: Double
    
    var hasParent: Boolean
    
    var id: String
    
    var level: Double
  }
  object FlatTreeNode {
    
    inline def apply(childrenCount: Double, hasParent: Boolean, id: String, level: Double): FlatTreeNode = {
      val __obj = js.Dynamic.literal(childrenCount = childrenCount.asInstanceOf[js.Any], hasParent = hasParent.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlatTreeNode]
    }
    
    extension [Self <: FlatTreeNode](x: Self) {
      
      inline def setChildrenCount(value: Double): Self = StObject.set(x, "childrenCount", value.asInstanceOf[js.Any])
      
      inline def setHasParent(value: Boolean): Self = StObject.set(x, "hasParent", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MultiRootTree extends StObject {
    
    def createEmptyNodeIfNotExist(nodeKey: String): Unit = js.native
    
    def deleteId(id: String): Unit = js.native
    
    /* private */ def findNode(nodeKey: Any): Any = js.native
    
    /* private */ def findNodeId(nodeKey: Any, id: Any): Any = js.native
    
    /* private */ def findRootId(id: Any): Any = js.native
    
    def flatten(): js.Array[FlatTreeNode] = js.native
    
    def getNodes(): StringDictionary[js.Array[String]] = js.native
    
    def getObject(): Nodes = js.native
    
    def getRootIds(): js.Array[String] = js.native
    
    def initNodes(): Unit = js.native
    
    def initRootIds(): Unit = js.native
    
    def insertIdAfterId(belowId: String, insertId: String): Unit = js.native
    
    def insertIdBeforeId(beforeId: String, insertId: String): Unit = js.native
    
    def insertIdIntoId(insideId: String, insertId: String): Unit = js.native
    
    def insertIdIntoNode(nodeKey: String, id: String): Unit = js.native
    def insertIdIntoNode(nodeKey: String, id: String, position: Double): Unit = js.native
    
    def insertIdIntoRoot(id: String): Unit = js.native
    def insertIdIntoRoot(id: String, position: Double): Unit = js.native
    
    /* private */ def moveId(moveId: Any, beforeId: Any, direction: Any): Any = js.native
    
    def moveIdAfterId(moveId: String, afterId: String): Unit = js.native
    
    def moveIdBeforeId(moveId: String, beforeId: String): Unit = js.native
    
    def moveIdIntoId(moveId: String, insideId: String): Unit = js.native
    def moveIdIntoId(moveId: String, insideId: String, atStart: Boolean): Unit = js.native
    
    /* private */ def nodeAndSubNodesDelete(nodeKey: Any): Any = js.native
    
    /* private */ def nodeDelete(nodeKey: Any): Any = js.native
    
    /* private */ def nodeDeleteAtIndex(nodeKey: Any, index: Any): Any = js.native
    
    /* private */ def nodeInsertAtEnd(nodeKey: Any, id: Any): Any = js.native
    
    /* private */ def nodeInsertAtStart(nodeKey: Any, id: Any): Any = js.native
    
    /* private */ def nodeRefrencesDelete(id: Any): Any = js.native
    
    var nodes: StringDictionary[js.Array[String]] = js.native
    
    /* private */ def rootDelete(index: Any): Any = js.native
    
    /* private */ def rootDeleteId(id: Any): Any = js.native
    
    var rootIds: js.Array[String] = js.native
    
    /* private */ def rootInsertAtEnd(id: Any): Any = js.native
    
    /* private */ def rootInsertAtStart(id: Any): Any = js.native
    
    /* private */ def swapArrayElements(arr: Any, indexA: Any, indexB: Any): Any = js.native
    
    def swapRootIdWithRootId(rootId: String, withRootId: String): Unit = js.native
    
    def swapRootPositionWithRootPosition(swapRootPosition: Double, withRootPosition: Double): Unit = js.native
    
    def toObject(): Nodes = js.native
  }
}
