package typings.unist

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type Data = StringDictionary[js.Any]
  
  trait Literal
    extends StObject
       with Node {
    
    var value: js.Any
  }
  object Literal {
    
    @scala.inline
    def apply(`type`: String, value: js.Any): Literal = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Literal]
    }
    
    @scala.inline
    implicit class LiteralMutableBuilder[Self <: Literal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Node
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    /**
      * Information from the ecosystem.
      */
    var data: js.UndefOr[Data] = js.undefined
    
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
    
    @scala.inline
    def apply(`type`: String): Node = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    @scala.inline
    implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Parent
    extends StObject
       with Node {
    
    /**
      * List representing the children of a node.
      */
    var children: js.Array[Node]
  }
  object Parent {
    
    @scala.inline
    def apply(children: js.Array[Node], `type`: String): Parent = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parent]
    }
    
    @scala.inline
    implicit class ParentMutableBuilder[Self <: Parent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: Node*): Self = StObject.set(x, "children", js.Array(value :_*))
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
    
    @scala.inline
    def apply(column: Double, line: Double): Point = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit class PointMutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
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
    
    @scala.inline
    def apply(end: Point, start: Point): Position = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Point): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent(value: js.Array[Double]): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setIndentVarargs(value: Double*): Self = StObject.set(x, "indent", js.Array(value :_*))
      
      @scala.inline
      def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
