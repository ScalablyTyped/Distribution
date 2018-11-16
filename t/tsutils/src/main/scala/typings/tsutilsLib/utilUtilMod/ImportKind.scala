package typings
package tsutilsLib.utilUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImportKind extends js.Object

@JSImport("tsutils/util/util", "ImportKind")
@js.native
object ImportKind extends js.Object {
  @js.native
  sealed trait All
    extends tsutilsLib.utilUtilMod.ImportKind
  
  @js.native
  sealed trait AllImportExpressions
    extends tsutilsLib.utilUtilMod.ImportKind
  
  @js.native
  sealed trait AllImports
    extends tsutilsLib.utilUtilMod.ImportKind
  
  @js.native
  sealed trait AllRequireLike
    extends tsutilsLib.utilUtilMod.ImportKind
  
  @js.native
  sealed trait AllStaticImports
    extends tsutilsLib.utilUtilMod.ImportKind
  
  @js.native
  sealed trait DynamicImport
    extends tsutilsLib.utilUtilMod.ImportKind
  
  @js.native
  sealed trait ExportFrom
    extends tsutilsLib.utilUtilMod.ImportKind
  
  @js.native
  sealed trait ImportDeclaration
    extends tsutilsLib.utilUtilMod.ImportKind
  
  @js.native
  sealed trait ImportEquals
    extends tsutilsLib.utilUtilMod.ImportKind
  
  @js.native
  sealed trait ImportType
    extends tsutilsLib.utilUtilMod.ImportKind
  
  @js.native
  sealed trait Require
    extends tsutilsLib.utilUtilMod.ImportKind
  
  /* 63 */ val All: All with scala.Double = js.native
  /* 24 */ val AllImportExpressions: AllImportExpressions with scala.Double = js.native
  /* 59 */ val AllImports: AllImports with scala.Double = js.native
  /* 18 */ val AllRequireLike: AllRequireLike with scala.Double = js.native
  /* 3 */ val AllStaticImports: AllStaticImports with scala.Double = js.native
  /* 8 */ val DynamicImport: DynamicImport with scala.Double = js.native
  /* 4 */ val ExportFrom: ExportFrom with scala.Double = js.native
  /* 1 */ val ImportDeclaration: ImportDeclaration with scala.Double = js.native
  /* 2 */ val ImportEquals: ImportEquals with scala.Double = js.native
  /* 32 */ val ImportType: ImportType with scala.Double = js.native
  /* 16 */ val Require: Require with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[tsutilsLib.utilUtilMod.ImportKind with scala.Double] = js.native
}

