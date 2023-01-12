package typings.typescript.mod.server

import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.SortedReadonlyArray
import typings.typescript.mod.TypeAcquisition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetTypings
  extends StObject
     with ProjectResponse {
  
  val compilerOptions: CompilerOptions
  
  @JSName("kind")
  val kind_SetTypings: ActionSet
  
  val typeAcquisition: TypeAcquisition
  
  @JSName("typings")
  val typings_ : js.Array[String]
  
  val unresolvedImports: SortedReadonlyArray[String]
}
object SetTypings {
  
  inline def apply(
    compilerOptions: CompilerOptions,
    kind: ActionSet,
    projectName: String,
    typeAcquisition: TypeAcquisition,
    typings_ : js.Array[String],
    unresolvedImports: SortedReadonlyArray[String]
  ): SetTypings = {
    val __obj = js.Dynamic.literal(compilerOptions = compilerOptions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], typeAcquisition = typeAcquisition.asInstanceOf[js.Any], unresolvedImports = unresolvedImports.asInstanceOf[js.Any])
    __obj.updateDynamic("typings")(typings_.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTypings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetTypings] (val x: Self) extends AnyVal {
    
    inline def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ActionSet): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setTypeAcquisition(value: TypeAcquisition): Self = StObject.set(x, "typeAcquisition", value.asInstanceOf[js.Any])
    
    inline def setTypings_(value: js.Array[String]): Self = StObject.set(x, "typings", value.asInstanceOf[js.Any])
    
    inline def setTypings_Varargs(value: String*): Self = StObject.set(x, "typings", js.Array(value*))
    
    inline def setUnresolvedImports(value: SortedReadonlyArray[String]): Self = StObject.set(x, "unresolvedImports", value.asInstanceOf[js.Any])
  }
}
