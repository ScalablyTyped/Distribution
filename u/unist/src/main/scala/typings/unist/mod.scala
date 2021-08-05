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
    
    inline def apply(`type`: String, value: js.Any): Literal = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Literal]
    }
    
    extension [Self <: Literal](x: Self) {
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
    
    inline def apply(`type`: String): Node = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    inline def apply(children: js.Array[Node], `type`: String): Parent = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Parent]
    }
    
    extension [Self <: Parent](x: Self) {
      
      inline def setChildren(value: js.Array[Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Node*): Self = StObject.set(x, "children", js.Array(value :_*))
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
      
      inline def setIndentVarargs(value: Double*): Self = StObject.set(x, "indent", js.Array(value :_*))
      
      inline def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
