package typings.tslint

import typings.typescript.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLanguageTypeUtilsMod {
  
  @JSImport("tslint/lib/language/typeUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def typeIsOrHasBaseType(`type`: Type, parentType: Type): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("typeIsOrHasBaseType")(`type`.asInstanceOf[js.Any], parentType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
