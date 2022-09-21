package typings.yaml

import typings.std.Map
import typings.yaml.documentMod.Replacer
import typings.yaml.nodeMod.Node
import typings.yaml.schemaSchemaMod.Schema
import typings.yaml.typesMod.CollectionTag
import typings.yaml.typesMod.ScalarTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createNodeMod {
  
  @JSImport("yaml/dist/doc/createNode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createNode(value: Any, tagName: String, ctx: CreateNodeContext): Node[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createNode")(value.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Node[Any]]
  inline def createNode(value: Any, tagName: Unit, ctx: CreateNodeContext): Node[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createNode")(value.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Node[Any]]
  
  trait CreateNodeContext extends StObject {
    
    var aliasDuplicateObjects: Boolean
    
    var keepUndefined: Boolean
    
    def onAnchor(source: Any): String
    
    var onTagObj: js.UndefOr[js.Function1[/* tagObj */ ScalarTag | CollectionTag, Unit]] = js.undefined
    
    var replacer: js.UndefOr[Replacer] = js.undefined
    
    var schema: Schema
    
    var sourceObjects: Map[Any, typings.yaml.anon.Node]
  }
  object CreateNodeContext {
    
    inline def apply(
      aliasDuplicateObjects: Boolean,
      keepUndefined: Boolean,
      onAnchor: Any => String,
      schema: Schema,
      sourceObjects: Map[Any, typings.yaml.anon.Node]
    ): CreateNodeContext = {
      val __obj = js.Dynamic.literal(aliasDuplicateObjects = aliasDuplicateObjects.asInstanceOf[js.Any], keepUndefined = keepUndefined.asInstanceOf[js.Any], onAnchor = js.Any.fromFunction1(onAnchor), schema = schema.asInstanceOf[js.Any], sourceObjects = sourceObjects.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateNodeContext]
    }
    
    extension [Self <: CreateNodeContext](x: Self) {
      
      inline def setAliasDuplicateObjects(value: Boolean): Self = StObject.set(x, "aliasDuplicateObjects", value.asInstanceOf[js.Any])
      
      inline def setKeepUndefined(value: Boolean): Self = StObject.set(x, "keepUndefined", value.asInstanceOf[js.Any])
      
      inline def setOnAnchor(value: Any => String): Self = StObject.set(x, "onAnchor", js.Any.fromFunction1(value))
      
      inline def setOnTagObj(value: /* tagObj */ ScalarTag | CollectionTag => Unit): Self = StObject.set(x, "onTagObj", js.Any.fromFunction1(value))
      
      inline def setOnTagObjUndefined: Self = StObject.set(x, "onTagObj", js.undefined)
      
      inline def setReplacer(value: Replacer): Self = StObject.set(x, "replacer", value.asInstanceOf[js.Any])
      
      inline def setReplacerFunction2(value: (/* key */ Any, /* value */ Any) => Any): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
      
      inline def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
      
      inline def setReplacerVarargs(value: Any*): Self = StObject.set(x, "replacer", js.Array(value*))
      
      inline def setSchema(value: Schema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSourceObjects(value: Map[Any, typings.yaml.anon.Node]): Self = StObject.set(x, "sourceObjects", value.asInstanceOf[js.Any])
    }
  }
}
