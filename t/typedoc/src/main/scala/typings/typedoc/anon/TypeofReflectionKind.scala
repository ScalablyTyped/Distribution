package typings.typedoc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofReflectionKind extends StObject {
  
  val All: Double
  
  val ClassMember: Double
  
  val ClassOrInterface: Double
  
  /** @internal */
  val ContainsCallSignatures: Double
  
  val ExportContainer: Double
  
  val FunctionOrMethod: Double
  
  /** @internal */
  val Inheritable: Double
  
  /**
    * Note: This does not include Class/Interface, even though they technically could contain index signatures
    * @internal
    */
  val SignatureContainer: Double
  
  val SomeExport: Double
  
  val SomeMember: Double
  
  val SomeModule: Double
  
  val SomeSignature: Double
  
  val SomeType: Double
  
  val SomeValue: Double
  
  val VariableOrProperty: Double
}
object TypeofReflectionKind {
  
  inline def apply(
    All: Double,
    ClassMember: Double,
    ClassOrInterface: Double,
    ContainsCallSignatures: Double,
    ExportContainer: Double,
    FunctionOrMethod: Double,
    Inheritable: Double,
    SignatureContainer: Double,
    SomeExport: Double,
    SomeMember: Double,
    SomeModule: Double,
    SomeSignature: Double,
    SomeType: Double,
    SomeValue: Double,
    VariableOrProperty: Double
  ): TypeofReflectionKind = {
    val __obj = js.Dynamic.literal(All = All.asInstanceOf[js.Any], ClassMember = ClassMember.asInstanceOf[js.Any], ClassOrInterface = ClassOrInterface.asInstanceOf[js.Any], ContainsCallSignatures = ContainsCallSignatures.asInstanceOf[js.Any], ExportContainer = ExportContainer.asInstanceOf[js.Any], FunctionOrMethod = FunctionOrMethod.asInstanceOf[js.Any], Inheritable = Inheritable.asInstanceOf[js.Any], SignatureContainer = SignatureContainer.asInstanceOf[js.Any], SomeExport = SomeExport.asInstanceOf[js.Any], SomeMember = SomeMember.asInstanceOf[js.Any], SomeModule = SomeModule.asInstanceOf[js.Any], SomeSignature = SomeSignature.asInstanceOf[js.Any], SomeType = SomeType.asInstanceOf[js.Any], SomeValue = SomeValue.asInstanceOf[js.Any], VariableOrProperty = VariableOrProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofReflectionKind]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofReflectionKind] (val x: Self) extends AnyVal {
    
    inline def setAll(value: Double): Self = StObject.set(x, "All", value.asInstanceOf[js.Any])
    
    inline def setClassMember(value: Double): Self = StObject.set(x, "ClassMember", value.asInstanceOf[js.Any])
    
    inline def setClassOrInterface(value: Double): Self = StObject.set(x, "ClassOrInterface", value.asInstanceOf[js.Any])
    
    inline def setContainsCallSignatures(value: Double): Self = StObject.set(x, "ContainsCallSignatures", value.asInstanceOf[js.Any])
    
    inline def setExportContainer(value: Double): Self = StObject.set(x, "ExportContainer", value.asInstanceOf[js.Any])
    
    inline def setFunctionOrMethod(value: Double): Self = StObject.set(x, "FunctionOrMethod", value.asInstanceOf[js.Any])
    
    inline def setInheritable(value: Double): Self = StObject.set(x, "Inheritable", value.asInstanceOf[js.Any])
    
    inline def setSignatureContainer(value: Double): Self = StObject.set(x, "SignatureContainer", value.asInstanceOf[js.Any])
    
    inline def setSomeExport(value: Double): Self = StObject.set(x, "SomeExport", value.asInstanceOf[js.Any])
    
    inline def setSomeMember(value: Double): Self = StObject.set(x, "SomeMember", value.asInstanceOf[js.Any])
    
    inline def setSomeModule(value: Double): Self = StObject.set(x, "SomeModule", value.asInstanceOf[js.Any])
    
    inline def setSomeSignature(value: Double): Self = StObject.set(x, "SomeSignature", value.asInstanceOf[js.Any])
    
    inline def setSomeType(value: Double): Self = StObject.set(x, "SomeType", value.asInstanceOf[js.Any])
    
    inline def setSomeValue(value: Double): Self = StObject.set(x, "SomeValue", value.asInstanceOf[js.Any])
    
    inline def setVariableOrProperty(value: Double): Self = StObject.set(x, "VariableOrProperty", value.asInstanceOf[js.Any])
  }
}
