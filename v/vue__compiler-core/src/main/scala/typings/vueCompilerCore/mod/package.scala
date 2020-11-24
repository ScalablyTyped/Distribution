package typings.vueCompilerCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BindingMetadata = org.scalablytyped.runtime.StringDictionary[
    typings.vueCompilerCore.vueCompilerCoreStrings.data | typings.vueCompilerCore.vueCompilerCoreStrings.props | typings.vueCompilerCore.vueCompilerCoreStrings.setup | typings.vueCompilerCore.vueCompilerCoreStrings.options
  ]
  
  type CompilerOptions = typings.vueCompilerCore.mod.ParserOptions with typings.vueCompilerCore.mod.TransformOptions with typings.vueCompilerCore.mod.CodegenOptions
  
  type DirectiveTransform = js.Function4[
    /* dir */ typings.vueCompilerCore.mod.DirectiveNode, 
    /* node */ typings.vueCompilerCore.mod.ElementNode, 
    /* context */ typings.vueCompilerCore.mod.TransformContext, 
    /* augmentor */ js.UndefOr[
      js.Function1[
        /* ret */ typings.vueCompilerCore.mod.DirectiveTransformResult, 
        typings.vueCompilerCore.mod.DirectiveTransformResult
      ]
    ], 
    typings.vueCompilerCore.mod.DirectiveTransformResult
  ]
  
  type HoistTransform = js.Function3[
    /* children */ js.Array[typings.vueCompilerCore.mod.TemplateChildNode], 
    /* context */ typings.vueCompilerCore.mod.TransformContext, 
    /* parent */ typings.vueCompilerCore.mod.ParentNode2, 
    scala.Unit
  ]
  
  type Namespace = scala.Double
  
  type Namespaces = typings.vueCompilerCore.vueCompilerCoreNumbers.`0`
  
  type NodeTransform = js.Function2[
    /* node */ typings.vueCompilerCore.mod.RootNode | typings.vueCompilerCore.mod.TemplateChildNode, 
    /* context */ typings.vueCompilerCore.mod.TransformContext, 
    scala.Unit | js.Function0[scala.Unit] | js.Array[js.Function0[scala.Unit]]
  ]
  
  type SlotFnBuilder = js.Function3[
    /* slotProps */ js.UndefOr[typings.vueCompilerCore.mod.ExpressionNode], 
    /* slotChildren */ js.Array[typings.vueCompilerCore.mod.TemplateChildNode], 
    /* loc */ typings.vueCompilerCore.mod.SourceLocation, 
    typings.vueCompilerCore.mod.FunctionExpression
  ]
  
  type StructuralDirectiveTransform = js.Function3[
    /* node */ typings.vueCompilerCore.mod.ElementNode, 
    /* dir */ typings.vueCompilerCore.mod.DirectiveNode, 
    /* context */ typings.vueCompilerCore.mod.TransformContext, 
    scala.Unit | js.Function0[scala.Unit]
  ]
  
  type TransformPreset = js.Tuple2[
    js.Array[typings.vueCompilerCore.mod.NodeTransform], 
    typings.std.Record[java.lang.String, typings.vueCompilerCore.mod.DirectiveTransform]
  ]
}
