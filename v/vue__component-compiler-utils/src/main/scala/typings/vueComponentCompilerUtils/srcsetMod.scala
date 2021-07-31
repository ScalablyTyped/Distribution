package typings.vueComponentCompilerUtils

import typings.vueComponentCompilerUtils.anon.PostTransformNode
import typings.vueComponentCompilerUtils.assetUrlMod.TransformAssetUrlsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcsetMod {
  
  @JSImport("@vue/component-compiler-utils/dist/templateCompilerModules/srcset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): PostTransformNode = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[PostTransformNode]
  @scala.inline
  def default(transformAssetUrlsOptions: TransformAssetUrlsOptions): PostTransformNode = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(transformAssetUrlsOptions.asInstanceOf[js.Any]).asInstanceOf[PostTransformNode]
}
