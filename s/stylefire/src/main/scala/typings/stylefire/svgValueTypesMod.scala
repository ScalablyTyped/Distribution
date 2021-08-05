package typings.stylefire

import typings.styleValueTypes.typesMod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgValueTypesMod {
  
  @JSImport("stylefire/lib/svg/value-types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(key: String): ValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(key.asInstanceOf[js.Any]).asInstanceOf[ValueType]
}
