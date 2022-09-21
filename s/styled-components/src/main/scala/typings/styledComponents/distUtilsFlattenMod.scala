package typings.styledComponents

import typings.styledComponents.distDistTypesMod.ExecutionContext
import typings.styledComponents.distDistTypesMod.ExtensibleObject
import typings.styledComponents.distDistTypesMod.Interpolation
import typings.styledComponents.distDistTypesMod.Stringifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsFlattenMod {
  
  @JSImport("styled-components/primitives/dist/dist/utils/flatten", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Props](chunk: Interpolation[Props]): Interpolation[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(chunk.asInstanceOf[js.Any]).asInstanceOf[Interpolation[Props]]
  inline def default[Props](chunk: Interpolation[Props], executionContext: ExecutionContext & Props): Interpolation[Props] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(chunk.asInstanceOf[js.Any], executionContext.asInstanceOf[js.Any])).asInstanceOf[Interpolation[Props]]
  inline def default[Props](
    chunk: Interpolation[Props],
    executionContext: ExecutionContext & Props,
    styleSheet: Unit,
    stylisInstance: Stringifier
  ): Interpolation[Props] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(chunk.asInstanceOf[js.Any], executionContext.asInstanceOf[js.Any], styleSheet.asInstanceOf[js.Any], stylisInstance.asInstanceOf[js.Any])).asInstanceOf[Interpolation[Props]]
  inline def default[Props](
    chunk: Interpolation[Props],
    executionContext: ExecutionContext & Props,
    styleSheet: typings.styledComponents.distDistSheetMod.default
  ): Interpolation[Props] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(chunk.asInstanceOf[js.Any], executionContext.asInstanceOf[js.Any], styleSheet.asInstanceOf[js.Any])).asInstanceOf[Interpolation[Props]]
  inline def default[Props](
    chunk: Interpolation[Props],
    executionContext: ExecutionContext & Props,
    styleSheet: typings.styledComponents.distDistSheetMod.default,
    stylisInstance: Stringifier
  ): Interpolation[Props] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(chunk.asInstanceOf[js.Any], executionContext.asInstanceOf[js.Any], styleSheet.asInstanceOf[js.Any], stylisInstance.asInstanceOf[js.Any])).asInstanceOf[Interpolation[Props]]
  inline def default[Props](chunk: Interpolation[Props], executionContext: Unit, styleSheet: Unit, stylisInstance: Stringifier): Interpolation[Props] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(chunk.asInstanceOf[js.Any], executionContext.asInstanceOf[js.Any], styleSheet.asInstanceOf[js.Any], stylisInstance.asInstanceOf[js.Any])).asInstanceOf[Interpolation[Props]]
  inline def default[Props](
    chunk: Interpolation[Props],
    executionContext: Unit,
    styleSheet: typings.styledComponents.distDistSheetMod.default
  ): Interpolation[Props] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(chunk.asInstanceOf[js.Any], executionContext.asInstanceOf[js.Any], styleSheet.asInstanceOf[js.Any])).asInstanceOf[Interpolation[Props]]
  inline def default[Props](
    chunk: Interpolation[Props],
    executionContext: Unit,
    styleSheet: typings.styledComponents.distDistSheetMod.default,
    stylisInstance: Stringifier
  ): Interpolation[Props] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(chunk.asInstanceOf[js.Any], executionContext.asInstanceOf[js.Any], styleSheet.asInstanceOf[js.Any], stylisInstance.asInstanceOf[js.Any])).asInstanceOf[Interpolation[Props]]
  
  inline def objToCssArray(obj: ExtensibleObject): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("objToCssArray")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def objToCssArray(obj: ExtensibleObject, prevKey: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("objToCssArray")(obj.asInstanceOf[js.Any], prevKey.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
