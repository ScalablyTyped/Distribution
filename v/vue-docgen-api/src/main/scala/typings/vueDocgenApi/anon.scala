package typings.vueDocgenApi

import typings.babelTypes.mod.File_
import typings.std.Record
import typings.vueDocgenApi.vueDocgenApiBooleans.`true`
import typings.vueInbrowserCompilerUtils.typesMod.ParamTag
import typings.vueInbrowserCompilerUtils.typesMod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bindings extends StObject {
    
    var bindings: js.Array[ParamTag | Tag]
  }
  object Bindings {
    
    inline def apply(bindings: js.Array[ParamTag | Tag]): Bindings = {
      val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bindings]
    }
    
    extension [Self <: Bindings](x: Self) {
      
      inline def setBindings(value: js.Array[ParamTag | Tag]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
      
      inline def setBindingsVarargs(value: (ParamTag | Tag)*): Self = StObject.set(x, "bindings", js.Array(value :_*))
    }
  }
  
  trait CommentIndex extends StObject {
    
    var commentIndex: js.UndefOr[Double] = js.undefined
  }
  object CommentIndex {
    
    inline def apply(): CommentIndex = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentIndex]
    }
    
    extension [Self <: CommentIndex](x: Self) {
      
      inline def setCommentIndex(value: Double): Self = StObject.set(x, "commentIndex", value.asInstanceOf[js.Any])
      
      inline def setCommentIndexUndefined: Self = StObject.set(x, "commentIndex", js.undefined)
    }
  }
  
  trait Parse extends StObject {
    
    def parse(src: String): File_
  }
  object Parse {
    
    inline def apply(parse: String => File_): Parse = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
      __obj.asInstanceOf[Parse]
    }
    
    extension [Self <: Parse](x: Self) {
      
      inline def setParse(value: String => File_): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Pick<@vue/compiler-sfc.@vue/compiler-sfc.SFCTemplateBlock, 'content' | 'attrs'> */
  trait PickSFCTemplateBlockconte extends StObject {
    
    var attrs: Record[String, String | `true`]
    
    var content: String
  }
  object PickSFCTemplateBlockconte {
    
    inline def apply(attrs: Record[String, String | `true`], content: String): PickSFCTemplateBlockconte = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickSFCTemplateBlockconte]
    }
    
    extension [Self <: PickSFCTemplateBlockconte](x: Self) {
      
      inline def setAttrs(value: Record[String, String | `true`]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
}
