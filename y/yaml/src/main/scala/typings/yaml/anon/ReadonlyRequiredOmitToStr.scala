package typings.yaml.anon

import typings.yaml.yamlStrings.folded
import typings.yaml.yamlStrings.literal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<std.Omit<yaml.yaml/dist/options.ToStringOptions, 'collectionStyle' | 'indent'>>> */
trait ReadonlyRequiredOmitToStr extends StObject {
  
  val blockQuote: Boolean | folded | literal
  
  def commentString(comment: String): String
  
  val defaultKeyType: typings.yaml.distNodesScalarMod.Scalar.Type
  
  val defaultStringType: typings.yaml.distNodesScalarMod.Scalar.Type
  
  val directives: Boolean
  
  val doubleQuotedAsJSON: Boolean
  
  val doubleQuotedMinMultiLineLength: Double
  
  val falseStr: String
  
  val indentSeq: Boolean
  
  val lineWidth: Double
  
  val minContentWidth: Double
  
  val nullStr: String
  
  val simpleKeys: Boolean
  
  val singleQuote: Boolean
  
  val trueStr: String
  
  val verifyAliasOrder: Boolean
}
object ReadonlyRequiredOmitToStr {
  
  inline def apply(
    blockQuote: Boolean | folded | literal,
    commentString: String => String,
    defaultKeyType: typings.yaml.distNodesScalarMod.Scalar.Type,
    defaultStringType: typings.yaml.distNodesScalarMod.Scalar.Type,
    directives: Boolean,
    doubleQuotedAsJSON: Boolean,
    doubleQuotedMinMultiLineLength: Double,
    falseStr: String,
    indentSeq: Boolean,
    lineWidth: Double,
    minContentWidth: Double,
    nullStr: String,
    simpleKeys: Boolean,
    singleQuote: Boolean,
    trueStr: String,
    verifyAliasOrder: Boolean
  ): ReadonlyRequiredOmitToStr = {
    val __obj = js.Dynamic.literal(blockQuote = blockQuote.asInstanceOf[js.Any], commentString = js.Any.fromFunction1(commentString), defaultKeyType = defaultKeyType.asInstanceOf[js.Any], defaultStringType = defaultStringType.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], doubleQuotedAsJSON = doubleQuotedAsJSON.asInstanceOf[js.Any], doubleQuotedMinMultiLineLength = doubleQuotedMinMultiLineLength.asInstanceOf[js.Any], falseStr = falseStr.asInstanceOf[js.Any], indentSeq = indentSeq.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], minContentWidth = minContentWidth.asInstanceOf[js.Any], nullStr = nullStr.asInstanceOf[js.Any], simpleKeys = simpleKeys.asInstanceOf[js.Any], singleQuote = singleQuote.asInstanceOf[js.Any], trueStr = trueStr.asInstanceOf[js.Any], verifyAliasOrder = verifyAliasOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyRequiredOmitToStr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyRequiredOmitToStr] (val x: Self) extends AnyVal {
    
    inline def setBlockQuote(value: Boolean | folded | literal): Self = StObject.set(x, "blockQuote", value.asInstanceOf[js.Any])
    
    inline def setCommentString(value: String => String): Self = StObject.set(x, "commentString", js.Any.fromFunction1(value))
    
    inline def setDefaultKeyType(value: typings.yaml.distNodesScalarMod.Scalar.Type): Self = StObject.set(x, "defaultKeyType", value.asInstanceOf[js.Any])
    
    inline def setDefaultStringType(value: typings.yaml.distNodesScalarMod.Scalar.Type): Self = StObject.set(x, "defaultStringType", value.asInstanceOf[js.Any])
    
    inline def setDirectives(value: Boolean): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    inline def setDoubleQuotedAsJSON(value: Boolean): Self = StObject.set(x, "doubleQuotedAsJSON", value.asInstanceOf[js.Any])
    
    inline def setDoubleQuotedMinMultiLineLength(value: Double): Self = StObject.set(x, "doubleQuotedMinMultiLineLength", value.asInstanceOf[js.Any])
    
    inline def setFalseStr(value: String): Self = StObject.set(x, "falseStr", value.asInstanceOf[js.Any])
    
    inline def setIndentSeq(value: Boolean): Self = StObject.set(x, "indentSeq", value.asInstanceOf[js.Any])
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setMinContentWidth(value: Double): Self = StObject.set(x, "minContentWidth", value.asInstanceOf[js.Any])
    
    inline def setNullStr(value: String): Self = StObject.set(x, "nullStr", value.asInstanceOf[js.Any])
    
    inline def setSimpleKeys(value: Boolean): Self = StObject.set(x, "simpleKeys", value.asInstanceOf[js.Any])
    
    inline def setSingleQuote(value: Boolean): Self = StObject.set(x, "singleQuote", value.asInstanceOf[js.Any])
    
    inline def setTrueStr(value: String): Self = StObject.set(x, "trueStr", value.asInstanceOf[js.Any])
    
    inline def setVerifyAliasOrder(value: Boolean): Self = StObject.set(x, "verifyAliasOrder", value.asInstanceOf[js.Any])
  }
}
