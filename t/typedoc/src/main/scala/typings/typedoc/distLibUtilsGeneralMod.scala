package typings.typedoc

import typings.typedoc.typedocBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibUtilsGeneralMod {
  
  @JSImport("typedoc/dist/lib/utils/general", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertNever(x: scala.Nothing): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("assertNever")(x.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  inline def getLoadedPaths(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoadedPaths")().asInstanceOf[js.Array[String]]
  
  inline def hasBeenLoadedMultipleTimes(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasBeenLoadedMultipleTimes")().asInstanceOf[Boolean]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends / * template literal string: ${inferC}${inferR} * / string ? / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify C * / any | typedoc.typedoc/dist/lib/utils/general.Chars</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify R * / any> : never
    }}}
    */
  @js.native
  trait Chars[T /* <: String */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    typedoc.typedoc/dist/lib/utils/general.InternalOnly extends true ? T : F
    }}}
    */
  @js.native
  trait IfInternal[T, F] extends StObject
  
  type InternalOnly = `false`
  
  type NeverIfInternal[T] = IfInternal[scala.Nothing, T]
}
