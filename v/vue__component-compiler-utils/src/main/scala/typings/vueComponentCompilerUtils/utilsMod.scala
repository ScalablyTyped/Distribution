package typings.vueComponentCompilerUtils

import typings.vueComponentCompilerUtils.assetUrlMod.TransformAssetUrlsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@vue/component-compiler-utils/dist/templateCompilerModules/utils", "urlToRequire")
  @js.native
  def urlToRequire(url: String): String = js.native
  @JSImport("@vue/component-compiler-utils/dist/templateCompilerModules/utils", "urlToRequire")
  @js.native
  def urlToRequire(url: String, transformAssetUrlsOption: TransformAssetUrlsOptions): String = js.native
  
  @js.native
  trait ASTNode extends StObject {
    
    var attrs: js.Array[Attr] = js.native
    
    var tag: String = js.native
  }
  object ASTNode {
    
    @scala.inline
    def apply(attrs: js.Array[Attr], tag: String): ASTNode = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[ASTNode]
    }
    
    @scala.inline
    implicit class ASTNodeMutableBuilder[Self <: ASTNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: js.Array[Attr]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrsVarargs(value: Attr*): Self = StObject.set(x, "attrs", js.Array(value :_*))
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Attr extends StObject {
    
    var name: String = js.native
    
    var value: String = js.native
  }
  object Attr {
    
    @scala.inline
    def apply(name: String, value: String): Attr = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attr]
    }
    
    @scala.inline
    implicit class AttrMutableBuilder[Self <: Attr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
