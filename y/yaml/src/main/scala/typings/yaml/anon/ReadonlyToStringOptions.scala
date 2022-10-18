package typings.yaml.anon

import typings.yaml.yamlStrings.any
import typings.yaml.yamlStrings.block
import typings.yaml.yamlStrings.flow
import typings.yaml.yamlStrings.folded
import typings.yaml.yamlStrings.literal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<yaml.yaml/dist/options.ToStringOptions> */
trait ReadonlyToStringOptions extends StObject {
  
  val blockQuote: js.UndefOr[Boolean | folded | literal] = js.undefined
  
  val collectionStyle: js.UndefOr[any | block | flow] = js.undefined
  
  val commentString: js.UndefOr[js.Function1[/* comment */ String, String]] = js.undefined
  
  val defaultKeyType: js.UndefOr[typings.yaml.distNodesScalarMod.Scalar.Type | Null] = js.undefined
  
  val defaultStringType: js.UndefOr[typings.yaml.distNodesScalarMod.Scalar.Type] = js.undefined
  
  val directives: js.UndefOr[Boolean | Null] = js.undefined
  
  val doubleQuotedAsJSON: js.UndefOr[Boolean] = js.undefined
  
  val doubleQuotedMinMultiLineLength: js.UndefOr[Double] = js.undefined
  
  val falseStr: js.UndefOr[String] = js.undefined
  
  val indent: js.UndefOr[Double] = js.undefined
  
  val indentSeq: js.UndefOr[Boolean] = js.undefined
  
  val lineWidth: js.UndefOr[Double] = js.undefined
  
  val minContentWidth: js.UndefOr[Double] = js.undefined
  
  val nullStr: js.UndefOr[String] = js.undefined
  
  val simpleKeys: js.UndefOr[Boolean] = js.undefined
  
  val singleQuote: js.UndefOr[Boolean | Null] = js.undefined
  
  val trueStr: js.UndefOr[String] = js.undefined
  
  val verifyAliasOrder: js.UndefOr[Boolean] = js.undefined
}
object ReadonlyToStringOptions {
  
  inline def apply(): ReadonlyToStringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyToStringOptions]
  }
  
  extension [Self <: ReadonlyToStringOptions](x: Self) {
    
    inline def setBlockQuote(value: Boolean | folded | literal): Self = StObject.set(x, "blockQuote", value.asInstanceOf[js.Any])
    
    inline def setBlockQuoteUndefined: Self = StObject.set(x, "blockQuote", js.undefined)
    
    inline def setCollectionStyle(value: any | block | flow): Self = StObject.set(x, "collectionStyle", value.asInstanceOf[js.Any])
    
    inline def setCollectionStyleUndefined: Self = StObject.set(x, "collectionStyle", js.undefined)
    
    inline def setCommentString(value: /* comment */ String => String): Self = StObject.set(x, "commentString", js.Any.fromFunction1(value))
    
    inline def setCommentStringUndefined: Self = StObject.set(x, "commentString", js.undefined)
    
    inline def setDefaultKeyType(value: typings.yaml.distNodesScalarMod.Scalar.Type): Self = StObject.set(x, "defaultKeyType", value.asInstanceOf[js.Any])
    
    inline def setDefaultKeyTypeNull: Self = StObject.set(x, "defaultKeyType", null)
    
    inline def setDefaultKeyTypeUndefined: Self = StObject.set(x, "defaultKeyType", js.undefined)
    
    inline def setDefaultStringType(value: typings.yaml.distNodesScalarMod.Scalar.Type): Self = StObject.set(x, "defaultStringType", value.asInstanceOf[js.Any])
    
    inline def setDefaultStringTypeUndefined: Self = StObject.set(x, "defaultStringType", js.undefined)
    
    inline def setDirectives(value: Boolean): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    inline def setDirectivesNull: Self = StObject.set(x, "directives", null)
    
    inline def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
    
    inline def setDoubleQuotedAsJSON(value: Boolean): Self = StObject.set(x, "doubleQuotedAsJSON", value.asInstanceOf[js.Any])
    
    inline def setDoubleQuotedAsJSONUndefined: Self = StObject.set(x, "doubleQuotedAsJSON", js.undefined)
    
    inline def setDoubleQuotedMinMultiLineLength(value: Double): Self = StObject.set(x, "doubleQuotedMinMultiLineLength", value.asInstanceOf[js.Any])
    
    inline def setDoubleQuotedMinMultiLineLengthUndefined: Self = StObject.set(x, "doubleQuotedMinMultiLineLength", js.undefined)
    
    inline def setFalseStr(value: String): Self = StObject.set(x, "falseStr", value.asInstanceOf[js.Any])
    
    inline def setFalseStrUndefined: Self = StObject.set(x, "falseStr", js.undefined)
    
    inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setIndentSeq(value: Boolean): Self = StObject.set(x, "indentSeq", value.asInstanceOf[js.Any])
    
    inline def setIndentSeqUndefined: Self = StObject.set(x, "indentSeq", js.undefined)
    
    inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setMinContentWidth(value: Double): Self = StObject.set(x, "minContentWidth", value.asInstanceOf[js.Any])
    
    inline def setMinContentWidthUndefined: Self = StObject.set(x, "minContentWidth", js.undefined)
    
    inline def setNullStr(value: String): Self = StObject.set(x, "nullStr", value.asInstanceOf[js.Any])
    
    inline def setNullStrUndefined: Self = StObject.set(x, "nullStr", js.undefined)
    
    inline def setSimpleKeys(value: Boolean): Self = StObject.set(x, "simpleKeys", value.asInstanceOf[js.Any])
    
    inline def setSimpleKeysUndefined: Self = StObject.set(x, "simpleKeys", js.undefined)
    
    inline def setSingleQuote(value: Boolean): Self = StObject.set(x, "singleQuote", value.asInstanceOf[js.Any])
    
    inline def setSingleQuoteNull: Self = StObject.set(x, "singleQuote", null)
    
    inline def setSingleQuoteUndefined: Self = StObject.set(x, "singleQuote", js.undefined)
    
    inline def setTrueStr(value: String): Self = StObject.set(x, "trueStr", value.asInstanceOf[js.Any])
    
    inline def setTrueStrUndefined: Self = StObject.set(x, "trueStr", js.undefined)
    
    inline def setVerifyAliasOrder(value: Boolean): Self = StObject.set(x, "verifyAliasOrder", value.asInstanceOf[js.Any])
    
    inline def setVerifyAliasOrderUndefined: Self = StObject.set(x, "verifyAliasOrder", js.undefined)
  }
}
