package typings.wonka

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.wonka.typesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object combineMod {
  
  @JSImport("wonka/dist/types/combine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combine[Sources /* <: js.Array[Source[Any]] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param sources because its type Sources is not an array type */ sources: Sources
  ): Source[TypeOfSourceArray[Sources]] = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(sources.asInstanceOf[js.Any]).asInstanceOf[Source[TypeOfSourceArray[Sources]]]
  
  inline def zip[Sources /* <: StringDictionary[Source[Any]] */](sources: Sources): Source[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Property in keyof Sources ]: wonka.wonka/dist/types/types.TypeOfSource<Sources[Property]>}
    */ typings.wonka.wonkaStrings.zip & TopLevel[Sources]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(sources.asInstanceOf[js.Any]).asInstanceOf[Source[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Property in keyof Sources ]: wonka.wonka/dist/types/types.TypeOfSource<Sources[Property]>}
    */ typings.wonka.wonkaStrings.zip & TopLevel[Sources]
  ]]
  inline def zip[Sources /* <: Array[Source[Any]] */](
    sources: /* import warning: importer.ImportType#apply c repeated non-array type: Sources */ js.Array[Sources]
  ): Source[TypeOfSourceArray[Sources]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(sources.asInstanceOf[js.Any]).asInstanceOf[Source[TypeOfSourceArray[Sources]]]
  
  type TypeOfSourceArray[T /* <: Array[Any] */] = js.Array[Any]
}
