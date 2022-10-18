package typings.stylehacks

import typings.postcss.mod.Node
import typings.postcss.mod.Result
import typings.std.Set
import typings.stylehacks.anon.Browsers
import typings.stylehacks.anon.Hack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPluginMod {
  
  @JSImport("stylehacks/types/plugin", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with BasePlugin {
    /**
      * @param {string[]} targets
      * @param {string[]} nodeTypes
      * @param {import('postcss').Result=} result
      */
    def this(targets: js.Array[String], nodeTypes: js.Array[String]) = this()
    def this(targets: js.Array[String], nodeTypes: js.Array[String], result: Result) = this()
    
    /**
      * @param {import('postcss').Node} node
      * @return {boolean}
      */
    /* CompleteClass */
    override def any(node: Node): Boolean = js.native
    
    /** @param {import('postcss').Node} node */
    /* CompleteClass */
    override def detect(node: Node): Unit = js.native
    
    /**
      * @param {import('postcss').Node} node
      * @return {void}
      */
    /* CompleteClass */
    override def detectAndResolve(node: Node): Unit = js.native
    
    /**
      * @param {import('postcss').Node} node
      * @return {void}
      */
    /* CompleteClass */
    override def detectAndWarn(node: Node): Unit = js.native
    
    /* CompleteClass */
    var nodeTypes: Set[String] = js.native
    
    /** @type {NodeWithInfo[]} */
    /* CompleteClass */
    var nodes: js.Array[NodeWithInfo] = js.native
    
    /**
      * @param {import('postcss').Node} node
      * @param {{identifier: string, hack: string}} metadata
      * @return {void}
      */
    /* CompleteClass */
    override def push(node: Node, metadata: Hack): Unit = js.native
    
    /** @return {void} */
    /* CompleteClass */
    override def resolve(): Unit = js.native
    
    /* CompleteClass */
    var targets: Set[String] = js.native
    
    /* CompleteClass */
    override def warn(): Unit = js.native
  }
  
  trait BasePlugin extends StObject {
    
    /**
      * @param {import('postcss').Node} node
      * @return {boolean}
      */
    def any(node: Node): Boolean
    
    /** @param {import('postcss').Node} node */
    def detect(node: Node): Unit
    
    /**
      * @param {import('postcss').Node} node
      * @return {void}
      */
    def detectAndResolve(node: Node): Unit
    
    /**
      * @param {import('postcss').Node} node
      * @return {void}
      */
    def detectAndWarn(node: Node): Unit
    
    var nodeTypes: Set[String]
    
    /** @type {NodeWithInfo[]} */
    var nodes: js.Array[NodeWithInfo]
    
    /**
      * @param {import('postcss').Node} node
      * @param {{identifier: string, hack: string}} metadata
      * @return {void}
      */
    def push(node: Node, metadata: Hack): Unit
    
    /** @return {void} */
    def resolve(): Unit
    
    var result: js.UndefOr[Result] = js.undefined
    
    var targets: Set[String]
    
    def warn(): Unit
  }
  object BasePlugin {
    
    inline def apply(
      any: Node => Boolean,
      detect: Node => Unit,
      detectAndResolve: Node => Unit,
      detectAndWarn: Node => Unit,
      nodeTypes: Set[String],
      nodes: js.Array[NodeWithInfo],
      push: (Node, Hack) => Unit,
      resolve: () => Unit,
      targets: Set[String],
      warn: () => Unit
    ): BasePlugin = {
      val __obj = js.Dynamic.literal(any = js.Any.fromFunction1(any), detect = js.Any.fromFunction1(detect), detectAndResolve = js.Any.fromFunction1(detectAndResolve), detectAndWarn = js.Any.fromFunction1(detectAndWarn), nodeTypes = nodeTypes.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], push = js.Any.fromFunction2(push), resolve = js.Any.fromFunction0(resolve), targets = targets.asInstanceOf[js.Any], warn = js.Any.fromFunction0(warn))
      __obj.asInstanceOf[BasePlugin]
    }
    
    extension [Self <: BasePlugin](x: Self) {
      
      inline def setAny(value: Node => Boolean): Self = StObject.set(x, "any", js.Any.fromFunction1(value))
      
      inline def setDetect(value: Node => Unit): Self = StObject.set(x, "detect", js.Any.fromFunction1(value))
      
      inline def setDetectAndResolve(value: Node => Unit): Self = StObject.set(x, "detectAndResolve", js.Any.fromFunction1(value))
      
      inline def setDetectAndWarn(value: Node => Unit): Self = StObject.set(x, "detectAndWarn", js.Any.fromFunction1(value))
      
      inline def setNodeTypes(value: Set[String]): Self = StObject.set(x, "nodeTypes", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Array[NodeWithInfo]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: NodeWithInfo*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setPush(value: (Node, Hack) => Unit): Self = StObject.set(x, "push", js.Any.fromFunction2(value))
      
      inline def setResolve(value: () => Unit): Self = StObject.set(x, "resolve", js.Any.fromFunction0(value))
      
      inline def setResult(value: Result): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setTargets(value: Set[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setWarn(value: () => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait NodeWithInfo extends Node {
    
    var _stylehacks: Browsers = js.native
  }
  
  trait Plugin extends StObject {
    
    def detectAndResolve(node: Node): Unit
    
    def detectAndWarn(node: Node): Unit
    
    var nodeTypes: Set[String]
    
    var targets: Set[String]
  }
  object Plugin {
    
    inline def apply(
      detectAndResolve: Node => Unit,
      detectAndWarn: Node => Unit,
      nodeTypes: Set[String],
      targets: Set[String]
    ): Plugin = {
      val __obj = js.Dynamic.literal(detectAndResolve = js.Any.fromFunction1(detectAndResolve), detectAndWarn = js.Any.fromFunction1(detectAndWarn), nodeTypes = nodeTypes.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plugin]
    }
    
    extension [Self <: Plugin](x: Self) {
      
      inline def setDetectAndResolve(value: Node => Unit): Self = StObject.set(x, "detectAndResolve", js.Any.fromFunction1(value))
      
      inline def setDetectAndWarn(value: Node => Unit): Self = StObject.set(x, "detectAndWarn", js.Any.fromFunction1(value))
      
      inline def setNodeTypes(value: Set[String]): Self = StObject.set(x, "nodeTypes", value.asInstanceOf[js.Any])
      
      inline def setTargets(value: Set[String]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    }
  }
}
