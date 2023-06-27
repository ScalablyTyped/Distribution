package typings.yaml

import typings.std.Set
import typings.yaml.anon.ReadonlyRequiredOmitToStr
import typings.yaml.distDocDocumentMod.Document
import typings.yaml.distNodesAliasMod.Alias
import typings.yaml.distNodesNodeMod.Node
import typings.yaml.distOptionsMod.ToStringOptions
import typings.yaml.yamlBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStringifyStringifyMod {
  
  @JSImport("yaml/dist/stringify/stringify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createStringifyContext_true(doc: Document[Node[Any], `true`], options: ToStringOptions): StringifyContext = (^.asInstanceOf[js.Dynamic].applyDynamic("createStringifyContext")(doc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringifyContext]
  
  inline def stringify(item: Any, ctx: StringifyContext): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(item.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(item: Any, ctx: StringifyContext, onComment: js.Function0[Unit]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(item.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], onComment.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(item: Any, ctx: StringifyContext, onComment: js.Function0[Unit], onChompKeep: js.Function0[Unit]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(item.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], onComment.asInstanceOf[js.Any], onChompKeep.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(item: Any, ctx: StringifyContext, onComment: Unit, onChompKeep: js.Function0[Unit]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(item.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], onComment.asInstanceOf[js.Any], onChompKeep.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait StringifyContext extends StObject {
    
    var actualString: js.UndefOr[Boolean] = js.undefined
    
    var allNullValues: js.UndefOr[Boolean] = js.undefined
    
    var anchors: Set[String]
    
    var doc: Document[Node[Any], `true`]
    
    var flowCollectionPadding: String
    
    var forceBlockIndent: js.UndefOr[Boolean] = js.undefined
    
    var implicitKey: js.UndefOr[Boolean] = js.undefined
    
    var inFlow: Boolean | Null
    
    var inStringifyKey: js.UndefOr[Boolean] = js.undefined
    
    var indent: String
    
    var indentAtStart: js.UndefOr[Double] = js.undefined
    
    var indentStep: String
    
    var options: ReadonlyRequiredOmitToStr
    
    var resolvedAliases: js.UndefOr[Set[Alias]] = js.undefined
  }
  object StringifyContext {
    
    inline def apply(
      anchors: Set[String],
      doc: Document[Node[Any], `true`],
      flowCollectionPadding: String,
      indent: String,
      indentStep: String,
      options: ReadonlyRequiredOmitToStr
    ): StringifyContext = {
      val __obj = js.Dynamic.literal(anchors = anchors.asInstanceOf[js.Any], doc = doc.asInstanceOf[js.Any], flowCollectionPadding = flowCollectionPadding.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], indentStep = indentStep.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], inFlow = null)
      __obj.asInstanceOf[StringifyContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StringifyContext] (val x: Self) extends AnyVal {
      
      inline def setActualString(value: Boolean): Self = StObject.set(x, "actualString", value.asInstanceOf[js.Any])
      
      inline def setActualStringUndefined: Self = StObject.set(x, "actualString", js.undefined)
      
      inline def setAllNullValues(value: Boolean): Self = StObject.set(x, "allNullValues", value.asInstanceOf[js.Any])
      
      inline def setAllNullValuesUndefined: Self = StObject.set(x, "allNullValues", js.undefined)
      
      inline def setAnchors(value: Set[String]): Self = StObject.set(x, "anchors", value.asInstanceOf[js.Any])
      
      inline def setDoc(value: Document[Node[Any], `true`]): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
      
      inline def setFlowCollectionPadding(value: String): Self = StObject.set(x, "flowCollectionPadding", value.asInstanceOf[js.Any])
      
      inline def setForceBlockIndent(value: Boolean): Self = StObject.set(x, "forceBlockIndent", value.asInstanceOf[js.Any])
      
      inline def setForceBlockIndentUndefined: Self = StObject.set(x, "forceBlockIndent", js.undefined)
      
      inline def setImplicitKey(value: Boolean): Self = StObject.set(x, "implicitKey", value.asInstanceOf[js.Any])
      
      inline def setImplicitKeyUndefined: Self = StObject.set(x, "implicitKey", js.undefined)
      
      inline def setInFlow(value: Boolean): Self = StObject.set(x, "inFlow", value.asInstanceOf[js.Any])
      
      inline def setInFlowNull: Self = StObject.set(x, "inFlow", null)
      
      inline def setInStringifyKey(value: Boolean): Self = StObject.set(x, "inStringifyKey", value.asInstanceOf[js.Any])
      
      inline def setInStringifyKeyUndefined: Self = StObject.set(x, "inStringifyKey", js.undefined)
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentAtStart(value: Double): Self = StObject.set(x, "indentAtStart", value.asInstanceOf[js.Any])
      
      inline def setIndentAtStartUndefined: Self = StObject.set(x, "indentAtStart", js.undefined)
      
      inline def setIndentStep(value: String): Self = StObject.set(x, "indentStep", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: ReadonlyRequiredOmitToStr): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setResolvedAliases(value: Set[Alias]): Self = StObject.set(x, "resolvedAliases", value.asInstanceOf[js.Any])
      
      inline def setResolvedAliasesUndefined: Self = StObject.set(x, "resolvedAliases", js.undefined)
    }
  }
}
