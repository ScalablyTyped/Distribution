package typings.vueTestUtils

import typings.std.NonNullable
import typings.std.Parameters
import typings.vueTestUtils.anon.Transformers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVnodeTransformersUtilMod {
  
  @JSImport("@vue/test-utils/dist/vnodeTransformers/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createVNodeTransformer(param0: Transformers): VNodeArgsTransformerFn = ^.asInstanceOf[js.Dynamic].applyDynamic("createVNodeTransformer")(param0.asInstanceOf[js.Any]).asInstanceOf[VNodeArgsTransformerFn]
  
  inline def isKeepAlive(`type`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isKeepAlive")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTeleport(`type`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTeleport")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends @vue/runtime-core.@vue/runtime-core.ConcreteComponent<{}, any, any, @vue/runtime-core.@vue/runtime-core.ComputedOptions, @vue/runtime-core.@vue/runtime-core.MethodOptions> ? T : never
    }}}
    */
  type ExtractComponentTypes[T] = T
  
  type InstanceArgsType = /* import warning: importer.ImportType#apply Failed type conversion: @vue/test-utils.@vue/test-utils/dist/vnodeTransformers/util.TransformVNodeArgs[1] */ js.Any
  
  type TransformVNodeArgs = Parameters[VNodeArgsTransformerFn]
  
  type VNodeArgsTransformerFn = NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@vue/test-utils.anon.FnCall>[0] */ js.Any
  ]
  
  type VNodeTransformerArgsType = /* import warning: importer.ImportType#apply Failed type conversion: @vue/test-utils.@vue/test-utils/dist/vnodeTransformers/util.TransformVNodeArgs[0] */ js.Any
  
  type VNodeTransformerInputComponentType = ExtractComponentTypes[VNodeTransformerInputType]
  
  type VNodeTransformerInputType = /* import warning: importer.ImportType#apply Failed type conversion: @vue/test-utils.@vue/test-utils/dist/vnodeTransformers/util.VNodeTransformerArgsType[0] */ js.Any
  
  type VTUVNodeTypeTransformer = js.Function2[
    /* inputType */ VNodeTransformerInputComponentType, 
    /* instance */ InstanceArgsType, 
    VNodeTransformerInputComponentType
  ]
}
