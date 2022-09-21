package typings.typedoc

import typings.typedoc.modelsTypesMod.SomeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectionsMod {
  
  @JSImport("typedoc/dist/lib/converter/utils/reflections", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def removeUndefined(`type`: SomeType): SomeType = ^.asInstanceOf[js.Dynamic].applyDynamic("removeUndefined")(`type`.asInstanceOf[js.Any]).asInstanceOf[SomeType]
}
