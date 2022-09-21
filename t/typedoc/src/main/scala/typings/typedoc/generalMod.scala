package typings.typedoc

import typings.typedoc.typedocBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generalMod {
  
  @JSImport("typedoc/dist/lib/utils/general", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertNever(x: scala.Nothing): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNever")(x.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  inline def getLoadedPaths(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoadedPaths")().asInstanceOf[js.Array[String]]
  
  inline def hasBeenLoadedMultipleTimes(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasBeenLoadedMultipleTimes")().asInstanceOf[Boolean]
  
  type Chars[T /* <: String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify C */ Any
  
  type IfInternal[T, F] = F | T
  
  type InternalOnly = `false`
  
  type NeverIfInternal[T] = IfInternal[scala.Nothing, T]
}
