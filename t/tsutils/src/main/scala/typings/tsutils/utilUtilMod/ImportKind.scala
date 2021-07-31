package typings.tsutils.utilUtilMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ImportKind extends StObject
@JSImport("tsutils/util/util", "ImportKind")
@js.native
object ImportKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImportKind & Double] = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with ImportKind
  /* 63 */ val All: typings.tsutils.utilUtilMod.ImportKind.All & Double = js.native
  
  @js.native
  sealed trait AllImportExpressions
    extends StObject
       with ImportKind
  /* 24 */ val AllImportExpressions: typings.tsutils.utilUtilMod.ImportKind.AllImportExpressions & Double = js.native
  
  @js.native
  sealed trait AllImports
    extends StObject
       with ImportKind
  /* 59 */ val AllImports: typings.tsutils.utilUtilMod.ImportKind.AllImports & Double = js.native
  
  @js.native
  sealed trait AllRequireLike
    extends StObject
       with ImportKind
  /* 18 */ val AllRequireLike: typings.tsutils.utilUtilMod.ImportKind.AllRequireLike & Double = js.native
  
  @js.native
  sealed trait AllStaticImports
    extends StObject
       with ImportKind
  /* 3 */ val AllStaticImports: typings.tsutils.utilUtilMod.ImportKind.AllStaticImports & Double = js.native
  
  @js.native
  sealed trait DynamicImport
    extends StObject
       with ImportKind
  /* 8 */ val DynamicImport: typings.tsutils.utilUtilMod.ImportKind.DynamicImport & Double = js.native
  
  @js.native
  sealed trait ExportFrom
    extends StObject
       with ImportKind
  /* 4 */ val ExportFrom: typings.tsutils.utilUtilMod.ImportKind.ExportFrom & Double = js.native
  
  @js.native
  sealed trait ImportDeclaration
    extends StObject
       with ImportKind
  /* 1 */ val ImportDeclaration: typings.tsutils.utilUtilMod.ImportKind.ImportDeclaration & Double = js.native
  
  @js.native
  sealed trait ImportEquals
    extends StObject
       with ImportKind
  /* 2 */ val ImportEquals: typings.tsutils.utilUtilMod.ImportKind.ImportEquals & Double = js.native
  
  @js.native
  sealed trait ImportType
    extends StObject
       with ImportKind
  /* 32 */ val ImportType: typings.tsutils.utilUtilMod.ImportKind.ImportType & Double = js.native
  
  @js.native
  sealed trait Require
    extends StObject
       with ImportKind
  /* 16 */ val Require: typings.tsutils.utilUtilMod.ImportKind.Require & Double = js.native
}
