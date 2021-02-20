package typings.tsutils.utilUtilMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ImportKind extends StObject
@JSImport("tsutils/util/util", "ImportKind")
@js.native
object ImportKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ImportKind with Double] = js.native
  
  @js.native
  sealed trait All extends ImportKind
  /* 63 */ val All: typings.tsutils.utilUtilMod.ImportKind.All with Double = js.native
  
  @js.native
  sealed trait AllImportExpressions extends ImportKind
  /* 24 */ val AllImportExpressions: typings.tsutils.utilUtilMod.ImportKind.AllImportExpressions with Double = js.native
  
  @js.native
  sealed trait AllImports extends ImportKind
  /* 59 */ val AllImports: typings.tsutils.utilUtilMod.ImportKind.AllImports with Double = js.native
  
  @js.native
  sealed trait AllRequireLike extends ImportKind
  /* 18 */ val AllRequireLike: typings.tsutils.utilUtilMod.ImportKind.AllRequireLike with Double = js.native
  
  @js.native
  sealed trait AllStaticImports extends ImportKind
  /* 3 */ val AllStaticImports: typings.tsutils.utilUtilMod.ImportKind.AllStaticImports with Double = js.native
  
  @js.native
  sealed trait DynamicImport extends ImportKind
  /* 8 */ val DynamicImport: typings.tsutils.utilUtilMod.ImportKind.DynamicImport with Double = js.native
  
  @js.native
  sealed trait ExportFrom extends ImportKind
  /* 4 */ val ExportFrom: typings.tsutils.utilUtilMod.ImportKind.ExportFrom with Double = js.native
  
  @js.native
  sealed trait ImportDeclaration extends ImportKind
  /* 1 */ val ImportDeclaration: typings.tsutils.utilUtilMod.ImportKind.ImportDeclaration with Double = js.native
  
  @js.native
  sealed trait ImportEquals extends ImportKind
  /* 2 */ val ImportEquals: typings.tsutils.utilUtilMod.ImportKind.ImportEquals with Double = js.native
  
  @js.native
  sealed trait ImportType extends ImportKind
  /* 32 */ val ImportType: typings.tsutils.utilUtilMod.ImportKind.ImportType with Double = js.native
  
  @js.native
  sealed trait Require extends ImportKind
  /* 16 */ val Require: typings.tsutils.utilUtilMod.ImportKind.Require with Double = js.native
}
