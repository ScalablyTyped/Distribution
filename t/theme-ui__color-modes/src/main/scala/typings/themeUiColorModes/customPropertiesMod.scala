package typings.themeUiColorModes

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customPropertiesMod {
  
  @JSImport("@theme-ui/color-modes/dist/declarations/src/custom-properties", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createColorProperties(
    colors: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColorModesScale */ Any,
    modes: StringDictionary[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColorMode */ Any
    ]
  ): Record[String, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("__createColorProperties")(colors.asInstanceOf[js.Any], modes.asInstanceOf[js.Any])).asInstanceOf[Record[String, js.Object]]
  
  inline def createColorStyles(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("__createColorStyles")().asInstanceOf[Any]
  inline def createColorStyles(
    theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("__createColorStyles")(theme.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def objectToVars(parent: String, obj: Record[String, Any]): Record[String, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("__objectToVars")(parent.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Record[String, js.Object]]
  
  inline def toCustomProperties(): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toCustomProperties")().asInstanceOf[Record[String, Any]]
  inline def toCustomProperties(obj: Unit, parent: String): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCustomProperties")(obj.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  inline def toCustomProperties(obj: Record[String, Any]): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toCustomProperties")(obj.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
  inline def toCustomProperties(obj: Record[String, Any], parent: String): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCustomProperties")(obj.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
}
