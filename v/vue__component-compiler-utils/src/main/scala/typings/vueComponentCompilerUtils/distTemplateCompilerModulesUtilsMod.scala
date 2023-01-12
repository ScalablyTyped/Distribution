package typings.vueComponentCompilerUtils

import typings.vueComponentCompilerUtils.distTemplateCompilerModulesAssetUrlMod.TransformAssetUrlsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTemplateCompilerModulesUtilsMod {
  
  @JSImport("@vue/component-compiler-utils/dist/templateCompilerModules/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def urlToRequire(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlToRequire")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def urlToRequire(url: String, transformAssetUrlsOption: TransformAssetUrlsOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("urlToRequire")(url.asInstanceOf[js.Any], transformAssetUrlsOption.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait ASTNode extends StObject {
    
    var attrs: js.Array[Attr]
    
    var tag: String
  }
  object ASTNode {
    
    inline def apply(attrs: js.Array[Attr], tag: String): ASTNode = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[ASTNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ASTNode] (val x: Self) extends AnyVal {
      
      inline def setAttrs(value: js.Array[Attr]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAttrsVarargs(value: Attr*): Self = StObject.set(x, "attrs", js.Array(value*))
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait Attr extends StObject {
    
    var name: String
    
    var value: String
  }
  object Attr {
    
    inline def apply(name: String, value: String): Attr = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attr]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Attr] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
