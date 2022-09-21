package typings.typedoc

import typings.typedoc.libUtilsMod.Logger
import typings.typedoc.modelsMod.ProjectReflection
import typings.typedoc.typedocStrings.All
import typings.typedoc.typedocStrings.ClassMember
import typings.typedoc.typedocStrings.ClassOrInterface
import typings.typedoc.typedocStrings.ContainsCallSignatures
import typings.typedoc.typedocStrings.ExportContainer
import typings.typedoc.typedocStrings.FunctionOrMethod
import typings.typedoc.typedocStrings.Inheritable
import typings.typedoc.typedocStrings.SignatureContainer
import typings.typedoc.typedocStrings.SomeExport
import typings.typedoc.typedocStrings.SomeMember
import typings.typedoc.typedocStrings.SomeModule
import typings.typedoc.typedocStrings.SomeSignature
import typings.typedoc.typedocStrings.SomeType
import typings.typedoc.typedocStrings.SomeValue
import typings.typedoc.typedocStrings.VariableOrProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentationMod {
  
  @JSImport("typedoc/dist/lib/validation/documentation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateDocumentation(
    project: ProjectReflection,
    logger: Logger,
    requiredToBeDocumented: js.Array[
      /* keyof typedoc.anon.TypeofReflectionKind */ All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateDocumentation")(project.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], requiredToBeDocumented.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
