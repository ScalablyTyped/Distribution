package typings.vueDocgenApi

import typings.astTypes.nodePathMod.NodePath
import typings.vueDocgenApi.anon.Bindings
import typings.vueInbrowserCompilerUtils.typesMod.ParamTag
import typings.vueInbrowserCompilerUtils.typesMod.ParamType
import typings.vueInbrowserCompilerUtils.typesMod.SlotDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slotHandlerMod {
  
  @JSImport("vue-docgen-api/dist/script-handlers/slotHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[js.Any, js.Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(documentation.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def getSlotComment(path: NodePath[js.Any, js.Any], descriptor: SlotDescriptor): js.UndefOr[SlotComment] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSlotComment")(path.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[SlotComment]]
  
  @scala.inline
  def parseSlotDocBlock(str: String, descriptor: SlotDescriptor): js.UndefOr[Bindings] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSlotDocBlock")(str.asInstanceOf[js.Any], descriptor.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Bindings]]
  
  /* Inlined std.Pick<vue-docgen-api.vue-docgen-api/dist/Documentation.SlotDescriptor, 'bindings'> */
  trait SlotComment extends StObject {
    
    var bindings: js.UndefOr[js.Array[ParamTag]] = js.undefined
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
  
  trait TypedParamTag
    extends StObject
       with ParamTag {
    
    @JSName("type")
    var type_TypedParamTag: ParamType
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
