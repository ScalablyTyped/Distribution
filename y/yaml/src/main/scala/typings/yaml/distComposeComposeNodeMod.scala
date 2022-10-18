package typings.yaml

import typings.yaml.anon.ReadonlyRequiredOmitParse
import typings.yaml.anon.ReadonlySchema
import typings.yaml.distComposeComposerMod.ComposeErrorHandler
import typings.yaml.distDocDirectivesMod.Directives
import typings.yaml.distNodesNodeMod.ParsedNode
import typings.yaml.distNodesScalarMod.Scalar.Parsed
import typings.yaml.distParseCstMod.SourceToken
import typings.yaml.distParseCstMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComposeComposeNodeMod {
  
  @JSImport("yaml/dist/compose/compose-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def composeEmptyNode(
    ctx: ComposeContext,
    offset: Double,
    before: js.Array[Token],
    pos: Double,
    hasSpaceBeforeCommentAnchorTagEnd: Props,
    onError: ComposeErrorHandler
  ): Parsed = (^.asInstanceOf[js.Dynamic].applyDynamic("composeEmptyNode")(ctx.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], before.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], hasSpaceBeforeCommentAnchorTagEnd.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Parsed]
  inline def composeEmptyNode(
    ctx: ComposeContext,
    offset: Double,
    before: js.Array[Token],
    pos: Null,
    hasSpaceBeforeCommentAnchorTagEnd: Props,
    onError: ComposeErrorHandler
  ): Parsed = (^.asInstanceOf[js.Dynamic].applyDynamic("composeEmptyNode")(ctx.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], before.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], hasSpaceBeforeCommentAnchorTagEnd.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Parsed]
  inline def composeEmptyNode(
    ctx: ComposeContext,
    offset: Double,
    before: Unit,
    pos: Double,
    hasSpaceBeforeCommentAnchorTagEnd: Props,
    onError: ComposeErrorHandler
  ): Parsed = (^.asInstanceOf[js.Dynamic].applyDynamic("composeEmptyNode")(ctx.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], before.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], hasSpaceBeforeCommentAnchorTagEnd.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Parsed]
  inline def composeEmptyNode(
    ctx: ComposeContext,
    offset: Double,
    before: Unit,
    pos: Null,
    hasSpaceBeforeCommentAnchorTagEnd: Props,
    onError: ComposeErrorHandler
  ): Parsed = (^.asInstanceOf[js.Dynamic].applyDynamic("composeEmptyNode")(ctx.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], before.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], hasSpaceBeforeCommentAnchorTagEnd.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Parsed]
  
  inline def composeNode(ctx: ComposeContext, token: Token, props: Props, onError: ComposeErrorHandler): ParsedNode = (^.asInstanceOf[js.Dynamic].applyDynamic("composeNode")(ctx.asInstanceOf[js.Any], token.asInstanceOf[js.Any], props.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[ParsedNode]
  
  trait ComposeContext extends StObject {
    
    var atRoot: Boolean
    
    var directives: Directives
    
    var options: ReadonlyRequiredOmitParse
    
    var schema: ReadonlySchema
  }
  object ComposeContext {
    
    inline def apply(
      atRoot: Boolean,
      directives: Directives,
      options: ReadonlyRequiredOmitParse,
      schema: ReadonlySchema
    ): ComposeContext = {
      val __obj = js.Dynamic.literal(atRoot = atRoot.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComposeContext]
    }
    
    extension [Self <: ComposeContext](x: Self) {
      
      inline def setAtRoot(value: Boolean): Self = StObject.set(x, "atRoot", value.asInstanceOf[js.Any])
      
      inline def setDirectives(value: Directives): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: ReadonlyRequiredOmitParse): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setSchema(value: ReadonlySchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComposeNode_ extends StObject
  
  trait Props extends StObject {
    
    var anchor: SourceToken | Null
    
    var comment: String
    
    var end: Double
    
    var spaceBefore: Boolean
    
    var tag: SourceToken | Null
  }
  object Props {
    
    inline def apply(comment: String, end: Double, spaceBefore: Boolean): Props = {
      val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], spaceBefore = spaceBefore.asInstanceOf[js.Any], anchor = null, tag = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setAnchor(value: SourceToken): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorNull: Self = StObject.set(x, "anchor", null)
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setSpaceBefore(value: Boolean): Self = StObject.set(x, "spaceBefore", value.asInstanceOf[js.Any])
      
      inline def setTag(value: SourceToken): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagNull: Self = StObject.set(x, "tag", null)
    }
  }
}
