package typings.svgson

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("svgson", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(input: String): js.Promise[INode] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[INode]]
  inline def parse(input: String, options: IParseOptions): js.Promise[INode] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[INode]]
  
  inline def parseSync(input: String): INode = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSync")(input.asInstanceOf[js.Any]).asInstanceOf[INode]
  inline def parseSync(input: String, options: IParseOptions): INode = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSync")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[INode]
  
  inline def stringify(ast: INode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(ast.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(ast: INode, options: IStringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait INode extends StObject {
    
    var attributes: Record[String, String]
    
    var children: js.Array[INode]
    
    var name: String
    
    var `type`: String
    
    var value: String
  }
  object INode {
    
    inline def apply(
      attributes: Record[String, String],
      children: js.Array[INode],
      name: String,
      `type`: String,
      value: String
    ): INode = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[INode]
    }
    
    extension [Self <: INode](x: Self) {
      
      inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[INode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: INode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait IParseOptions extends StObject {
    
    var camelcase: js.UndefOr[Boolean] = js.undefined
    
    var transformNode: js.UndefOr[js.Function1[/* node */ INode, INode]] = js.undefined
  }
  object IParseOptions {
    
    inline def apply(): IParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IParseOptions]
    }
    
    extension [Self <: IParseOptions](x: Self) {
      
      inline def setCamelcase(value: Boolean): Self = StObject.set(x, "camelcase", value.asInstanceOf[js.Any])
      
      inline def setCamelcaseUndefined: Self = StObject.set(x, "camelcase", js.undefined)
      
      inline def setTransformNode(value: /* node */ INode => INode): Self = StObject.set(x, "transformNode", js.Any.fromFunction1(value))
      
      inline def setTransformNodeUndefined: Self = StObject.set(x, "transformNode", js.undefined)
    }
  }
  
  trait IStringifyOptions extends StObject {
    
    var selfClose: js.UndefOr[Boolean] = js.undefined
    
    var transformAttr: js.UndefOr[js.Function3[/* key */ String, /* value */ String, /* escape */ TEscape, String]] = js.undefined
  }
  object IStringifyOptions {
    
    inline def apply(): IStringifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStringifyOptions]
    }
    
    extension [Self <: IStringifyOptions](x: Self) {
      
      inline def setSelfClose(value: Boolean): Self = StObject.set(x, "selfClose", value.asInstanceOf[js.Any])
      
      inline def setSelfCloseUndefined: Self = StObject.set(x, "selfClose", js.undefined)
      
      inline def setTransformAttr(value: (/* key */ String, /* value */ String, /* escape */ TEscape) => String): Self = StObject.set(x, "transformAttr", js.Any.fromFunction3(value))
      
      inline def setTransformAttrUndefined: Self = StObject.set(x, "transformAttr", js.undefined)
    }
  }
  
  type TEscape = js.Function1[/* text */ js.UndefOr[String], String]
}
