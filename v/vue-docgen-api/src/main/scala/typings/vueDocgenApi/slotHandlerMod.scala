package typings.vueDocgenApi

import typings.astTypes.nodePathMod.NodePath
import typings.vueDocgenApi.anon.Bindings
import typings.vueInbrowserCompilerUtils.typesMod.ParamTag
import typings.vueInbrowserCompilerUtils.typesMod.ParamType
import typings.vueInbrowserCompilerUtils.typesMod.SlotDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slotHandlerMod {
  
  @JSImport("vue-docgen-api/dist/script-handlers/slotHandler", JSImport.Default)
  @js.native
  def default(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
  
  @JSImport("vue-docgen-api/dist/script-handlers/slotHandler", "getSlotComment")
  @js.native
  def getSlotComment(path: NodePath[_, _], descriptor: SlotDescriptor): js.UndefOr[SlotComment] = js.native
  
  @JSImport("vue-docgen-api/dist/script-handlers/slotHandler", "parseSlotDocBlock")
  @js.native
  def parseSlotDocBlock(str: String, descriptor: SlotDescriptor): js.UndefOr[Bindings] = js.native
  
  /* Inlined std.Pick<vue-docgen-api.vue-docgen-api/dist/Documentation.SlotDescriptor, 'bindings'> */
  @js.native
  trait SlotComment extends StObject {
    
    var bindings: js.UndefOr[js.Array[ParamTag]] = js.native
  }
  object SlotComment {
    
    @scala.inline
    def apply(): SlotComment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlotComment]
    }
    
    @scala.inline
    implicit class SlotCommentMutableBuilder[Self <: SlotComment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBindings(value: js.Array[ParamTag]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
      
      @scala.inline
      def setBindingsVarargs(value: ParamTag*): Self = StObject.set(x, "bindings", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TypedParamTag extends ParamTag {
    
    @JSName("type")
    var type_TypedParamTag: ParamType = js.native
  }
  object TypedParamTag {
    
    @scala.inline
    def apply(title: String, `type`: ParamType): TypedParamTag = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypedParamTag]
    }
    
    @scala.inline
    implicit class TypedParamTagMutableBuilder[Self <: TypedParamTag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: ParamType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
