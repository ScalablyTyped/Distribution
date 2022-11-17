package typings.three

import typings.std.Exclude
import typings.std.Map
import typings.three.examplesJsmNodesCoreConstantsMod.NodeTypeOption
import typings.three.examplesJsmNodesNodesMod.ConstNode
import typings.three.examplesJsmNodesNodesMod.Node
import typings.three.examplesJsmNodesNodesMod.NodeBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesShadernodeShaderNodeMod {
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNode", "ConvertType")
  @js.native
  open class ConvertTypeCls protected ()
    extends StObject
       with ConvertType {
    def this(`type`: NodeTypeOption) = this()
    def this(`type`: NodeTypeOption, cacheMap: Map[Any, ConstNode]) = this()
  }
  
  @JSImport("three/examples/jsm/nodes/shadernode/ShaderNode", "ShaderNode")
  @js.native
  open class ShaderNode[T, R /* <: Node */] protected () extends StObject {
    def this(jsFunc: js.Function2[/* inputs */ NodeObjects_[T], /* builder */ NodeBuilder, NodeRepresentation[Node]]) = this()
    
    def call(
      inputs: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof T ]: T[key] extends three.three/examples/jsm/nodes/shadernode/ShaderNode.NodeRepresentation<three.three/examples/jsm/nodes/Nodes.Node>? three.three/examples/jsm/nodes/shadernode/ShaderNode.Swizzable<three.three/examples/jsm/nodes/Nodes.Node> | three.three/examples/jsm/nodes/Nodes.Node : T[key]} */ js.Any
    ): Swizzable[R] = js.native
    def call(
      inputs: /* import warning: importer.ImportType#apply Failed type conversion: {[ key in keyof T ]: T[key] extends three.three/examples/jsm/nodes/shadernode/ShaderNode.NodeRepresentation<three.three/examples/jsm/nodes/Nodes.Node>? three.three/examples/jsm/nodes/shadernode/ShaderNode.Swizzable<three.three/examples/jsm/nodes/Nodes.Node> | three.three/examples/jsm/nodes/Nodes.Node : T[key]} */ js.Any,
      builder: NodeBuilder
    ): Swizzable[R] = js.native
  }
  
  object cacheMaps {
    
    @JSImport("three/examples/jsm/nodes/shadernode/ShaderNode", "cacheMaps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/nodes/shadernode/ShaderNode", "cacheMaps.bool")
    @js.native
    def bool: Map[Boolean, ConstNode] = js.native
    inline def bool_=(x: Map[Boolean, ConstNode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bool")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/shadernode/ShaderNode", "cacheMaps.float")
    @js.native
    def float: Map[Double, ConstNode] = js.native
    inline def float_=(x: Map[Double, ConstNode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("float")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/shadernode/ShaderNode", "cacheMaps.int")
    @js.native
    def int: Map[Double, ConstNode] = js.native
    inline def int_=(x: Map[Double, ConstNode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/shadernode/ShaderNode", "cacheMaps.uint")
    @js.native
    def uint: Map[Double, ConstNode] = js.native
    inline def uint_=(x: Map[Double, ConstNode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint")(x.asInstanceOf[js.Any])
  }
  
  inline def getConstNodeType(value: NodeOrType): NodeTypeOption | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getConstNodeType")(value.asInstanceOf[js.Any]).asInstanceOf[NodeTypeOption | Null]
  
  inline def nodeArray[T /* <: js.Array[NodeObjectOption] */](obj: /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T]): NodeArray_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeArray")(obj.asInstanceOf[js.Any]).asInstanceOf[NodeArray_[T]]
  
  inline def nodeImmutable[T](
    nodeClass: T,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type ProxiedTuple<GetConstructors<T>> is not an array type */ params: ProxiedTuple[GetConstructors[T]]
  ): Swizzable[ConstructedNode[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeImmutable")(nodeClass.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Swizzable[ConstructedNode[T]]]
  
  inline def nodeObject(obj: String): NodeObject_[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeObject")(obj.asInstanceOf[js.Any]).asInstanceOf[NodeObject_[String]]
  inline def nodeObject(obj: Boolean): NodeObject_[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeObject")(obj.asInstanceOf[js.Any]).asInstanceOf[NodeObject_[Boolean]]
  inline def nodeObject(obj: Double): NodeObject_[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeObject")(obj.asInstanceOf[js.Any]).asInstanceOf[NodeObject_[Double]]
  inline def nodeObject(obj: Node): NodeObject_[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeObject")(obj.asInstanceOf[js.Any]).asInstanceOf[NodeObject_[Node]]
  inline def nodeObject[T /* <: Node & (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in three.three/examples/jsm/nodes/core/constants.SwizzleOption | number ]: three.three/examples/jsm/nodes/shadernode/ShaderNode.Swizzable<three.three/examples/jsm/nodes/Nodes.Node>} */ js.Any) */](obj: T): NodeObject_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeObject")(obj.asInstanceOf[js.Any]).asInstanceOf[NodeObject_[T]]
  
  inline def nodeObjects[T](obj: T): NodeObjects_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeObjects")(obj.asInstanceOf[js.Any]).asInstanceOf[NodeObjects_[T]]
  
  inline def nodeProxy[T](nodeClass: T): js.Function1[/* params */ ProxiedTuple[GetConstructors[T]], Swizzable[ConstructedNode[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeProxy")(nodeClass.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* params */ ProxiedTuple[GetConstructors[T]], Swizzable[ConstructedNode[T]]]]
  inline def nodeProxy[T, S /* <: GetPossibleScopes[T] */](nodeClass: T, scope: S): js.Function1[
    /* params */ ProxiedTuple[RemoveTail[GetConstructorsByScope[T, S]]], 
    Swizzable[ConstructedNode[T]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeProxy")(nodeClass.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* params */ ProxiedTuple[RemoveTail[GetConstructorsByScope[T, S]]], 
    Swizzable[ConstructedNode[T]]
  ]]
  inline def nodeProxy[T, S /* <: GetPossibleScopes[T] */](nodeClass: T, scope: S, factor: NodeObjectOption): js.Function1[
    /* params */ ProxiedTuple[RemoveHeadAndTail[GetConstructorsByScope[T, S]]], 
    Swizzable[ConstructedNode[T]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeProxy")(nodeClass.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], factor.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* params */ ProxiedTuple[RemoveHeadAndTail[GetConstructorsByScope[T, S]]], 
    Swizzable[ConstructedNode[T]]
  ]]
  
  type AnyConstructors = Construtors[Any, Any, Any, Any]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends new (args : ...any): infer R ? R extends three.three/examples/jsm/nodes/Nodes.Node ? R : never : never
    }}}
    */
  @js.native
  trait ConstructedNode[T] extends StObject
  
  /**
    * "flattens" the tuple into an union type
    */
  type ConstructorUnion[T /* <: AnyConstructors */] = Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: T['a'] */ js.Any, 
    Unit
  ]
  
  /**
    * Temporary type to save signatures of 4 constructors. Each element may be tuple or undefined.
    *
    * We use an object instead of tuple or union as it makes stuff easier, especially in Typescript 4.0.
    */
  trait Construtors[A /* <: js.UndefOr[Array[Any]] */, B /* <: js.UndefOr[Array[Any]] */, C /* <: js.UndefOr[Array[Any]] */, D /* <: js.UndefOr[Array[Any]] */] extends StObject {
    
    var a: A
    
    var b: B
    
    var c: C
    
    var d: D
  }
  object Construtors {
    
    inline def apply[A /* <: js.UndefOr[Array[Any]] */, B /* <: js.UndefOr[Array[Any]] */, C /* <: js.UndefOr[Array[Any]] */, D /* <: js.UndefOr[Array[Any]] */](a: A, b: B, c: C, d: D): Construtors[A, B, C, D] = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any])
      __obj.asInstanceOf[Construtors[A, B, C, D]]
    }
    
    extension [Self <: Construtors[?, ?, ?, ?], A /* <: js.UndefOr[Array[Any]] */, B /* <: js.UndefOr[Array[Any]] */, C /* <: js.UndefOr[Array[Any]] */, D /* <: js.UndefOr[Array[Any]] */](x: Self & (Construtors[A, B, C, D])) {
      
      inline def setA(value: A): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: B): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setC(value: C): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setD(value: D): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConvertType extends StObject {
    
    def apply(params: Any*): Swizzable[Node] = js.native
  }
  
  /**
    * Extract list of possible scopes - union of the first paramter
    * of all constructors, should it be string
    */
  type ExtractScopes[T /* <: AnyConstructors */] = /* import warning: importer.ImportType#apply Failed type conversion: T['a'][0] extends string ? T['a'][0] : never */ js.Any
  
  /**
    * Returns all constructors where the first paramter is assignable to given "scope"
    */
  // tslint:disable-next-line:interface-over-type-literal
  trait FilterConstructorsByScope[T /* <: AnyConstructors */, S] extends StObject {
    
    var a: /* import warning: importer.ImportType#apply Failed type conversion: S extends T['a'][0] ? T['a'] : undefined */ js.Any
    
    var b: /* import warning: importer.ImportType#apply Failed type conversion: S extends T['b'][0] ? T['b'] : undefined */ js.Any
    
    var c: /* import warning: importer.ImportType#apply Failed type conversion: S extends T['c'][0] ? T['c'] : undefined */ js.Any
    
    var d: /* import warning: importer.ImportType#apply Failed type conversion: S extends T['d'][0] ? T['d'] : undefined */ js.Any
  }
  object FilterConstructorsByScope {
    
    inline def apply[T /* <: AnyConstructors */, S](
      a: /* import warning: importer.ImportType#apply Failed type conversion: S extends T['a'][0] ? T['a'] : undefined */ js.Any,
      b: /* import warning: importer.ImportType#apply Failed type conversion: S extends T['b'][0] ? T['b'] : undefined */ js.Any,
      c: /* import warning: importer.ImportType#apply Failed type conversion: S extends T['c'][0] ? T['c'] : undefined */ js.Any,
      d: /* import warning: importer.ImportType#apply Failed type conversion: S extends T['d'][0] ? T['d'] : undefined */ js.Any
    ): FilterConstructorsByScope[T, S] = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterConstructorsByScope[T, S]]
    }
    
    extension [Self <: FilterConstructorsByScope[?, ?], T /* <: AnyConstructors */, S](x: Self & (FilterConstructorsByScope[T, S])) {
      
      inline def setA(
        value: /* import warning: importer.ImportType#apply Failed type conversion: S extends T['a'][0] ? T['a'] : undefined */ js.Any
      ): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(
        value: /* import warning: importer.ImportType#apply Failed type conversion: S extends T['b'][0] ? T['b'] : undefined */ js.Any
      ): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setC(
        value: /* import warning: importer.ImportType#apply Failed type conversion: S extends T['c'][0] ? T['c'] : undefined */ js.Any
      ): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setD(
        value: /* import warning: importer.ImportType#apply Failed type conversion: S extends T['d'][0] ? T['d'] : undefined */ js.Any
      ): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    }
  }
  
  type GetConstructors[T] = ConstructorUnion[OverloadedConstructorsOf[T]]
  
  type GetConstructorsByScope[T, S] = ConstructorUnion[FilterConstructorsByScope[OverloadedConstructorsOf[T], S]]
  
  type GetPossibleScopes[T] = ExtractScopes[OverloadedConstructorsOf[T]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ index in keyof T ]: three.three/examples/jsm/nodes/shadernode/ShaderNode.NodeObject<T[index]>}
    }}}
    */
  @js.native
  trait NodeArray_[T /* <: js.Array[NodeObjectOption] */] extends StObject
  
  type NodeObjectOption = NodeRepresentation[Node] | String
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends three.three/examples/jsm/nodes/Nodes.Node ? three.three/examples/jsm/nodes/shadernode/ShaderNode.Swizzable<T> : T extends number | boolean ? three.three/examples/jsm/nodes/shadernode/ShaderNode.Swizzable<three.three/examples/jsm/nodes/Nodes.ConstNode> : T
    }}}
    */
  type NodeObject_[T] = T
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ key in keyof T ]: T[key] extends three.three/examples/jsm/nodes/shadernode/ShaderNode.NodeObjectOption? three.three/examples/jsm/nodes/shadernode/ShaderNode.NodeObject<T[key]> : T[key]}
    }}}
    */
  @js.native
  trait NodeObjects_[T] extends StObject
  
  type NodeOrType = Node | NodeTypeOption
  
  type NodeRepresentation[T /* <: Node */] = Double | Boolean | Node | Swizzable[T]
  
  /**
    * Returns all constructors
    *
    * <https://github.com/microsoft/TypeScript/issues/37079>
    * <https://stackoverflow.com/a/52761156/1623826>
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends {new (args : infer A1): unknown, new (args : infer A2): unknown, new (args : infer A3): unknown, new (args : infer A4): unknown} ? three.three/examples/jsm/nodes/shadernode/ShaderNode.Construtors<A1, A2, A3, A4> : T extends {new (args : infer A1): unknown, new (args : infer A2): unknown, new (args : infer A3): unknown} ? three.three/examples/jsm/nodes/shadernode/ShaderNode.Construtors<A1, A2, A3, undefined> : T extends {new (args : infer A1): unknown, new (args : infer A2): unknown} ? three.three/examples/jsm/nodes/shadernode/ShaderNode.Construtors<A1, A2, undefined, undefined> : T extends new (args : infer A): unknown ? three.three/examples/jsm/nodes/shadernode/ShaderNode.Construtors<A, undefined, undefined, undefined> : three.three/examples/jsm/nodes/shadernode/ShaderNode.Construtors<undefined, undefined, undefined, undefined>
    }}}
    */
  @js.native
  trait OverloadedConstructorsOf[T] extends StObject
  
  // opposite of NodeObject: node -> node|swizzable|boolean|number, otherwise do nothing
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends three.three/examples/jsm/nodes/Nodes.Node ? three.three/examples/jsm/nodes/shadernode/ShaderNode.NodeRepresentation<T> : T
    }}}
    */
  type Proxied[T] = T
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ index in keyof T ]: three.three/examples/jsm/nodes/shadernode/ShaderNode.Proxied<T[index]>}
    }}}
    */
  @js.native
  trait ProxiedObject[T] extends StObject
  
  type ProxiedTuple[T /* <: Array[Any] */] = /* import warning: importer.ImportType#apply c repeated non-array type: {[ index in keyof T ]: three.three/examples/jsm/nodes/shadernode/ShaderNode.Proxied<T[index]>} */ js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ index in keyof T ]: three.three/examples/jsm/nodes/shadernode/ShaderNode.Proxied<T[index]>} */ js.Any
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends [unknown, ...infer X, unknown] ? X : []
    }}}
    */
  type RemoveHeadAndTail[T /* <: Array[Any] */] = js.Array[Any]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends [unknown, ...infer X] ? X : []
    }}}
    */
  type RemoveTail[T /* <: Array[Any] */] = js.Array[Any]
  
  type Swizzable[T /* <: Node */] = T & (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in three.three/examples/jsm/nodes/core/constants.SwizzleOption | number ]: three.three/examples/jsm/nodes/shadernode/ShaderNode.Swizzable<three.three/examples/jsm/nodes/Nodes.Node>} */ js.Any)
}
