package typings.yaml

import typings.yaml.anon.EndStart
import typings.yaml.anon.ReadonlyCollection
import typings.yaml.anon.`0`
import typings.yaml.stringifyMod.StringifyContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringifyCollectionMod {
  
  @JSImport("yaml/dist/stringify/stringifyCollection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringifyCollection(collection: ReadonlyCollection, ctx: StringifyContext, options: StringifyCollectionOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringifyCollection")(collection.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait StringifyCollectionOptions extends StObject {
    
    var blockItemPrefix: String
    
    var flowChars: EndStart | `0`
    
    var itemIndent: String
    
    var onChompKeep: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onComment: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object StringifyCollectionOptions {
    
    inline def apply(blockItemPrefix: String, flowChars: EndStart | `0`, itemIndent: String): StringifyCollectionOptions = {
      val __obj = js.Dynamic.literal(blockItemPrefix = blockItemPrefix.asInstanceOf[js.Any], flowChars = flowChars.asInstanceOf[js.Any], itemIndent = itemIndent.asInstanceOf[js.Any])
      __obj.asInstanceOf[StringifyCollectionOptions]
    }
    
    extension [Self <: StringifyCollectionOptions](x: Self) {
      
      inline def setBlockItemPrefix(value: String): Self = StObject.set(x, "blockItemPrefix", value.asInstanceOf[js.Any])
      
      inline def setFlowChars(value: EndStart | `0`): Self = StObject.set(x, "flowChars", value.asInstanceOf[js.Any])
      
      inline def setItemIndent(value: String): Self = StObject.set(x, "itemIndent", value.asInstanceOf[js.Any])
      
      inline def setOnChompKeep(value: () => Unit): Self = StObject.set(x, "onChompKeep", js.Any.fromFunction0(value))
      
      inline def setOnChompKeepUndefined: Self = StObject.set(x, "onChompKeep", js.undefined)
      
      inline def setOnComment(value: () => Unit): Self = StObject.set(x, "onComment", js.Any.fromFunction0(value))
      
      inline def setOnCommentUndefined: Self = StObject.set(x, "onComment", js.undefined)
    }
  }
}
