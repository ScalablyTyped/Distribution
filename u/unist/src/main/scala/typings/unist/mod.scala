package typings.unist

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type Data = StringDictionary[Any]
  
  trait Literal[Value, TData /* <: js.Object */]
    extends StObject
       with Node[TData] {
    
    var value: Value
  }
  object Literal {
    
    inline def apply[Value, TData /* <: js.Object */](`type`: String, value: Value): Literal[Value, TData] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Literal[Value, TData]]
    }
    
    extension [Self <: Literal[?, ?], Value, TData /* <: js.Object */](x: Self & (Literal[Value, TData])) {
      
      inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Node[TData /* <: js.Object */] extends StObject {
    
    /**
      * Information from the ecosystem.
      */
    var data: js.UndefOr[TData] = js.undefined
    
    /**
      * Location of a node in a source document.
      * Must not be present if a node is generated.
      */
    var position: js.UndefOr[Position] = js.undefined
    
    /**
      * The variant of a node.
      */
    var `type`: String
  }
  object Node {
    
    inline def apply[TData /* <: js.Object */](`type`: String): Node[TData] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node[TData]]
    }
    
    extension [Self <: Node[?], TData /* <: js.Object */](x: Self & Node[TData]) {
      
      inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    TNode extends unist.unist.Node<infer TData> ? TData : never
    }}}
    */
  @js.native
  trait NodeData[TNode /* <: Node[js.Object] */] extends StObject
  
  trait Parent[ChildNode /* <: Node[js.Object] */, TData /* <: js.Object */]
    extends StObject
       with Node[TData] {
    
    /**
      * List representing the children of a node.
      */
    var children: js.Array[ChildNode]
  }
  object Parent {
    
    inline def apply[ChildNode /* <: Node[js.Object] */, TData /* <: js.Object */](children: js.Array[ChildNode], `type`: String): Parent[ChildNode, TData] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parent[ChildNode, TData]]
    }
    
    extension [Self <: Parent[?, ?], ChildNode /* <: Node[js.Object] */, TData /* <: js.Object */](x: Self & (Parent[ChildNode, TData])) {
      
      inline def setChildren(value: js.Array[ChildNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: ChildNode*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  trait Point extends StObject {
    
    /**
      * Column in a source file (1-indexed integer).
      */
    var column: Double
    
    /**
      * Line in a source file (1-indexed integer).
      */
    var line: Double
    
    /**
      * Character in a source file (0-indexed integer).
      */
    var offset: js.UndefOr[Double] = js.undefined
  }
  object Point {
    
    inline def apply(column: Double, line: Double): Point = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    extension [Self <: Point](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  trait Position extends StObject {
    
    /**
      * Place of the first character after the parsed source region.
      */
    var end: Point
    
    /**
      * Start column at each index (plus start line) in the source region,
      * for elements that span multiple lines.
      */
    var indent: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Place of the first character of the parsed source region.
      */
    var start: Point
  }
  object Position {
    
    inline def apply(end: Point, start: Point): Position = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    extension [Self <: Position](x: Self) {
      
      inline def setEnd(value: Point): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setIndent(value: js.Array[Double]): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setIndentVarargs(value: Double*): Self = StObject.set(x, "indent", js.Array(value*))
      
      inline def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
