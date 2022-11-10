package typings.wonka

import org.scalablytyped.runtime.StringDictionary
import typings.wonka.distTypesTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCombineMod {
  
  @JSImport("wonka/dist/types/combine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combine[Sources /* <: js.Array[Source[Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param sources because its type Sources is not an array type */ sources: Sources
  ): Source[TypeOfSourceArray[Sources]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(sources.asInstanceOf[js.Any]).asInstanceOf[Source[TypeOfSourceArray[Sources]]]
  
  inline def zip[Sources /* <: StringDictionary[Source[Any]] */](sources: Sources): Source[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Property in keyof Sources ]: wonka.wonka/dist/types/types.TypeOfSource<Sources[Property]>} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(sources.asInstanceOf[js.Any]).asInstanceOf[Source[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ Property in keyof Sources ]: wonka.wonka/dist/types/types.TypeOfSource<Sources[Property]>} */ js.Any
  ]]
  inline def zip[Sources /* <: Array[Source[Any]] */](
    sources: /* import warning: importer.ImportType#apply c repeated non-array type: Sources */ js.Array[Sources]
  ): Source[TypeOfSourceArray[Sources]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(sources.asInstanceOf[js.Any]).asInstanceOf[Source[TypeOfSourceArray[Sources]]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends [infer Head, ...infer Tail] ? [wonka.wonka/dist/types/types.TypeOfSource<Head>, ...wonka.wonka/dist/types/combine.TypeOfSourceArray<Tail>] : []
    }}}
    */
  type TypeOfSourceArray[T /* <: Array[Any] */] = js.Array[Any]
}
