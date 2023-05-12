package typings.webpackSubresourceIntegrity

import typings.webpack.mod.ChunkGroup
import typings.webpack.mod.ChunkGroupOptions
import typings.webpack.mod.Module
import typings.webpack.mod.RealDependencyLocation
import typings.webpack.mod.SyntheticDependencyLocation
import typings.webpackSubresourceIntegrity.distCjsTypesMod.HWPAssets
import typings.webpackSubresourceIntegrity.distCjsTypesMod.HtmlTagObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Assets extends StObject {
    
    var assets: HWPAssets
  }
  object Assets {
    
    inline def apply(assets: HWPAssets): Assets = {
      val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any])
      __obj.asInstanceOf[Assets]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Assets] (val x: Self) extends AnyVal {
      
      inline def setAssets(value: HWPAssets): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    }
  }
  
  trait AssetsHWPAssets extends StObject {
    
    var assets: typings.webpackSubresourceIntegrity.distMjsTypesMod.HWPAssets
  }
  object AssetsHWPAssets {
    
    inline def apply(assets: typings.webpackSubresourceIntegrity.distMjsTypesMod.HWPAssets): AssetsHWPAssets = {
      val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssetsHWPAssets]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AssetsHWPAssets] (val x: Self) extends AnyVal {
      
      inline def setAssets(value: typings.webpackSubresourceIntegrity.distMjsTypesMod.HWPAssets): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    }
  }
  
  trait BodyTags extends StObject {
    
    var bodyTags: js.Array[HtmlTagObject]
    
    var headTags: js.Array[HtmlTagObject]
  }
  object BodyTags {
    
    inline def apply(bodyTags: js.Array[HtmlTagObject], headTags: js.Array[HtmlTagObject]): BodyTags = {
      val __obj = js.Dynamic.literal(bodyTags = bodyTags.asInstanceOf[js.Any], headTags = headTags.asInstanceOf[js.Any])
      __obj.asInstanceOf[BodyTags]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BodyTags] (val x: Self) extends AnyVal {
      
      inline def setBodyTags(value: js.Array[HtmlTagObject]): Self = StObject.set(x, "bodyTags", value.asInstanceOf[js.Any])
      
      inline def setBodyTagsVarargs(value: HtmlTagObject*): Self = StObject.set(x, "bodyTags", js.Array(value*))
      
      inline def setHeadTags(value: js.Array[HtmlTagObject]): Self = StObject.set(x, "headTags", value.asInstanceOf[js.Any])
      
      inline def setHeadTagsVarargs(value: HtmlTagObject*): Self = StObject.set(x, "headTags", js.Array(value*))
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(groupOptions: String): ChunkGroup = js.native
    def apply(groupOptions: String, module: Unit, loc: Unit, request: String): ChunkGroup = js.native
    def apply(groupOptions: String, module: Unit, loc: RealDependencyLocation): ChunkGroup = js.native
    def apply(groupOptions: String, module: Unit, loc: RealDependencyLocation, request: String): ChunkGroup = js.native
    def apply(groupOptions: String, module: Unit, loc: SyntheticDependencyLocation): ChunkGroup = js.native
    def apply(groupOptions: String, module: Unit, loc: SyntheticDependencyLocation, request: String): ChunkGroup = js.native
    def apply(groupOptions: String, module: Module): ChunkGroup = js.native
    def apply(groupOptions: String, module: Module, loc: Unit, request: String): ChunkGroup = js.native
    def apply(groupOptions: String, module: Module, loc: RealDependencyLocation): ChunkGroup = js.native
    def apply(groupOptions: String, module: Module, loc: RealDependencyLocation, request: String): ChunkGroup = js.native
    def apply(groupOptions: String, module: Module, loc: SyntheticDependencyLocation): ChunkGroup = js.native
    def apply(groupOptions: String, module: Module, loc: SyntheticDependencyLocation, request: String): ChunkGroup = js.native
    def apply(groupOptions: ChunkGroupOptions): ChunkGroup = js.native
    def apply(groupOptions: ChunkGroupOptions, module: Unit, loc: Unit, request: String): ChunkGroup = js.native
    def apply(groupOptions: ChunkGroupOptions, module: Unit, loc: RealDependencyLocation): ChunkGroup = js.native
    def apply(groupOptions: ChunkGroupOptions, module: Unit, loc: RealDependencyLocation, request: String): ChunkGroup = js.native
    def apply(groupOptions: ChunkGroupOptions, module: Unit, loc: SyntheticDependencyLocation): ChunkGroup = js.native
    def apply(groupOptions: ChunkGroupOptions, module: Unit, loc: SyntheticDependencyLocation, request: String): ChunkGroup = js.native
    def apply(groupOptions: ChunkGroupOptions, module: Module): ChunkGroup = js.native
    def apply(groupOptions: ChunkGroupOptions, module: Module, loc: Unit, request: String): ChunkGroup = js.native
    def apply(groupOptions: ChunkGroupOptions, module: Module, loc: RealDependencyLocation): ChunkGroup = js.native
    def apply(groupOptions: ChunkGroupOptions, module: Module, loc: RealDependencyLocation, request: String): ChunkGroup = js.native
    def apply(groupOptions: ChunkGroupOptions, module: Module, loc: SyntheticDependencyLocation): ChunkGroup = js.native
    def apply(groupOptions: ChunkGroupOptions, module: Module, loc: SyntheticDependencyLocation, request: String): ChunkGroup = js.native
  }
  
  trait HeadTags extends StObject {
    
    var bodyTags: js.Array[typings.webpackSubresourceIntegrity.distMjsTypesMod.HtmlTagObject]
    
    var headTags: js.Array[typings.webpackSubresourceIntegrity.distMjsTypesMod.HtmlTagObject]
  }
  object HeadTags {
    
    inline def apply(
      bodyTags: js.Array[typings.webpackSubresourceIntegrity.distMjsTypesMod.HtmlTagObject],
      headTags: js.Array[typings.webpackSubresourceIntegrity.distMjsTypesMod.HtmlTagObject]
    ): HeadTags = {
      val __obj = js.Dynamic.literal(bodyTags = bodyTags.asInstanceOf[js.Any], headTags = headTags.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeadTags]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeadTags] (val x: Self) extends AnyVal {
      
      inline def setBodyTags(value: js.Array[typings.webpackSubresourceIntegrity.distMjsTypesMod.HtmlTagObject]): Self = StObject.set(x, "bodyTags", value.asInstanceOf[js.Any])
      
      inline def setBodyTagsVarargs(value: typings.webpackSubresourceIntegrity.distMjsTypesMod.HtmlTagObject*): Self = StObject.set(x, "bodyTags", js.Array(value*))
      
      inline def setHeadTags(value: js.Array[typings.webpackSubresourceIntegrity.distMjsTypesMod.HtmlTagObject]): Self = StObject.set(x, "headTags", value.asInstanceOf[js.Any])
      
      inline def setHeadTagsVarargs(value: typings.webpackSubresourceIntegrity.distMjsTypesMod.HtmlTagObject*): Self = StObject.set(x, "headTags", js.Array(value*))
    }
  }
}
