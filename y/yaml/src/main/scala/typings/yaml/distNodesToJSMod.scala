package typings.yaml

import typings.std.Map
import typings.yaml.distDocDocumentMod.Document
import typings.yaml.distNodesNodeMod.Node
import typings.yaml.distStringifyStringifyMod.StringifyContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodesToJSMod {
  
  @JSImport("yaml/dist/nodes/toJS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toJS(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def toJS(value: Any, arg: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(value.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toJS(value: Any, arg: String, ctx: ToJSContext): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(value.asInstanceOf[js.Any], arg.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toJS(value: Any, arg: Null, ctx: ToJSContext): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toJS")(value.asInstanceOf[js.Any], arg.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait AnchorData extends StObject {
    
    var aliasCount: Double
    
    var count: Double
    
    var res: Any
  }
  object AnchorData {
    
    inline def apply(aliasCount: Double, count: Double, res: Any): AnchorData = {
      val __obj = js.Dynamic.literal(aliasCount = aliasCount.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnchorData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnchorData] (val x: Self) extends AnyVal {
      
      inline def setAliasCount(value: Double): Self = StObject.set(x, "aliasCount", value.asInstanceOf[js.Any])
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setRes(value: Any): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    }
  }
  
  trait ToJSContext extends StObject {
    
    var anchors: Map[Node[Any], AnchorData]
    
    var doc: Document[Node[Any]]
    
    var keep: Boolean
    
    var mapAsMap: Boolean
    
    var mapKeyWarned: Boolean
    
    var maxAliasCount: Double
    
    var onCreate: js.UndefOr[js.Function1[/* res */ Any, Unit]] = js.undefined
    
    /** Requiring this directly in Pair would create circular dependencies */
    def stringify(item: Any, ctx: StringifyContext): String
    def stringify(item: Any, ctx: StringifyContext, onComment: js.Function0[Unit]): String
    def stringify(item: Any, ctx: StringifyContext, onComment: js.Function0[Unit], onChompKeep: js.Function0[Unit]): String
    def stringify(item: Any, ctx: StringifyContext, onComment: Unit, onChompKeep: js.Function0[Unit]): String
    /** Requiring this directly in Pair would create circular dependencies */
    @JSName("stringify")
    var stringify_Original: js.Function4[
        /* item */ Any, 
        /* ctx */ StringifyContext, 
        /* onComment */ js.UndefOr[js.Function0[Unit]], 
        /* onChompKeep */ js.UndefOr[js.Function0[Unit]], 
        String
      ]
  }
  object ToJSContext {
    
    inline def apply(
      anchors: Map[Node[Any], AnchorData],
      doc: Document[Node[Any]],
      keep: Boolean,
      mapAsMap: Boolean,
      mapKeyWarned: Boolean,
      maxAliasCount: Double,
      stringify: (/* item */ Any, /* ctx */ StringifyContext, /* onComment */ js.UndefOr[js.Function0[Unit]], /* onChompKeep */ js.UndefOr[js.Function0[Unit]]) => String
    ): ToJSContext = {
      val __obj = js.Dynamic.literal(anchors = anchors.asInstanceOf[js.Any], doc = doc.asInstanceOf[js.Any], keep = keep.asInstanceOf[js.Any], mapAsMap = mapAsMap.asInstanceOf[js.Any], mapKeyWarned = mapKeyWarned.asInstanceOf[js.Any], maxAliasCount = maxAliasCount.asInstanceOf[js.Any], stringify = js.Any.fromFunction4(stringify))
      __obj.asInstanceOf[ToJSContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToJSContext] (val x: Self) extends AnyVal {
      
      inline def setAnchors(value: Map[Node[Any], AnchorData]): Self = StObject.set(x, "anchors", value.asInstanceOf[js.Any])
      
      inline def setDoc(value: Document[Node[Any]]): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
      
      inline def setKeep(value: Boolean): Self = StObject.set(x, "keep", value.asInstanceOf[js.Any])
      
      inline def setMapAsMap(value: Boolean): Self = StObject.set(x, "mapAsMap", value.asInstanceOf[js.Any])
      
      inline def setMapKeyWarned(value: Boolean): Self = StObject.set(x, "mapKeyWarned", value.asInstanceOf[js.Any])
      
      inline def setMaxAliasCount(value: Double): Self = StObject.set(x, "maxAliasCount", value.asInstanceOf[js.Any])
      
      inline def setOnCreate(value: /* res */ Any => Unit): Self = StObject.set(x, "onCreate", js.Any.fromFunction1(value))
      
      inline def setOnCreateUndefined: Self = StObject.set(x, "onCreate", js.undefined)
      
      inline def setStringify(
        value: (/* item */ Any, /* ctx */ StringifyContext, /* onComment */ js.UndefOr[js.Function0[Unit]], /* onChompKeep */ js.UndefOr[js.Function0[Unit]]) => String
      ): Self = StObject.set(x, "stringify", js.Any.fromFunction4(value))
    }
  }
}
