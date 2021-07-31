package typings.vueDocgenApi

import typings.babelTypes.mod.Noop_
import typings.babelTypes.mod.TSTypeAnnotation_
import typings.babelTypes.mod.TypeAnnotation_
import typings.vueInbrowserCompilerUtils.typesMod.ParamType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getTypeFromAnnotationMod {
  
  @JSImport("vue-docgen-api/dist/utils/getTypeFromAnnotation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): js.UndefOr[ParamType] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.UndefOr[ParamType]]
  @scala.inline
  def default(typeNode: Noop_): js.UndefOr[ParamType] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(typeNode.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ParamType]]
  @scala.inline
  def default(typeNode: TSTypeAnnotation_): js.UndefOr[ParamType] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(typeNode.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ParamType]]
  @scala.inline
  def default(typeNode: TypeAnnotation_): js.UndefOr[ParamType] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(typeNode.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ParamType]]
}
