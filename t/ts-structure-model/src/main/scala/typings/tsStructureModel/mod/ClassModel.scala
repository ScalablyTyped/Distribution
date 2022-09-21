package typings.tsStructureModel.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassModel extends StObject {
  
  var annotationOverridings: StringDictionary[js.Array[Annotation]]
  
  var annotations: js.Array[Annotation]
  
  var `extends`: js.Array[TypeModel]
  
  var fields: js.Array[FieldModel]
  
  var implements: js.Array[TypeModel]
  
  var isInterface: Boolean
  
  var methods: js.Array[MethodModel]
  
  var moduleName: String
  
  var name: String
  
  var typeParameterConstraint: js.Array[String]
  
  var typeParameters: js.Array[String]
}
object ClassModel {
  
  inline def apply(
    annotationOverridings: StringDictionary[js.Array[Annotation]],
    annotations: js.Array[Annotation],
    `extends`: js.Array[TypeModel],
    fields: js.Array[FieldModel],
    implements: js.Array[TypeModel],
    isInterface: Boolean,
    methods: js.Array[MethodModel],
    moduleName: String,
    name: String,
    typeParameterConstraint: js.Array[String],
    typeParameters: js.Array[String]
  ): ClassModel = {
    val __obj = js.Dynamic.literal(annotationOverridings = annotationOverridings.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], implements = implements.asInstanceOf[js.Any], isInterface = isInterface.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typeParameterConstraint = typeParameterConstraint.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassModel]
  }
  
  extension [Self <: ClassModel](x: Self) {
    
    inline def setAnnotationOverridings(value: StringDictionary[js.Array[Annotation]]): Self = StObject.set(x, "annotationOverridings", value.asInstanceOf[js.Any])
    
    inline def setAnnotations(value: js.Array[Annotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsVarargs(value: Annotation*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setExtends(value: js.Array[TypeModel]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    inline def setExtendsVarargs(value: TypeModel*): Self = StObject.set(x, "extends", js.Array(value*))
    
    inline def setFields(value: js.Array[FieldModel]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: FieldModel*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setImplements(value: js.Array[TypeModel]): Self = StObject.set(x, "implements", value.asInstanceOf[js.Any])
    
    inline def setImplementsVarargs(value: TypeModel*): Self = StObject.set(x, "implements", js.Array(value*))
    
    inline def setIsInterface(value: Boolean): Self = StObject.set(x, "isInterface", value.asInstanceOf[js.Any])
    
    inline def setMethods(value: js.Array[MethodModel]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsVarargs(value: MethodModel*): Self = StObject.set(x, "methods", js.Array(value*))
    
    inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTypeParameterConstraint(value: js.Array[String]): Self = StObject.set(x, "typeParameterConstraint", value.asInstanceOf[js.Any])
    
    inline def setTypeParameterConstraintVarargs(value: String*): Self = StObject.set(x, "typeParameterConstraint", js.Array(value*))
    
    inline def setTypeParameters(value: js.Array[String]): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersVarargs(value: String*): Self = StObject.set(x, "typeParameters", js.Array(value*))
  }
}
