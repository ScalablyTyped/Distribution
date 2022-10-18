package typings.styleValueTypes

import typings.styleValueTypes.anon.Dictx
import typings.styleValueTypes.libTypesMod.Color
import typings.styleValueTypes.libTypesMod.HSLA
import typings.styleValueTypes.libTypesMod.RGBA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libColorUtilsMod {
  
  @JSImport("style-value-types/lib/color/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isColorString(`type`: String): js.Function1[/* v */ Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isColorString")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* v */ Any, Boolean]]
  inline def isColorString(`type`: String, testProp: String): js.Function1[/* v */ Any, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("isColorString")(`type`.asInstanceOf[js.Any], testProp.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ Any, Boolean]]
  
  inline def splitColor(aName: String, bName: String, cName: String): js.Function1[/* v */ String | Color, RGBA | HSLA | Dictx] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitColor")(aName.asInstanceOf[js.Any], bName.asInstanceOf[js.Any], cName.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* v */ String | Color, RGBA | HSLA | Dictx]]
}
